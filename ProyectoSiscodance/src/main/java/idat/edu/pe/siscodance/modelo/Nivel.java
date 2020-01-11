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
@Table(name = "nivel")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Nivel.findAll", query = "SELECT n FROM Nivel n"),
		@NamedQuery(name = "Nivel.findByIdNivel", query = "SELECT n FROM Nivel n WHERE n.idnivel = :idnivel"),
		@NamedQuery(name = "Nivel.findByNomNivel", query = "SELECT n FROM Nivel n WHERE n.nomnivel = :nomnivel") })

public class Nivel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idnivel")
	private Integer idnivel;
	@Column(name = "nomnivel")
	private String nomnivel;
	/*@OneToMany(mappedBy="grado", cascade=CascadeType.ALL)
	private List<Grado> grados;*/

	public Nivel() {

	}

	public Nivel(Integer idnivel) {
		this.idnivel = idnivel;

	}

	public Nivel(Integer idnivel, String nombre) {
		super();
		this.idnivel = idnivel;
		this.nomnivel= nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdnivel() {
		return idnivel;
	}

	public void setIdnivel(Integer idnivel) {
		this.idnivel = idnivel;
	}

	public String getNomnivel() {
		return nomnivel;
	}

	public void setNomnivel(String nombre) {
		this.nomnivel = nombre;
	}

/*	public List<Grado> getGrados() {
		return grados;
	}

	public void setGrados(List<Grado> grados) {
		this.grados = grados;
	}*/

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idnivel != null ? idnivel.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Nivel)) {
			return false;
		}
		Nivel other = (Nivel) object;
		if ((this.idnivel == null && other.idnivel != null)
				|| (this.idnivel != null && !this.idnivel.equals(other.idnivel))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "idat.edu.pe.siscodance.modelo.Nivel[ idnivel=" + idnivel + " ]";
	}

	public Nivel buscarPorID(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
