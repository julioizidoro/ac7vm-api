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
public class Clienteenderecoresidencial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclienteenderecoresidencial;
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

}
