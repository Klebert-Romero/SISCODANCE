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
@Table(name="observacion")
public class Observacion implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "idobservacion")
	private Integer idobservacion;
	@Column(name = "comentario")
	private String comentario;
	

	@JoinColumn(name = "idcalificacion", referencedColumnName = "idcalificacion")
	@ManyToOne(optional = false)
	private Calificacion calificacion;
	
	public Observacion() {
		// TODO Auto-generated constructor stub
	}

	public Observacion(Integer idobservacion, String comentario, Calificacion calificacion) {
		super();
		this.idobservacion = idobservacion;
		this.comentario = comentario;
		this.calificacion = calificacion;
	}

	public Integer getIdobservacion() {
		return idobservacion;
	}

	public void setIdobservacion(Integer idobservacion) {
		this.idobservacion = idobservacion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Calificacion getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Calificacion calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calificacion == null) ? 0 : calificacion.hashCode());
		result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + ((idobservacion == null) ? 0 : idobservacion.hashCode());
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
		Observacion other = (Observacion) obj;
		if (calificacion == null) {
			if (other.calificacion != null)
				return false;
		} else if (!calificacion.equals(other.calificacion))
			return false;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (idobservacion == null) {
			if (other.idobservacion != null)
				return false;
		} else if (!idobservacion.equals(other.idobservacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Observacion [idobservacion=" + idobservacion + ", comentario=" + comentario + ", calificacion="
				+ calificacion + "]";
	}
	
	



}
