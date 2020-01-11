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
@Table(name = "grado")
/*@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Grado.findAll", query = "SELECT n FROM Grado n"),
		@NamedQuery(name = "Grado.findByIdGrado", query = "SELECT n FROM Grado n WHERE n.idgrado = :idgrado"),
		@NamedQuery(name = "Grado.findByNombregrado", query = "SELECT n FROM Grado n WHERE n.nombregrado = :nombregrado"),
		@NamedQuery(name = "Grado.findByTurno", query = "SELECT n FROM Grado n WHERE n.turno = :turno"),
		@NamedQuery(name = "Grado.findByIdnivel", query = "SELECT n FROM Grado n WHERE n.idnivel = :idnivel") })*/
public class Grado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idgrado")
	private Integer idgrado;
	@Column(name = "nombregrado")
	private String nombregrado;
	@Column(name = "turno")
	private String turno;
//	@Column(name = "idnivel")
//	private Integer idnivel;
	@ManyToOne
	@JoinColumn(name="idnivel")
	private Nivel nivel;

	public Grado() {

	}

	public Grado(Integer idgrado) {
		this.idgrado = idgrado;
	}

	public Grado(Integer idgrado, String nombre, String turno) {
		super();
		this.idgrado = idgrado;
		this.nombregrado = nombre;
		this.turno = turno;
		//this.idnivel = idnivel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdgrado() {
		return idgrado;
	}

	public void setIdgrado(Integer idgrado) {
		this.idgrado = idgrado;
	}

	public String getNombregrado() {
		return nombregrado;
	}

	public void setNombregrado(String nombre) {
		this.nombregrado = nombre;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

/*	public Integer getIdnivel() {
		return idnivel;
	}

	public void setIdnivel(Integer idnivel) {
		this.idnivel = idnivel;
	}*/

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idgrado != null ? idgrado.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Grado)) {
			return false;
		}
		Grado other = (Grado) object;
		if ((this.idgrado == null && other.idgrado != null)
				|| (this.idgrado != null && !this.idgrado.equals(other.idgrado))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "idat.edu.pe.siscodance.modelo.Grado[ idgrado=" + idgrado + " ]";
	}

	public Grado buscarPorID(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
