package Desafios.Curso;


import java.time.LocalDate;

public class CursoMain {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Davi: " + devDavi.getConteudosInscritos());
        devDavi.progredir();
        System.out.println("Conteúdos Concluidos Davi: " + devDavi.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Davi: " + devDavi.getConteudosInscritos());
        System.out.println("Davi XP: "+ devDavi.calcularTotalXp());

        System.out.println("\n ====== // ====== \n");

        System.out.println("Conteúdos Inscritos Daniel: " + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("Conteúdos Concluidos Daniel: " + devDavi.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Daniel: " + devDaniel.getConteudosInscritos());
        System.out.println("Daniel XP: " + devDaniel.calcularTotalXp());

    }
}
