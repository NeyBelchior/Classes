package Classes;

public class ValorXReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b =a; //atribuição por valor(uma copia do valor é definido na memoria)
		//pois estou trabalhando com tipo primitivo 
		
		a++;
		b--;
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
		System.out.println(a+" "+b);
		
		Data d1=new Data(1,6,2022);
		Data d2= d1;//atribuição por referencia , pois estou trabalhando objeto 
		d1.dia=32;
		d2.mes=12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		//Quando você passa um objeto como parâmetro para um método 
		//dentro desse metodo você vai receber a referencia para o bjeto em memoria
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
				
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia=1;
		d.mes=1;
		d.ano=1970;
	}//metodo estatic só acessa metodo static 
	//aqui não é uma boa pratica , pois gera impacto no objeto
	static void alterarPrimitivo(int a) {
		a++;// aqui a variável a tem um o local de memoria completamente diferente da variavel c
	}//aqui foi gerado uma copia e não uma tribuicao logoo que eu modificar aqui dentro não irá gera impacto fora( não altera c)
}
