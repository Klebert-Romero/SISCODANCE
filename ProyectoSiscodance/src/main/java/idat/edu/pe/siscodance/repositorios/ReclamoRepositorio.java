package idat.edu.pe.siscodance.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import idat.edu.pe.siscodance.modelo.Reclamo;
import idat.edu.pe.siscodance.modelo.TipoReclamo;

public interface ReclamoRepositorio extends CrudRepository<Reclamo, Integer>{
	
	
	@Query("from Reclamo")
	public List<TipoReclamo> findAllTipoReclamos();
	
}
