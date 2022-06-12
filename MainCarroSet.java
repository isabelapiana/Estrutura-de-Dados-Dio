package one.digitalinnovation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainCarroSet {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>(); //Criar um conjunto de carros

        hashSetCarros.add(new Carro("ford"));
        hashSetCarros.add(new Carro("chevrolet"));
        hashSetCarros.add(new Carro("fiat"));
        hashSetCarros.add(new Carro("zip"));
        hashSetCarros.add(new Carro("alfa romeo"));

        System.out.println(hashSetCarros); //Imprime tudo fora de ordem, não preserva ordem de inserção

        Set<Carro> treeSetCarros = new TreeSet<>(); //Para usar o TreeSet, é necessário implementar a classe Comparable e o método CompareTo

        treeSetCarros.add(new Carro("ford"));
        treeSetCarros.add(new Carro("chevrolet"));
        treeSetCarros.add(new Carro("fiat"));
        treeSetCarros.add(new Carro("peugeot"));
        treeSetCarros.add(new Carro("zip"));
        treeSetCarros.add(new Carro("alfa romeo"));

        System.out.println(treeSetCarros); //Retorna conforme o tamanho da String, assim como foi determinado no CompareTo

    }
}
