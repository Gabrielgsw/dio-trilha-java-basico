package Application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		
		System.out.print("Digite o seu nome: ");
		nomeCliente = sc.nextLine();
		System.out.print("Por favor, digite o número da sua conta! ");
		numero = sc.nextInt();
		System.out.print("Digite a sua agencia: ");
		sc.nextLine();
		agencia=sc.nextLine();
		System.out.print("Digite o seu saldo em conta: ");
		saldo=sc.nextDouble();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque! ");
		
		
		
		
		
		
		sc.close();
		
	}

}
