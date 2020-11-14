package br.com.guelaio.hotelguelaio.hg.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guelaio.hotelguelaio.hg.interfaces.Service;
import br.com.guelaio.hotelguelaio.hg.models.Banco;
import br.com.guelaio.hotelguelaio.hg.models.Cliente;

public class CadastrarCliente implements Service {

//	private HttpServletRequest request;
//	private HttpServletResponse response;
//
//	public CadastrarCliente(HttpServletRequest request, HttpServletResponse response) {
//		setRequest(request);
//		setResponse(response);
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
//
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//
//		Date dataFormatada;
//		try {
//			dataFormatada = simpleDateFormat.parse(request.getParameter("dataDeNascimento"));
//		} catch (ParseException e) {
//			throw new ServletException(e);
//		}
//
//		Cliente cliente = new Cliente(request.getParameter("nome"), request.getParameter("cpf"), dataFormatada);
//
//		Banco banco = new Banco();
//
//		banco.adicionar(cliente);
////		
////		response.sendRedirect("listarClientes");
////		return "";
//
//	}
//
//	public HttpServletRequest getRequest() {
//		return this.request;
//	}
//
//	public HttpServletResponse getResponse() {
//		return this.response;
//	}
//
//	private void setRequest(HttpServletRequest request) {
//		this.request = request;
//	}
//
//	private void setResponse(HttpServletResponse response) {
//		this.response = response;
//	}

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

		return "redirect:controllerPrincipalServlet?service=listarClientes&id=" + cliente.getId();
	}

}
