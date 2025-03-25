package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.aldeia = "Aldeia da folha";
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        // Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.aldeia = "Aldeia da folha";
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.AtivarCura();

        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.aldeia = "Aldeia da folha";
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 18;
        Hinata.ByakuganAtivado();
    }
}