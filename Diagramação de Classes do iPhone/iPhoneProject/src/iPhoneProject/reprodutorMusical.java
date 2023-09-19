package iPhoneProject;

public interface reprodutorMusical {

	public static void tocar() {
		System.out.println("A sua música selecionada está sendo tocada! ");
	}
	
	public static void pausar() {
		System.out.println("Sua música foi pausada! ");
	}
	
	public static void selecionarMusica(String nomeMusica) {
		System.out.println("A música "+nomeMusica+" está sendo tocada!");
	}
	
}
