package Desafios.desafio4;

public class NinjaAvancado implements Ninja {
    String nome, patente, habilidade;
    int idade;
    Especialidade especialidade;

    public NinjaAvancado() {

    }

    public NinjaAvancado(String nome, int idade, String patente, String habilidade, Especialidade especialidade) {
        this.habilidade = habilidade;
        this.idade = idade;
        this.nome = nome;
        this.patente = patente;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("--------------RG NINJA--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Patente: " + this.patente);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("-------------------------------------");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + this.nome + " executou a habilidade: " + this.habilidade);
    }
}
