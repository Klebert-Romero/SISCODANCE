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
@Table(name = "tutor")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Tutor.findAll", query = "SELECT t FROM Tutor t"),
		@NamedQuery(name = "Tutor.findByIdTutor", query = "SELECT t FROM Tutor t WHERE t.idtutor = :idtutor"),
		@NamedQuery(name = "Tutor.findByNombre", query = "SELECT t FROM Tutor t WHERE t.nomtutor = :nomtutor"),
		@NamedQuery(name = "Tutor.findByApePaterno", query = "SELECT t FROM Tutor t WHERE t.apepattutor = :apepattutor"),
		@NamedQuery(name = "Tutor.findByApeMaterno", query = "SELECT t FROM Tutor t WHERE t.apemattutor = :apemattutor"),
		@NamedQuery(name = "Tutor.findBydnitutor", query = "SELECT t FROM Tutor t WHERE t.dnitutor = :dnitutor"),
		@NamedQuery(name = "Tutor.findBytelefono", query = "SELECT t FROM Tutor t WHERE t.telefonotut = :telefonotut"),
		@NamedQuery(name = "Tutor.findBycorreo", query = "SELECT t FROM Tutor t WHERE t.correotut = :correotut"),
		@NamedQuery(name = "Tutor.findByNombreUsuario", query = "SELECT t FROM Tutor t WHERE t.nombreusuario = :nombreusuario") })

public class Tutor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idtutor")
	private Integer idtutor;
	@Column(name = "nomtutor")
	private String nomtutor;
	@Column(name = "apepattutor")
	private String apepattutor;
	@Column(name = "apemattutor")
	private String apemattutor;
	@Column(name = "dnitutor")
	private String dnitutor;
	@Column(name = "telefonotut")
	private String telefonotut;
	@Column(name = "correotut")
	private String correotut;
	@Column(name = "nombreusuario")
	private String nombreusuario;

	public Tutor() {

	}

	public Tutor(Integer idtutor, String nomtutor) {
		this.idtutor = idtutor;
		this.nomtutor = nomtutor;
	}

	public Tutor(String nomtutor, String apepattutor, String apemattutor, String dnitutor, String telefonotut,
			String correotut, String nombreusuario) {
		super();
		this.nomtutor = nomtutor;
		this.apepattutor = apepattutor;
		this.apemattutor = apemattutor;
		this.dnitutor = dnitutor;
		this.telefonotut = telefonotut;
		this.correotut = correotut;
		this.nombreusuario = nombreusuario;		
	}

	public Integer getIdtutor() {
		return idtutor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setIdtutor(Integer idtutor) {
		this.idtutor = idtutor;
	}

	public String getNomtutor() {
		return nomtutor;
	}

	public void setNomtutor(String nomtutor) {
		this.nomtutor = nomtutor;
	}

	public String getApepattutor() {
		return apepattutor;
	}

	public void setApepattutor(String apepattutor) {
		this.apepattutor = apepattutor;
	}

	public String getApemattutor() {
		return apemattutor;
	}

	public void setApemattutor(String apemattutor) {
		this.apemattutor = apemattutor;
	}

	public String getDnitutor() {
		return dnitutor;
	}

	public void setDnitutor(String dnitutor) {
		this.dnitutor = dnitutor;
	}

	public String getTelefonotut() {
		return telefonotut;
	}

	public void setTelefonotut(String telefonotut) {
		this.telefonotut = telefonotut;
	}

	public String getCorreotut() {
		return correotut;
	}

	public void setCorreotut(String correotut) {
		this.correotut = correotut;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idtutor != null ? idtutor.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Tutor)) {
			return false;
		}
		Tutor other = (Tutor) object;
		if ((this.idtutor == null && other.idtutor != null)
				|| (this.idtutor != null && !this.idtutor.equals(other.idtutor))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		//return "idat.edu.pe.siscodance.jpa.modelo.Tutor[ idutor=" + idtutor + " ]";
		return "idat.edu.pe.siscodance.modelo.Tutor[ idtutor=" + idtutor + " ]";
	}

	public Tutor buscarPorID(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
