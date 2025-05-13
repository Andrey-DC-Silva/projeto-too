package modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

    public void adicionarAvaliacao(AvaliacaoFisica avalicao){
        avaliacoes.add(avalicao);
    }

    public String mostrarAvaliacoes(){
        String aux = "Historico de Avaliações: /n";
        for(AvaliacaoFisica cadaAvaliacao : avaliacoes){
            aux += "->> " + cadaAvaliacao + "/n";
        }
        return aux;
    }

    public String getMatricula(){ return matricula; }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibirDados(){
        String aux = super.exibirDados();
        aux += "/nMatricula: " + matricula;
        aux += "/nAvalições Físicas: " + avaliacoes.size() + "/n";
        return aux;
    }
}
