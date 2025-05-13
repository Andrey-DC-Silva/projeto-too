package modelo;

import java.time.Period;

public class Plano {
    private String nome;
    private String descricao;
    private double valor;

    public Plano(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirPlano() {
        System.out.println("Plano: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
    }

    @Override
    public String toString(){
        return nome;
    }

}
