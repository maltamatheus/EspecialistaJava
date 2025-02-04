package br.com.especialistajava.modulo18.collections.agencia;

import br.com.especialistajava.modulo18.exceptions.HotelNaoEncontradoException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<Hotel>(1000);

    public CadastroHotel(){
        hoteis.add(new Hotel("Hotel 0", "Cidade 0", 1000));
        hoteis.add(new Hotel("Hotel 1", "Cidade 1", 1100));
        hoteis.add(new Hotel("Hotel 2", "Cidade 2", 1200));
        hoteis.add(new Hotel("Hotel 3", "Cidade 3", 1300));
        hoteis.add(new Hotel("Hotel 4", "Cidade 4", 1400));
        hoteis.add(new Hotel("Hotel 4", "Cidade 4", 1401));
        hoteis.add(new Hotel("Hotel 4", "Cidade 4", 1402));
        hoteis.add(new Hotel("Hotel 4", "Cidade 4", 1403));
        hoteis.add(new Hotel("Hotel 5", "Cidade 5", 1500));
    }

    public void adicionar(Hotel hotel){
        if(!hoteis.contains(hotel)){
        }
            hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos(){
        return hoteis;
    }

    public void removerHotel(Hotel hotel){
        if(hoteis.remove(hotel)){
            System.out.printf("O Hotel %s da cidade %s foi removido com sucesso %n", hotel.getNome(), hotel.getCidade());
        } else {
            throw new HotelNaoEncontradoException("Hotel inexistente");
        }
    }

    public void removerHotel2(Hotel hotel){
        int i = 0;
        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<Hotel>(1000);

        while (i < hoteis.size()){
            if(hoteis.get(i).equals(hotel)){
                hoteisParaRemocao.add(hoteis.get(i));
            }
            i++;
        }

        System.out.println(hoteisParaRemocao);

        hoteis.removeAll(hoteisParaRemocao);
    }

    public void removerHotel3(Hotel hotel){
        Iterator<Hotel> hotelIterator = hoteis.iterator();

        List<Hotel> listaH = new ArrayList<Hotel>(1000);

        while (hotelIterator.hasNext()){
            Hotel h = hotelIterator.next();
            if(h.equals(hotel)){
                hotelIterator.remove();
            } else {
                listaH.add(h);
            }
        }

        imprimir(listaH.iterator());
        System.out.println("**************************");
        System.out.println("AGORA NO SENTIDO INVERSO");
        System.out.println("**************************");
        imprimir2(listaH.listIterator(listaH.size()));

    }

    private void imprimir(Iterator<Hotel> hotelIterator) {
        while (hotelIterator.hasNext()){
            Hotel hotel = hotelIterator.next();
            System.out.printf("%s - %s - %.2f%n",hotel.getNome(),hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
    private void imprimir2(ListIterator<Hotel> hotelListIterator) {
        while (hotelListIterator.hasPrevious()){
            Hotel hotel = hotelListIterator.previous();
            System.out.printf("%s - %s - %.2f%n",hotel.getNome(),hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }


    public void imprimirCadastro(){
        for (int i = 0; i < hoteis.size();i++) {
            System.out.printf("Índice: %d - %s - %s - %.2f%n",
                    i, hoteis.get(i).getNome(), hoteis.get(i).getCidade(), hoteis.get(i).getPrecoDiaria());
        }

        System.out.println("Total de Hotéis: " + hoteis.size());
    }

    public void imprimirCadastro2(){
        Iterator<Hotel> hotelIterator = hoteis.iterator();

        Hotel hotel = null;

        while(hotelIterator.hasNext()){
            hotel = hotelIterator.next();
            System.out.printf("%s fica na cidade %s e sua diária custa %.2f%n",
                    hotel.getNome()
                   ,hotel.getCidade()
                   ,hotel.getPrecoDiaria());
        }
    }

    public void truncateCadastro(){
        hoteis.clear();
    }
}
