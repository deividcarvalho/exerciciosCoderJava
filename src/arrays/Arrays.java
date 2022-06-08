package arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		//Array � um objeto
		//� homog�neo (tem um mesmo tipo)
		//� est�tico (Tamanho Fixo definido na cria��o)
		//O tamanho n�o pode ser alterado, mas pode ser atribuido a um outro Array
		//Pode ser multidimensional
		
		
		String[] a = new String[10];
		a[0] = "Deivid";
		a[1] = "Nanda";
		a[2] = "Lipe";
		a[3] = "Van�ssa";
		
		System.out.println(a[0].toUpperCase());
		System.out.println(a[1].toLowerCase());
		System.out.println(a[2].toString());
		System.out.println(a[3].length());
	}

}
