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
@Table(name="categoria_detalle")

public class CategoriaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "idcatdetalle")
	private Integer idcatdetalle;
	@Column(name = "idgrado")
	private Integer idgrado;
	@Column(name = "idcategoria")
	private Integer idcategoria;
	public Integer getIdcatdetalle() {
		return idcatdetalle;
	}
	public void setIdcatdetalle(Integer idcatdetalle) {
		this.idcatdetalle = idcatdetalle;
	}
	public Integer getIdgrado() {
		return idgrado;
	}
	public void setIdgrado(Integer idgrado) {
		this.idgrado = idgrado;
	}
	public Integer getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcatdetalle == null) ? 0 : idcatdetalle.hashCode());
		result = prime * result + ((idcategoria == null) ? 0 : idcategoria.hashCode());
		result = prime * result + ((idgrado == null) ? 0 : idgrado.hashCode());
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
		CategoriaDetalle other = (CategoriaDetalle) obj;
		if (idcatdetalle == null) {
			if (other.idcatdetalle != null)
				return false;
		} else if (!idcatdetalle.equals(other.idcatdetalle))
			return false;
		if (idcategoria == null) {
			if (other.idcategoria != null)
				return false;
		} else if (!idcategoria.equals(other.idcategoria))
			return false;
		if (idgrado == null) {
			if (other.idgrado != null)
				return false;
		} else if (!idgrado.equals(other.idgrado))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CategoriaDetalle [idcatdetalle=" + idcatdetalle + ", idgrado=" + idgrado + ", idcategoria="
				+ idcategoria + "]";
	}
	
	

	
}
