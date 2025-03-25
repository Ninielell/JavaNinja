package Desafios.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sair = 0, escolha;
        int quantidadeNinjas = 0;
        String clan;
        Ninja[] ninjas = new Ninja[quantidadeNinjas];

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Informações Ninjas");
            System.out.println("3. Atualizar Habilidades Especiais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Quantos ninjas vocé deseja cadastrar? -> ");
                    quantidadeNinjas = scanner.nextInt();
                    scanner.nextLine();
                    ninjas = new Ninja[quantidadeNinjas];

                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("O ninja é um Uchiha?");
                        System.out.print("Resposta: ");
                        clan = scanner.nextLine();
                        if (clan.equalsIgnoreCase("Sim")) {
                            ninjas[i] = new Uchiha();
                            System.out.print("Digite o nome do " + (i + 1) + "º ninja: ");
                            ninjas[i].nome = scanner.nextLine();
                            System.out.print("Digite a idade do(a) " + ninjas[i].nome + ": ");
                            ninjas[i].idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Digite a missão do " + ninjas[i].nome + ": ");
                            ninjas[i].missao = scanner.nextLine();
                            System.out.print("Digite o nível de dificuldade da missão " + ninjas[i].missao + ": ");
                            ninjas[i].nivelDificuldade = scanner.nextLine();
                            System.out.print("Digite o status da missão " + ninjas[i].missao+ ": ");
                            ninjas[i].statusMissao = scanner.nextLine();
                            System.out.print("Habilidade especial do " + ninjas[i].nome + ": ");
                            ((Uchiha)ninjas[i]).habilidadeEspecial = scanner.nextLine();
                        } else {
                            ninjas[i] = new Ninja();
                            System.out.print("Digite o nome do " + (i + 1) + "º ninja: ");
                            ninjas[i].nome = scanner.nextLine();
                            System.out.print("Digite a idade do(a) " + ninjas[i].nome + ": ");
                            ninjas[i].idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Digite a missão do " + ninjas[i].nome + ": ");
                            ninjas[i].missao = scanner.nextLine();
                            System.out.print("Digite o nível de dificuldade da missão " + ninjas[i].missao + ": ");
                            ninjas[i].nivelDificuldade = scanner.nextLine();
                            System.out.print("Digite o status da missão " + ninjas[i].missao+ ": ");
                            ninjas[i].statusMissao = scanner.nextLine();
                        }
                    }
                    break;
                case 2:
                    if (ninjas.length > 0) {
                        System.out.println(" ");
                        System.out.println("Lista de ninjas cadastrados: ");
                    } else {
                        System.out.println("Nenhum ninja cadastrado. Por favor, cadastre um ninja primeiro.");
                    }
                    for (int i = 0; i < ninjas.length; i++) {
                        ninjas[i].mostrarInfo();
                        System.out.println("------------------------");
                    }
                    break;
                case 3:
                    if (ninjas.length > 0) {
                        System.out.println(" ");
                        System.out.println("Lista de ninjas cadastrados: ");
                    } else {
                        System.out.println("Nenhum ninja cadastrado. Por favor, cadastre um ninja primeiro!");
                        break;
                    }
                    System.out.println("Deseja atualizar a habilidade de qual ninja?");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println((i + 1) + " - " + ninjas[i].nome);
                    }
                    System.out.print("Escolha um ninja: ");
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    if (ninjas[escolha - 1] instanceof Uchiha) {
                        System.out.print("Habilidade especial do " + ninjas[escolha - 1].nome + ": ");
                        ((Uchiha)ninjas[escolha - 1]).habilidadeEspecial = scanner.nextLine();
                    } else {
                        System.out.println("Esse ninja não é um Uchiha e não possui habilidade especial para atualizar!");
                    }
                    break;
                case 4:
                    sair = 4;
                    break;
                default:
                    System.out.println("Valor inválido!");
                break;
            }
        } while (sair != 4) ;
        scanner.close();
    }
}