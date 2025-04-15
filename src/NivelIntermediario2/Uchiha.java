package NivelIntermediario2;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String aldeia, int idade, String nome) {
        super(aldeia, idade, nome);
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo!");
    }

}
