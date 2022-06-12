package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class MainCarroEqualsAndHashCode {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("ford"));
        listaCarros.add(new Carro("chevrolet"));
        listaCarros.add(new Carro("volkswagen"));

        //A lista contém carro ford?
        System.out.println(listaCarros.contains(new Carro("ford"))); //Utiliza Equals and HashCode, implementado na classe Carro
        System.out.println(new Carro("ford").hashCode()); //Traz o HashCode da marca

        Carro carro1 = new Carro("ford");
        Carro carro2 = new Carro("chevrolet");
        System.out.println(carro1.equals(carro2)); //Comparar se os carros são iguais
    }
}
