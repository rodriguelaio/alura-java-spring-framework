package br.com.guelaio.hotelguelaio.hg.models;

public class Usuario {
	
	private static int id;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario(String nome, String email, String senha) {
		setId();
		setNome(nome);
		setEmail(email);
		setSenha(senha);
	}
	
	public int getId() {
		return Usuario.id;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	private void setId() {
		Usuario.id++;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setEmail(String email) {
		this.email = email;
	}
	
	private void setSenha(String senha) {
		this.senha = senha;
	}

}
