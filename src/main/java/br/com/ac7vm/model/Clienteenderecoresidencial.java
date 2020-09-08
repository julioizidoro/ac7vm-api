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
public class Clienteenderecoresidencial implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idclienteenderecoresidencial;
	@Size(max = 9)
	@Column(name = "cep")
	private String cep;
	@Size(max = 200)
	@Column(name = "endereco")
	private String endereco;
	@Size(max = 10)
	@Column(name = "numero")
	private String numero;
	@Size(max = 200)
	@Column(name = "complemento")
	private String complemento;
	@Size(max = 100)
	@Size(max = 45)
	@Column(name = "bairro")
	private String bairro;
	@Column(name = "cidade")
	private String cidade;
	@Size(max = 50)
	@Column(name = "estado")
	private String estado;
	@Size(max = 14)
	@Column(name = "foneresidencial")
	private String foneresidencial;
	@JsonBackReference
	@JoinColumn(name = "instituicao_idinstituicao", referencedColumnName = "idinstituicao")
    @OneToOne(optional = false)
    private Instituicao instituicao;
	
	public Clienteenderecoresidencial() {
		
	}

	public Integer getIdclienteenderecoresidencial() {
		return idclienteenderecoresidencial;
	}

	public void setIdclienteenderecoresidencial(Integer idclienteenderecoresidencial) {
		this.idclienteenderecoresidencial = idclienteenderecoresidencial;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public String getFoneresidencial() {
		return foneresidencial;
	}

	public void setFoneresidencial(String foneresidencial) {
		this.foneresidencial = foneresidencial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idclienteenderecoresidencial;
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
		Clienteenderecoresidencial other = (Clienteenderecoresidencial) obj;
		if (idclienteenderecoresidencial != other.idclienteenderecoresidencial)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clienteenderecoresidencial [idclienteenderecoresidencial=" + idclienteenderecoresidencial + "]";
	}
	
	
	
	

}
