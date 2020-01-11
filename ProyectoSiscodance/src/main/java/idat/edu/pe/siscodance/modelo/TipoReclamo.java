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
@Table(name = "tiporeclamo")

public class TipoReclamo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)

	@Column(name = "idtiporeclamo")
	private Integer idtiporeclamo;

	@Column(name = "nombretipo")
	private String nombretipo;

	public TipoReclamo() {
	}

	public TipoReclamo(Integer idtiporeclamo, String nombretipo) {
		this.idtiporeclamo = idtiporeclamo;
		this.nombretipo = nombretipo;
	}

	public Integer getIdtiporeclamo() {
		return idtiporeclamo;
	}

	public void setIdtiporeclamo(Integer idtiporeclamo) {
		this.idtiporeclamo = idtiporeclamo;
	}

	public String getNombretipo() {
		return nombretipo;
	}

	public void setNombretipo(String nombretipo) {
		this.nombretipo = nombretipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idtiporeclamo == null) ? 0 : idtiporeclamo.hashCode());
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
		TipoReclamo other = (TipoReclamo) obj;
		if (idtiporeclamo == null) {
			if (other.idtiporeclamo != null)
				return false;
		} else if (!idtiporeclamo.equals(other.idtiporeclamo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "idat.edu.pe.siscodance.modelo.TipoReclamo [idtiporeclamo=" + idtiporeclamo + "]";
	}
	
	

}
