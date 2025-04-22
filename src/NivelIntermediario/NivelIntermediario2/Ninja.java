package NivelIntermediario.NivelIntermediario2;

public abstract class Ninja implements EstrategiaDeCombate{

    //TODO: Incluir novos 2 novos atributos: numeroDeMissoesConcluida, Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Kage
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluida;
    RankNinja rank;
    final double altura = 2.10; // Qualquer metodo, atributo ou classe nao pode ser alterado se tiver Final

    public Ninja() {
    }

    // Metodo existente: primeiro metodo
    public Ninja(String aldeia, int idade, String nome) {
        this.aldeia = aldeia;
        this.idade = idade;
        this.nome = nome;
    }

    final void tacarKunai() {
        System.out.println("Joguei kunai!");
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

    // Ingeligencia de combate
    public void inteligenciaDeCombate(){
        System.out.println("Neu nome é: "+ nome +" e essa é minha inteligencia de batalha!");
    }

    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é: "+ qi + " e você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: "+ qi + " e vocé é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: "+ qi + " e vocé precisa treinar mais!");
        }
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + " eu sou da " + aldeia + " e tenho " + idade + " anos.";
    }
}
