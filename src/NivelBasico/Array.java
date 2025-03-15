package NivelBasico;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo Referência
        //String inicializa com null
        String[] ninja = new String [7];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Kakashi Hatake";
        ninja[4] = "Hinata Hyuga";

        //System.out.println(ninja[5]);
        /*
        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }*/

        // Redeclara o ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

//        System.out.println(ninja[2]);
        // For para fazer um loop no ARRAY
        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }




        // Int inicializam com 0
        /*int[] idade = new int[2];

        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }

        // Boolean inicializam com false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);*/


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
