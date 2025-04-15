package NivelIntermediario2;

public class Main {
    public static void main(String[] args) {

        /*Obj ninja, um filho da puta pode fazer isso se não tiver classe abstrata protegendo
        Ninja ninjaGenerico = new Ninja();
        ninjaGenerico.nome = "Nome generico";*/

        // Obj Uzumaki
        Ninja naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        System.out.println(  );
        // Obj Uchiha
        Ninja sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
    }
}