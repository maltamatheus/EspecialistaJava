package br.com.especialistajava.modulo18.collections.megasena;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

    private int qtdeSorteada;

    private List<Integer> numerosSorteados = new ArrayList<Integer>(6);

    private boolean numeroValido = false;

    private final Random GERADOR = new Random();

    private Integer numero;
    @Override
    public boolean hasNext() {
        return qtdeSorteada < 6;
    }

    @Override
    public Integer next() {
        numeroValido = false;
        while(!numeroValido){
            numero = GERADOR.nextInt(60);
            if(numerosSorteados.contains(numero)){
                numeroValido = false;
            } else {
                numerosSorteados.add(numero);
                qtdeSorteada++;
                numeroValido = true;
            }
        }
        return numero;
    }
}
