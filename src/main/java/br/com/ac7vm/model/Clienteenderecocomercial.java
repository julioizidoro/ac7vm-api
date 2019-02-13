package br.com.ac7vm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Clienteenderecocomercial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclienteenderecocomercial;
	@NotEmpty
	@Size(max = 9)
	@Column(name = "cep")
	private String cep;
	@NotEmpty
	@Size(max = 200)
	@Column(name = "endereco")
	private String endereco;
	@NotEmpty
	@Size(max = 10)
	@Column(name = "numero")
	private String numero;
	@NotEmpty
	@Size(max = 200)
	@Column(name = "complemento")
	private String complemento;
	@NotEmpty
	@Size(max = 100)
	@Column(name = "cidade")
	private String cidade;
	@NotEmpty
	@Size(max = 50)
	@Column(name = "estado")
	private String estado;
	@JoinColumn(name = "cliente_idcliente", referencedColumnName = "idcliente")
    @OneToOne(optional = false)
    private Cliente cliente;
	
	public Clienteenderecocomercial() {
		
	}

	public int getIdclienteenderecocomercial() {
		return idclienteenderecocomercial;
	}

	public void setIdclienteenderecocomercial(int idclienteenderecocomercial) {
		this.idclienteenderecocomercial = idclienteenderecocomercial;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idclienteenderecocomercial;
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
		Clienteenderecocomercial other = (Clienteenderecocomercial) obj;
		if (idclienteenderecocomercial != other.idclienteenderecocomercial)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clienteenderecocomercial [idclienteenderecocomercial=" + idclienteenderecocomercial + "]";
	}
	
	
	
	
	

}
