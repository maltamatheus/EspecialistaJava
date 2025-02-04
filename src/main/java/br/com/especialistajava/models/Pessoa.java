package br.com.especialistajava.models;

import java.util.Date;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Date dtNascto;

    public Pessoa(String nome, Integer idade, Date dtNascto){
        this.nome = nome;
        this.idade = idade;
        this.dtNascto = dtNascto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDtNascto() {
        return dtNascto;
    }

    public void setDtNascto(Date dtNascto) {
        this.dtNascto = dtNascto;
    }

    public void imprimirNome(String nome){
        System.out.println("O nome da pessoa foi " + nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dtNascto=" + dtNascto +
                '}';
    }

}
