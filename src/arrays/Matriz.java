package arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Informe a quantidade de notas: ");
		int qtdNotas = entrada.nextInt();
		
		System.out.println("Qtd alunos: "+qtdAlunos);
		System.out.println("Qtd notas: "+qtdNotas);
		
		double notasDaTurma [][] = new double [qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {//percorrer os alunos da turma
			for (int n = 0; n < notasDaTurma[a].length; n++) {//percorrer as notas do aluno
				
				System.out.printf("Informe a nota %d do aluno %d: ",n+1,a+1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
				
			}
		}
		
		double media = total/(qtdAlunos*qtdNotas);
		System.out.println("A média da turma é: "+media);
		
		
		entrada.close();
		
		
	}

}
