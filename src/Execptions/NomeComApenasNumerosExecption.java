package Execptions;

public class NomeComApenasNumerosExecption extends  Exception {
	
	public NomeComApenasNumerosExecption() {
		super("Nao e permitido nome com apenas {NUMEROS}");
	}
	
	public NomeComApenasNumerosExecption(String msg) {
		super(msg);
	}

}
