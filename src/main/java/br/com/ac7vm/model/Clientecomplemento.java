package br.com.ac7vm.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Clientecomplemento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idclientecomplemento;
	@Size(max = 50)
	@Column(name = "nacionalidade")
	private String  nacionalidade;
	@Size(max = 45)
	@Column(name = "naturalidade")
	private String  naturalidade;
	@Size(max =45)
	@Column(name = "nomepai")
	private String  nomepai;
	@Size(max = 45)
	@Column(name = "nomemae")
	private String  nomemae;
	@Size(max = 100)
	@Column(name = "profissao")
	private String  profissao;
	@Size(max = 30)
	@Column(name = "estadocivil")
	private String  estadocivil;
	@Size(max = 45)
	@Column(name = "numerorg")
	private String  numerorg;
	@Column(name = "dataemissao")
    @Temporal(TemporalType.DATE)
    private Date dataemissao;
	@Size(max = 10)
	@Column(name = "emissor")
	private String  emissor;
	@Size(max = 1)
	@Column(name = "sexo")
	private String  sexo;
	@JsonBackReference
	@JoinColumn(name = "instituicao_idinstituicao", referencedColumnName = "idinstituicao")
	@OneToOne(optional = false)
    private Instituicao instituicao;
	
	public Clientecomplemento() {
		
	}

	

	

	public Integer getIdclientecomplemento() {
		return idclientecomplemento;
	}





	public void setIdclientecomplemento(Integer idclientecomplemento) {
		this.idclientecomplemento = idclientecomplemento;
	}





	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNomepai() {
		return nomepai;
	}

	public void setNomepai(String nomepai) {
		this.nomepai = nomepai;
	}

	public String getNomemae() {
		return nomemae;
	}

	public void setNomemae(String nomemae) {
		this.nomemae = nomemae;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getNumerorg() {
		return numerorg;
	}

	public void setNumerorg(String numerorg) {
		this.numerorg = numerorg;
	}

	public Date getDataemissao() {
		return dataemissao;
	}

	public void setDataemissao(Date dataemissao) {
		this.dataemissao = dataemissao;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idclientecomplemento;
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
		Clientecomplemento other = (Clientecomplemento) obj;
		if (idclientecomplemento != other.idclientecomplemento)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Clientecomplemento [idclientecomplemento=" + idclientecomplemento + "]";
	}

	
	
	
	
	

}
