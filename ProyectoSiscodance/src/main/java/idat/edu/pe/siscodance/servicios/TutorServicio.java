package idat.edu.pe.siscodance.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import idat.edu.pe.siscodance.modelo.Tutor;
import idat.edu.pe.siscodance.repositorios.TutorRepositorio;

@Service
@Transactional

public class TutorServicio {
	@Autowired
	private TutorRepositorio repositorio;
	
	public TutorServicio() {
		
	}
	public List<Tutor> buscarTodo(){
		return (List<Tutor>) repositorio.findAll();  
	}
	public Tutor crear(Tutor tutor) {
		return repositorio.save(tutor);
	}
	public Tutor actualizar(Tutor tutorActualizar) {
		Tutor tutorActual = repositorio.findById(tutorActualizar.getIdtutor()).get();
		tutorActual.setIdtutor(tutorActualizar.getIdtutor());
		tutorActual.setNomtutor(tutorActualizar.getNomtutor());
		tutorActual.setApepattutor(tutorActualizar.getApepattutor());
		tutorActual.setApemattutor(tutorActualizar.getApemattutor());
	    tutorActual.setDnitutor(tutorActualizar.getDnitutor());
		tutorActual.setTelefonotut(tutorActualizar.getTelefonotut());
		tutorActual.setCorreotut(tutorActualizar.getCorreotut());
		//Ojo
		tutorActual.setNombreusuario(tutorActualizar.getNombreusuario());
		
		Tutor tutorActualizado = repositorio.save(tutorActual);
		return tutorActualizado;
	}
	public Tutor buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}
	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}

}
