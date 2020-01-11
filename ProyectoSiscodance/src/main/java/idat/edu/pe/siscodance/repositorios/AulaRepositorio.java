package idat.edu.pe.siscodance.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.siscodance.modelo.Aula;
import idat.edu.pe.siscodance.modelo.Grado;
import idat.edu.pe.siscodance.modelo.Nivel;
import idat.edu.pe.siscodance.modelo.Tutor;

public interface AulaRepositorio extends CrudRepository<Aula, Integer> {
	/*@Query (value = "SELECT a FROM Aula a WHERE a.seccion = ?1")
	public List<Aula> buscarAulasPorNombre(String seccion);
	
	@Query(value = "SELECT a FROM Aula a WHERE a.seccion like CONCAT(?1, '%')")
	public List<Aula> buscarAulaLikeNombre(String seccion);*/
	
	@Query("from Grado")
	public List<Grado> findAllGrados();
	
	@Query("from Nivel")
	public List<Nivel> findAllNivel();
	
	@Query("from Tutor")
	public List<Tutor> findAllTutor();
}
