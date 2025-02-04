package br.com.especialistajava.exceptions;

public class Principal {
    public static void main(String[] args) {
        metodo01();
    }

    static void metodo01() {
        System.out.println("Início metodo01");
        try {

            try {
                System.out.println("Início Try / Catch");
                int x = 10 / 0;
                System.out.println("Fim Try / Catch");
            } catch (Exception e) {
//                throw new RuntimeException("Programa encerrado inesperadamente... Verifique o erro...\n" + e.getMessage());
                throw e;
            }
        } catch (Exception e) {
//            throw new RuntimeException("Capturando os erros gerais...\n" + e.getMessage());
            throw e;
        }
        System.out.println("Fim metodo01");

    }
}
