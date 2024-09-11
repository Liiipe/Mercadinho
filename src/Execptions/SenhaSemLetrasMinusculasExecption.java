package Execptions;

public class SenhaSemLetrasMinusculasExecption extends Exception{

	public SenhaSemLetrasMinusculasExecption() {
		super("As senhas tem que ter uma ou mais caracter com letras minusculas");
	}
	
	
	public SenhaSemLetrasMinusculasExecption(String mensagem) {
		super(mensagem);
	}

}
