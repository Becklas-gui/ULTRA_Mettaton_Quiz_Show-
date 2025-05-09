import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) {

        // Caminho do diretório, se mudar o codigo explode
        String basePath = System.getProperty("user.home") + "\\Downloads\\Grupo\\dbg";

        System.out.println("Verificando diretório: " + basePath);
        File directory = new File(basePath);

        // Verifica se o diretório existe, basicamente um console.log pra testar qnd der erro
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Diretório não encontrado ou não é um diretório válido.");
            return;
        }

        System.out.println("Diretório encontrado! Listando arquivos:");
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            System.out.println("- " + file.getName());
        }

        // busca o wav
        File audioFile = null;
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.getName().toLowerCase().endsWith(".wav")) {
                audioFile = file;
                break;
            }
        }

        if (audioFile == null) {
            System.out.println("Nenhum arquivo .wav foi encontrado no diretório especificado.");
            return;
        }

        System.out.println("Arquivo encontrado: " + audioFile.getName());
        System.out.println("Caminho completo: " + audioFile.getAbsolutePath());

        // Controle de áudio
        Clip clip = null;
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            System.out.println("=> Iniciando Glamour.wav \n");
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("! Erro ao abrir o arquivo de áudio!");
            e.printStackTrace();
        }

        // Início do Quiz
         Scanner scanner = new Scanner(System.in);
        Random dandadan = new Random();
        String resposta;
        int esc = 0;

        // Instanciar as questões de forma polimórfica
        Materia[] materias = new Materia[9];

        // Matemática
        materias[0] = new Matematica("Qual é a raiz quadrada de 16?", "4");
        materias[1] = new Matematica("Qual é o valor de Pi (aproximado)?", "3.14");
        materias[2] = new Matematica("Quantos lados tem um hexágono?", "6");

        // Artes
        materias[3] = new Artes("\n*Elementos Básicos das Artes Visuais*\n\nAqui está uma pergunta bem chique, meus queridos! Qual dos elementos abaixo NÃO é considerado um elemento básico das artes visuais? \n1) Linha\n2) Cor\n3) Ritmo\n4) Textura", "3");

        materias[4] = new Artes("Qual pintor é famoso por suas obras de paisagens com água?", "Monet");
        materias[5] = new Artes("Qual técnica utiliza carvão para desenhar?", "Desenho a carvão");

        // Física
        materias[6] = new Fisica("Qual é a unidade de medida da força?", "Newton");
        materias[7] = new Fisica("Quem formulou a Lei da Gravitação Universal?", "Isaac Newton");
        materias[8] = new Fisica("Qual é a velocidade da luz no vácuo (em m/s)?", "299792458");

        System.out.println("Bem vindos, Senhoras e Senhores, ao Mettaton Quiz Show!!!");

        // Loop do Quiz
        while (true) {
            System.out.print("\nEscolha uma das seguintes matérias para o Quiz (ou digite 0 para sair):\n1 - Matemática\n2 - Artes\n3 - Fisica\n");
            esc = scanner.nextInt();

            if (esc == 0) {
                System.out.println("Saindo do quiz. Até a próxima!");
                break;
            }

            if (esc < 1 || esc > 3) {
                System.out.println("Matéria não encontrada.");
                continue;
            }

            // Seleciona uma questão aleatória da matéria escolhida
            int random = dandadan.nextInt(3);
            int index = (esc - 1) * 3 + random;

            // Exibe a questão e espera a resposta
            System.out.println(materias[index].getquestao());
            resposta = scanner.next();
            materias[index].exibirExplicacao(random);
        }

        scanner.close();
    }
}
