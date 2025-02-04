package br.com.especialistajava.models;

import br.com.especialistajava.interfaces.ChaveDeBoca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Principal {

    public static void main(String[] args) throws ParseException {
        Estudante estudante = new Estudante("Matheus",44, new SimpleDateFormat("dd/MM/yyyy").parse("26/06/1980"));
        Estagiario estagiario = new Estagiario("Matheus",44, new SimpleDateFormat("dd/MM/yyyy").parse("26/06/1980"));
        estagiario.setNumContrato("123456");
        Pessoa pessoa = new Pessoa("Matheus",44, new SimpleDateFormat("dd/MM/yyyy").parse("26/06/1980"));

//        metodoQualquer(estagiario);

//        Empresa empresa = new Empresa();
//
//        empresa.contratar(estudante);

        System.out.println(estagiario.toString());
        System.out.println(estudante.toString());
        System.out.println(pessoa.toString());

    }

    public static Map<Integer,Integer> returnHighestValueOfAnArray(ArrayList<Integer> list, int k){
        int element = list.get(0);
        Map<Integer,Integer> elementsInDescendingOrder = new HashMap<Integer,Integer>();
        int start = 1;
        while (start <= k){
            for (int idx = 1;idx <= list.size();idx++){
                if (element < list.get(idx) && !elementsInDescendingOrder.containsValue(element)){
                    element = list.get(idx);
                }
            }

            elementsInDescendingOrder.put(start,element);
            start++;
        }

        return elementsInDescendingOrder;
    }

    public static void metodoQualquer(Pessoa pessoa){

        Estudante estudante;

        if(pessoa instanceof Estudante) {
            estudante = (Estudante) pessoa;
            estudante.setMatricula(10);
            pessoa.imprimirNome(estudante.getNome());
            return;
        }

        System.out.println(pessoa.toString());

    }
}
