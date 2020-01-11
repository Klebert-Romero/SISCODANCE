package idat.edu.pe.siscodance.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.siscodance.modelo.Grado;
import idat.edu.pe.siscodance.modelo.Nivel;
import idat.edu.pe.siscodance.repositorios.GradoRepositorio;

@Service
@Transactional
public class GradoServicio {
	@Autowired
	private GradoRepositorio repositorio;

	public GradoServicio() {

	}

	public List<Grado> buscarTodo() {
		return (List<Grado>) repositorio.findAll();
	}

	public Grado crear(Grado grado) {
		return repositorio.save(grado);
	}

	public Grado actualizar(Grado gradoActualizar) {
		Grado gradoActual = repositorio.findById(gradoActualizar.getIdgrado()).get();
		gradoActual.setIdgrado(gradoActualizar.getIdgrado());
		gradoActual.setNombregrado(gradoActualizar.getNombregrado());

		Grado gradoActualizado = repositorio.save(gradoActual);
		return gradoActualizado;
	}

	public Grado buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}

	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}

	public List<Nivel> listarNiveles() {
		return repositorio.findAllNivel();
	}
}
