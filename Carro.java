package one.digitalinnovation;

import java.util.Objects;

public class Carro implements Comparable<Carro>{

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return Objects.equals(getMarca(), carro.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carro o) {
        if(this.marca.length()<o.marca.length()){ //comparar pelo tamanho da String
            return -1; //caso a primeira String seja menor
        }
        else if(this.marca.length()> o.marca.length()){
            return 1; //caso a primeira String seja maior
        }
        return 0; //caso as Strings sejam iguais
    }

    /*
    Para comparar por ordem alfabética:

    @Override
    public int compareTo(Carro o){
    return this.getMarca().compareTo(o.getMarca());
    }
     */
}
