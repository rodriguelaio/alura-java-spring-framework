package br.com.guelaio.hotelguelaio.hg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cadastrarCliente")
public class cadastrarCliente extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		Cliente cliente = new Cliente(request.getParameter("nome"));
//		System.out.println("wow" + request.getParameter("nomeDoCLiente"));
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/novoClienteCadastrado.jsp");
		request.setAttribute("nome", cliente.getNome());
		requestDispatcher.forward(request, response);
//		Response
	}
	
}
