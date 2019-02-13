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
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;
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
	@Column(name = "sexo")
	private String seox;
	@NotEmpty
	@Size(max = 18)
	@Column(name = "cpfcnpj")
	private String cpfcnpj;
	@NotEmpty
	@Size(max = 1)
	@Column(name = "corespondencia")
	private String corespondencia;
	@NotEmpty
	@Size(max = 14)
	@Column(name = "fonecelular")
	private String fonecelular;
	@NotEmpty
	@Size(max = 100)
	@Column(name = "email")
	private String email;
	@Column(name = "datacadastro")
    @Temporal(TemporalType.DATE)
    private Date datacadastro;
	@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "cliente")
	private Clienteenderecocomercial clienteenderecocomercial;
	@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "cliente")
	private Clienteenderecoresidencial clienteenderecoresidencial;
	@OneToOne(cascade = CascadeType.REFRESH, mappedBy = "cliente")
	private Clientesocio clientesocio;
	
	
	public Cliente() {
		
	}


	public int getIdcliente() {
		return idcliente;
	}


	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
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


	public String getSeox() {
		return seox;
	}


	public void setSeox(String seox) {
		this.seox = seox;
	}


	public String getCpfcnpj() {
		return cpfcnpj;
	}


	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}


	public String getCorespondencia() {
		return corespondencia;
	}


	public void setCorespondencia(String corespondencia) {
		this.corespondencia = corespondencia;
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


	public Date getDatacadastro() {
		return datacadastro;
	}


	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}


	public Clienteenderecocomercial getClienteenderecocomercial() {
		return clienteenderecocomercial;
	}


	public void setClienteenderecocomercial(Clienteenderecocomercial clienteenderecocomercial) {
		this.clienteenderecocomercial = clienteenderecocomercial;
	}


	public Clienteenderecoresidencial getClienteenderecoresidencial() {
		return clienteenderecoresidencial;
	}


	public void setClienteenderecoresidencial(Clienteenderecoresidencial clienteenderecoresidencial) {
		this.clienteenderecoresidencial = clienteenderecoresidencial;
	}


	public Clientesocio getClientesocio() {
		return clientesocio;
	}


	public void setClientesocio(Clientesocio clientesocio) {
		this.clientesocio = clientesocio;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idcliente;
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
		Cliente other = (Cliente) obj;
		if (idcliente != other.idcliente)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nome=" + nome + "]";
	}
	
	
	
	
	
}
