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
        Matematica pontematematica = new Matematica("ponte", "ponte");
        Matematica[] matematica = new Matematica[3];
        Random dandadan = new Random();
        String resposta;
        int esc = 0;

        matematica[0] = new Matematica("questao 1", "a");
        matematica[1] = new Matematica("questao 2", "b");
        matematica[2] = new Matematica("questao 3", "c");

        System.out.println("Bem vindos, Senhoras e Senhores, ao Mettaton Quiz Show!!!");
        System.out.print("Escolha uma das seguintes matérias para o Quiz:\n\n1 - Matemática\n2 - Física\n3 - Artes\n");
        esc = scanner.nextInt();

        switch (esc) {
            case 1:
                int random = dandadan.nextInt(3);
                System.out.println(matematica[random].getquestao());
                resposta = scanner.next();
                pontematematica.exibirExplicacao(random);
                break;
            default:
                System.out.println("Matéria não encontrada.");
                break;
        }

        

        scanner.close();
    }
}
