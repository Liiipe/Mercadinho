package Execptions;

public class SenhaSemMaiusculasExecption extends Exception {

	public SenhaSemMaiusculasExecption() {
		super("Senha Tem que ter letras maiusculas");
	}
	public SenhaSemMaiusculasExecption(String msg) {
		super(msg);
	}
	
}
