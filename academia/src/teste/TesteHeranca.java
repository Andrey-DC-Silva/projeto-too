package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AvaliacaoFisica;
import modelo.Professor;

public class TesteHeranca {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("Alguem");
        p.setCPF("123.123.123-12");
        p.setEspecializacao("da aula");

        System.out.println(p.exibirDados());

        Aluno a = new Aluno();
        a.setNome("Loco");
        a.setMatricula("123");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        a.setDtNasc(LocalDate.parse("10/10/2000", formato));

        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.adicionarAvaliacao(av1);
        av1.setProfessor(p);

        System.out.println(a.exibirDados());
        System.out.println("------ ");
        System.out.println(av1.exibirDados());
    }

}