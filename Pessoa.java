package Classes;

public class Pessoa {

String	nome;
Double peso;

Pessoa(String nome,Double peso){
	
	this.nome=nome;
	this.peso=peso;
	
	}	
void comer (Comida c) {
	peso+=c.peso;
	
}

	
}
