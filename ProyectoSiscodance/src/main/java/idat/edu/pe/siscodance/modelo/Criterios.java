package idat.edu.pe.siscodance.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="criterios")

public class Criterios implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idcriterios")
	private Integer idcriterios;
	@Column(name = "nombrecri")
	private String nombrecri;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "puntajemax")
	private Integer puntajemax;
	
	public Criterios() {
		// TODO Auto-generated constructor stub
	}

	public Criterios(Integer idcriterios, String nombrecri, String descripcion, Integer puntajemax) {
		super();
		this.idcriterios = idcriterios;
		this.nombrecri = nombrecri;
		this.descripcion = descripcion;
		this.puntajemax = puntajemax;
	}

	public Integer getIdcriterios() {
		return idcriterios;
	}

	public void setIdcriterios(Integer idcriterios) {
		this.idcriterios = idcriterios;
	}

	public String getNombrecri() {
		return nombrecri;
	}

	public void setNombrecri(String nombrecri) {
		this.nombrecri = nombrecri;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPuntajemax() {
		return puntajemax;
	}

	public void setPuntajemax(Integer puntajemax) {
		this.puntajemax = puntajemax;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idcriterios == null) ? 0 : idcriterios.hashCode());
		result = prime * result + ((nombrecri == null) ? 0 : nombrecri.hashCode());
		result = prime * result + ((puntajemax == null) ? 0 : puntajemax.hashCode());
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
		Criterios other = (Criterios) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idcriterios == null) {
			if (other.idcriterios != null)
				return false;
		} else if (!idcriterios.equals(other.idcriterios))
			return false;
		if (nombrecri == null) {
			if (other.nombrecri != null)
				return false;
		} else if (!nombrecri.equals(other.nombrecri))
			return false;
		if (puntajemax == null) {
			if (other.puntajemax != null)
				return false;
		} else if (!puntajemax.equals(other.puntajemax))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Criterios [idcriterios=" + idcriterios + ", nombrecri=" + nombrecri + ", descripcion=" + descripcion
				+ ", puntajemax=" + puntajemax + "]";
	}
	
	
	
}
