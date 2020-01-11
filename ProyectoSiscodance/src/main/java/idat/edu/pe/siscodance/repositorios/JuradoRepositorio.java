package idat.edu.pe.siscodance.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import idat.edu.pe.siscodance.modelo.Jurado;

public interface JuradoRepositorio extends CrudRepository<Jurado, Integer> {
	@Query (value = "SELECT a FROM Jurado a WHERE a.nomjurado = ?1")
	public List<Jurado> buscarJuradosPorNombre(String nomjurado);

	@Query(value = "SELECT a FROM Jurado a WHERE a.nomjurado like CONCAT(?1, '%')")
	public List<Jurado> buscarJuradoLikeNombre(String nomjurado);

}
