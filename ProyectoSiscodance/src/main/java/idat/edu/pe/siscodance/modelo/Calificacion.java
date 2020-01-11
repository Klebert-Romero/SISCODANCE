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
@Table(name="calificacion")
public class Calificacion implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "idcalificacion")
	private Integer idcalificacion;
	@Column(name = "calificacion")
	private Integer calificacion;
	
	@ManyToOne
	@JoinColumn(name="idparticipante")
	private Participante participante;
	
	@ManyToOne
	@JoinColumn(name="idjurado")
	private Jurado jurado;
	
	@ManyToOne
	@JoinColumn(name="idcriterio")
	private Criterios criterio;

	public Integer getIdcalificacion() {
		return idcalificacion;
	}

	public void setIdcalificacion(Integer idcalificacion) {
		this.idcalificacion = idcalificacion;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public Jurado getJurado() {
		return jurado;
	}

	public void setJurado(Jurado jurado) {
		this.jurado = jurado;
	}

	public Criterios getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterios criterio) {
		this.criterio = criterio;
	}

	@Override
	public String toString() {
		return "Calificacion [idcalificacion=" + idcalificacion + ", calificacion=" + calificacion + ", participante="
				+ participante + ", jurado=" + jurado + ", criterio=" + criterio + "]";
	}

	
	
}
