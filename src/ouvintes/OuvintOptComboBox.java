package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import telas.TelaDeEdicao;
import telascadastro.TelaDeCadastro;

public class OuvintOptComboBox implements ActionListener{
	TelaDeCadastro tela;
	
	public OuvintOptComboBox(TelaDeCadastro telaCadastro) {
		this.tela = telaCadastro;
	}
	
	public void actionPerformed(ActionEvent e) {
		String opt = (String) tela.getOpcao().getSelectedItem();
		
		switch(opt) {
		case "ClienteFisico":
		case "FornecedorFisico":
			tela.getIdentificado().setVisible(true);
			tela.getIdentificadorCNPJ().setVisible(false);
			break;
			
		case "ClienteJuridico":
		case "FornecedorJuridico":
			tela.getIdentificado().setVisible(false);
			tela.getIdentificadorCNPJ().setVisible(true);
			break;
		case "Administrador":
			tela.getIdentificado().setVisible(false);
			tela.getIdentificadorCNPJ().setVisible(false);
			break;
		}
	}

	
	
}
