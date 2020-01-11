package idat.edu.pe.siscodance.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="participante")

public class Participante implements Serializable {
	
	@Id
	@Column(name = "idparticipante")
	private Integer idparticipante;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_Inscripcion;
	
	@ManyToOne
	@JoinColumn(name="iddanza")
	private Danza danza;
	
	@ManyToOne
	@JoinColumn(name="idcatdetalle")
	private CategoriaDetalle categoriaDetalle;
	
	@ManyToOne
	@JoinColumn(name="idaula")
	private Aula aula;
	
	
	public Participante() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdparticipante() {
		return idparticipante;
	}


	public void setIdparticipante(Integer idparticipante) {
		this.idparticipante = idparticipante;
	}


	public Date getFecha_Inscripcion() {
		return fecha_Inscripcion;
	}


	public void setFecha_Inscripcion(Date fecha_Inscripcion) {
		this.fecha_Inscripcion = fecha_Inscripcion;
	}


	public Danza getDanza() {
		return danza;
	}


	public void setDanza(Danza danza) {
		this.danza = danza;
	}


	public CategoriaDetalle getCategoriaDetalle() {
		return categoriaDetalle;
	}


	public void setCategoriaDetalle(CategoriaDetalle categoriaDetalle) {
		this.categoriaDetalle = categoriaDetalle;
	}


	public Aula getAula() {
		return aula;
	}


	public void setAula(Aula aula) {
		this.aula = aula;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aula == null) ? 0 : aula.hashCode());
		result = prime * result + ((categoriaDetalle == null) ? 0 : categoriaDetalle.hashCode());
		result = prime * result + ((danza == null) ? 0 : danza.hashCode());
		result = prime * result + ((fecha_Inscripcion == null) ? 0 : fecha_Inscripcion.hashCode());
		result = prime * result + ((idparticipante == null) ? 0 : idparticipante.hashCode());
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
		Participante other = (Participante) obj;
		if (aula == null) {
			if (other.aula != null)
				return false;
		} else if (!aula.equals(other.aula))
			return false;
		if (categoriaDetalle == null) {
			if (other.categoriaDetalle != null)
				return false;
		} else if (!categoriaDetalle.equals(other.categoriaDetalle))
			return false;
		if (danza == null) {
			if (other.danza != null)
				return false;
		} else if (!danza.equals(other.danza))
			return false;
		if (fecha_Inscripcion == null) {
			if (other.fecha_Inscripcion != null)
				return false;
		} else if (!fecha_Inscripcion.equals(other.fecha_Inscripcion))
			return false;
		if (idparticipante == null) {
			if (other.idparticipante != null)
				return false;
		} else if (!idparticipante.equals(other.idparticipante))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Participante [idparticipante=" + idparticipante + ", fecha_Inscripcion=" + fecha_Inscripcion
				+ ", danza=" + danza + ", categoriaDetalle=" + categoriaDetalle + ", aula=" + aula + "]";
	}
	
	

}
