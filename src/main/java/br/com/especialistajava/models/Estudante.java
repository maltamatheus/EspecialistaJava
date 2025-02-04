package br.com.especialistajava.models;

import java.sql.DataTruncation;
import java.util.Date;

public class Estudante extends Pessoa{

    public Estudante(String nome, Integer idade, Date dtNascto) {
        super(nome, idade, dtNascto);
    }

    private Integer matricula;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public void imprimirNome(String nome){
        System.out.println("O nome do estudante " + nome);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "matricula=" + matricula +
                '}';
    }
}
