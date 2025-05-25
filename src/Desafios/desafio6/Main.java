package Desafios.desafio6;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, vila;
        int escolha, pos, idade;
        boolean encontrado = false;

        List<Ninja> ninjaList = new LinkedList<>();

        ninjaList.add(new Ninja("Naruto Uzumaki", "Aldeia da folha", 17));
        ninjaList.add(new Ninja("Sasuke Uchiha", "Aldeia da folha", 18));
        ninjaList.add(new Ninja("Sakura Haruno", "Aldeia da folha", 18));
        ninjaList.add(new Ninja("Shikamaru Nara", "Aldeia da folha", 19));
        ninjaList.add(new Ninja("Kakashi Hatake", "Aldeia da folha", 32));
        ninjaList.add(new Ninja("Tobirama Senju", "Aldeia da folha", 55));
        ninjaList.add(new Ninja("Gaara do Deserto", "Aldeia do Deserto", 17));

        do {
            System.out.println("----------------------------------");
            System.out.println("1. Adicionar no inicio da lista");
            System.out.println("2. Remover do inicio da lista");
            System.out.println("3. Exibir lista completa");
            System.out.println("4. Buscar ninja da lista");
            System.out.println("5. Sair");
            System.out.println("----------------------------------");
            System.out.print("Opção: ");
            escolha = input.nextInt();
            input.nextLine();
            switch (escolha){
                case 1:
                    System.out.print("Digite o nome do ninja: ");
                    nome = input.nextLine();

                    System.out.print("Digite a vila do ninja: ");
                    vila = input.nextLine();

                    System.out.print("Digite a idade do ninja: ");
                    idade = input.nextInt();
                    input.nextLine();

                    ninjaList.addFirst(new Ninja(nome, vila, idade));
                    System.out.println("O ninja " + nome + " foi registrado com sucesso!");
                    break;
                case 2:
                    System.out.println("O ninja " + ninjaList.getFirst().getNome() + " foi removido com sucesso!");
                    ninjaList.removeFirst();
                    break;
                case 3:
                    System.out.println("------Lista Ninja------");
                    System.out.println("1. Ordenar lista e exibir lista");
                    System.out.println("2. Exibir lista completa");
                    System.out.println("3. Voltar");
                    System.out.print("Opção: ");
                    escolha = input.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("-----Ordenar lista-----");
                            System.out.println("1. Por nome");
                            System.out.println("2. Por idade");
                            System.out.println("3. Por vila");
                            System.out.println("4. Voltar");
                            System.out.println("---------------------------");
                            System.out.print("Opção: ");
                            escolha = input.nextInt();
                            input.nextLine();
                            switch (escolha) {
                                case 1:
                                    Collections.sort(ninjaList, Comparator.comparing(Ninja::getNome));
                                    exibirLista(ninjaList);
                                    break;
                                case 2:
                                    Collections.sort(ninjaList, Comparator.comparing(Ninja::getIdade));
                                    exibirLista(ninjaList);
                                    break;
                                case 3:
                                    Collections.sort(ninjaList, Comparator.comparing(Ninja::getVila));
                                    exibirLista(ninjaList);
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                                    break;
                            }
                            break;
                        case 2:
                            exibirLista(ninjaList);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("----- Método de busca -----");
                    System.out.println("1. Buscar por nome");
                    System.out.println("2. Buscar por posição na lista");
                    System.out.println("3. Voltar");
                    System.out.println("---------------------------");
                    System.out.print("Opção: ");
                    escolha = input.nextInt();
                    input.nextLine();
                    switch (escolha) {
                        case 1:
                            System.out.print("Digite o nome completo do ninja: ");
                            nome = input.nextLine();
                            for (Ninja ninja : ninjaList) {
                                if (ninja.getNome().equalsIgnoreCase(nome)) {
                                    System.out.println("Ninja encontrado: " + ninja);
                                    encontrado = true;
                                    System.out.print("Pressione para continuar!");
                                    input.nextLine();
                                    break;
                                }
                            }

                            if (!encontrado) {
                                System.out.println("Ninja não encontrado!");
                            }
                            break;
                        case 2:
                            System.out.print("Digite a posição do ninja: ");
                            pos = input.nextInt();
                            input.nextLine();
                            System.out.println("Ninja encontrado: " + ninjaList.get(pos - 1) + " | Posição: " + pos + " | Index: " + (pos - 1));
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (escolha != 5);
    }

    public static void exibirLista(List<Ninja> lista) {
        for (Ninja ninja : lista) {
            sleep(500);
            System.out.println(ninja);
        }
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
