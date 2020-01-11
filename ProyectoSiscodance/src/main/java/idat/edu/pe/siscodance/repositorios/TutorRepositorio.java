package idat.edu.pe.siscodance.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import idat.edu.pe.siscodance.modelo.Tutor;

public interface TutorRepositorio extends CrudRepository<Tutor, Integer> {
	@Query (value = "SELECT a FROM Tutor a WHERE a.nomtutor = ?1")
	public List<Tutor> buscarTutoresPorNombre(String nomtutor);

	@Query(value = "SELECT a FROM Tutor a WHERE a.nomtutor like CONCAT(?1, '%')")
	public List<Tutor> buscarTutorLikeNombre(String nomtutor);

}
