package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class MainCarroList {
    public static void main(String[] args) {

        List<Carro> listCarro = new ArrayList<>();

        listCarro.add(new Carro("ford"));
        listCarro.add(new Carro("chevrolet"));
        listCarro.add(new Carro("fiat"));
        listCarro.add(new Carro("peugeot"));

        System.out.println(listCarro.contains(new Carro("ford"))); //Testa se existe o ford na lista

        System.out.println(listCarro.get(2)); //Pega o carro que está no índice 2

        System.out.println(listCarro.indexOf(new Carro("fiat"))); //Em qual índice está o fiat?

        System.out.println(listCarro.remove(2));
        System.out.println(listCarro); //removeu o carro do índice 2

    }
}

