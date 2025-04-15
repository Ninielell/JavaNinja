package NivelIntermediario.NivelIntermediario2;

public class Main {
    public static void main(String[] args) {

        /*Obj ninja, um filho da puta pode fazer isso se não tiver classe abstrata protegendo
        Ninja ninjaGenerico = new Ninja();
        ninjaGenerico.nome = "Nome generico";*/

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Aldeia da folha", 17, "Naruto Uzumaki", 30, RankNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        System.out.println(  );
        // Obj Uchiha
        Uchiha sasuke = new Uchiha("Aldeia da folha", 18, "Sasuke Uchiha", 26, RankNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        System.out.println( );
        // Obj Uchiha2
        Uchiha itachi = new Uchiha("Aldeia da folha", 27, "Itachi Uchiha", 574, RankNinja.JOUNIN);
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();

        System.out.println( );
        // Obj Uchiha3
        Uchiha madara = new Uchiha("Aldeia da folha", 90, "Madara Uchiha", 900, RankNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
    }
}