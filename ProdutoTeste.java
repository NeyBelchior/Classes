package Classes;



public class ProdutoTeste {

	public static void main(String[] args) {

	Produto p1=new Produto("Notebook");
	//p1.nome="Notebook";
	p1.preco=4356.89;
	
	Produto.desconto=0.29;
	
	
	
	var p2 = new Produto();
	
	p2.nome="Caneta Preta";
	p2.preco=12.56;
	
	
	System.out.println(p1.nome +" "+p1.precoComDesconto());
	System.out.println(p2.nome +" "+p1.precoComDesconto());
	double precofinal1 = p1.precoComDesconto();
	double precofinal2 = p2.precoComDesconto(0.1);
	double mediaCarrinho=(precofinal1+precofinal2)/2;
	
	System.out.printf("Media do carrinho = R$%.2f.",mediaCarrinho);
	
	}

}
