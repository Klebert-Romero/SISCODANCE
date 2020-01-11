package idat.edu.pe.siscodance.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")

public class AdministracionWebController {
	
	@RequestMapping("/administracion")
	public String listar(Model model) {
		
		return "/moduloAdministracion/administracion";
	}

}
