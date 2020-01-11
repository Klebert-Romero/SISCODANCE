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
@Table(name="danza")

public class Danza implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "iddanza")
	private Integer iddanza;
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="iddistrito")
	private Distrito discrito;

	public Danza() {
		
	}

	public Danza(Integer iddanza, String nombre, Distrito discrito) {
		super();
		this.iddanza = iddanza;
		this.nombre = nombre;
		this.discrito = discrito;
	}

	public Integer getIddanza() {
		return iddanza;
	}

	public void setIddanza(Integer iddanza) {
		this.iddanza = iddanza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Distrito getDiscrito() {
		return discrito;
	}

	public void setDiscrito(Distrito discrito) {
		this.discrito = discrito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((discrito == null) ? 0 : discrito.hashCode());
		result = prime * result + ((iddanza == null) ? 0 : iddanza.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Danza other = (Danza) obj;
		if (discrito == null) {
			if (other.discrito != null)
				return false;
		} else if (!discrito.equals(other.discrito))
			return false;
		if (iddanza == null) {
			if (other.iddanza != null)
				return false;
		} else if (!iddanza.equals(other.iddanza))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Danza [iddanza=" + iddanza + ", nombre=" + nombre + ", discrito=" + discrito + "]";
	}
	
	
	

}
