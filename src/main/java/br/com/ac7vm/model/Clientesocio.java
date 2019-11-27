package br.com.ac7vm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Clientesocio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idclientesocio;
	@Size(max = 100)
	@Column(name = "nome")
	private String nome;
	@Size(max = 14)
	@Column(name = "cpf")
	private String cpf;
	@Size(max = 14)
	@Column(name = "fonecelular")
	private String fonecelular;
	@Size(max = 100)
	@Column(name = "email")
	private String email;
	@JsonBackReference
	@JoinColumn(name = "instituicao_idinstituicao", referencedColumnName = "idinstituicao")
    @OneToOne(optional = false)
    private Instituicao instituicao;
	
	public Clientesocio() {
		
	}

	

	public Integer getIdclientesocio() {
		return idclientesocio;
	}



	public void setIdclientesocio(Integer idclientesocio) {
		this.idclientesocio = idclientesocio;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFonecelular() {
		return fonecelular;
	}

	public void setFonecelular(String fonecelular) {
		this.fonecelular = fonecelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		result = prime * result + idclientesocio;
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
		Clientesocio other = (Clientesocio) obj;
		if (idclientesocio != other.idclientesocio)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clientesocio [idclientesocio=" + idclientesocio + "]";
	}
	
	
	
	

}
