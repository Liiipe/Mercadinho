package ouvintesTeclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class OuvinteDaTeclaEnter implements KeyListener {
	
	/*@Author: John Herbert
	 * 
	 */
	JComboBox<Object> todosOsObject;
	JSpinner spiner;
	JFormattedTextField maskField;
	JPasswordField password;
	JTextField txt;
	JFrame telas;
	JButton butao;

	public OuvinteDaTeclaEnter(JFrame tela,JButton botao,JComboBox<Object> objetcts) {
		this.telas = tela;
		this.butao = botao;
		this.todosOsObject = objetcts;
	}
	
	public OuvinteDaTeclaEnter(JFrame tela,JButton botao,JSpinner spiner) {
		this.telas = tela;
		this.butao = botao;
		this.spiner = spiner;
		
	}
	
	public OuvinteDaTeclaEnter(JFrame tela, JButton butao) {
		this.telas = tela;
		this.butao = butao;
	}
	
	public OuvinteDaTeclaEnter(JFrame tela, JButton butao,JPasswordField texto) {
		this.telas = tela;
		this.butao = butao;
		this.password = texto;
		//this.txt_2 = txt2;
	}
	
	public OuvinteDaTeclaEnter(JFrame tela, JButton butao,JTextField texto) {
		this.telas = tela;
		this.butao = butao;
		this.txt = texto;
		//this.txt_2 = txt2;
		

	}

	public void keyTyped(KeyEvent e) {


	}

	public void keyPressed(KeyEvent e) {
		char teclaPrecionada = e.getKeyChar();
		
	if(e.getSource() == txt || e.getSource() == password) {
		if (teclaPrecionada == KeyEvent.VK_ENTER) {
			butao.doClick();
		}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		char teclaPrecionada = e.getKeyChar();
		
			if (teclaPrecionada == KeyEvent.VK_ENTER) {
				butao.doClick();
			}
			
			
	}

}
