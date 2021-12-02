package Classes;

public class Data {
	int dia;
	int mes;
	int ano;

	Data(){
		dia=1;
		mes=1;
		ano=1970;
	}
	
	Data(int diaInicial,int mesInicial,int anoInicial){
		dia=diaInicial;
		mes=mesInicial;
		ano=anoInicial;
		
		
		
	}
	String obterDataFormatada () {
		
		
		return  Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano) ;
		
	}
	 
	 //ou fazer usando string format
	 
	void   imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
		 
	 }
}
