package idat.edu.pe.siscodance.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.siscodance.modelo.TipoReclamo;

public interface TipoReclamoRepositorio extends CrudRepository<TipoReclamo, Integer> {

	@Query (value = "SELECT a FROM TipoReclamo a WHERE a.nombretipo = ?1")
	public List<TipoReclamo> buscarTipoReclaPorNombre(String nombretipo);
	
	@Query(value = "SELECT a FROM TipoReclamo a WHERE a.nombretipo like CONCAT(?1, '%')")
	public List<TipoReclamo> buscarTipoReclaLikeNombre(String nombretipo);
}
