package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add("Deivid");
		conjunto.add(5);
		conjunto.add(1);
		conjunto.add(3);
		conjunto.add(true);
		conjunto.add(22.6);
		conjunto.add("Vanêssa");

		
		System.out.println(conjunto.toString());
		
		System.out.println(conjunto.contains("Vanessa"));
		
		System.out.println("Tamanho do conjunto: "+conjunto.size());
		
	}

}
