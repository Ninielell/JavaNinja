package NivelIntermediario.NivelIntermediario4;
    // Para que essa merda serve? Serve para encher o saco, escalibilidade e manutenção!
public abstract class Ninja {

    // Pode ser alterado a qualquer momento.
    String nome, aldeia;
    int idade;

    // Pode conter métodos normais
    public void xingar (){
        System.out.println("Vai se foder!");
    }

    // Pode conter métodos abstratos
    public abstract void nomeDoNinja();

    public abstract void tacarKunai();
}
