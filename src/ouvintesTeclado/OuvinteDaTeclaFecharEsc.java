package ouvintesTeclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import telas.TelaDeLogin;

public class OuvinteDaTeclaFecharEsc implements KeyListener {
	JPasswordField password;
	JFrame telas;
	JTextField txt;
	JButton butao;
	
	public OuvinteDaTeclaFecharEsc(JFrame tela,JButton botao){
		this.telas = tela;
		this.butao = botao;
	}
	
	public OuvinteDaTeclaFecharEsc(JFrame tela,JButton botao,JPasswordField senha){
		this.telas = tela;
		this.password = senha;
		this.butao = botao;
	}
	
	
	public OuvinteDaTeclaFecharEsc(JFrame tela,JButton botao,JTextField campo) {
		this.telas = tela;
		this.txt = campo;
		this.butao = botao;
	}
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char key = e.getKeyChar();
		
	if(e.getSource() == txt || e.getSource() == password) {	
		if(key == KeyEvent.VK_ESCAPE) {
			butao.doClick();
		}
	}
//	
//	if(key == KeyEvent.VK_ENTER) {
//		butao.doClick();
//	}
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
