package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja naruto
        Ninja Naruto = new Ninja();
        Naruto.aldeia = "Aldeia da folha";
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;

        // Criar o ninja Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;

        //Aplicando métodos ao objeto
        Sasuke.SharinganAtivado();
        System.out.println(Sasuke.EuSouUmNinja());

        System.out.println("Você tem: " + Sasuke.idade + " anos, então falta " + Sasuke.anosParaSeTornarHokage(30) + " anos para você poder virar um hokage");

        // Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.aldeia = "Aldeia da folha";
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
    }
}
