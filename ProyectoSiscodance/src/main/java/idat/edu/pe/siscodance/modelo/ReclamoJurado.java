package idat.edu.pe.siscodance.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="reclamojurado")

public class ReclamoJurado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "idrejurado")
	private Integer idrejurado;
	@Column(name = "estadojurado")
	private String estadojurado;

	@ManyToOne
	@JoinColumn(name="idreclamo")
	private Reclamo reclamo;
	
	@ManyToOne
	@JoinColumn(name="idjurado")
	private Jurado jurado;
	
	public ReclamoJurado() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdrejurado() {
		return idrejurado;
	}

	public void setIdrejurado(Integer idrejurado) {
		this.idrejurado = idrejurado;
	}

	public String getEstadojurado() {
		return estadojurado;
	}

	public void setEstadojurado(String estadojurado) {
		this.estadojurado = estadojurado;
	}

	public Reclamo getReclamo() {
		return reclamo;
	}

	public void setReclamo(Reclamo reclamo) {
		this.reclamo = reclamo;
	}

	public Jurado getJurado() {
		return jurado;
	}

	public void setJurado(Jurado jurado) {
		this.jurado = jurado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estadojurado == null) ? 0 : estadojurado.hashCode());
		result = prime * result + ((idrejurado == null) ? 0 : idrejurado.hashCode());
		result = prime * result + ((jurado == null) ? 0 : jurado.hashCode());
		result = prime * result + ((reclamo == null) ? 0 : reclamo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReclamoJurado other = (ReclamoJurado) obj;
		if (estadojurado == null) {
			if (other.estadojurado != null)
				return false;
		} else if (!estadojurado.equals(other.estadojurado))
			return false;
		if (idrejurado == null) {
			if (other.idrejurado != null)
				return false;
		} else if (!idrejurado.equals(other.idrejurado))
			return false;
		if (jurado == null) {
			if (other.jurado != null)
				return false;
		} else if (!jurado.equals(other.jurado))
			return false;
		if (reclamo == null) {
			if (other.reclamo != null)
				return false;
		} else if (!reclamo.equals(other.reclamo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReclamoJurado [idrejurado=" + idrejurado + ", estadojurado=" + estadojurado + ", reclamo=" + reclamo
				+ ", jurado=" + jurado + "]";
	}
	
	
	

}
