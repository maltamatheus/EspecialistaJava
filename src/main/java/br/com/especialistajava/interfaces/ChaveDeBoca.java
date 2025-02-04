package br.com.especialistajava.interfaces;

public interface ChaveDeBoca extends Ferramenta{
    String tamanho();
    String tipo();

    static boolean apertou(int qtasVezes){
        return qtasVezes > 10;
    }
}
