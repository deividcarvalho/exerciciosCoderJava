package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {

	public static void main(String[] args) {
		
		//Set(Não considera itens duplicados) 
		//HashSet
		//Set<String> alunosAprovados = new HashSet<String>();
		
		//Set(Não considera itens duplicados) 
		//TreeSet (Classifica o conjunto)
		//Set<String> alunosAprovados = new TreeSet<String>();
		
		//SortedSet (Várias funções de ordenação) 
		//TreeSet (Classifica o conjunto)
		//  <> é generics
		SortedSet<String> alunosAprovados = new TreeSet<String>();
		
		
		alunosAprovados.add("Ivan");
		alunosAprovados.add("Vanêssa");
		alunosAprovados.add("Deivid");
		alunosAprovados.add("Fernanda");
		alunosAprovados.add("Lúcia");
		alunosAprovados.add("Vanêssa");
		alunosAprovados.add("Dayse");
		alunosAprovados.add("Felipe");
		alunosAprovados.add("Mateus");
		
		for (String nomes : alunosAprovados) {
			System.out.println(nomes);
		}
		
	}
}
