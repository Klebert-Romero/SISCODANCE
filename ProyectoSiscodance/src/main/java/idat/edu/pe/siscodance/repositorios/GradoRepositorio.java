package idat.edu.pe.siscodance.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.siscodance.modelo.Grado;
import idat.edu.pe.siscodance.modelo.Nivel;;

public interface GradoRepositorio extends CrudRepository<Grado, Integer> {
	/*@Query (value = "SELECT a FROM Grado a WHERE a.nombregrado = ?1")
	public List<Grado> buscarGradosPorNombre(String nombregrado);

	@Query(value = "SELECT a FROM Grado a WHERE a.nombregrado like CONCAT(?1, '%')")
	public List<Grado> buscarGradoLikeNombre(String nombregrado);*/
	
	@Query("from Nivel")
	public List<Nivel> findAllNivel();

}
