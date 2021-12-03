package Classes;

public class TeoriaNull {
	public static void main(String[] args) {
		
		String s1 ="";
		System.out.println(s1.concat("!!!!!"));
		
		//String s2= null;
		//System.out.println(s2.concat("????"));
		//null pointer(runtime) é você ter uma variável nula e você tentar acessar um atributo dessa variável nula
		
		//String s3;
		//System.out.println(s2.concat("????"));
		//erro de compilação que não permite nem que meu codigo execute 
	
		Data d1 =Math.random()>0.5?new Data():null;
		if(d1!=null) {
			d1.mes=3;
			System.out.println(d1.obterDataFormatada());
		}
		String s3=Math.random()>0.5?"opa":null;
	if(s3!=null) {
		System.out.println(s3.concat("????"));
	}
	}
	

}
