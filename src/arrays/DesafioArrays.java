package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do Array: ");
		int tamanhoDoArray = sc.nextInt();
		double notas[] = new double[tamanhoDoArray];

		System.out.println(Arrays.toString(notas));

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1));
			notas[i] = sc.nextDouble();
		}

		System.out.println(Arrays.toString(notas));

		double total = 0;

		for (double somaNotas : notas) {
			total += somaNotas;
		}

		double media = total / notas.length;

		System.out.println("A média do aluno é: " + media);

		sc.close();

	}

}
