package repositorio;

import java.util.ArrayList;

import entiti.Cliente;
import entiti.Gerente;
import entiti.Usuario;

public class CentralDeInformacoes {

    private ArrayList<Gerente> adm = new ArrayList<>();
    private ArrayList<Cliente> todosOsclients = new ArrayList<>();

    public CentralDeInformacoes(ArrayList<Cliente> clients) {
		todosOsclients = clients;
	}
    // JA ESTA FUNCIONADO MAIS VER SE VAIR RECEBER MODIFICACOES
	// CADASTRA OS DADOS NA CENTRAL PEGANDO UMA STRING A QUAL DIZ O TIPO DO OBJETO
	// QUE IRA SER CADASTRADO
	public boolean cadastroDeUsuario(Usuario u) {
		boolean usuarioCadastrou = false;// RETORNA TRUE CASO CADASTRO ESTEJA BEM SUCEDIDO

		// DE ACORDO COM A STRING MUDA A REFERENCIA A QUAL OBJETO A SER APONTADO

		if (u instanceof Gerente) {
			u = new Gerente(u.getNome(), u.getEmail(), u.getSenha());
			for (int i = 0; i < adm.size(); i++) {
				if (adm.size() > 0) { // MESMO QUE EU VA TIRAR O MODIFICADOR ADM DA TELA QUANDO CADASTRADO ESTO
										// FAZENDO ISSO PRA MAIOR SEGURANCA
					return usuarioCadastrou;
				}

			}
			adm.add((Gerente) u);
			usuarioCadastrou = true;
		}

		return usuarioCadastrou;
	}
	public ArrayList<Gerente> getAdm() {
		return adm;
	}

	void setAdm(ArrayList<Gerente> adm) {
		this.adm = adm;
	}

	public boolean isLogado(String email, String Senha) {
		for (int i = 0; i < adm.size(); i++) {
			if (adm.get(i).getEmail().equals(email) && adm.get(i).getSenha().equals(Senha)) {
				return true;
			}
		}
		return false;
	}

	public Gerente retornaADM(String email) {// PESSOAL QUANDO FOREM LISTAR NAO E PRA LISTAREM ADM!

		for (int i = 0; i < adm.size(); i++) {
			if (adm.get(i).getEmail().equals(email)) {
				return adm.get(i);
			}
		}
		return null;
	}
}