package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
	Comida c1 = new Comida("Arroz", 0.250);
	Comida c2 = new Comida("Feijão", 0.200);
	Comida c3 = new Comida("Picanha", 0.500);
	
	Pessoa p = new Pessoa("Deivid", 87);
	
	System.out.println(p.apresentar());
	p.comer(c1);
	System.out.println(p.apresentar());
	p.comer(c2);
	System.out.println(p.apresentar());
	p.comer(c3);
	
	Pessoa p2 = new Pessoa("Vanêssa Milena", 50.7);
	System.out.println(p2.apresentar());
	p2.comer(c3);
	p2.comer(c1);
	p2.comer(c3);
	System.out.println(p2.apresentar());
	
	String[] a = new String[10];
	a[0] = "Deivid";
	a[3] = "Vanêssa";
	a[1] = "Nanda";
	a[2] = "Lipe";
	
	System.out.println(a[0].toUpperCase());
	System.out.println(a[1].toLowerCase());
	System.out.println(a[2].toString());
	System.out.println(a[3]);
	
	
	
	}

}
