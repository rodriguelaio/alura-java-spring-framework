package br.com.guelaio.hotelguelaio.hg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controllerPrincipalServlet", urlPatterns = { "/controllerPrincipalServlet" })
public class ControllerPrincipalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String RAIZDOENDPOINTPRINCIPAL = "controllerPrincipalServlet?service=";
	private static final String PATHDACAMADADEVIEW = "/WEB-INF/view/";

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ValidarRequestService validarRequestService = new ValidarRequestService();

		String acaoEEnderecoComSplitPorDoisPontos = validarRequestService
				.validarService(request.getParameter("service")).executar(request, response);

		if (acaoEEnderecoComSplitPorDoisPontos.split(":")[0].equals("redirect"))
			response.sendRedirect(RAIZDOENDPOINTPRINCIPAL + acaoEEnderecoComSplitPorDoisPontos.split(":")[1]);

		if (acaoEEnderecoComSplitPorDoisPontos.split(":")[0].equals("dispatch")) {
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher(PATHDACAMADADEVIEW + acaoEEnderecoComSplitPorDoisPontos.split(":")[1]);
			requestDispatcher.forward(request, response);
		}
	}

}
