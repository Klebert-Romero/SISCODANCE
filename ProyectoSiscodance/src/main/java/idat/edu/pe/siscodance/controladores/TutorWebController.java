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


import idat.edu.pe.siscodance.modelo.Tutor;
import idat.edu.pe.siscodance.servicios.TutorServicio;

@Controller
@RequestMapping("/tutores")

public class TutorWebController {
	
	@Autowired
	private TutorServicio servicio;
	
	@RequestMapping("/listarTodo")
	public String listarTutores(Model model) {
		List <Tutor> listaTutores = servicio.buscarTodo();
		model.addAttribute("listaTutores", listaTutores);
		return "/moduloAdministracion/listarTodo";
		
	}
	@RequestMapping("/nuevo")
	public String nuevoTutor(Model model) {
		Tutor tutor = new Tutor();
		model.addAttribute("tutor", tutor);
		return "/moduloAdministracion/nuevoTutor";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearTutor(@ModelAttribute("tutor") Tutor tutor) {
		servicio.crear(tutor);
	    return "redirect:/tutores/listarTodo";
	}
	
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarTutor(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("/moduloAdministracion/editarTutor");
	    Tutor tutor = servicio.buscarPorID(id);
	    mav.addObject("tutor", tutor);
	    return mav;
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminarTutor(@PathVariable(name = "id") int id) {
		servicio.borrarPorID(id);;
	    return "redirect:/tutores/listarTodo";       
	}

}
