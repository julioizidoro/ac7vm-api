package br.com.ac7vm.model;

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

@Entity
public class Clientesegundo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclientesegundo;
	@Size(max = 100)
	@Column(name = "nome")
	private String nome;
	@Size(max = 14)
	@Column(name = "cpf")
	private String cpf;
	@Size(max = 30)
	@Column(name = "rg")
	private String rg;
	@Size(max = 10)
	@Column(name = "emissor")
	private String emissor;
	@Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
	@Size(max = 10)
	@Column(name = "sexo")
	private String sexo;
	@Size(max = 10)
	@Column(name = "estadocivil")
	private String estadocivil;
	@Size(max = 15)
	@Column(name = "fonecelular")
	private String fonecelular;
	@Size(max = 15)
	@Column(name = "fonefixo")
	private String fonefixo;
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
	@Size(max = 45)
	@Column(name = "bairro")
	private String bairro;
	@Size(max = 100)
	@Column(name = "cidade")
	private String cidade;
	@Size(max = 2)
	@Column(name = "estado")
	private String estaod;
	@Size(max = 100)
	@Column(name = "email")
	private String email;
	@Size(max = 10)
	@Column(name = "nacionalidade")
	private String nacionalidade;
	@Size(max = 50)
	@Column(name = "profissao")
	private String profissao;
	@Size(max = 100)
	@Column(name = "localtrabalho")
	private String localtrabalho;
	@JoinColumn(name = "instituicao_idinstituicao", referencedColumnName = "idinstituicao")
    @OneToOne(optional = false)
    private Instituicao instituicao;
	
	public Clientesegundo() {
		super();
	}

	

	public int getIdclientesegundo() {
		return idclientesegundo;
	}



	public void setIdclientesegundo(int idclientesegundo) {
		this.idclientesegundo = idclientesegundo;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
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

	public String getEstaod() {
		return estaod;
	}

	public void setEstaod(String estaod) {
		this.estaod = estaod;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getLocaltrabalho() {
		return localtrabalho;
	}

	public void setLocaltrabalho(String localtrabalho) {
		this.localtrabalho = localtrabalho;
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
		result = prime * result + idclientesegundo;
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
		Clientesegundo other = (Clientesegundo) obj;
		if (idclientesegundo != other.idclientesegundo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clientesegundo [nome=" + nome + "]";
	}
	
	
	
    

}
