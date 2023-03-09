package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
