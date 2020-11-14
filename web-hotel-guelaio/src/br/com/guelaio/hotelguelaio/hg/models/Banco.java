package br.com.guelaio.hotelguelaio.hg.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Cliente> clientes = new ArrayList<>();

	public Cliente getClienteById(int id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId() == id) return cliente;
		}
		return null;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void adicionar(Cliente cliente) {
		clientes.add(cliente);
	}
}
