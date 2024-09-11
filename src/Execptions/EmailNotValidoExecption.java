package Execptions;

public class EmailNotValidoExecption extends Exception {
	
	public EmailNotValidoExecption() {super("O E_mail nao possui [@] ou [gmail.com]");}
	
	public EmailNotValidoExecption(String msg) {
		super(msg);
	}
		
	

}
