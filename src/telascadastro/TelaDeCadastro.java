package telascadastro;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ouvintes.OuvintOptComboBox;
import ouvintes.OuvinteBotaoVoltar;
import ouvintes.OuvinteTelaCadastro;
import ouvintesTeclado.OuvinteDaTeclaEnter;
import ouvintesTeclado.OuvinteDaTeclaFecharEsc;
import repositorio.CentralDeInformacoes;
import repositorio.Componentes;
import repositorio.Persistencia;
import telas.TelaPadrao;

public class TelaDeCadastro extends TelaPadrao {

	Persistencia persistenci = new Persistencia();
	CentralDeInformacoes central = persistenci.recuperarCentral();

	public TelaDeCadastro() {
		super("Cadastro");
		setSize(600, 640);
		botao();
		comboBox(this);
		maskFormat();
		referenciadorTxt();
		camadaTxt();
		tituloTela();
		imagenDeFundo();
		repaint();

		setVisible(true);
	}

	private JComboBox<String> opcao;
	private JTextField identificado;
	private JTextField identificadorCNPJ;
	private JTextField nome;
	private JTextField email;
	private JPasswordField senha;
	private JPasswordField confirmaSenha;
	private JButton cadastrar;
	private JButton voltar;

	public void maskFormat() {
		try {
			identificado = Componentes.formatadoTxt("###.###.###-##", identificado, this, 160, 410, 260, 30);
			identificadorCNPJ = Componentes.formatadoTxt("###.###.###/####-##", identificadorCNPJ, this, 160, 410, 260,
					30);
			identificado.addKeyListener(new OuvinteDaTeclaEnter(this, cadastrar, identificado));
			identificadorCNPJ.addKeyListener(new OuvinteDaTeclaEnter(this, cadastrar, identificadorCNPJ));
			if (!central.getAdm().isEmpty()) {
				identificado.addKeyListener(new OuvinteDaTeclaFecharEsc(this, voltar, identificado));
				identificadorCNPJ.addKeyListener(new OuvinteDaTeclaFecharEsc(this, voltar, identificadorCNPJ));

			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		identificado.setVisible(false);
		identificadorCNPJ.setVisible(true);

		if (central.getAdm().isEmpty()) {
			identificado.setVisible(false);
			identificadorCNPJ.setVisible(false);
		}

	}

	public void botao() {

		OuvinteTelaCadastro ouvinteBotaoCadastro = new OuvinteTelaCadastro(null);
		cadastrar = Componentes.addButao(this, "Cadastrar", 160, 510, 260, 30);
		cadastrar.addActionListener(ouvinteBotaoCadastro);
		if (central.getAdm().size() != 0) {
			voltar = Componentes.addButao(this, "Voltar", 160, 550, 260, 30);
			voltar.addActionListener(new OuvinteBotaoVoltar(this));
		}
	}

	public void comboBox(JFrame tela) {
		Persistencia persistencia = new Persistencia();
		CentralDeInformacoes central = persistencia.recuperarCentral();

		String[] tipoDeCadastro = { "Administrador" };
		ArrayList<String> cadastro = new ArrayList<>(Arrays.asList(tipoDeCadastro));

		if (central.getAdm().size() > 0) {
			cadastro.remove(0);
			cadastro.add("ClienteJuridico");
			cadastro.add("ClienteFisico");
			cadastro.add("FornecedorFisico");
			cadastro.add("FornecedorJuridico");

		}
		opcao = Componentes.adicionarComboBox(this, cadastro, 160, 460, 260, 30);
		OuvintOptComboBox ouvintOpcao = new OuvintOptComboBox(this);
		opcao.setSelectedIndex(0);
		opcao.addActionListener(ouvintOpcao);
		opcao.addKeyListener(new OuvinteDaTeclaEnter(this, cadastrar));
		opcao.addKeyListener(new OuvinteDaTeclaFecharEsc(this, voltar));
		repaint();

	}

	public void camadaTxt() {

		nome = Componentes.addTexto(this, 160, 160, 260, 30);
		email = Componentes.addTexto(this, 160, 225, 260, 30);
		senha = Componentes.adicionarPasswordField(this, 160, 290, 260, 30);
		confirmaSenha = Componentes.adicionarPasswordField(this, 160, 350, 260, 30);

		nome.addKeyListener(new OuvinteDaTeclaEnter(this, cadastrar, nome));
		email.addKeyListener(new OuvinteDaTeclaEnter(this, cadastrar, email));
		senha.addKeyListener(new OuvinteDaTeclaEnter(this, cadastrar, senha));
		confirmaSenha.addKeyListener(new OuvinteDaTeclaEnter(this, cadastrar, confirmaSenha));

		if (!central.getAdm().isEmpty()) {// AQUI E O CODIGO PRA O ESC PODER VOLTAR PRA TELA MENU
			nome.addKeyListener(new OuvinteDaTeclaFecharEsc(this, voltar, nome));
			email.addKeyListener(new OuvinteDaTeclaFecharEsc(this, voltar, email));
			senha.addKeyListener(new OuvinteDaTeclaFecharEsc(this, voltar, senha));
			confirmaSenha.addKeyListener(new OuvinteDaTeclaFecharEsc(this, voltar, confirmaSenha));

		}
	}

	public void referenciadorTxt() {
		Componentes.addLabel(this, "Nome:", 60, 160, 95, 30);
		Componentes.addLabel(this, "eMail:", 60, 225, 95, 30);
		Componentes.addLabel(this, "Senha:", 60, 290, 95, 30);
		Componentes.addLabel(this, "Confirma Senha:", 60, 350, 95, 30);
	}

	public void tituloTela() {
		Componentes.adicionarTitulo(this, "CADASTRO DE USUARIO", 0, 0, 850, 95);
	}

	public void imagenDeFundo() {
		Componentes.radomizadorDeTela(this, 0, 0, 900, 640);

	}

	public JTextField getIdentificado() {
		return identificado;
	}

	public void setIdentificado(JTextField identificado) {
		this.identificado = identificado;
	}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField geteMail() {
		return email;
	}

	public void seteMail(JTextField eMail) {
		this.email = eMail;
	}

	public JPasswordField getSenha() {
		return senha;
	}

	public void setSenha(JPasswordField senha) {
		this.senha = senha;
	}

	public JPasswordField getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(JPasswordField confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public JComboBox<String> getOpcao() {
		return opcao;
	}

	public void setOpcao(JComboBox<String> opcao) {
		this.opcao = opcao;
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public void setCadastrar(JButton cadastrar) {
		this.cadastrar = cadastrar;
	}

	public JTextField getIdentificadorCNPJ() {
		return identificadorCNPJ;
	}

	public void setIdentificadorCNPJ(JTextField identificadorCNPJ) {
		this.identificadorCNPJ = identificadorCNPJ;
	}

	public JButton getVoltar() {
		return voltar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}

	public static void main(String[] args) {
		new TelaDeCadastro();
	}

}
