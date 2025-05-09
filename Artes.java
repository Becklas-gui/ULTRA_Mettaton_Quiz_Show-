
// Ah, maravilhosos espectadores do *Mettaton Quiz Show*! Está na hora de testarmos os seus conhecimentos artísticos com uma pitada de glamour, é claro! Preparem-se para as questões com muito estilo e… *brilho*!

// ---

// **1. Elementos Básicos das Artes Visuais**

// Aqui está uma pergunta bem *chique*, meus queridos! Qual dos elementos abaixo NÃO é considerado um elemento básico das artes visuais?

// * 1. Linha
// * 2. Cor
// * 3. Ritmo
// * 4. Textura

// **Resposta correta:** *3) Ritmo!*

// **Explicação glamourosa:** Ah, o ritmo, um elemento da música e da dança! Mas, nas artes visuais, o ritmo não faz parte da festa. O que realmente brilha aqui são os elementos como linha, cor, forma e textura, meus amores. O ritmo é mais uma *sinfonia*, não um traço! Tirem isso da tela e vamos continuar com o show!

// ---

// **2. Técnicas de Arte Visual**

// Agora, meus adorados artistas, qual técnica artística utiliza tinta à base de óleo e permite uma riqueza de detalhes e profundidade que vai deixar você boquiaberto? Vamos lá:

// * 1. Aquarela
// * 2. Pastel seco
// * 3. Têmpera
// * 4. Pintura a óleo

// **Resposta correta:** *4) Pintura a óleo!*

// **Explicação deslumbrante:** A pintura a óleo é como um vestido de alta costura para sua tela! Com seus pigmentos e óleo de linhaça, ela é capaz de criar uma profundidade de cor e mistura que faz até o mais simples quadro parecer uma obra-prima celestial! Aquarela? Pastel seco? Eles são bonitos, mas nada comparado à *luxuosa* pintura a óleo!

// ---

// **3. Arte Contemporânea**

// E agora, uma questão sobre a arte contemporânea, que sempre deixa todo mundo de queixo caído. Qual das características abaixo é uma das mais marcantes na arte contemporânea?

// * 1. A valorização da simetria e do equilíbrio clássico.
// * 2. O foco exclusivo em pintura e escultura.
// * 3. A interdisciplinaridade e o uso de novas tecnologias e mídias.
// * 4. O distanciamento do público e a negação de significados políticos.

// **Resposta correta:** *3) A interdisciplinaridade e o uso de novas tecnologias e mídias!*

// **Explicação fantástica:** Ah, meus amores, a arte contemporânea está *muito* além daquelas velhas e antiquadas molduras! Ela traz a *interação*, a *inovação*, e mistura tudo: vídeo, fotografia, instalações e… até arte digital! A ideia é explorar novas formas e questionar o mundo ao nosso redor, *cheio de brilho e drama* – sem a necessidade de manter a velha e limitada ideia de "beleza" convencional! Isso é puro glamour!

// ---

// E aí está, meus queridos! Espero que tenham aproveitado essas questões tão sofisticadas quanto eu! *Até o próximo Mettaton Quiz Show!*



public class Artes extends Materia {

    public Artes(String questao, String resp) {
        super(questao, resp);
    }

    @Override
    public void exibirExplicacao(int random) {
        if (random == 0) {
            System.out.println("\nResposta correta: 3) Ritmo!\n\nAh, o ritmo, um elemento da música e da dança! Mas, nas artes visuais, o ritmo não faz parte da festa. O que realmente brilha aqui \nsão os elementos como linha, cor, forma e textura, meus amores. \nO ritmo é mais uma sinfonia, não um traço!\nTirem isso da tela e vamos continuar com o show!");
        } else if (random == 1) {
            System.out.println("Claude Monet é um dos pintores mais famosos do Impressionismo, conhecido por suas paisagens aquáticas.");
        } else if (random == 2) {
            System.out.println("A técnica de desenho a carvão permite criar sombras e traços marcantes em ilustrações artísticas.");
        }
    }
}

