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
@Table(name="departamento")

public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "iddepartamento")
	private Integer iddepartamento;
	@Column(name = "nombredep")
	private String nombredep;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIddepartamento() {
		return iddepartamento;
	}
	public void setIddepartamento(Integer iddepartamento) {
		this.iddepartamento = iddepartamento;
	}
	public String getNombredep() {
		return nombredep;
	}
	public void setNombredep(String nombredep) {
		this.nombredep = nombredep;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iddepartamento == null) ? 0 : iddepartamento.hashCode());
		result = prime * result + ((nombredep == null) ? 0 : nombredep.hashCode());
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
		Departamento other = (Departamento) obj;
		if (iddepartamento == null) {
			if (other.iddepartamento != null)
				return false;
		} else if (!iddepartamento.equals(other.iddepartamento))
			return false;
		if (nombredep == null) {
			if (other.nombredep != null)
				return false;
		} else if (!nombredep.equals(other.nombredep))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Departamento [iddepartamento=" + iddepartamento + ", nombredep=" + nombredep + "]";
	}
	
	
	
	
	
}
