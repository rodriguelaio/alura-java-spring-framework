package br.com.guelaio.hotelguelaio.hg;

import br.com.guelaio.hotelguelaio.hg.interfaces.Service;
import br.com.guelaio.hotelguelaio.hg.services.CadastrarCliente;
import br.com.guelaio.hotelguelaio.hg.services.FormCadastrarCliente;
import br.com.guelaio.hotelguelaio.hg.services.ListarClientes;
import br.com.guelaio.hotelguelaio.hg.services.RemoverCliente;

public class ValidarRequestService {
	
	public Service validarService(String requestService) {
		if (requestService.equals("formCadastrarCliente")) return new FormCadastrarCliente();
		if (requestService.equals("cadastrarCliente")) return new CadastrarCliente();
		if (requestService.equals("removerCliente")) return new RemoverCliente();
		return new ListarClientes();
	}

}
