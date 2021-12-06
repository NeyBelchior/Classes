package Classes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<>();
		//offer e add >> adiciona elemento na fila
		
		//Para filas com valores pré-definidos caso o numero de elementos cheque ao máximo ele retorna false, ja o add retorna um exception
		//A diferença do comportamento ocorre quando a fila está cheia
		fila.add("Ana");//retorna false
		fila.offer("bia");//lança uma execption
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
        
		//vão retornar o elemento da fila sem remover
		//a diferença do comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek());//caso não tenha ninguem retorna nulo
		System.out.println(fila.peek());
		System.out.println(fila.element());//no such element excepetion, caso não tenha
		

		
		//poll e remove >obter o próximo elemento da fila e remove
		//retorna os elementos da fila removendo fifo
		//a diferença do comportamento ocorre quando a fila está vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //retorna uma execpetion
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());//quando não tiver mais elemento retorna null
		
		
		//System.out.println(fila.size());
	   //System.out.println(fila.clear());
	//System.out.println(fila.isEmpty());
		
	//System.out.println(fila.contains(fila));
	}

}
