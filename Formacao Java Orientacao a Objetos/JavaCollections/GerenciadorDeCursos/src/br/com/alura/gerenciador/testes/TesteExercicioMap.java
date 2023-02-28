package br.com.alura.gerenciador.testes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteExercicioMap {
	
	public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        //pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));
        
        System.out.println("Chaves: ");
        Set<Integer> setDeChaves = pessoas.keySet();
        for(Integer chave : setDeChaves) {
        	System.out.println(chave);
        }
        System.out.println();
        
        System.out.println("Valores: ");
        Collection<String> collectionDeValores = pessoas.values();
        for(String valor : collectionDeValores) {
        	System.out.println(valor);
        }
	
        // associacao do map entre suas chaves e valores
        System.out.println("\nAssociacao: ");
        Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
        System.out.println(associacoes);
        
        for(Entry<Integer, String> associacao : associacoes) {
        	System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
        
	}

}
