package Desafios.desafio4;

public class Main {
    public static void main(String[] args) {

        // criação do ninja básico com construtor padrão
        NinjaBasico iruka = new NinjaBasico();
        iruka.nome = "Iruka Umino";
        iruka.idade = 27;
        iruka.patente = "Chuuin";
        iruka.habilidade = "Jutsu de Invocação";

        iruka.mostrarInformacoes();
        iruka.executarHabilidade();

        System.out.println( ); // Apenas para ficar visualmente confortavel no output

        // criação do ninja básico com construtor sem uma especialidade
        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 17, "Genin", "Rasengan");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        System.out.println( );

        // criação do ninja avançado com construtor padrão
        NinjaAvancado rocklee = new NinjaAvancado();
        rocklee.nome = "Rock Lee";
        rocklee.idade = 20;
        rocklee.patente = "Jounin";
        rocklee.habilidade = "Oito portões";
        rocklee.especialidade = Especialidade.Taijutsu;

        rocklee.mostrarInformacoes();
        rocklee.executarHabilidade();

        System.out.println( );

        // criação do ninja avançado com a especialidade em um tipo de habilidade
        NinjaAvancado sasuke = new NinjaAvancado("Sasuke Uchiha", 18, "Chunin", "Chidori", Especialidade.Ninjutsu);
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();
    }
}
