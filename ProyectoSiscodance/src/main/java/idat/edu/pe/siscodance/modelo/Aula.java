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
@Table(name = "aula")

public class Aula implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idaula;

	private String seccion;

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Tutor idtutor;

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Grado idgrado;

	public Aula() {
		super();
	}

	public Aula(Integer idaula, String seccion, Tutor idtutor, Grado idgrado) {
		super();
		this.idaula = idaula;
		this.seccion = seccion;
		this.idtutor = idtutor;
		this.idgrado = idgrado;
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idaula == null) ? 0 : idaula.hashCode());
		result = prime * result + ((idgrado == null) ? 0 : idgrado.hashCode());
		result = prime * result + ((idtutor == null) ? 0 : idtutor.hashCode());
		result = prime * result + ((seccion == null) ? 0 : seccion.hashCode());
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
		Aula other = (Aula) obj;
		if (idaula == null) {
			if (other.idaula != null)
				return false;
		} else if (!idaula.equals(other.idaula))
			return false;
		if (idgrado == null) {
			if (other.idgrado != null)
				return false;
		} else if (!idgrado.equals(other.idgrado))
			return false;
		if (idtutor == null) {
			if (other.idtutor != null)
				return false;
		} else if (!idtutor.equals(other.idtutor))
			return false;
		if (seccion == null) {
			if (other.seccion != null)
				return false;
		} else if (!seccion.equals(other.seccion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aula [idaula=" + idaula + ", seccion=" + seccion + ", idtutor=" + idtutor + ", idgrado=" + idgrado
				+ "]";
	}

}
