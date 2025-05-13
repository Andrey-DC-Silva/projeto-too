package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private String CPF;
    private LocalDate dtNasc;

    Pessoa(String nome){nome = nome;}

    Pessoa(){

    }

    Pessoa(String nome, String CPF){
        this.nome = nome;
        setCPF(CPF);
    }

    public String exibirDados(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String aux = "Dados da Pessoa Cadastrada: /n";
        aux += "Nome: " + nome + "/n";
        if(CPF != null){
            aux += "CPF: " + CPF + "/n";
        }
        if(dtNasc != null){
            aux += "Data de Nascimento: " + dtNasc + "/n";
        }
        return aux;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "").trim();
        if(cpf != null && cpf.length() == 11){
            this.CPF = cpf;
        }
        else{
            System.out.println("CPF inválido.");
        }
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }
    public void setDtNasc(LocalDate dtN){
        dtNasc = dtN;
    }

    @Override
    public String toString() {
        return nome;
    }
}
