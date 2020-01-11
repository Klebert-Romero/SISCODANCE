package idat.edu.pe.siscodance.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import idat.edu.pe.siscodance.modelo.Nivel;
import idat.edu.pe.siscodance.servicios.NivelServicio;

@Controller
@RequestMapping("/niveles")

public class NivelWebController {
	
	@Autowired
	private NivelServicio servicio;
	
	@RequestMapping("/listarNiveles")
	public String listarNiveles(Model model) {
		List <Nivel> listaNiveles = servicio.buscarTodo();
		model.addAttribute("listaNiveles", listaNiveles);
		return "/moduloAdministracion/listarNiveles";
		
	}
	@RequestMapping("/nuevo")
	public String nuevoNivel(Model model) {
		Nivel nivel = new Nivel();
		model.addAttribute("nivel", nivel);
		return "/moduloAdministracion/nuevoNivel";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearNivel(@ModelAttribute("nivel") Nivel nivel) {
		servicio.crear(nivel);
	    return "redirect:/niveles/listarNiveles";
	}
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarNivel(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("/moduloAdministracion/editarNivel");
	    Nivel nivel = servicio.buscarPorID(id);
	    mav.addObject("nivel", nivel);
	    return mav;
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminarNivel(@PathVariable(name = "id") int id) {
		servicio.borrarPorID(id);;
	    return "redirect:/niveles/listarNiveles";       
	}

}
