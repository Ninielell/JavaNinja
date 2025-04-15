package NivelIntermediario.NivelIntermediario2;

public abstract class Ninja implements EstrategiaDeCombate{

    //TODO: Incluir novos 2 novos atributos: numeroDeMissoesConcluida, Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Kage
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluida;
    RankNinja rank;

    public Ninja() {
    }

    // Metodo existente: primeiro metodo
    public Ninja(String aldeia, int idade, String nome) {
        this.aldeia = aldeia;
        this.idade = idade;
        this.nome = nome;
    }

    // TODO: Sobrecarga do construtor chamando os novos atributos
    // Sonbrecarga de metodos voce nao precisa redeclarar o construtor, so os novos atributos
    public Ninja(String aldeia, int idade, String nome, int numeroDeMissoesConcluida, RankNinja rank) {
        this(aldeia, idade, nome); // referencia o construtor antiga/acima
        this.numeroDeMissoesConcluida = numeroDeMissoesConcluida;
        this.rank = rank;
    }

    // Metodo geral! Todos os ninjas vão ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial!");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Neu nome é: "+ nome +" e essa é minha estrategia de batalha!");
    }
}
