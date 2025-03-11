package NivelBasico.Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
        * If e Else - Condições
        * Else-If
        * Objetivo: Passar o ninja de núvel, de acordo com o numero de missoes
        * */

        // Ninja Naruto
        String nome = "Naturo Uzumaki";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numeroMissoes = 9;

        /*
            Estrutura do IF/ELSE-IF/ELSE
        * if (condicao) {
            resultado
        } else if (condicao) {
            resultado
        } else {
            resultado caso nada seja verdadeiro
        }
        * */

        if (numeroMissoes == 10 && idade > 15) {
            System.out.println("Rank = Chunnin");
        } else if (numeroMissoes >= 20) {
            System.out.println("Rank = Jounnin");
        } else {
            System.out.println("Rank = Gennin");
        }
    }
}
