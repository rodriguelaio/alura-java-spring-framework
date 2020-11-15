package br.com.guelaio.hotelguelaio.hg.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.guelaio.hotelguelaio.hg.interfaces.Service;
import br.com.guelaio.hotelguelaio.hg.models.Banco;
import br.com.guelaio.hotelguelaio.hg.models.Cliente;

public class CadastrarCliente implements Service {

	public String executar(HttpServletRequest request, HttpServletResponse response) {

		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		Date dataDeNascimento = new Date();

		try {
			dataDeNascimento = dataFormatada.parse(request.getParameter("dataDeNascimento"));
		} catch (ParseException e) {
			return e.getMessage();
		}

		Cliente cliente = new Cliente(request.getParameter("nome"), request.getParameter("cpf"), dataDeNascimento);

		Banco banco = new Banco();
		banco.adicionar(cliente);
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("cliente", cliente);
		System.out.println("pior q foi pela sessao mermo");
		return "redirect:listarClientes";
	}

}
