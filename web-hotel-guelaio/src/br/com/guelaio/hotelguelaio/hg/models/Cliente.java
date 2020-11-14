package br.com.guelaio.hotelguelaio.hg.models;

import java.util.Date;

public class Cliente {

	private static int id;
	private String nome;
	private String cpf;
	private Date dataDeNascimento;

	public Cliente(String nome, String cpf, Date dataDeNascimento) {
		setId();
		setNome(nome);
		setCpf(cpf);
		setDataDeNascimento(dataDeNascimento);
	}

	public int getId() {
		return Cliente.id;
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

	private void setId() {
		Cliente.id++;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
