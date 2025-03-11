package NivelBasico;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String [4];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Kakashi Hatake";

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }



        /*
        * String ninja1 = "Naruto Uzumaki";
        * String ninja2 = "Sasuke Uchiha";
        * String ninja3 = "Sakura Haruno";
        * System.out.println(ninja1);
        * System.out.println(ninja2);
        * System.out.println(ninja3);
        *  */
    }
}
