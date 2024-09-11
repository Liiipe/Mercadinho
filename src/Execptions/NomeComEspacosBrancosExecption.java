package Execptions;

public class NomeComEspacosBrancosExecption extends Exception {
	
	public NomeComEspacosBrancosExecption() {
		super("Nome nao pode conter {espacamentos}");
	}

	public NomeComEspacosBrancosExecption(String msg ) {
		super(msg);
	}
}
