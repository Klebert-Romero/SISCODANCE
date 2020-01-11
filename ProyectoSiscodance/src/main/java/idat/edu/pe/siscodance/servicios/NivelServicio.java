package idat.edu.pe.siscodance.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import idat.edu.pe.siscodance.modelo.Nivel;
import idat.edu.pe.siscodance.repositorios.NivelRepositorio;

@Service
@Transactional

public class NivelServicio {
	@Autowired
	private NivelRepositorio repositorio;
	
	public NivelServicio() {
		
	}
	public List<Nivel> buscarTodo(){
		return (List<Nivel>) repositorio.findAll();  
	}
	public Nivel crear(Nivel nivel) {
		return repositorio.save(nivel);
	}
	public Nivel actualizar(Nivel nivelActualizar) {
		Nivel nivelActual = repositorio.findById(nivelActualizar.getIdnivel()).get();
		nivelActual.setIdnivel(nivelActualizar.getIdnivel());
		nivelActual.setNomnivel(nivelActualizar.getNomnivel());
		
		Nivel nivelActualizado = repositorio.save(nivelActual);
		return nivelActualizado;
	}
	public Nivel buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}
	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}


}
