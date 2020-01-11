package idat.edu.pe.siscodance.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.siscodance.modelo.Nivel;;

public interface NivelRepositorio extends CrudRepository<Nivel, Integer> {
	@Query (value = "SELECT a FROM Nivel a WHERE a.nomnivel = ?1")
	public List<Nivel> buscarNivelesPorNombre(String nomnivel);

	@Query(value = "SELECT a FROM Nivel a WHERE a.nomnivel like CONCAT(?1, '%')")
	public List<Nivel> buscarNivelLikeNombre(String nomnivel);

	
}
