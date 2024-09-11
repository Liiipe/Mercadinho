
import repositorio.CentralDeInformacoes;
import repositorio.Persistencia;
import telas.TelaDeLogin;
import telascadastro.TelaDeCadastro;

public class Main {

	public static void main(String[] args) {
		Persistencia persistencia = new Persistencia();
		CentralDeInformacoes central = persistencia.recuperarCentral();
		
		//new	TelaPadrao("");
		//TelaDeCadastro tela	= 	new TelaDeCadastro();
		//new TelaDeLogin();
		//new TelaRecuperarSenha();
		//new TelaCadastroDeServicos();
			if(central.getAdm().isEmpty()) {
				new TelaDeCadastro();
			}else {
				new TelaDeLogin();
			}
	}

}
