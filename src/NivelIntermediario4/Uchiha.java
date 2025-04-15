package NivelIntermediario4;

public class Uchiha extends Ninja{

    @Override
    public void nomeDoNinja() {
        System.out.println("O meu nome é " + this.nome);
    }

    @Override
    public void tacarKunai() {
        System.out.println("Eu taquei uma kunai!");
    }
}
