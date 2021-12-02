package Classes;

public class Produto {

   String nome;
   double preco;
  static double desconto=0.25;
   
 Produto(String nomeInicial,double precoInicial){
	 preco=precoInicial;
	 nome=nomeInicial;
	
	 
	   
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
