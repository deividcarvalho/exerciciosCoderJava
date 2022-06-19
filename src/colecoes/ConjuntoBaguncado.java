package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	public static void main(String[] args) {
		
		HashSet conjuntoPais = new HashSet();
		
		conjuntoPais.add("Deivid");
		conjuntoPais.add("Van�ssa");
		conjuntoPais.add("Fam�lia");
		
		HashSet conjuntoFilhos = new HashSet();
		conjuntoFilhos.add("Fernanda");
		conjuntoFilhos.add("Felipe");
		conjuntoFilhos.add("Fam�lia");
		
		System.out.println("Pais: "+conjuntoPais.toString());
		System.out.println("Filhos: "+conjuntoFilhos.toString());
		
		conjuntoPais.addAll(conjuntoFilhos); //Uni�o de um conjunto com outro
		System.out.println(conjuntoPais.toString());
		
		conjuntoPais.retainAll(conjuntoFilhos); // Intercess�o entre dois conjuntos (O que tem em comum entre eles!)

		System.out.println(conjuntoPais);
		
		
	}

}
