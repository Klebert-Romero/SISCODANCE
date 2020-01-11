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

import idat.edu.pe.siscodance.modelo.Aula;
import idat.edu.pe.siscodance.modelo.Grado;
import idat.edu.pe.siscodance.modelo.Nivel;
import idat.edu.pe.siscodance.modelo.Tutor;
import idat.edu.pe.siscodance.servicios.AulaServicio;

@Controller
@RequestMapping("/aulas")
public class AulaWebController {
	
	@Autowired
	private AulaServicio servicio;
	
	@RequestMapping("/listarAulas")
	public String listarAulas(Model model) {
		List <Aula> listaAulas = servicio.buscarTodo();
		model.addAttribute("listaAulas", listaAulas);
		return "/moduloAdministracion/listarAulas";
	}
	
	@RequestMapping("/nuevo")
	public String nuevaAula(Model model) {
		Aula aula = new Aula();
		List<Grado> grados = servicio.listarGrados();
		List<Nivel> niveles = servicio.listarNiveles();
		List<Tutor> tutores = servicio.listarTutores();
		model.addAttribute("aula", aula);
		model.addAttribute("grado", grados);
		model.addAttribute("nivel", niveles);
		model.addAttribute("tutor", tutores);
		return "/moduloAdministracion/nuevaAula";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearAula(@ModelAttribute("aula") Aula aula) {
		servicio.crear(aula);
		return "redirect:/aulas/listarAulas";
	}
	
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarAula(@PathVariable(name = "id")int id) {
		ModelAndView mav = new ModelAndView("/moduloAdministracion/editarAula");
		Aula aula = servicio.buscarPorId(id);
		List<Grado> grados = servicio.listarGrados();
		List<Nivel> niveles = servicio.listarNiveles();
		List<Tutor> tutores = servicio.listarTutores();
		mav.addObject("aula", aula);
		mav.addObject("grado", grados);
		mav.addObject("nivel", niveles);
		mav.addObject("tutor", tutores);
		return mav;
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarAula(@PathVariable(name = "id")int id) {
		servicio.borrarPorId(id);
		return "redirect:/aulas/listarAulas";
	}

}
