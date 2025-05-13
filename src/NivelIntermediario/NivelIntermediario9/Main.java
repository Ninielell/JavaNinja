package NivelIntermediario.NivelIntermediario9;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken("Shuriken gigante"));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Pergaminho de invocação"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Kurama"));

        System.out.println("Itens na bolsa:");
        bolsaNinja.mostrarFerramenta();
    }
}
