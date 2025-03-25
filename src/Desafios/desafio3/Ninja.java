package Desafios.desafio3;

public class Ninja {
    String nome;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    int idade;

    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Missão: " + this.missao);
        System.out.println("Nível de dificuldade: " + this.nivelDificuldade);
        System.out.println("Status da missão: " + this.statusMissao);
    }
}
