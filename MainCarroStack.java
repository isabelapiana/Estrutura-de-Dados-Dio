package one.digitalinnovation;

import java.util.Stack;

public class MainCarroStack {
    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("ford"));
        stackCarros.push(new Carro("chevrolet"));
        stackCarros.push(new Carro("fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); //Retirou quem foi adicionado por último/quem estava no topo da pilha (fiat)
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek()); //mostra individualmente, mas não retira
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty()); //testa se a pilha está vazia (não está)
    }
}
