package br.com.guelaio.hotelguelaio.hg.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.guelaio.hotelguelaio.hg.interfaces.Service;

public class Logout implements Service {

	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();
		
		return "redirect:formLogin";
	}

}
