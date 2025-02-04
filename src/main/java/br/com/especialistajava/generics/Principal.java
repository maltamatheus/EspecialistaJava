package br.com.especialistajava.generics;

import java.util.Random;

public class Principal {

    public static final Random RANDOM = new Random();
    public static void main(String[] args) {
        String[] apostolos = {"Matheus","Marcos","Lucas","João"};
        Integer[] numerosPares = {2,4,6,8,10,12};

        sortear(numerosPares);

//        System.out.println("O apóstolo escolhido foi: " + sortear(apostolos));
//        System.out.println("O número escolhido foi: " + sortear(numerosPares));
    }

    public static <T> void sortear(T[] lista){
        if (lista.length <= 0){
            throw new IllegalArgumentException("A lista não pode estar vazia");
        }

        int idx = RANDOM.nextInt(lista.length);

        System.out.println("O item sorteado foi " + lista[idx]);

    }

}
