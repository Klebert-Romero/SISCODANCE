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


import idat.edu.pe.siscodance.modelo.Jurado;
import idat.edu.pe.siscodance.servicios.JuradoServicio;

@Controller
@RequestMapping("/jurados")

public class JuradoWebController {
	
	@Autowired
	private JuradoServicio servicio;
	
	@RequestMapping("/listarJurados")
	public String listarJurados(Model model) {
		List <Jurado> listaJurados = servicio.buscarTodo();
		model.addAttribute("listaJurados", listaJurados);
		return "/moduloAdministracion/listarJurado";
		
	}
	@RequestMapping("/nuevo")
	public String nuevoJurado(Model model) {
		Jurado jurado = new Jurado();
		model.addAttribute("jurado", jurado);
		return "/moduloAdministracion/nuevoJurado";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearJurado(@ModelAttribute("jurado") Jurado jurado) {
		servicio.crear(jurado);
	    return "redirect:/jurados/listarJurados";
	}
	
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarJurado(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("/moduloAdministracion/editarJurado");
	    Jurado jurado = servicio.buscarPorID(id);
	    mav.addObject("jurado", jurado);
	    return mav;
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminarJurado(@PathVariable(name = "id") int id) {
		servicio.borrarPorID(id);;
	    return "redirect:/jurados/listarJurados";       
	}

}
