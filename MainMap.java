package one.digitalinnovation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>(); //Chaves e valores
        aluno.put("Nome","João");
        aluno.put("Idade","17");
        aluno.put("Media","8.5");
        aluno.put("Turma","3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet()); //Retorna as chaves

        System.out.println(aluno.values()); //Retorna os valores

        List<Map<String,String>> listaAlunos = new ArrayList<>(); //Fazer uma lista de Map

        listaAlunos.add(aluno);

        Map<String,String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade","10");
        aluno2.put("Media","8.9");
        aluno2.put("Turma","3b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome")); //aluno contém uma chave chamada Nome?
    }
}
