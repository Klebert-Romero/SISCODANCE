package idat.edu.pe.siscodance.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="categoria")

@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
		@NamedQuery(name = "Categoria.findByIdCategoria", query = "SELECT c FROM Categoria c WHERE c.idcategoria = :idcategoria"),
		@NamedQuery(name = "Categoria.findByNombre", query = "SELECT c FROM Categoria c WHERE c.nombrecate = :nombrecate"),
		@NamedQuery(name = "Categoria.findByDescripcion", query = "SELECT c FROM Categoria c WHERE c.descripcion = :descripcion"),
		 })


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
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Categoria(Integer idcategoria, String nombrecate, String descripcion) {
		super();
		this.idcategoria = idcategoria;
		this.nombrecate = nombrecate;
		this.descripcion = descripcion;
	}




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

