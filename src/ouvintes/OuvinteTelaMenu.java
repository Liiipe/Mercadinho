package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import mensageirosErro.MensageiroMenu;
import repositorio.CentralDeInformacoes;
import repositorio.Persistencia;
import telas.TelaDeLogin;
import telas.TelaMenu;
import telascadastro.TelaDeCadastro;


public class OuvinteTelaMenu implements ActionListener {

	Persistencia persistencia = new Persistencia();
	CentralDeInformacoes central = persistencia.recuperarCentral();

	TelaMenu tela;

	public OuvinteTelaMenu(TelaMenu telaMenu) {
		this.tela = telaMenu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		tela.dispose();
		switch (comando) {
		case "Cadastro Usuarios":
			new TelaDeCadastro();
			break;
		case "Gerar Relatorio-PDF":// ESTAS TELAS NAO FAZEM NADA PORQUE EU VOU VER SE VAI TER UMA TELA OU FASSO
									// APARECE JOPANEL
			break;
		case "Gerar Planilha de Financas":// MESMA COISAS A CIMA
			break;
		case "Desconectar":
			tela.dispose();
			new TelaDeLogin();
			break;
		case "Remover Conta":
			central.getAdm().remove(0);
			persistencia.salvarCentral(central);
			new TelaDeCadastro();
			break;
		case "Excluir Persistencia":
			persistencia.salvarCentral(new CentralDeInformacoes(null));
			new TelaDeCadastro();
		}

	}

}
