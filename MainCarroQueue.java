package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class MainCarroQueue {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>(); //Adicionar fila de carros

        queueCarros.add(new Carro("ford"));
        queueCarros.add(new Carro("chevrolet"));
        queueCarros.add(new Carro("fiat"));

        System.out.println(queueCarros.add(new Carro("peugeot"))); //Retorna true se conseguiu adicionar (conseguiu). Se não conseguir, dá erro.
        System.out.println(queueCarros); //Exibe por ordem de entrada na fila

        System.out.println(queueCarros.offer(new Carro("renault"))); //Retorna true se conseguir adicionar, retorna false caso não consiga (ao contrário do add, não dá erro).
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //Pega o primeiro elemento ao entrar na fila (não remove) e depois mostra a fila
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //Pega o primeiro elemento e depois o remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty()); //Conferir se está vazio
    }
}
