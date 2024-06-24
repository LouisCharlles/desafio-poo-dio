import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso java","Descrição",8);
        Curso curso2 = new Curso("Curso Python","Descrição",6);
        System.out.println(curso);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria("Mentoria de Java","Descricao",LocalDate.now());

    }
}