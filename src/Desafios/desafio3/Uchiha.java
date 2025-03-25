package Desafios.desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        mostrarHabilidadeEspecial();
    }
}
