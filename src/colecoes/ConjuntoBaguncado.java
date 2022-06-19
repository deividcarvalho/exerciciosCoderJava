package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	public static void main(String[] args) {
		
		HashSet conjuntoPais = new HashSet();
		
		conjuntoPais.add("Deivid");
		conjuntoPais.add("Vanêssa");
		conjuntoPais.add("Família");
		
		HashSet conjuntoFilhos = new HashSet();
		conjuntoFilhos.add("Fernanda");
		conjuntoFilhos.add("Felipe");
		conjuntoFilhos.add("Família");
		
		System.out.println("Pais: "+conjuntoPais.toString());
		System.out.println("Filhos: "+conjuntoFilhos.toString());
		
		conjuntoPais.addAll(conjuntoFilhos); //União de um conjunto com outro
		System.out.println(conjuntoPais.toString());
		
		conjuntoPais.retainAll(conjuntoFilhos); // Intercessão entre dois conjuntos (O que tem em comum entre eles!)

		System.out.println(conjuntoPais);
		
		
	}

}
