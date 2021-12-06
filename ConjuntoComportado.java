package Classes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Set <String> listaAprovados = new HashSet<>();
		SortedSet <String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);//lembrando que um set não tem ordenação não respeita ordem
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int a :nums) {
			System.out.println(a);
			
		}
		

	}

}
