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
@Table(name="distrito")

public class Distrito implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "iddistrito")
	private Integer iddistrito;
	@Column(name = "nombredist")
	private String nombresit;
	
	@ManyToOne
	@JoinColumn(name="idprovincia")
	private Provincia provincia;

	public Integer getIddistrito() {
		return iddistrito;
	}

	public void setIddistrito(Integer iddistrito) {
		this.iddistrito = iddistrito;
	}

	public String getNombresit() {
		return nombresit;
	}

	public void setNombresit(String nombresit) {
		this.nombresit = nombresit;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iddistrito == null) ? 0 : iddistrito.hashCode());
		result = prime * result + ((nombresit == null) ? 0 : nombresit.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
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
		Distrito other = (Distrito) obj;
		if (iddistrito == null) {
			if (other.iddistrito != null)
				return false;
		} else if (!iddistrito.equals(other.iddistrito))
			return false;
		if (nombresit == null) {
			if (other.nombresit != null)
				return false;
		} else if (!nombresit.equals(other.nombresit))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Distrito [iddistrito=" + iddistrito + ", nombresit=" + nombresit + ", provincia=" + provincia + "]";
	}
	
	
	
	
	
}
