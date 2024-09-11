package entiti;

public class Gerente extends Usuario{
    //private boolean isGerente;
	
	public Gerente(String nome, String email, String senha) {
		super(nome,email,senha);
//		this.isGerente = isLogado;
	}
//
//	public boolean isGerente() {
//		return isGerente;
//	}
//
//	public void setGerente(boolean isGerente) {
//		this.isGerente = isGerente;
//	}

	@Override
	public String toString() {
		return "Gerente <" + getNome() + ">";
	}
}
