package iPhoneProject;

public interface navegadorInternet {
	
	public static void exibirPagina(String url) {
		System.out.println("A página solicitada está sendo exibida!");
	}
	
	public static void adicionarNovaAba() {
		System.out.println("Nova aba adicionada! ");
	}
	
	public static void atualizarPagina() {
		System.out.println("Página atualizada com sucesso! ");
	}
}
