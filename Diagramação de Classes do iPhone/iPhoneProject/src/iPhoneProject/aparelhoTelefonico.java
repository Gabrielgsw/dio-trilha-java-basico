package iPhoneProject;

public interface aparelhoTelefonico {

	public static void ligar(Long numeroTelefonico) {
		
		System.out.println("Você está ligando para o número "+numeroTelefonico+" !");
	}
	
	public static void atender() {
		System.out.println("A ligação foi atendida! ");
	}
	
	public static void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado! ");
	}
	
	
	
}
