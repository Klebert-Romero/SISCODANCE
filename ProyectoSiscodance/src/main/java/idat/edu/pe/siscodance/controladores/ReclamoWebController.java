package idat.edu.pe.siscodance.controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import idat.edu.pe.siscodance.modelo.Reclamo;
import idat.edu.pe.siscodance.servicios.ReclamoServicio;

@Controller
@RequestMapping("/reclamos")
public class ReclamoWebController {
	
	private ReclamoServicio servicio;
	
	@RequestMapping("/listarTodo")
	public String listarReclamos(Model model) {
		List<Reclamo> listaReclamos = servicio.buscarTodo();
		model.addAttribute("listaReclamos", listaReclamos);
		return "/moduloReclamos/listarTodo";
	}
	
	@RequestMapping("/nuevo")
	public String nuevoReclamo(Model model) {
		Reclamo reclamo = new Reclamo();
		model.addAttribute("reclamo", reclamo);
		return "/moduloReclamos/nuevoReclamo";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearReclamo(@ModelAttribute("reclamo") Reclamo reclamo) {
		servicio.crear(reclamo);
		return "redirect:/reclamos/listarTodo";
	}
	
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarReclamo(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("/moduloReclamos/editarReclamo");
		Reclamo reclamo = servicio.buscarPorID(id);
		mav.addObject("reclamo", reclamo);
		return mav;
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarReclamo(@PathVariable(name = "id") int id) {
		servicio.borrarPorId(id);
		;
		return "redirect:/reclamos/listarTodo";
	}
}
