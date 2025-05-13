package NivelIntermediario.NivelIntermediario9;

public class Pergaminho {
    private String nome;

    public Pergaminho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
