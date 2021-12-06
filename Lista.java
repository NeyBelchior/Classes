package Classes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<UsuarioLista> lista = new ArrayList<>();
		
		UsuarioLista u1=new UsuarioLista("Ana");
		
		
		lista.add(u1);
		lista.add(new UsuarioLista("Carlos"));
		lista.add(new UsuarioLista("Lia"));
		lista.add(new UsuarioLista("Bia"));
		lista.add(new UsuarioLista("Manu"));
		System.out.println(lista.get(3).nome);
		System.out.println();
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new UsuarioLista("Manu")));
		System.out.println("tem ? "+ lista.contains(new UsuarioLista("Lia")));
		
		for (UsuarioLista percorredor :lista) {
			System.out.println(percorredor.nome);
		}
		

	}

}
