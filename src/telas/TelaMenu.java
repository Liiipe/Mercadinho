package telas;

import java.awt.MenuBar;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ouvintes.OuvinteTelaMenu;
import repositorio.Componentes;

//VOU DEIXAR O DESINE DA TELA PRONTA
public class TelaMenu  extends TelaPadrao{
	
	
	public TelaMenu() {
		super("Menu");
		menu();
		titulo();
		randomTela();
		
		setVisible(true);
	}
	
	private JMenuBar menuBar;
	private JMenu menuop;
	private JButton deletar;
	
	
	
	public void menu() {
		OuvinteTelaMenu ouveMenuItem = new OuvinteTelaMenu(this);
		menuop =  Componentes.addJmenu(this, menuBar,"options",0, 30, 750, 95);
		JMenuItem menuCadastroUsuario = Componentes.addMenuItem(menuop,"Cadastro Usuarios");
		JMenuItem menuCadastroServicos = Componentes.addMenuItem(menuop,"Cadastro Servicos");
		JMenuItem menuCadastroFornecedorEmServicos = Componentes.addMenuItem(menuop, "Cadastrar Servico em Fornecedor");
		JMenuItem menuCadastroOrcamento = Componentes.addMenuItem(menuop, "Cadastro Orcamento");
		JMenuItem menuCadastroFornecedorOrcamento = Componentes.addMenuItem(menuop, "Cadastrar Fornecedores em Orcamento");
		JMenuItem menuCadastrarPacote = Componentes.addMenuItem(menuop, "Cadastrar Pacote Fornecedores");
		JMenuItem menuDetalharFornecedor = Componentes.addMenuItem(menuop, "Listar Fornecedor");
		JMenuItem menuDetalharPacoteDeFornecedores = Componentes.addMenuItem(menuop, "Listar Pacote Fornecedores");
		JMenuItem menuDetalharOrcamento = Componentes.addMenuItem(menuop, "Lista Orcamentos");
		JMenuItem menuEditarServicos = Componentes.addMenuItem(menuop, "Editar ou Remover Servicos");
		JMenuItem menuGerarRelatorio = Componentes.addMenuItem(menuop, "Gerar Relatorio-PDF");
		JMenuItem menuGerarPlanilhaEvento = Componentes.addMenuItem(menuop, "Gerar Planilha de Financas");
		JMenuItem menuDesconectar = Componentes.addMenuItem(menuop, "Desconectar");
		JMenuItem menuRemoverContaADM = Componentes.addMenuItem(menuop, "Remover Conta");
		JMenuItem menuRemoverBancoDeDados = Componentes.addMenuItem(menuop, "Excluir Persistencia");
		//OUVINTES
		menuCadastroUsuario.addActionListener(ouveMenuItem);
		menuCadastroServicos.addActionListener(ouveMenuItem);
		menuCadastroFornecedorEmServicos.addActionListener(ouveMenuItem);
		menuCadastroOrcamento.addActionListener(ouveMenuItem);
		menuCadastroFornecedorOrcamento.addActionListener(ouveMenuItem);
		menuCadastrarPacote.addActionListener(ouveMenuItem);
		menuDetalharFornecedor.addActionListener(ouveMenuItem);
		menuDetalharPacoteDeFornecedores.addActionListener(ouveMenuItem);
		menuDetalharOrcamento.addActionListener(ouveMenuItem);
		menuEditarServicos.addActionListener(ouveMenuItem);
		menuGerarRelatorio.addActionListener(ouveMenuItem);
		menuGerarPlanilhaEvento.addActionListener(ouveMenuItem);
		menuDesconectar.addActionListener(ouveMenuItem);
		menuRemoverContaADM.addActionListener(ouveMenuItem);
		menuRemoverBancoDeDados.addActionListener(ouveMenuItem);
		
		
	}
	
	
	
	public void randomTela() {
		Componentes.addRadomizadorDeTelaOption(this,0, 50, 900, 640);
	}
	
	public void titulo() {
		Componentes.adicionarTitulo(this,"Tela Menu", 0,0, 900, 95);
	}
	
	public static void main(String[] args) {
		new TelaMenu();
	}

}
