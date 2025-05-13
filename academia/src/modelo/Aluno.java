package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private LocalDate dtMatricula;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    private Plano plano;
    private double valorMensalidade;

    public void adicionarAvaliacao(AvaliacaoFisica avalicao){
        avaliacoes.add(avalicao);
    }

    public String mostrarAvaliacoes(){
        String aux = "Historico de Avaliações: \n";
        for(AvaliacaoFisica cadaAvaliacao : avaliacoes){
            aux += "->> " + cadaAvaliacao + "\n";
        }
        return aux;
    }

    public String getMatricula(){ return matricula; }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDtMatricula(){
        return dtMatricula;
    }
    public void setDtMatricula(LocalDate dtMatricula){
        this.dtMatricula = dtMatricula;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
        verificarDesconto();
    }

    public void verificarDesconto(){
        if(Period.between(dtMatricula, LocalDate.now()).getMonths()>=3){
            valorMensalidade = plano.getValor() * 0.9;
        }
        else{
            valorMensalidade = plano.getValor();
        }
    }

    @Override
    public String exibirDados(){
        String aux = super.exibirDados();
        aux += "\nMatricula: " + matricula;
        aux += "\nAvalições Físicas: " + avaliacoes.size() + "\n";
        aux += "Valor da mensalidade: R$" + valorMensalidade + "\n";
        if (plano != null) {
            aux += "Plano: " + plano.getNome() + "\n";
            aux += "Descrição: " + plano.getDescricao() + "\n";
            aux += "Valor do Plano: R$" + plano.getValor() + "\n";
        }
        return aux;
    }
}
