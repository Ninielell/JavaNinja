package Condicoes;

import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de repetição: vão repetir infinitamente ou até atingir o parametro definido
        * WHILE - FOR
        * */

        // While
        /* While (condicao) {
            tudo aqui vai acontecer
        }*/

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*while (numeroDeClones < numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O naruto fez " + numeroDeClones + " clones.");
        }*/

        // FOR
        /* For (int i = 0; i < 10; i++) {
            tudo aqui vai acontecer
        }
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("O naruto tem chakra?");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");

        switch (scanner.nextInt()) {
            case 1:
                for (int c = 0; c <= 50; c++) {
                    System.out.println("Naruto invocou "+ c +" clones!");
                }
                break;
            case 2:
                System.out.println("Naruto está igual o kakashi!");
                break;
            default:
                System.out.println("Opção inválida seu bocó!");
                break;
        }

        scanner.close();
    }
}
