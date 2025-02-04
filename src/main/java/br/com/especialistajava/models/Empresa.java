package br.com.especialistajava.models;

public class Empresa {

    public void contratar(Estagiario estagiario){
        System.out.println("Contratei o estagiário " + estagiario.getNome());
    }

    public void contratar(Pessoa pessoa){
        System.out.println("Contratei o fulano " + pessoa.getNome());
    }

    public void contratar(Estudante estudante){
        System.out.println("Contratei o aluno " + estudante.getNome());
    }
}
