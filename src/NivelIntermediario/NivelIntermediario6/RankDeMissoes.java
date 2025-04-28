package NivelIntermediario.NivelIntermediario6;

public enum RankDeMissoes {
    D("Fácil", 2),
    C("Médio", 3),
    B("Dificil", 4),
    A("Muito difcil", 5),
    S("Extremamente difcil", 6);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
