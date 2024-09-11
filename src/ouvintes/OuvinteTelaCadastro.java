package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Execptions.EmailNotValidoExecption;
import Execptions.NomeComApenasNumerosExecption;
import Execptions.NomeComEspacosBrancosExecption;
import Execptions.SenhaEmBrancoExecption;
import Execptions.SenhaSemLetrasMinusculasExecption;
import Execptions.SenhaSemMaiusculasExecption;
/*import Execptions.EmailNotValidoExecption;
import Execptions.NomeComApenasNumerosExecption;
import Execptions.NomeComEspacosBrancosExecption;
import Execptions.SenhaEmBrancoExecption;
import Execptions.SenhaSemLetrasMinusculasExecption;
import Execptions.SenhaSemMaiusculasExecption;*/
import entiti.Gerente;
import entiti.Usuario;
import mensageiro.MensageiroUsuario;
import mensageiroErro.ValidadorCadastroUsuario;
import repositorio.CentralDeInformacoes;
import repositorio.Persistencia;
import telas.TelaDeLogin;
import telascadastro.TelaDeCadastro;

public class OuvinteTelaCadastro implements ActionListener {
	TelaDeCadastro telaCadastro;
	Persistencia persistencia = new Persistencia();
	CentralDeInformacoes central = persistencia.recuperarCentral();

	public OuvinteTelaCadastro(TelaDeCadastro tela) {
		this.telaCadastro = tela;
	}

	public void actionPerformed(ActionEvent e) {
		
		String opcao = (String) telaCadastro.getOpcao().getSelectedItem();
		String identificadorCPF = (String) telaCadastro.getIdentificado().getText();
		String idCNPJ = (String) telaCadastro.getIdentificadorCNPJ().getText();
		String nome = telaCadastro.getNome().getText();
		String email = telaCadastro.geteMail().getText();
		String password = telaCadastro.getSenha().getText();
		String confirmaSenha = telaCadastro.getConfirmaSenha().getText();
	
		if (nome.isBlank() || email.isBlank() || password.isBlank() || confirmaSenha.isBlank()) {
			MensageiroUsuario.usuarioCampoVazio();
		}else if(!password.equals(confirmaSenha)) {
			MensageiroUsuario.usuarioSenhaErrada();
		} else {
			try {
			Usuario u = null;
			switch (opcao) {
			case "Gerente":
				u = new Gerente(nome, email, password);
				break;
			}
			ValidadorCadastroUsuario.validadorSenha(u);
			ValidadorCadastroUsuario.validarE_Mail(u);
			ValidadorCadastroUsuario.ValidarNome(u);

			if (central.cadastroDeUsuario(u)) {
				persistencia.salvarCentral(central);
				MensageiroUsuario.usuarioSalvo();
				if (u instanceof Gerente) {
					new TelaDeLogin();
				} else {
					new TelaDeCadastro();
				}
				telaCadastro.setVisible(false);
			} else {
				MensageiroUsuario.usuarioErro();
			}
			
			} catch (SenhaSemLetrasMinusculasExecption | SenhaSemMaiusculasExecption | SenhaEmBrancoExecption e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			} catch (EmailNotValidoExecption e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage());
			} catch (NomeComEspacosBrancosExecption | NomeComApenasNumerosExecption e3) {
				JOptionPane.showMessageDialog(null, e3.getMessage());
			}
		}//end else
		
	}

	
}