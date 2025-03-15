package NivelBasico.Desafios.desafio2;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int quantidadeNinjas = 0;
        String[] cadastroNinjas = new String[quantidadeNinjas];
        String[] listaNinjas = new String[quantidadeNinjas];
        int escolha = 0;
        int sair = 0;
        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Lista Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = entrada.nextInt();

            if (escolha == 1 && cadastroNinjas.length == 0) {
                System.out.print("Quantos ninjas vocé deseja cadastrar? -> ");
                quantidadeNinjas = entrada.nextInt();
                entrada.nextLine();
                cadastroNinjas = new String[quantidadeNinjas];
                escolha = 1;

            } else if (escolha == 2 && cadastroNinjas.length == 0) {
                System.out.println("Nenhum ninja cadastrado. Por favor, cadastre um ninja primeiro.");
            } else if (escolha == 2 && cadastroNinjas.length > 0) {
                System.out.println(" ");
                System.out.println("Lista de ninjas cadastrados: ");
            }

            switch (escolha) {
                case 1:
                    for (int i = 0; i < cadastroNinjas.length; i++) {
                        System.out.print("Digite o nome do " + (i + 1) + "º ninja: ");
                        cadastroNinjas[i] = entrada.nextLine();
                    }
                    listaNinjas = cadastroNinjas.clone();
                    break;
                case 2:
                    for (int i = 0; i < listaNinjas.length; i++) {
                        System.out.println("" + (i + 1) + " - " + listaNinjas[i]);
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
