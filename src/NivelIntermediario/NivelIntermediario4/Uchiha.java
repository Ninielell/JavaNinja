package NivelIntermediario.NivelIntermediario4;

public class Uchiha extends Ninja{

    // o Override serve para sobreescrever o metodo da interface ou classe pai
    @Override
    public void nomeDoNinja() {
        System.out.println("O meu nome é " + this.nome);
    }

    // o Override serve para sobreescrever o metodo da interface ou classe pai
    @Override
    public void tacarKunai() {
        System.out.println("Eu taquei uma kunai!");
    }
}
