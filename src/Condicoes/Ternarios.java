package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternários: Maneiras de reduzir o código
        * Variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";

        System.out.println(nivelDoNinja);

        String resultado = (2 == 2) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
