package arrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {

		// Array é um objeto
		// É homogêneo (tem um mesmo tipo)
		// É estático (Tamanho Fixo definido na criação)
		// O tamanho não pode ser alterado, mas pode ser atribuido a um outro Array
		// Pode ser multidimensional

		String[] a = new String[10];
		a[0] = "Deivid";
		a[1] = "Nanda";
		a[2] = "Lipe";
		a[3] = "Vanêssa";

		System.out.println(a[0].toUpperCase());
		System.out.println(a[1].toLowerCase());
		System.out.println(a[2].toString());
		System.out.println(a[3].length());

		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.0;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 7.7;

		System.out.println("Notas do AlunoA: "+Arrays.toString(notasAlunoA));

		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}

		System.out.println("A média do aluno A é: " + total / notasAlunoA.length);

		double[] notasAlunoB = new double[3];
		notasAlunoB[0] = 8.5;
		notasAlunoB[1] = 7.25;
		notasAlunoB[2] = 6.43;
		
		System.out.println("Notas do AlunoB: "+Arrays.toString(notasAlunoB));

		double totalNotaB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalNotaB += notasAlunoB[i];
		}
		
		System.out.println("A média do aluno B é: "+totalNotaB/notasAlunoB.length);
		

	}

}
