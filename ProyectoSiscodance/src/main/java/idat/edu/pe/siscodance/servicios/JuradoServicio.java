package idat.edu.pe.siscodance.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import idat.edu.pe.siscodance.modelo.Jurado;
import idat.edu.pe.siscodance.repositorios.JuradoRepositorio;

@Service
@Transactional

public class JuradoServicio {
	@Autowired
	private JuradoRepositorio repositorio;
	
	public JuradoServicio() {
		
	}
	public List<Jurado> buscarTodo(){
		return (List<Jurado>) repositorio.findAll();  
	}
	public Jurado crear(Jurado jurado) {
		return repositorio.save(jurado);
	}
	public Jurado actualizar(Jurado juradoActualizar) {
		Jurado juradoActual = repositorio.findById(juradoActualizar.getIdjurado()).get();
		juradoActual.setIdjurado(juradoActualizar.getIdjurado());
		juradoActual.setNomjurado(juradoActualizar.getNomjurado());
		juradoActual.setApepatjurado(juradoActualizar.getApepatjurado());
		juradoActual.setApematjurado(juradoActualizar.getApematjurado());
	    juradoActual.setDnijurado(juradoActualizar.getDnijurado());
		juradoActual.setTelefono(juradoActualizar.getTelefono());
		juradoActual.setNombreusuario(juradoActualizar.getNombreusuario());
		
		Jurado juradoActualizado = repositorio.save(juradoActual);
		return juradoActualizado;
	}
	public Jurado buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}
	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}

}
