package NivelIntermediario.NivelIntermediario10;

import java.util.Objects;

public class Ninja {

    private final String nome;
    private final String email;
    private final int telefone;

    public Ninja(String nome, String email, int telefone) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    // Core class na próxima aula.


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return telefone == ninja.telefone && Objects.equals(nome, ninja.nome) && Objects.equals(email, ninja.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, telefone);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}