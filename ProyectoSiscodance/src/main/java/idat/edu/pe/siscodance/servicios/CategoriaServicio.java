package idat.edu.pe.siscodance.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.siscodance.modelo.Categoria;
import idat.edu.pe.siscodance.repositorios.CategoriaRepositorio;

@Service
@Transactional

public class CategoriaServicio {
	@Autowired
	private CategoriaRepositorio repositorio;
	
	public CategoriaServicio() {
		
	}
	public List<Categoria> buscarTodo(){
		return (List<Categoria>) repositorio.findAll();  
	}
	public Categoria crear(Categoria categoria) {
		return repositorio.save(categoria);
	}
	public Categoria actualizar(Categoria categoriaActualizar) {
		Categoria categoriaActual = repositorio.findById(categoriaActualizar.getIdcategoria()).get();
		categoriaActual.setIdcategoria(categoriaActualizar.getIdcategoria());
		categoriaActual.setNombrecate(categoriaActualizar.getNombrecate());
		categoriaActual.setDescripcion(categoriaActualizar.getDescripcion());
		
		
		Categoria categoriaActualizado = repositorio.save(categoriaActual);
		return categoriaActualizado;
	}
	public Categoria buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}
	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}
	

}
