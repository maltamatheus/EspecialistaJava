package br.com.especialistajava.modulo18.collections.agencia;

import java.util.Objects;

public class Hotel {

    private String nome, cidade;
    private double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        this.nome = nome;
        this.cidade = cidade;
        this.precoDiaria = precoDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if(precoDiaria < 0 ){
            throw new IllegalArgumentException("Valor da Diária não pode ser menor que 0");
        }

        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel)) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(nome, hotel.nome) && Objects.equals(cidade, hotel.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade);
    }
}