package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer (Comida comida) {
		if (comida !=null) {
			this.peso += comida.peso;
			System.out.println("Delicia esse "+comida.nome);
		}
	}
	
	String apresentar () {
		return "Olá meu nome é "+nome+" e tenho "+peso+" Kg";
	}

}
