package br.com.guelaio.hotelguelaio.hg.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guelaio.hotelguelaio.hg.interfaces.Service;
import br.com.guelaio.hotelguelaio.hg.models.Banco;
import br.com.guelaio.hotelguelaio.hg.models.Cliente;

public class RemoverCliente implements Service {
	public String executar(HttpServletRequest request, HttpServletResponse response) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataFormatada;
		try {
			dataFormatada = simpleDateFormat.parse(request.getParameter("dataDeNascimento"));
		} catch (ParseException e) {
			return e.getMessage();
		}

		Cliente cliente = new Cliente(request.getParameter("nome"), request.getParameter("cpf"), dataFormatada);

		Banco banco = new Banco();

		banco.adicionar(cliente);
		return "";
	}
}
