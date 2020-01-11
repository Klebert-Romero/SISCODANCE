package idat.edu.pe.siscodance.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.siscodance.modelo.Aula;
import idat.edu.pe.siscodance.modelo.Grado;
import idat.edu.pe.siscodance.modelo.Nivel;
import idat.edu.pe.siscodance.modelo.Tutor;
import idat.edu.pe.siscodance.repositorios.AulaRepositorio;

@Service
@Transactional
public class AulaServicio {
	
	@Autowired
	private AulaRepositorio repositorio;
	
	public AulaServicio() {
	}

	public List<Aula> buscarTodo(){
		return (List<Aula>) repositorio.findAll();
	}
	
	public Aula crear(Aula aula) {
		return repositorio.save(aula);
	}
	
	public Aula actualizar(Aula aulaActualizar) {
		Aula aulaActual = repositorio.findById(aulaActualizar.getIdaula()).get();
		aulaActual.setIdaula(aulaActualizar.getIdaula());
		aulaActual.setSeccion(aulaActualizar.getSeccion());
		
		Aula aulaActualizada = repositorio.save(aulaActual);
		return aulaActualizada;
	}
	
	public Aula buscarPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void borrarPorId(Integer id) {
		repositorio.deleteById(id);
	}
	
	public List<Grado> listarGrados(){
		return repositorio.findAllGrados();
	}
	
	public List<Nivel> listarNiveles() {
		return repositorio.findAllNivel();
	}
	
	public List<Tutor> listarTutores(){
		return repositorio.findAllTutor();
	}
}
