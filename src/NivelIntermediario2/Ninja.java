package NivelIntermediario2;

public abstract class Ninja implements EstrategiaDeCombate{

    String nome;
    String aldeia;
    int idade;

    // Metodo geral! Todos os ninjas vão ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial!");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Neu nome é: "+ nome +" e essa é minha estrategia de batalha!");
    }
}
