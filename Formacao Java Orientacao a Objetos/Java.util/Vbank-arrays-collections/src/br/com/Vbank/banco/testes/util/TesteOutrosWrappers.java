package br.com.Vbank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeInt = Integer.valueOf(30); // autoboxing
		int i = idadeInt.intValue(); // unboxing
		System.out.println(i);
		
		Double idadeDouble = Double.valueOf(30);
		double d = idadeDouble.doubleValue();
		System.out.println(d);
		
		Boolean bRef = Boolean.FALSE;
		boolean b = bRef.booleanValue();
		System.out.println(b);
		
		Number refNumero = Integer.valueOf(20);
		
		List<Number> listaNumeros = new ArrayList<>();
		listaNumeros.add(5);
		listaNumeros.add(2.4);
		listaNumeros.add(5.8F);
		
		// testes de autoboxing e unboxing
		
		Integer idadeRef = 29; // autoboxinng, é criado um objeto do tipo Integer
		int primitivo = new Integer(21); // unboxing
		
		int a = 1;
		int c = 2;

		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef);
		lista.add(primitivo); // autoboxing
		lista.add(a); // autoboxing
		lista.add(c); // autoboxing

		int i1 = lista.get(0); // unboxing
		Integer i2 = lista.get(1);

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(lista);
		
	}

}
