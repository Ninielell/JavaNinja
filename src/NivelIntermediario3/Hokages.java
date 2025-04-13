package NivelIntermediario3;

public class Hokages{

    String nome, aldeia;
    int idade, missoes;
    boolean vivoOuNao;
    double saldoBancario, altura;

    // Construtor sem argumentos / parametros
    public Hokages() {

    }

    // Construtor com argumentos / parametros

    public Hokages(String aldeia, double altura, int idade, int missoes, String nome, double saldoBancario, boolean vivoOuNao) {
        this.aldeia = aldeia;
        this.altura = altura;
        this.idade = idade;
        this.missoes = missoes;
        this.nome = nome;
        this.saldoBancario = saldoBancario;
        this.vivoOuNao = vivoOuNao;
    }
}
