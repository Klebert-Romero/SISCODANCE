package idat.edu.pe.siscodance.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.siscodance.modelo.Categoria;
import idat.edu.pe.siscodance.modelo.Jurado;

public interface CategoriaRepositorio extends CrudRepository<Categoria, Integer> {
	@Query (value = "SELECT a FROM Categoria a WHERE a.nombrecate = ?1")
	public List<Categoria> buscarJuradosPorNombre(String nombrecate);

	@Query(value = "SELECT a FROM Categoria a WHERE a.nombrecate like CONCAT(?1, '%')")
	public List<Categoria> buscarJuradoLikeNombre(String nombrecate);

}
