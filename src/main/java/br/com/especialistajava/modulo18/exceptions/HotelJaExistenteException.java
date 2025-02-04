package br.com.especialistajava.modulo18.exceptions;

public class HotelJaExistenteException extends RuntimeException {
    public HotelJaExistenteException(String s) {
        super(s);
    }
}
