package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Descrição curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Java Intermediario");
        curso1.setDescricao("Descrição curso");
        curso1.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria em Java");
        mentoria1.setDescricao("Descrição Mentoria em Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}