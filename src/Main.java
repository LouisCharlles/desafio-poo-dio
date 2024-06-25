import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao");
        curso.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descricao");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de mentoria Java.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição de bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuis = new Dev();
        devLuis.setNome("Luis");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+devLuis.getConteudosInscritos());
        devLuis.progredir();
        System.out.println();
        System.out.println("Conteudos concluídos: "+devLuis.getConteudosConcluidos());
        double xp = devLuis.calcularTotaXp();
        System.out.println();
        System.out.println("Total de XP: "+ xp);
        devLuis.progredir();
        xp = devLuis.calcularTotaXp();
        System.out.println("Conteudos concluídos: "+devLuis.getConteudosConcluidos());
        System.out.println("Total de XP: "+ xp);


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos concluídos: "+devJoao.getConteudosConcluidos());
    }
}