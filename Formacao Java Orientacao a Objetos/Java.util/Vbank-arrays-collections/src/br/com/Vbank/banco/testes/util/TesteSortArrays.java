package br.com.Vbank.banco.testes.util;
import java.util.Arrays;

public class TesteSortArrays
{
    public static void main(String[] args) {
    	
        int[] numeros = new int[]{43, 15, 64, 22, 89};

        Arrays.sort(numeros); //método utilitário sort

        System.out.println(Arrays.toString(numeros)); //método utilitário toString

    }
}
