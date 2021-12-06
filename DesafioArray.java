package Classes;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		
		
	Scanner entrada =new Scanner(System.in);		
	
	System.out.println("Digite a quantidade de notas que você possui");
	int qtde = entrada.nextInt();
	double[] notas = new double[qtde];
	int contadorNota=1;
	for (int i=0;i<notas.length;i++) {
		
		System.out.println("Digite a "+ contadorNota +" nota.");
		double notaInformada=entrada.nextDouble();
		notas[i]=notaInformada;
		System.out.println("Nota "+notaInformada + " foi adicionada no indice "+ i);
	    contadorNota++;
	}
	double total =0;

	for(double nota :notas ) {
	
		total+=nota;
		}
	
	System.out.println("A média é :"+total/notas.length);
	
	entrada.close();


	}

}
