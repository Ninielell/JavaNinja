package NivelIntermediario.NivelIntermediario2;

public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String aldeia, int idade, String nome) {
        super(aldeia, idade, nome);
    }

    public Uzumaki(String aldeia, int idade, String nome, int numeroDeMissoesConcluida, RankNinja rank) {
        super(aldeia, idade, nome, numeroDeMissoesConcluida, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar. Eu já cmplete " + numeroDeMissoesConcluida + " missoes!");
    }

}