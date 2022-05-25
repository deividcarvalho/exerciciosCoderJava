package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		Produto p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.printf("Pre�o R$ %.2f \n", precoFinal1);
		
		System.out.printf("Pre�o R$ %.2f \n",precoFinal2);
		double precoFinal = (precoFinal1+precoFinal2)/2;
		
		System.out.printf("Pre�o M�dio R$ %.2f \n",precoFinal);
	}

}
