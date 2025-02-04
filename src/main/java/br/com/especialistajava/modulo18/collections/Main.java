package br.com.especialistajava.modulo18.collections;

import br.com.especialistajava.modulo18.collections.agencia.CadastroHotel;
import br.com.especialistajava.modulo18.collections.agencia.Hotel;

import java.util.ArrayList;

public class Main {
    
    private static CadastroHotel cadastroHotel = new CadastroHotel();

    public static void main(String[] args) {
        cadastroHotel.removerHotel3(new Hotel("Hotel 4", "Cidade 4", 0));
    }
    
}
