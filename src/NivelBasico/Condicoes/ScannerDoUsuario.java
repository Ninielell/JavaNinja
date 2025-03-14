package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner = É um jeito de trazer o usuario para dentro da aplicação.
        * Objetivo = O usuário vai criar um ninja e vamos validar os dados
        * */

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do Ninja
        System.out.print("Escreva o nome do Ninja: ");
        String texto = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é " + texto);

        // Receber a idade do Ninja
        System.out.print("Escreva a idade do Ninja: ");
        int idade = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é " + idade + " anos");

        // Tratamento de dados
        if (idade >= 18) {
            System.out.println("O ninja já é maior de idade, e pode ir em missões fora da aldeia.");

        } else {
            System.out.println("Esse ninjá é muito novo, ele precisa treinar mais antes de sair da vila!");
        }

        // Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}