package Execptions;

public class SenhaEmBrancoExecption extends Exception {
	
	public SenhaEmBrancoExecption() {
		super("Senha nao pode estar com espacos em |{branco}|");
	}

}
