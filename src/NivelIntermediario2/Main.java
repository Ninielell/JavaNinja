package NivelIntermediario2;

public class Main {
    public static void main(String[] args) {

        /*Obj ninja, um filho da puta pode fazer isso se não tiver classe abstrata protegendo
        Ninja ninjaGenerico = new Ninja();
        ninjaGenerico.nome = "Nome generico";*/

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        System.out.println(  );

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();

        // Obj Uchiha2
        Uchiha itachi = new Uchiha("Aldeia da folha", 27, "Itachi Uchiha");
        itachi.habilidadeEspecial();
    }
}