package br.com.guelaio.hotelguelaio.hg;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada;
		try {
			dataFormatada = simpleDateFormat.parse(request.getParameter("dataDeNascimento"));
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Cliente cliente = new Cliente(request.getParameter("nome"),
				request.getParameter("cpf"), dataFormatada);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/novoClienteCadastrado.jsp");
		request.setAttribute("nome", cliente.getNome());
		request.setAttribute("dataDeNascimento", cliente.getDataDeNascimento());
		requestDispatcher.forward(request, response);

	}
	
}
