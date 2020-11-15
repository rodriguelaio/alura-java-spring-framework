package br.com.guelaio.hotelguelaio.hg.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.guelaio.hotelguelaio.hg.interfaces.Service;

public class FormLogin implements Service {
	
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		return "dispatch:formLogin.jsp";
	}

}
