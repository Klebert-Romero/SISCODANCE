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

import idat.edu.pe.siscodance.modelo.Categoria;

import idat.edu.pe.siscodance.servicios.CategoriaServicio;;

@Controller
@RequestMapping("/categorias")

public class CategoriaWebCotroller {
	@Autowired
	private CategoriaServicio servicio;
	
	@RequestMapping("/listarCategorias")
	public String listarJurados(Model model) {
		List <Categoria> listaCategorias = servicio.buscarTodo();
		model.addAttribute("listaCategorias", listaCategorias);
		return "/moduloAdministracion/listarCategorias";
		
	}
	@RequestMapping("/nuevo")
	public String nuevoCategoria(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria", categoria);
		return "/moduloAdministracion/nuevaCategoria";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String crearCategoria(@ModelAttribute("categoria") Categoria categoria) {
		servicio.crear(categoria);
	    return "redirect:/categorias/listarCategorias";
	}
	
	@RequestMapping("/actualizar/{id}")
	public ModelAndView editarCategoria(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("/moduloAdministracion/editarCategoria");
	    Categoria categoria = servicio.buscarPorID(id);
	    mav.addObject("categoria", categoria);
	    return mav;
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminarCategoria(@PathVariable(name = "id") int id) {
		servicio.borrarPorID(id);;
	    return "redirect:/categorias/listarCategorias";       
	
	
	}

}
