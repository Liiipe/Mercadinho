package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entiti.Gerente;
import mensageiro.MensageiroUsuario;
import repositorio.CentralDeInformacoes;
import repositorio.Persistencia;
import telas.TelaDeLogin;
//import telas.TelaMenu;
import telas.TelaMenu;

public class OuvinteTelaLogin implements ActionListener{

	TelaDeLogin telaLogin;
	
	public OuvinteTelaLogin(TelaDeLogin telaDeLogin) {
		this.telaLogin = telaDeLogin;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Persistencia persistencia = new Persistencia();
		CentralDeInformacoes central = persistencia.recuperarCentral();
		
		String eMail = telaLogin.geteMail().getText();
		String senha = telaLogin.getPassword().getText();
		
		if(eMail.isBlank() || senha.isBlank()) {
			MensageiroUsuario.usuarioCampoVazio();
		}else {
			if(central.isLogado(eMail, senha)) {
				Gerente adm = central.retornaADM(eMail);
				new TelaMenu();
				telaLogin.setVisible(false);
			}else {
				MensageiroUsuario.usuarioNaoEncontrado();
			}
		}
		
	}

}
