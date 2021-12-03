package Classes;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 =new Pessoa("Ney",80.0);
		Comida c1 =new Comida("Feijoada",0.500);
		
		System.out.println(p1.peso);
		p1.comer(c1);
		System.out.println(p1.peso);
	

	}

}
