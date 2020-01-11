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
@Table(name="jurado")

@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Jurado.findAll", query = "SELECT t FROM Jurado t"),
		@NamedQuery(name = "Jurado.findByIdJurado", query = "SELECT t FROM Jurado t WHERE t.idjurado = :idjurado"),
		@NamedQuery(name = "Jurado.findByNombre", query = "SELECT t FROM Jurado t WHERE t.nomjurado = :nomjurado"),
		@NamedQuery(name = "Jurado.findByApePaterno", query = "SELECT t FROM Jurado t WHERE t.apepatjurado = :apepatjurado"),
		@NamedQuery(name = "Jurado.findByApeMaterno", query = "SELECT t FROM Jurado t WHERE t.apematjurado = :apematjurado"),
		@NamedQuery(name = "Jurado.findBydnijurado", query = "SELECT t FROM Jurado t WHERE t.dnijurado = :dnijurado"),
		@NamedQuery(name = "Jurado.findBytelefono", query = "SELECT t FROM Jurado t WHERE t.telefono = :telefono"),
		@NamedQuery(name = "Jurado.findByNombreUsuario", query = "SELECT t FROM Jurado t WHERE t.nombreusuario = :nombreusuario") })

public class Jurado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idjurado")
	private Integer idjurado;
	@Column(name = "nomjurado")
	private String nomjurado;
	@Column(name = "apepatjurado")
	private String apepatjurado;
	@Column(name = "apematjurado")
	private String apematjurado;
	@Column(name = "dnijurado")
	private String dnijurado;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "nombreusuario")
	private String nombreusuario;
	
<<<<<<< HEAD
	public Integer getIdtutor() {
		return idtutor;
=======
	public Jurado() {
>>>>>>> branch 'master' of https://github.com/Klebert-Romero/Siscodance.git
	}

	public Jurado(Integer idjurado, String nomjurado, String apepatjurado, String apematjurado, String dnijurado,
			String telefono, String nombreusuario) {
		super();
		this.idjurado = idjurado;
		this.nomjurado = nomjurado;
		this.apepatjurado = apepatjurado;
		this.apematjurado = apematjurado;
		this.dnijurado = dnijurado;
		this.telefono = telefono;
		this.nombreusuario = nombreusuario;
	}
	
	public Integer getIdjurado() {
		return idjurado;
	}
	public void setIdjurado(Integer idjurado) {
		this.idjurado = idjurado;
	}
	public String getNomjurado() {
		return nomjurado;
	}
	public void setNomjurado(String nomjurado) {
		this.nomjurado = nomjurado;
	}
	public String getApepatjurado() {
		return apepatjurado;
	}
	public void setApepatjurado(String apepjurado) {
		this.apepatjurado = apepjurado;
	}
	public String getApematjurado() {
		return apematjurado;
	}
	public void setApematjurado(String apemjurado) {
		this.apematjurado = apemjurado;
	}
	public String getDnijurado() {
		return dnijurado;
	}
	public void setDnijurado(String dnijurado) {
		this.dnijurado = dnijurado;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	@Override
	public String toString() {
<<<<<<< HEAD
		return "Jurado [idtutor=" + idtutor + ", nomjurado=" + nomjurado + ", apepjurado=" + apepjurado
				+ ", apemjurado=" + apemjurado + ", dnijurado=" + dnijurado + ", telefono=" + telefono + ", cargo="
				+ cargo + ", nombreusuario=" + nombreusuario + "]";
	}
	
	

=======
		return "Jurado [idjurado=" + idjurado + ", nomjurado=" + nomjurado + ", apepatjurado=" + apepatjurado
				+ ", apematjurado=" + apematjurado + ", dnijurado=" + dnijurado + ", telefono=" + telefono
				+ ", nombreusuario=" + nombreusuario + "]";
>>>>>>> branch 'master' of https://github.com/Klebert-Romero/Siscodance.git
	}
	
<<<<<<< HEAD
	
	
	


=======
}
>>>>>>> branch 'master' of https://github.com/Klebert-Romero/Siscodance.git
