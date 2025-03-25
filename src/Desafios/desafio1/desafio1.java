package Desafios.desafio1;


import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] ninja = new String[3];
        String[] missoes = new String[3];
        int[] idade = new int[3];
        char[] dificuldade = new char[3];
        String[] status = new String[3];

        for (int i = 0; i < ninja.length; i++) {
            System.out.print("Digite o nome do " + (i + 1) +"ª ninja:");
            ninja[i] = scanner.nextLine();
        }
        for (int i = 0; i < idade.length; i++) {
            System.out.print("Digite a idade do " + ninja[i] +":");
            idade[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < missoes.length; i++) {
            System.out.print("Digite a missão do " + ninja[i] +":");
            missoes[i] = scanner.nextLine();
        }
        for (int i = 0; i < dificuldade.length; i++) {
            System.out.print("Digite a dificuldade da missão " + missoes[i] +":");
            dificuldade[i] = scanner.next().charAt(0);
            scanner.nextLine();
        }
        for (int i = 0; i < ninja.length; i++) {
            if (idade[i] < 15) {
                status[i] = (dificuldade[i] == 'C' || dificuldade[i] == 'D') ? "Concluido" : "Não concluido";
            } else {
                status[i] = "Concluido";
            }
        }
        for (int i = 0; i < ninja.length; i++) {
            System.out.println("------------------------");
            System.out.println("Ninja: " + ninja[i]);
            System.out.println("Idade: " + idade[i]);
            System.out.println("Missão: " + missoes[i]);
            System.out.println("Dificuldade: " + dificuldade[i]);
            System.out.println("Status da missão: " + status[i]);
        }
        scanner.close();
    }
}
