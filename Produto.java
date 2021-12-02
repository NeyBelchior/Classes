package Classes;

public class Produto {

   String nome;
   double preco;
   double desconto;
   
 Produto(String nomeInicial,double precoInicial,double descontoInicial){
	 preco=precoInicial;
	 nome=nomeInicial;
	 desconto=descontoInicial;
	 
	   
   }
   Produto(String nomeInicial){
	   nome=nomeInicial;
	   
   }
   Produto(){
	   
   }
      
   
   
   Double precoComDesconto(){
	  
	   return preco*(1-desconto);
   }
  Double precoComDesconto(double descontoDoGerente){
	  
	   return preco*(1-desconto+descontoDoGerente);
  }

	

}
