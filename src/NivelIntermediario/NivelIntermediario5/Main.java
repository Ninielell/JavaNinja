package NivelIntermediario.NivelIntermediario5;

public class Main {
    public static void main(String[] args) {

        // OBJETO UCHIHA
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.sharinganAtivado();

        // OBJETO HATAKE
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();
    }
}