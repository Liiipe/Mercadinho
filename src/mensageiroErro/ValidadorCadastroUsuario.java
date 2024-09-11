package mensageiroErro;

import Execptions.EmailNotValidoExecption;
import Execptions.NomeComApenasNumerosExecption;
import Execptions.NomeComEspacosBrancosExecption;
import Execptions.SenhaEmBrancoExecption;
import Execptions.SenhaSemLetrasMinusculasExecption;
import Execptions.SenhaSemMaiusculasExecption;
import entiti.Usuario;

public abstract class ValidadorCadastroUsuario {
	
	public static void validarE_Mail(Usuario u)throws EmailNotValidoExecption {
		if(!u.getEmail().contains("@gmail.com")) {
			throw new EmailNotValidoExecption();
		}	
	}
	
	public static void ValidarNome(Usuario u)throws NomeComEspacosBrancosExecption,NomeComApenasNumerosExecption {
		if(u.getNome().isEmpty()) {
			throw new NomeComEspacosBrancosExecption();
		}
		if(isNumber(u)) {
			throw new NomeComApenasNumerosExecption();
		}
	}
	
	public static boolean isNumber(Usuario usuario) {

		try {
			Integer.parseInt(usuario.getNome());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public static void validadorSenha(Usuario u) throws SenhaSemLetrasMinusculasExecption,SenhaSemMaiusculasExecption,SenhaEmBrancoExecption {
	
		if(!temLetraMaiuscula(u.getSenha())) {
			throw new SenhaSemMaiusculasExecption();
		}
		if(!temLetraMinuscula(u.getSenha())) {
			throw new SenhaSemLetrasMinusculasExecption();
		}
		if(u.getSenha().isEmpty()) {
			throw new SenhaEmBrancoExecption();
		}
	}


	public static boolean temLetraMaiuscula(String senha) {

		for (int i = 0; i < senha.length(); i++) {
			if (Character.isUpperCase(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean temLetraMinuscula(String senha) {

		for (int i = 0; i < senha.length(); i++) {
			if (Character.isLowerCase(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	//VALIDADOR UNIVERSAL SERVE SO PARA CHAMAR TODOS OS METODOS DE VALIDACAO A CIMA PARA QUE NAO ESIGA SAIR CHAMANDO CADA METODO!!
	public static void validaorUniversal(Usuario u)throws Exception {
		validadorSenha(u);
		validarE_Mail(u);
		ValidarNome(u);
		
	}
}
