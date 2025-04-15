package NivelIntermediario.NivelIntermediario3;

public class Senju extends Hokages{

    @Override
    public void sabedoriaHokage() {
        System.out.println("Você adquiriu sabedoria!");
    }

    public Senju()
    {

    }

    public Senju(String aldeia, double altura, int idade, int missoes, String nome, double saldoBancario, boolean vivoOuNao) {
        this.aldeia = aldeia;
        this.altura = altura;
        this.idade = idade;
        this.missoes = missoes;
        this.nome = nome;
        this.saldoBancario = saldoBancario;
        this.vivoOuNao = vivoOuNao;
    }
}
