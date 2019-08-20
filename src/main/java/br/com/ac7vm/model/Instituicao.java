package br.com.ac7vm.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Instituicao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idinstituicao;
	@NotEmpty
	@Size(max = 100)
	@Column(name = "nome")
	private String nome;
	@NotEmpty
	@Size(max = 2)
	@Column(name = "tipojuridico")
	private String tipojuridico;
	@NotEmpty
	@Size(max = 1)
	@Column(name = "tipo")
	private String tipo;
	@NotEmpty
	@Size(max = 18)
	@Column(name = "cpfcnpj")
	private String cpfcnpj;
	@Size(max = 14)
	@Column(name = "fonecelular")
	private String fonecelular;
	@Size(max = 14)
	@Column(name = "fonefixo")
	private String fonefixo;
	@Size(max = 100)
	@Column(name = "email")
	private String email;
	@Column(name = "datacadastro")
	@Temporal(TemporalType.DATE)
	private Date datacadastro;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "instituicao")
	private Clientesocio clientesocio;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "instituicao")
	private Clienteenderecoresidencial clienteenderecoresidencial;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "instituicao")
	private Clienteenderecocomercial clienteenderecocomercial;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "instituicao")
	private Clientecomplemento clientecomplemento;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "instituicao")
	private  Clientesegundo clientesegundo;

	public Instituicao() {

	}

	public int getIdinstituicao() {
		return idinstituicao;
	}

	public void setIdinstituicao(int idinstituicao) {
		this.idinstituicao = idinstituicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipojuridico() {
		return tipojuridico;
	}

	public void setTipojuridico(String tipojuridico) {
		this.tipojuridico = tipojuridico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getFonecelular() {
		return fonecelular;
	}

	public void setFonecelular(String fonecelular) {
		this.fonecelular = fonecelular;
	}

	public String getFonefixo() {
		return fonefixo;
	}

	public void setFonefixo(String fonefixo) {
		this.fonefixo = fonefixo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}
	
	

	public Clientesocio getClientesocio() {
		return clientesocio;
	}

	public void setClientesocio(Clientesocio clientesocio) {
		this.clientesocio = clientesocio;
	}

	public Clienteenderecoresidencial getClienteenderecoresidencial() {
		return clienteenderecoresidencial;
	}

	public void setClienteenderecoresidencial(Clienteenderecoresidencial clienteenderecoresidencial) {
		this.clienteenderecoresidencial = clienteenderecoresidencial;
	}

	public Clienteenderecocomercial getClienteenderecocomercial() {
		return clienteenderecocomercial;
	}

	public void setClienteenderecocomercial(Clienteenderecocomercial clienteenderecocomercial) {
		this.clienteenderecocomercial = clienteenderecocomercial;
	}

	public Clientecomplemento getClientecomplemento() {
		return clientecomplemento;
	}

	public void setClientecomplemento(Clientecomplemento clientecomplemento) {
		this.clientecomplemento = clientecomplemento;
	}

	public Clientesegundo getClientesegundo() {
		return clientesegundo;
	}

	public void setClientesegundo(Clientesegundo clientesegundo) {
		this.clientesegundo = clientesegundo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idinstituicao;
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
		Instituicao other = (Instituicao) obj;
		if (idinstituicao != other.idinstituicao)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Instituicao [idinstituicao=" + idinstituicao + ", nome=" + nome + "]";
	}

}
