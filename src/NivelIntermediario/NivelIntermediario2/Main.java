package NivelIntermediario.NivelIntermediario2;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- Naruto Uzumaki ----------");
        Uzumaki naruto = new Uzumaki("Aldeia da folha", 17, "Naruto Uzumaki");
        System.out.println(naruto);
        naruto.tacarKunai();
        System.out.println(naruto.altura);
        System.out.println("---------- Sasuke Uchiha ----------");
        Uchiha sasuke = new Uchiha("Aldeia da folha", 18, "Sasuke Uchiha");
        System.out.println(sasuke);

        System.out.println("-----------");
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Anbu";

    }
}