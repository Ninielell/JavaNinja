package NivelIntermediario.NivelIntermediario14;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
            List<String> ninjas = new ArrayList<>();
        */

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.add("Naruto Uzumaki");
        ninjasSet.add("Sasuke Uchiha");
        ninjasSet.add("Sakura Haruno");
        ninjasSet.add("Naruto Uzumaki");

        System.out.println("ninjasSet = " + ninjasSet);
    }
}