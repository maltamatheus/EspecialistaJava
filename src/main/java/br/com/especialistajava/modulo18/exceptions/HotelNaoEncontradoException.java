package br.com.especialistajava.modulo18.exceptions;

public class HotelNaoEncontradoException extends RuntimeException {
    public HotelNaoEncontradoException(String msg) {
        super(msg);
    }
}
