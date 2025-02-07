package br.com.especialistajava.modulo18.collections.agencia;

import java.util.Comparator;

public class NivelClasseComparator implements Comparator<Hotel> {
    @Override
    public int compare(Hotel o1, Hotel o2) {
        return o1.getNivelClasse().compareTo(o2.getNivelClasse());
    }
}
