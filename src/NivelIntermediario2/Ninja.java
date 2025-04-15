package NivelIntermediario2;

public abstract class Ninja implements EstrategiaDeCombate{

    String nome;
    String aldeia;
    int idade;

    public Ninja() {

    }

    public Ninja(String aldeia, int idade, String nome) {
        this.aldeia = aldeia;
        this.idade = idade;
        this.nome = nome;
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
