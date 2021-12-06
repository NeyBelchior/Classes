package Classes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		//conceito de pilha é igual o livro lifo
		//last in first out
		
		Deque<String> livros  = new ArrayDeque<>();
		livros.add("O pequeno principe");//se add ou nao retorna true ou false
		livros.push("Don Quixote");// retorna uma execption se o elemento que eu tentar adicionar for restrito por restrições de capacidade
        livros.push("O Hobbit");
        
        for(String percorre : livros) {
        	System.out.println(percorre);
        }
        System.out.println(livros.peek());
        System.out.println(livros.element());
   
        System.out.println(livros.pop());//joga execessão 
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        //System.out.println(livros.poll());
      //  System.out.println(livros.remove());//joga execessão 
        
        System.out.println(livros.size());
        System.out.println();
        
     //   livros.size();
       // livros.clear();
        //livros.contains("ney");
        //livros.isEmpty();
        
       
	}

}
