package telas;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ouvintes.OuvinteTelaLogin;
import ouvintesTeclado.OuvinteDaTeclaEnter;
import repositorio.Componentes;

//import ouvintes.OuvinteRecuperSenha;
//import ouvintes.OuvinteTelaLogin;
//import ouvintesTeclado.OuvinteDaTeclaEnter;
//import repositorio.Componentes;

public class TelaDeLogin extends TelaPadrao {
	
	public TelaDeLogin() {
		super("Tela Login");
		botao();
		//adicionarTxt();
		//adicionarLayer();
		iconeLogin();
		backGround();
		repaint();
		
		setVisible(true);
		

	}
	
	private JTextField email;
	private JPasswordField password;
	private JButton prosseguir;
	
	
	/*public void adicionarLayer() {
		Componentes.addLabel(this, "eMail: ", 200, 200, 95, 30);
		Componentes.addLabel(this, "Senha", 200, 270, 95, 30);
		JLabel recuperar =	Componentes.addLabelSemCor(this,"recuperar Senha" , 415, 320, 110, 50);
		OuvinteRecuperSenha ouvinteRecuperar = new OuvinteRecuperSenha(this, recuperar);
		recuperar.addMouseListener(ouvinteRecuperar);
	}*/

	/*public void adicionartxt() {
		email = Componentes.addTexto(this, 330, 200, 260, 30);
		password = Componentes.adicionarPasswordField(this,330 ,270 , 260, 30);
		email.addKeyListener(new OuvinteDaTeclaEnter(this,prosseguir,email));
		password.addKeyListener(new OuvinteDaTeclaEnter(this, prosseguir, password));
		
	}*/
	
	public void botao() {
		OuvinteTelaLogin ouvinteBotaoProsseguir = new OuvinteTelaLogin(this);
		prosseguir = Componentes.addButao(this,"Logar", 385, 370, 160, 30);
		prosseguir.addActionListener(ouvinteBotaoProsseguir);
		prosseguir.addKeyListener(new OuvinteDaTeclaEnter(this, prosseguir));
	}
	
	
	public void iconeLogin() {
		Componentes.adicionarIcone(this, 380, 100, 160, 95);
	}
	
	public void backGround() {
		Componentes.radomizadorDeTela(this, 0,0, 900, 640);
		//Componentes.addBackGround(this, Color.GRAY, Color.LIGHT_GRAY);
	}

	public JTextField geteMail() {
		return email;
	}

	public void seteMail(JTextField eMail) {
		this.email = eMail;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public void setPassword(JPasswordField password) {
		this.password = password;
	}

	public JButton getProsseguir() {
		return prosseguir;
	}

	public void setProsseguir(JButton prosseguir) {
		this.prosseguir = prosseguir;
	}

	public static void main(String[] args) {
		new TelaDeLogin();

	}
	
	
}
