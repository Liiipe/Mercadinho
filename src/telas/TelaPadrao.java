package telas;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public abstract class TelaPadrao extends JFrame {
	// TELA PADRAO QUE SO E USADA PARA CRIAR OUTRAS TELAS
	public TelaPadrao(String titulo){
		setTitle(titulo);
		setSize(900,640);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
	//	setUndecorated(true);
		addLookAndFeel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
	public void addLookAndFeel() {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
}
}
