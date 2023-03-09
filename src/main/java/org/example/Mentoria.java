package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo {
    private String titulo;

    private String conteudo;

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO = 20.0;
    }

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.data = data;
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return titulo.equals(mentoria.titulo) && descricao.equals(mentoria.descricao) && data.equals(mentoria.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, data);
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
