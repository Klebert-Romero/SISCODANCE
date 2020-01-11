package idat.edu.pe.siscodance.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.siscodance.modelo.Reclamo;
import idat.edu.pe.siscodance.repositorios.ReclamoRepositorio;

@Service
@Transactional
public class ReclamoServicio {

	@Autowired
	public ReclamoRepositorio repositorio;

	public ReclamoServicio() {
	}

	public Reclamo crear(Reclamo reclamo) {
		return repositorio.save(reclamo);
	}

	public List<Reclamo> buscarTodo() {
		return (ArrayList<Reclamo>) repositorio.findAll();
	}

	public Reclamo actualizar(Reclamo reclamoActualizar) {
		Reclamo reclamoActual = repositorio.findById(reclamoActualizar.getIdreclamo()).get();
		reclamoActual.setIdreclamo(reclamoActualizar.getIdreclamo());
		reclamoActual.setDescriprecla(reclamoActualizar.getDescriprecla());
		reclamoActual.setEstado(reclamoActualizar.getEstado());
		;
		Reclamo reclamoActualizado = repositorio.save(reclamoActual);
		return reclamoActualizado;
	}

	public Reclamo buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}

	public void borrarPorId(Integer id) {
		repositorio.deleteById(id);
	}
}
