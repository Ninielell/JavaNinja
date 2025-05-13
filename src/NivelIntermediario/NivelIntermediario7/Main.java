package NivelIntermediario.NivelIntermediario7;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array
        // São estáticos, não alteram tamanho.
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        // Listas
        // Listas não são estáticas, elas podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        // Adicionar na lista
        ninjasList.add("Kakashi Hatake");

        System.out.println(" lISTA: " + ninjasList);

        // Remover da lista
        ninjasList.remove("Kakashi Hatake");

        System.out.println(" lISTA: " + ninjasList);

        // Trocar elementos
        ninjasList.set(3, "Hashirama Senju"); // Int para o index e o string para o que vai substituir
        System.out.println(" lISTA: " + ninjasList);

        // Ver o tamanho da lista
        System.out.println(" Tamanho lISTA: " +ninjasList.size() + " elementos");

        System.out.println(ninjasList.get(0));

    }
}