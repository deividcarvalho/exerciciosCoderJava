package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {

	public static void main(String[] args) {
		
		//Set(N�o considera itens duplicados) 
		//HashSet
		//Set<String> alunosAprovados = new HashSet<String>();
		
		//Set(N�o considera itens duplicados) 
		//TreeSet (Classifica o conjunto)
		//Set<String> alunosAprovados = new TreeSet<String>();
		
		//SortedSet (V�rias fun��es de ordena��o) 
		//TreeSet (Classifica o conjunto)
		//  <> � generics
		SortedSet<String> alunosAprovados = new TreeSet<String>();
		
		
		alunosAprovados.add("Ivan");
		alunosAprovados.add("Van�ssa");
		alunosAprovados.add("Deivid");
		alunosAprovados.add("Fernanda");
		alunosAprovados.add("L�cia");
		alunosAprovados.add("Van�ssa");
		alunosAprovados.add("Dayse");
		alunosAprovados.add("Felipe");
		alunosAprovados.add("Mateus");
		
		for (String nomes : alunosAprovados) {
			System.out.println(nomes);
		}
		
	}
}
