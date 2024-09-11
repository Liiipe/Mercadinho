package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import telas.TelaMenu;

public class OuvinteBotaoVoltar implements ActionListener{
	
	JButton botao;
	JFrame tela;
	
	public OuvinteBotaoVoltar(JFrame tela) {
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		tela.dispose();
		new TelaMenu();
		
	}

}
