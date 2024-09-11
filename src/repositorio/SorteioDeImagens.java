package repositorio;

import java.awt.Color;
import java.util.Random;

public abstract class SorteioDeImagens {
/*@John Herbert.
 * 
 */
	
	
	//ESTE METODO SERVE PRA MODIFICAR AS IMAGENS DA TELA POR MEIO DE UMA ARRAY E DA CLASS RADOM.
	public static String sorteioDeTela() {
		
		String armazem [] = {"Figuras/dark-purple.jpg" ,"Figuras/Dark.jpg"};// NÃO POSSUI AINDA IMAGENS A CEREM SORTEADAS  
		
		int numero = new Random().nextInt(2);
		String sorteio = armazem[numero];
		return sorteio;
	}
	
/*ACIMA ESTOU SORTEANDO DUAS IMAGENS ESPECIFICAS DA TELA. CASO QUERAM CRIAR METODOS PARA POSSIVEIS TELAS
 *E SO USAREM USAREM O METODO ACIMA COMO REFERENCIA. 	
 */
	
	
/*
 * SOBRECARGA DO METODO MAIS PARA USO DE IMAGENS ESPECIFICAS PARA CASO QUEIRA DIGITAR AS IMAGENS NAS TELAS____	
 */
public static String sorteioDeTelaMenu() {
		
		String armazem [] = {"Figuras/retrowave-neon-4k1040.jpg", "Figuras/backGround80.jpg"};// NÃO POSSUI AINDA IMAGENS A CEREM SORTEADAS  
		
		int numero = new Random().nextInt(2);
		String sorteio = armazem[numero];
		return sorteio;
	}
	

public static Color sorteioDeTela(Color cor,Color color) {
	
	Color armazem [] = {cor,color};// NÃO POSSUI AINDA IMAGENS A CEREM SORTEADAS  
	
	int numero = new Random().nextInt(2);
	Color sorteio = armazem[numero];
	return sorteio;
}
}
