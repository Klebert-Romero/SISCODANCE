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
@Table(name="jurado")
public class Jurado implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idtutor")
	private Integer idtutor;
	@Column(name = "nomjurado")
	private String nomjurado;
	@Column(name = "apepjurado")
	private String apepjurado;
	@Column(name = "apemjurado")
	private String apemjurado;
	@Column(name = "dnijuado")
	private String dnijurado;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "cargo")
	private String cargo;
	@Column(name = "nombreusuario")
	private String nombreusuario;
	
	public Integer getIdtutor() {
		return idtutor;
	}
	public void setIdtutor(Integer idtutor) {
		this.idtutor = idtutor;
	}
	public String getNomjurado() {
		return nomjurado;
	}
	public void setNomjurado(String nomjurado) {
		this.nomjurado = nomjurado;
	}
	public String getApepjurado() {
		return apepjurado;
	}
	public void setApepjurado(String apepjurado) {
		this.apepjurado = apepjurado;
	}
	public String getApemjurado() {
		return apemjurado;
	}
	public void setApemjurado(String apemjurado) {
		this.apemjurado = apemjurado;
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	@Override
	public String toString() {
		return "Jurado [idtutor=" + idtutor + ", nomjurado=" + nomjurado + ", apepjurado=" + apepjurado
				+ ", apemjurado=" + apemjurado + ", dnijurado=" + dnijurado + ", telefono=" + telefono + ", cargo="
				+ cargo + ", nombreusuario=" + nombreusuario + "]";
	}
	
	

	}
	
	
	
	


