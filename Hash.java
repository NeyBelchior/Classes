package Classes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<UsuarioLista> usuarios =new HashSet<>();
		
		usuarios.add(new UsuarioLista ("Pedro"));
		usuarios.add(new UsuarioLista ("Ana"));
		usuarios.add(new UsuarioLista ("Guilherme"));
		
		boolean resultado = usuarios.contains("Ana");
		
		System.out.println(resultado);
		

	

	}

}
