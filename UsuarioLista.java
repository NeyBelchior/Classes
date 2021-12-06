package Classes;

import java.util.Objects;

public class UsuarioLista {
	String nome;
	
	UsuarioLista(String nome){
		this.nome=nome;
	}
	public String toString() {
		return "meu nome é " + this.nome+" ";
	}

	/*@Override
	public int hashCode() {
		final int prime =31;
		int result =1;
		result =prime*result+((nome==null)? 0 :nome.hashCode());
		return result;
	}*/
	@Override
	public int hashCode(){
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioLista other = (UsuarioLista) obj;
		return Objects.equals(nome, other.nome);
	}
	

}
