package br.com.guelaio.hotelguelaio.hg;

public class Cliente {
	
	private String nome;
	
	public Cliente(String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
