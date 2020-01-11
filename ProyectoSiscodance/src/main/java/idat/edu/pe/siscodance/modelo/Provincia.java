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
@Table(name="provincia")
public class Provincia implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idprovincia")
	private Integer idprovincia;
	@Column(name = "nombreprov")
	private String nombreprov;
	
	@ManyToOne
	@JoinColumn(name="iddepartamento")
	private Departamento departamento;

	public Integer getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(Integer idprovincia) {
		this.idprovincia = idprovincia;
	}

	public String getNombreprov() {
		return nombreprov;
	}

	public void setNombreprov(String nombreprov) {
		this.nombreprov = nombreprov;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((idprovincia == null) ? 0 : idprovincia.hashCode());
		result = prime * result + ((nombreprov == null) ? 0 : nombreprov.hashCode());
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
		Provincia other = (Provincia) obj;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (idprovincia == null) {
			if (other.idprovincia != null)
				return false;
		} else if (!idprovincia.equals(other.idprovincia))
			return false;
		if (nombreprov == null) {
			if (other.nombreprov != null)
				return false;
		} else if (!nombreprov.equals(other.nombreprov))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Provincia [idprovincia=" + idprovincia + ", nombreprov=" + nombreprov + ", departamento=" + departamento
				+ "]";
	}

	
	
	
	
}
