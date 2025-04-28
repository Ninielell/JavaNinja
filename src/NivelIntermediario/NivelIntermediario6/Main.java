package NivelIntermediario.NivelIntermediario6;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Derrote Zabuza", RankDeMissoes.B);

        missao1.exibirDados();

        Missoes missao2 = new Missoes("Derrote Madara", RankDeMissoes.S);

        missao2.exibirDados();

        /*
        System.out.println("-------- Naruto --------");
        Uzumaki naruto = new Uzumaki("Konoha", 18, "Naruto Uzumaki", 23);
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setNome("Naruto");
        System.out.println("Meu novo nome é: " + naruto.getNome());

        System.out.println("-------- Sasuke --------");
        */

        // Uchiha sasuke = new Uchiha("Konoha", 19, "Sasuke Uchiha", 34);
    }
}
