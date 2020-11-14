package br.com.guelaio.hotelguelaio.hg.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service {

	public String executar(HttpServletRequest request, HttpServletResponse response);
	
}
