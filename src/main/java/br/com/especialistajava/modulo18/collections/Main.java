package br.com.especialistajava.modulo18.collections;

import br.com.especialistajava.modulo18.collections.agencia.CadastroHotel;
import br.com.especialistajava.modulo18.collections.agencia.Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    
    private static CadastroHotel cadastroHotel = new CadastroHotel();

    private static List<Integer> dezenasSorteadas = new ArrayList<Integer>(6);
    public static void main(String[] args) {
        List<Hotel> hoteis = cadastroHotel.obterTodos();

        System.out.println(cadastroHotel.ordenarPorPreco(hoteis));
        System.out.println(cadastroHotel.ordenarPorPrecoReverso(hoteis));
    }
}