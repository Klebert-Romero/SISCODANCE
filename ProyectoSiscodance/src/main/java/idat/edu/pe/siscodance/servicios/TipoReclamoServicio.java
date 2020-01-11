package idat.edu.pe.siscodance.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.siscodance.modelo.TipoReclamo;
import idat.edu.pe.siscodance.repositorios.TipoReclamoRepositorio;

@Service
@Transactional
public class TipoReclamoServicio {

	@Autowired
	private TipoReclamoRepositorio repositorio;

	public TipoReclamoServicio() {
	}

	public List<TipoReclamo> buscarTodo() {
		return (List<TipoReclamo>) repositorio.findAll();
	}

	public TipoReclamo crear(TipoReclamo tiporeclamo) {
		return repositorio.save(tiporeclamo);
	}

	public TipoReclamo actualizar(TipoReclamo tipoReclaActualizar) {
		TipoReclamo tipoReclaActual = repositorio.findById(tipoReclaActualizar.getIdtiporeclamo()).get();
		tipoReclaActual.setIdtiporeclamo(tipoReclaActualizar.getIdtiporeclamo());
		tipoReclaActual.setNombretipo(tipoReclaActualizar.getNombretipo());
		;
		TipoReclamo tipoReclaActualizado = repositorio.save(tipoReclaActual);
		return tipoReclaActualizado;
	}

	public TipoReclamo buscarPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	public void borrarPorId(Integer id) {
		repositorio.deleteById(id);
	}
}
