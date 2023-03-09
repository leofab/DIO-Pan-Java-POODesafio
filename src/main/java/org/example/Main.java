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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcam Java Developer");
        bootcamp.setDescricao("Descrição Bootcam Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());

        System.out.println("--------------");

        Dev devJoao = new Dev();
        devCamila.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());


    }
}