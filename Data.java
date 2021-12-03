package Classes;

public class Data {
	int dia;
	int mes;
	int ano;
/*Eu posso chamar o this também para chamar outro construtor dentro da classe
 * */
	Data(){
	//dia=1;
	//mes=1;
	//ano=1970;
		this(1,1,1970);//aqui só posso usar dentro de um construtor
		
	}
	
	/*this:
	 * o this pode ser usado independente de você ter conflito de nomes.
	 * sempre que você quiser acessar uma variável de INSTANCIA vocẽ pode usar o this.nomeDaVariavel
	 * Eu uso o this para referenciar o objeto que está sendo criado naquele momento
	 *  
	 * 
	 * 
	 * 
	 * 
		*/
	     //esses parametros só estarão visíveis durante a construção do objeto
	Data(int dia,int mes,int ano){
		//this(); aqui não pode pois eu tenho o segundo construtor chamando o primeiro
		//gerando um looping
		
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
		
		
		
	}
	
	/*Aqui também temos um método que pertence a instância logo eu também consigo acessar
	 * o dia através do this
	 * o this aponta para o objeto atual que esta executando esse código 
	 * 
	 * Já para metodos de classe (static) não tem como chamar o this
	 * */
	String obterDataFormatada () {
		//linha 48 variavel local, o que vem antes dela não estará visível só a paritir da definição para baixo e também no escopo do método 
		final String formato ="%d/%d/%d";//this.dia é facultativo 
		return String.format(formato, this.dia,mes,ano);
		
	}
	 
	 //ou fazer usando string format
	 
	void   imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
		 
	 }
}
