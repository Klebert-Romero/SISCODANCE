package idat.edu.pe.siscodance.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="aula")

public class Aula implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idaula;
	
	private String seccion;
	
	 @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	  private Tutor idtutor;
	 

	 @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	  private Grado idgrado;


	public Integer getIdaula() {
		return idaula;
	}


	public void setIdaula(Integer idaula) {
		this.idaula = idaula;
	}


	public String getSeccion() {
		return seccion;
	}


	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}


	public Tutor getIdtutor() {
		return idtutor;
	}


	public void setIdtutor(Tutor idtutor) {
		this.idtutor = idtutor;
	}


	public Grado getIdgrado() {
		return idgrado;
	}


	public void setIdgrado(Grado idgrado) {
		this.idgrado = idgrado;
	}


	@Override
	public String toString() {
		return "Aula [idaula=" + idaula + ", seccion=" + seccion + ", idtutor=" + idtutor + ", idgrado=" + idgrado
				+ "]";
	}
	 
	 

}
