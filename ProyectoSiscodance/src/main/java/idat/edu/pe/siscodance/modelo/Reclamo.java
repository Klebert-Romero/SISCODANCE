package idat.edu.pe.siscodance.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "reclamo")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Reclamo.findAll", query = "SELECT r FROM Reclamo r"),
		@NamedQuery(name = "Reclamo.findByIdReclamo", query = "SELECT r FROM Reclamo r WHERE r.idreclamo = :idreclamo"),
		@NamedQuery(name = "Reclamo.findByDescripRecla", query = "SELECT r FROM Reclamo r WHERE r.descriprecla = :descriprecla"),
		@NamedQuery(name = "Reclamo.findByEstado", query = "SELECT r FROM Reclamo r WHERE r.estado = :estado") })

public class Reclamo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)

	@Column(name = "idreclamo")
	private Integer idreclamo;

	@Column(name = "descriprecla")
	private String descriprecla;

	@Column(name = "estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="idtiporeclamo")
	private Reclamo reclamo;
	
	@ManyToOne
	@JoinColumn(name="idtutor")
	private Tutor tutor;

	public Reclamo() {

	}

	public Integer getIdreclamo() {
		return idreclamo;
	}

	public void setIdreclamo(Integer idreclamo) {
		this.idreclamo = idreclamo;
	}

	public String getDescriprecla() {
		return descriprecla;
	}

	public void setDescriprecla(String descriprecla) {
		this.descriprecla = descriprecla;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Reclamo getReclamo() {
		return reclamo;
	}

	public void setReclamo(Reclamo reclamo) {
		this.reclamo = reclamo;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descriprecla == null) ? 0 : descriprecla.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((idreclamo == null) ? 0 : idreclamo.hashCode());
		result = prime * result + ((reclamo == null) ? 0 : reclamo.hashCode());
		result = prime * result + ((tutor == null) ? 0 : tutor.hashCode());
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
		Reclamo other = (Reclamo) obj;
		if (descriprecla == null) {
			if (other.descriprecla != null)
				return false;
		} else if (!descriprecla.equals(other.descriprecla))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (idreclamo == null) {
			if (other.idreclamo != null)
				return false;
		} else if (!idreclamo.equals(other.idreclamo))
			return false;
		if (reclamo == null) {
			if (other.reclamo != null)
				return false;
		} else if (!reclamo.equals(other.reclamo))
			return false;
		if (tutor == null) {
			if (other.tutor != null)
				return false;
		} else if (!tutor.equals(other.tutor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reclamo [idreclamo=" + idreclamo + ", descriprecla=" + descriprecla + ", estado=" + estado
				+ ", reclamo=" + reclamo + ", tutor=" + tutor + "]";
	}
	
	

	
	

}
