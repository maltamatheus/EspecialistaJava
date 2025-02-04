package br.com.especialistajava.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Estagiario extends Estudante{

    private String numContrato;

    public Estagiario(String nome, Integer idade, Date dtNascto){
        super(nome, idade, dtNascto);
    }

    @Override
    public void imprimirNome(String nome){
        System.out.println("O nome passado em Estagiário foi " + nome);
    }

    public void correr10km(){
        System.out.println(this.getNome() + " correu 10km");
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "numContrato='" + numContrato + '\'' +
                '}';
    }
}
