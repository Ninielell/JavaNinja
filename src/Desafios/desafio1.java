package Desafios;


public class desafio1 {
    public static void main(String[] args) {

        String nome;
        String missao;
        String status;
        int idade;
        char dificuldade;

        nome = "Naruto Uzumaki";
        missao = "Impeça Sasuke Uchiha";
        idade = 15;
        dificuldade = 'A';

        if (idade < 15) {
            if (dificuldade == 'C' || dificuldade == 'D') {
                status = "Concluido";
            } else {
                status = "Nao concluido";
            }
        } else {
            status = "Concluido";
        }

        System.out.println("------------------------");
        System.out.println("Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Status da missão: " + status);

        nome = "Maito Gai";
        missao = "Derrote Madara Uchiha";
        idade = 28;
        dificuldade = 'S';

        if (idade < 15) {
            if (dificuldade == 'C' || dificuldade == 'D') {
                status = "Concluido";
            } else {
                status = "Nao concluido";
            }
        } else {
            status = "Concluido";
        }

        System.out.println("------------------------");
        System.out.println("Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Status da missão: " + status);


        nome = "Shikamaru Nara";
        missao = "Mate Hidan";
        idade = 14;
        dificuldade = 'A';

        if (idade < 15) {
            if (dificuldade == 'C' || dificuldade == 'D') {
                status = "Concluido";
            } else {
                status = "Nao concluido";
            }
        } else {
            status = "Concluido";
        }

        System.out.println("------------------------");
        System.out.println("Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Status da missão: " + status);
    }
}
