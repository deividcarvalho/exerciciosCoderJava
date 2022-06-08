package arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		//Array é um objeto
		//É homogêneo (tem um mesmo tipo)
		//É estático (Tamanho Fixo definido na criação)
		//O tamanho não pode ser alterado, mas pode ser atribuido a um outro Array
		//Pode ser multidimensional
		
		
		String[] a = new String[10];
		a[0] = "Deivid";
		a[1] = "Nanda";
		a[2] = "Lipe";
		a[3] = "Vanêssa";
		
		System.out.println(a[0].toUpperCase());
		System.out.println(a[1].toLowerCase());
		System.out.println(a[2].toString());
		System.out.println(a[3].length());
	}

}
