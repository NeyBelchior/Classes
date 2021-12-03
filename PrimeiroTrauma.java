package Classes;

public class PrimeiroTrauma {
	int a =3;//não pode mexer aqui 
   static int b= 8;
	public static void main(String[] args) {
		//pode mexer aqui
		PrimeiroTrauma p =new PrimeiroTrauma();
		System.out.println(p.a);
		System.out.println(b);
//eu só consigo acessar um atributo de instancia atraves de um metodo estatico (out)
		//se eu criar uma instancia na classe em que quero acessar ele
	}

}
