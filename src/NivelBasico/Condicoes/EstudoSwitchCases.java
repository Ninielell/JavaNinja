package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * Switch Cases: Servem para gerar casos especificos
        * Objetivo: Pedir para o usuário escolher entre os Ninjas
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções pra o usuario
        System.out.println("Escolha um ninja: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma das opções
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você escolheu: " + escolhaDoUsuario);

        // Reação ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("o usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("o usuario escolheu o revoltadinho do Sasuke Uchiha");
                break;
            case 3:
                System.out.println("o usuario escolheu a chata da Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma resposta valida, tente novamente!");
                break;
        }

        // Fechar a caixa
        scanner.close();
    }

}
