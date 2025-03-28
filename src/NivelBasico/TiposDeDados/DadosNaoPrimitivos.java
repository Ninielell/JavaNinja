package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: Strings, Arrays, Class, Enum
        * Objetivos: Criar um ninka, e atribuir metodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // ToUpperCase vai transformar tudo em maiusculo
        System.out.println("Esse texto está em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // toLowerCase vai transformar tudo em minusculo
        System.out.println(aldeiaEmCaixaBaixa);
    }
}
