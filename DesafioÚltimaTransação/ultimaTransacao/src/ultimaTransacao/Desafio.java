package ultimaTransacao;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
	    String entrada = scanner.nextLine();
	    String[] partes = entrada.split(",");
	   
	    
	    
	    Transacao transacao = new Transacao(partes[0],partes[1],partes[2],Double.parseDouble(partes[3]));
	  
	    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.
	    transacao.imprimir();
	    
		scanner.close();

	}
}
