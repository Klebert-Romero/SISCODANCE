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

import idat.edu.pe.siscodance.modelo.Grado;
import idat.edu.pe.siscodance.modelo.Nivel;
import idat.edu.pe.siscodance.servicios.GradoServicio;

@Controller
@RequestMapping("/grados")
public class GradoWebController {
	
	@Autowired
	private GradoServicio servicio;
	
	@RequestMapping("/listarGrados")
	public String listarGrados(Model model) {
		List <Grado> listaGrados = servicio.buscarTodo();
		model.addAttribute("listaGrados", listaGrados);
		return "/moduloAdministracion/listarGrados";
		
	}
	@RequestMapping("/nuevo")
	public String nuevoGrado(Model model) {
		Grado grado = new Grado();
		List<Nivel> niveles = servicio.listarNiveles();
		
		model.addAttribute("grado", grado);
		model.addAttribute("nivel", niveles);
		return "/moduloAdministracion/nuevoGrado";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearGrado(@ModelAttribute("grado") Grado grado) {
		servicio.crear(grado);
	    return "redirect:/grados/listarGrados";
	}
	
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarGrado(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("/moduloAdministracion/editarGrado");
	    Grado grado = servicio.buscarPorID(id);
	    List<Nivel> niveles = servicio.listarNiveles();
		
	    mav.addObject("grado", grado);
	    mav.addObject("nivel", niveles);
	    return mav;
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarGrado(@PathVariable(name = "id") int id) {
		servicio.borrarPorID(id);;
	    return "redirect:/grados/listarGrados";       
	}

}