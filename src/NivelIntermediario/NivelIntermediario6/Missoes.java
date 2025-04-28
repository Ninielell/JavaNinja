package NivelIntermediario.NivelIntermediario6;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    // Metodo para mostrar infos
    public void exibirDados() {
        System.out.println("Missão: " + nome + " | Rank: " + rank + " ( Descrição: " + rank.getDescricao() + " | Dificuldade: " + rank.getDificuldade()+ ")");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}