package Desafios.desafio2;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int quantidadeNinjas = 0;
        String[] cadastroNinjas = new String[quantidadeNinjas];
        int escolha, sair = 0;
        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Lista Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Quantos ninjas vocé deseja cadastrar? -> ");
                    quantidadeNinjas = entrada.nextInt();
                    entrada.nextLine();
                    cadastroNinjas = new String[quantidadeNinjas];

                    for (int i = 0; i < cadastroNinjas.length; i++) {
                        System.out.print("Digite o nome do " + (i + 1) + "º ninja: ");
                        cadastroNinjas[i] = entrada.nextLine();
                    }
                    break;
                case 2:
                    if (cadastroNinjas.length > 0) {
                        System.out.println(" ");
                        System.out.println("Lista de ninjas cadastrados: ");
                    } else {
                        System.out.println("Nenhum ninja cadastrado. Por favor, cadastre um ninja primeiro.");
                    }
                    for (int i = 0; i < cadastroNinjas.length; i++) {
                        System.out.println((i + 1) + " - " + cadastroNinjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sair = 1;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
                System.out.println(" ");
        } while (sair != 1);
        entrada.close();
    }
}
