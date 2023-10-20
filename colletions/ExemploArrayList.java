package colletions;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String args[]){

        ArrayList<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Carol");

        System.out.println(listaDeNomes.get(1));

        for(String nome : listaDeNomes){
            System.out.println(nome);
        }

        if(listaDeNomes.contains("Carol")){
            System.out.println("Carol está na lista");
        }

        listaDeNomes.remove("Carol");

        if(!listaDeNomes.contains("Carol")){
            System.out.println("Carol NÃO está na lista");
        }

        listaDeNomes.clear();
        if (listaDeNomes.isEmpty()) {
            System.out.println("A lista está vazia");
        }

    }
    
}
