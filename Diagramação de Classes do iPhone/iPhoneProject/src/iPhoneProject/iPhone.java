package iPhoneProject;

import java.util.HashMap;
import java.util.Map;

public class iPhone implements reprodutorMusical,aparelhoTelefonico,navegadorInternet {

	private String nomeMusica;
	private String nomeCantor;
	
	private Long numeroTelefonico;
	private String nomeContato;
	
	private Map<Long,String> listaNumeros;
		
	
	public iPhone(String nomeMusica, String nomeCantor, Long numeroTelefonico, String nomeContato,
			Map<Long, String> listaNumeros) {
		this.nomeMusica = nomeMusica;
		this.nomeCantor = nomeCantor;
		this.numeroTelefonico = numeroTelefonico;
		this.nomeContato = nomeContato;
		this.listaNumeros = listaNumeros;
	}


	public String getNomeMusica() {
		return nomeMusica;
	}


	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}


	public String getNomeCantor() {
		return nomeCantor;
	}


	public void setNomeCantor(String nomeCantor) {
		this.nomeCantor = nomeCantor;
	}


	public Long getNumeroTelefonico() {
		return numeroTelefonico;
	}


	public void setNumeroTelefonico(Long numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}


	public String getNomeContato() {
		return nomeContato;
	}


	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}


	public Map<Long, String> getListaNumeros() {
		return listaNumeros;
	}


	public void setListaNumeros() {
		this.listaNumeros = new HashMap<Long,String>();
	}


	public static void main(String[] args) {
					

	}

}
