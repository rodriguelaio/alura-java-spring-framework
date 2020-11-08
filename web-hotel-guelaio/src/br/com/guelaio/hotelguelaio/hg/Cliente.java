package br.com.guelaio.hotelguelaio.hg;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String cpf;
	private Date dataDeNascimento;
	private Date dataDeCriacao = new Date();
	
	public Cliente(String nome, String cpf, Date dataDeNascimento) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataDeNascimento(dataDeNascimento);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public Date getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public Date getDataDeCriacao() {
		return this.dataDeCriacao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

}
