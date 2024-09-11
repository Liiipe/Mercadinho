package repositorio;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

/*import entity.Fornecedor;
import entity.TipoDeServico;
import modelosEntity.Orcamento;
import modelosEntity.PacoteDeFornecedores;*/

public abstract class Componentes {

	/*
	 * @Author: John Herbert.
	 * 
	 * @Class : Componentes.
	 * 
	 * 
	 */
	// CRIA CHECKBOX
	public static JCheckBox addCheckBox(JFrame tela, String txt, int x, int y, int comprimento, int altura) {
		JCheckBox checkBox = new JCheckBox(txt);
		checkBox.setBounds(x, y, comprimento, altura);
		checkBox.setOpaque(false);
		checkBox.setForeground(Color.MAGENTA);
		tela.add(checkBox);
		return checkBox;
	}

	// CRIA MENU:
	public static JMenu addJmenu(JFrame tela, JMenuBar menuBar, String txt, int x, int y, int comprimento, int altura) {
		menuBar = new JMenuBar();
		tela.setJMenuBar(menuBar);
		JMenu menu = new JMenu(txt);
		menu.setBounds(x, y, comprimento, altura);
		menu.setOpaque(true);
		menu.setBackground(Color.BLACK);
		menu.setForeground(Color.CYAN);
		menu.setMnemonic('o');
		menuBar.add(menu);

		return menu;
	}

	// CRIA SPINNER:
	public static JSpinner addSpinner(JFrame tela, int x, int y, int comprimento, int altura) {
		JSpinner spinner = new JSpinner();
		spinner.setBounds(x, y, comprimento, altura);
		spinner.setFont(new Font("Arial", 1, 20));
		tela.add(spinner);
		return spinner;
	}

	// CRIS JTEXT FILDE SETANDO COR
	public static JTextField addTextFieldEditavel(JFrame tela, String txt, Color background, Color foregroud, int x,
			int y, int comprimento, int altura) {
		JTextField texto = new JTextField();
		texto.setText(txt);
		texto.setBackground(background);
		texto.setForeground(foregroud);
		texto.setEditable(false);
		tela.add(texto);
		return texto;
	}

	// CRIAR JMENUITEM:
	public static JMenuItem addMenuItem(JMenu menu, String txt) {
		JMenuItem menuItem = new JMenuItem(txt);
		menuItem.setOpaque(true);
		menuItem.setBackground(Color.BLACK);
		menuItem.setForeground(Color.MAGENTA);
		menu.add(menuItem);

		return menuItem;
	}
	

	// CRIA UMA JList:
	public static JList<String> addJlist(JFrame tela, ArrayList<String> texto, int x, int y, int comprimento,
			int altura) {
		Vector<String> arryText = new Vector<String>(texto);
		JList<String> list = new JList<>(arryText);
		list.setBounds(x, y, comprimento, altura);
		tela.add(list);
		return list;

	}

	// CRIA UM MASCARA:
	public static JFormattedTextField formatadoTxt(String texto, JTextField txt, JFrame tela, int x, int y,
			int comprimento, int altura) throws ParseException {
		MaskFormatter mascara = new MaskFormatter(texto);
		JFormattedTextField txtFormatado = new JFormattedTextField(txt);
		mascara.install(txtFormatado);
		txtFormatado.setBounds(x, y, comprimento, altura);
		tela.add(txtFormatado);
		return txtFormatado;

	}

	// CRIA UM BOTAO..
	public static JButton addButao(JFrame tela, String nome, int x, int y, int comprimento, int altura) {
		JButton botao = new JButton(nome);
		botao.setBounds(x, y, comprimento, altura);
		botao.setVerticalTextPosition(SwingConstants.BOTTOM);
		botao.setHorizontalTextPosition(SwingConstants.CENTER);
		botao.setForeground(Color.MAGENTA);
		tela.add(botao);
		return botao;
	}

	/*
	 * 
	 * 
	 */
	// CRIA UM BLOCO DE TEXTO.
	public static JTextField addTexto(JFrame tela, int x, int y, int comprimento, int altura) {
		JTextField texto = new JTextField();
		texto.setBounds(x, y, comprimento, altura);
		tela.add(texto);
		return texto;
	}

	/*
	 *
	 * 
	 */

	// CRIA UMA lABEL OU TEXTO DE REFERENCIA.
	public static JLabel addLabel(JFrame tela, String nome, int x, int y, int comprimento, int altura) {
		JLabel label = new JLabel(nome);
		label.setBounds(x, y, comprimento, altura);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setOpaque(true);
		label.setForeground(Color.MAGENTA);
		label.setBackground(Color.BLACK);
		tela.add(label);
		return label;

	}

	public static JLabel addLabelSemCor(JFrame tela, String nome, int x, int y, int comprimento, int altura) {
		JLabel label = new JLabel(nome);
		label.setBounds(x, y, comprimento, altura);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setForeground(Color.MAGENTA);
		// label.setBackground(Color.DARK_GRAY);
		tela.add(label);
		return label;

	}

	/*
	 * 	
	 */
	// CRIA UMA JCHECKBOX.
	public static JCheckBox adicionarCheckBox(JFrame tela, String nome, int x, int y, int comprimento, int altura) {
		JCheckBox jcheckBox = new JCheckBox(nome);
		jcheckBox.setBounds(x, y, comprimento, altura);
		tela.add(jcheckBox);
		return jcheckBox;

	}
	/*
	 * 
	 */

	// CRIA UMA COMBOBOX.
	public static JComboBox<String> adicionarComboBox(JFrame tela, ArrayList<String> texto, int x, int y,
			int comprimento, int altura) {
		Vector<String> arryText = new Vector<String>(texto);
		JComboBox<String> jComboBox = new JComboBox<>(arryText);
		jComboBox.setBounds(x, y, comprimento, altura);
		tela.add(jComboBox);
		return jComboBox;

	}

	/*
	 * 
	 */
	// SERVE PRA MODIFICAR A IMAGEM DA TELA DE FORMA RANDOMIZADA.
	public static JLabel radomizadorDeTela(JFrame tela, int x, int y, int comprimento, int altura) {

		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(SorteioDeImagens.sorteioDeTela()));
		jLabel.setBounds(x, y, comprimento, altura);
		tela.add(jLabel);
		return jLabel;
	}

	public static JLabel addRadomizadorDeTelaOption(JFrame tela, int x, int y, int comprimento, int altura) {

		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(SorteioDeImagens.sorteioDeTelaMenu()));
		jLabel.setBounds(x, y, comprimento, altura);
		tela.add(jLabel);
		return jLabel;
	}

	/*
	 * 	
	 */

	// CRIA PASSWORDFIELD.
	public static JPasswordField adicionarPasswordField(JFrame tela, int x, int y, int comprimento, int altura) {
		JPasswordField password = new JPasswordField();
		password.setBounds(x, y, comprimento, altura);
		tela.add(password);
		return password;

	}

	// ADICIONA TITULO
	public static JLabel adicionarTitulo(JFrame tela, String txt, int x, int y, int comprimento, int altura) {
		ImageIcon icon = new ImageIcon("Figuras/icons8-confetti-100.png");
		JLabel jLabel = new JLabel(txt, icon, JLabel.LEFT);
		jLabel.setBounds(x, y, comprimento, altura);
		jLabel.setFont(new Font("Impact", Font.ITALIC, 50));
		jLabel.setOpaque(true);
		jLabel.setBackground(Color.darkGray);
		jLabel.setForeground(Color.BLACK);
		tela.add(jLabel);
		return jLabel;

	}

	/*
	 * 
	 */
	// ADICIONA ICONE DE LOGIN
	public static JLabel adicionarIcone(JFrame tela, int x, int y, int comprimento, int altura) {
		ImageIcon icone = new ImageIcon("Figuras/icons8-login-64.png");
		JLabel label = new JLabel(icone);
		label.setBounds(x, y, comprimento, altura);
		tela.add(label);
		return label;
	}

	/*
	 * 
	 * 
	 */

	
	public static void addBackGround(JFrame tela, Color cor, Color Color) {
		tela.setBackground(SorteioDeImagens.sorteioDeTela(cor, Color));

	}


	
}
