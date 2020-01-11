package idat.edu.pe.siscodance.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.siscodance.modelo.TipoReclamo;
import idat.edu.pe.siscodance.servicios.TipoReclamoServicio;

@Controller
@RequestMapping("/tipoReclamos")
public class TipoReclamoWebController {
	
	@Autowired
	private TipoReclamoServicio servicio;
	
	@RequestMapping("/listarTodo")
	public String listarTipoReclamos(Model model) {
		List<TipoReclamo> listaTipoReclamo = servicio.buscarTodo();
		model.addAttribute("listaTipoReclamo", listaTipoReclamo);
		return "/moduloAdministracion/listarTodo";
	}
	
}
