package NivelIntermediario.NivelIntermediario5;

public class Hatake extends Ninja implements SharinganInterface, HokageInterface, AnbuInterface {

    public void boasVindas() {
        System.out.println("Neu nome é " + nome + " e sou do clã Hatake");
    }

    // Metodo da interface
    public void sharinganAtivado() {
        System.out.println("Ativou o Sharingan!");
    }

    // Metodo da interface
    public void ninjaDeElite() {
        System.out.println("Sou um ninja da Anbu!");
    }

    public void hokageAtivo() {
        System.out.println("Eu sou o Hokage!");
    }
}