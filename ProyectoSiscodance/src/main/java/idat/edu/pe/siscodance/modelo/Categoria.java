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
@Table(name="categoria")
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "idcategoria")
	private Integer idcategoria;
	@Column(name = "nombrecate")
	private String nombrecate;
	@Column(name = "descripcion")
	private String descripcion;
	
	public Integer getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNombrecate() {
		return nombrecate;
	}
	public void setNombrecate(String nombrecate) {
		this.nombrecate = nombrecate;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idcategoria == null) ? 0 : idcategoria.hashCode());
		result = prime * result + ((nombrecate == null) ? 0 : nombrecate.hashCode());
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
		Categoria other = (Categoria) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idcategoria == null) {
			if (other.idcategoria != null)
				return false;
		} else if (!idcategoria.equals(other.idcategoria))
			return false;
		if (nombrecate == null) {
			if (other.nombrecate != null)
				return false;
		} else if (!nombrecate.equals(other.nombrecate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Categoria [idcategoria=" + idcategoria + ", nombrecate=" + nombrecate + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	
	
	
}

