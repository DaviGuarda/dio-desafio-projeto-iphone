package entities;

import java.util.Objects;

public class Aplicativo {
    private String nome;
    private String descricao;

    public Aplicativo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aplicativo that = (Aplicativo) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "nome='"
                + nome
                + '\''
                + ", descricao='" + descricao + '\''
                + '}';
    }
}
