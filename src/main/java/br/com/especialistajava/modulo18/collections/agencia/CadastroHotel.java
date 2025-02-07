package br.com.especialistajava.modulo18.collections.agencia;

import br.com.especialistajava.modulo18.exceptions.HotelNaoEncontradoException;

import java.util.*;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<Hotel>(1000);
    private final LinkedList<Hotel> hoteisLL = new LinkedList<>();

    public CadastroHotel(){
        hoteis.add(new Hotel("Hotel 0", "Cidade 0", "A",1000));
        hoteis.add(new Hotel("Hotel 1", "Cidade 1","B", 1100));
        hoteis.add(new Hotel("Hotel 1", "Cidade 1.2","C", 1200));
        hoteis.add(new Hotel("Hotel 3", "Cidade 3","A", 1300));
        hoteis.add(new Hotel("Hotel 4", "Cidade 4.1","B", 1400));
        hoteis.add(new Hotel("Hotel 4", "Cidade 4.2","C", 1400));
        hoteis.add(new Hotel("Hotel 4", "Cidade 4.3","A", 1400));
        hoteis.add(new Hotel("Hotel 4", "Cidade 4.4","B", 1400));
        hoteis.add(new Hotel("Hotel 5", "Cidade 5","C", 1500));
    }



    public void adicionar(Hotel hotel){
        if(!hoteis.contains(hotel)){
        }
            hoteis.add(hotel);
    }

    public void adicionarNoInicio(Hotel hotel){
        if(!hoteisLL.contains(hotel)){
            hoteisLL.addFirst(hotel);
        }
    }

    public List<Hotel> ordenarPorPreco(List<Hotel> hoteis){
        hoteis.sort(new PrecoHotelComparator());
        return hoteis;
    }
    public List<Hotel> ordenarPorPrecoReverso(List<Hotel> hoteis){
        hoteis.sort(new PrecoHotelComparator().reversed().thenComparing(new NivelClasseComparator())
                .thenComparing(Comparator.naturalOrder().reversed()));
        return hoteis;
    }

    public void adicionarLL(Hotel hotel){
        if(!hoteisLL.contains(hotel)){
            hoteisLL.add(hotel);
        }
    }

        public void adicionarNoFim(Hotel hotel){
        if(!hoteisLL.contains(hotel)){
            hoteisLL.addLast(hotel);
        }
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
        System.out.println("AGORA ITERANDO NO SENTIDO INVERSO");
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
        public void imprimirCadastro3(){
        for (int i = 0; i < hoteisLL.size();i++) {
            System.out.printf("Índice: %d - %s - %s - %.2f%n",
                    i, hoteisLL.get(i).getNome(), hoteisLL.get(i).getCidade(), hoteisLL.get(i).getPrecoDiaria());
        }

        System.out.println("Total de Hotéis: " + hoteisLL.size());
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

    public Hotel[] transformarListaEmArray(){
        return hoteis.toArray(new Hotel[0]);
    }
}
