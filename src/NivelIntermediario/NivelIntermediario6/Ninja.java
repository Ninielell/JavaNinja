package NivelIntermediario.NivelIntermediario6;

public abstract class Ninja {
    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    final double altura = 2.10;

    public Ninja(){
    }

    public Ninja(String aldeia, int idade, String nome, int numeroDeMissoesConcluidas) {
        this.aldeia = aldeia;
        this.idade = idade;
        this.nome = nome;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    // Tirar dados ou mostrar para usuario, utilizar GET + Nome da variavel

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0){
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }
}
