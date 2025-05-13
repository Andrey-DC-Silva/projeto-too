package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AvaliacaoFisica;
import modelo.Plano;
import modelo.Professor;

public class TesteHeranca {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Professor p = new Professor();
        p.setNome("Humano(a)0_o");
        p.setCPF("123.123.123-12");
        p.setEspecializacao("da aula");
        System.out.println(p.exibirDados());
        System.out.println("_______");

        Plano planoSimples = new Plano("Simples", "É simples -_-!",99.90);
        Plano planoCaro = new Plano("Caro", "É caro, inclusive, demais!", 329.90);

        Aluno a1 = new Aluno();
        a1.setNome("Ser Desconhecido(Recente)");
        a1.setMatricula("238");
        a1.setDtNasc(LocalDate.parse("10/03/1999", formato));
        a1.setDtMatricula(LocalDate.parse("20/04/2025", formato));
        a1.setPlano(planoSimples);

        AvaliacaoFisica av1 = new AvaliacaoFisica(a1);
        a1.adicionarAvaliacao(av1);
        av1.setProfessor(p);

        System.out.println(a1.exibirDados());
        System.out.println(av1.exibirDados());
        System.out.println("_______");

        Aluno a2 = new Aluno();
        a2.setNome("Provável Dono(a) da Academia(Antigo)");
        a2.setMatricula("001");
        a2.setDtNasc(LocalDate.parse("20/05/1990", formato));
        a2.setDtMatricula(LocalDate.parse("20/05/2015", formato));
        a2.setPlano(planoCaro);

        AvaliacaoFisica av2 = new AvaliacaoFisica(a2);
        a2.adicionarAvaliacao(av2);
        av2.setProfessor(p);

        System.out.println(a2.exibirDados());
        System.out.println(av2.exibirDados());

    }

}