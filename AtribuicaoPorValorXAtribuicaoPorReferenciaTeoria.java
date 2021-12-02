package Classes;

public class AtribuicaoPorValorXAtribuicaoPorReferenciaTeoria {
	
	/*Por valor : Primitivos
	 * int a = 2;
	 * Aqui no espaço de memória do computador eu terei um rótulo que eu chamei de a
	 * e dentro dele vai ter um valor 2
	 * quando eu defino um int b = a; Nesse momento ,em que faço um atribuição representada
	 * pelo "=",na memória é criado um outro espaço de memória esse espaço de memoria vai ser 
	 * rotulado com b e valor 2 , ou seja sempre que eu crio uma variável primitiva e eu 
	 * associo essa variável através de uma atribuição é feito uma CÓPIA,
	 * de tal forma que se eu fizer em uma linha a++ e na outra b--
	 * o valor de a vai passar a ser 3
	 * e valor de b vai ser 1 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Por Refrência :Objetos 
	 * 
	 * quando eu crio um objeto DATA d1 = new Data();
	 * Data d2 = d1;
	 * Nesse cenário eu também tenho uma área de memória no meu computador e no momento
	 * que crio d1 eu tenho também um rótulo com d1 , só que no valor eu tenho um endereço
	 * e esse endereço vai apontar para uma área de memoria que de fato tem o valores de dia
	 * mes e ano , ou seja o local onde foi criado(instanciado) o objeto 
	 * No caso de d2 = d1, siguinifica que será criado um outro espaço de memória com o rótulo
	 * d2 e o endereço será copiado de d1 para d2 , logo d1 e d2 vão apontar para o mesmo
	 * objeto na memória , tanto d1 quanto d2 manipula esse objeto de tal forma que
	 * oque eu fizer em uma variável a outra também irá enxergar, isso porque a atribuição
	 * foi feita por REFERÊNCIA 
	 * 
	 * Se eu fizer d2=new DATA(); isso siguinifica que d2 vai apontar para outro
	 * endereço de memória 
	 * 
	 * e se eu fizer agora d1 = d2  siguinifica de d1 não vai mais apontar para a instancia anterior
	 * ele vai apontar para o novo objeto o mesmo de d2 e o anterior será excluído da memória
	 * a partir de um processo chamado garbet colector(coletor de lixo do java)
	 * Quando você tem um objeto na memória que não é mais referenciado por nenhuma variável 
	 * siguinifica que ele não pode ser mais alcançado e ele vai ser coletado pelo coletor de lixo do java
	 * 
	 * em programas mais antigos você tinha que alocar memoria e desalocar memoria
	 * 
	 * Se você não quiser fazer atribuição de objetos, você tem a possibilidade de clonar
	 * o objeto; Em todas as clases java tem o método clone()
	 * 
	 * 
	 * 
	 * */

}
