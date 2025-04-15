package Desafios.desafio4;

public class NinjaAvancado extends NinjaBasico {

    Especialidade especialidade;

    public NinjaAvancado() {
        super();
    }

    public NinjaAvancado(String nome, int idade, String patente, String habilidade, Especialidade especialidade) {
        super(nome,idade,patente,habilidade);
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
}
