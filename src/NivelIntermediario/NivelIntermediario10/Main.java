package NivelIntermediario.NivelIntermediario10;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 229926130);

        System.out.println("Cdastro: " + cadastro);
        System.out.println("Nome do cadastro = " + cadastro.getNome());

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke",  229926131);
        System.out.println("Cdastro Record: " + cadastroRecord);
        System.out.println("Nome cadastro usando RECORDS: " + cadastroRecord.nomeDoFuncionario());
    }
}
