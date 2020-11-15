package br.com.guelaio.hotelguelaio.hg.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.guelaio.hotelguelaio.hg.interfaces.Service;
import br.com.guelaio.hotelguelaio.hg.models.Banco;
import br.com.guelaio.hotelguelaio.hg.models.Cliente;

public class ListarClientes implements Service {

	public String executar(HttpServletRequest request, HttpServletResponse response) {

		Banco banco = new Banco();

		HttpSession httpSession = request.getSession();
		Cliente cliente = (Cliente) httpSession.getAttribute("cliente");

		request.setAttribute("nome", cliente.getNome());
		request.setAttribute("cpf", cliente.getCpf());
		request.setAttribute("listaClientes", banco.getClientes());
		
		return "dispatch:listaClientes.jsp";
	}
}
