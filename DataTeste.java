package Classes;

public class DataTeste {

	public static void main(String[] args) {
		Data data1=new Data();
		Data data2=new Data();
		
		data1.ano=1995;
		data1.dia=31;
		data1.mes=05;
		
		data2.ano=1995;
		data2.dia=01;
		data2.mes=05;
		
		System.out.println(data1.obterDataFormatada());
		

	}

}
