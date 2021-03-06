package br.com.ac7vm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idusuario;
	@NotEmpty
	@Size(max = 100)
	@Column(name = "nome")
	private String nome;
	@Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
	@NotEmpty
	@Size(max = 45)
	@Column(name = "login")
	private String login;
	@NotEmpty
	@Size(max = 200)
	@Column(name = "senha")
	private String senha;
	@NotEmpty
	@Size(max = 200)
	@Column(name = "email")
	private String email;
	@NotEmpty
	@Size(max = 15)
	@Column(name = "fonecelular")
	private String fonecelular;
	@Column(name = "situacao")
	private boolean situacao;
	@Column(name = "urlfoto")
	private String urlfoto;
	
	@JoinColumn(name = "acesso_idacesso", referencedColumnName = "idacesso")
	@ManyToOne
	private Acesso acesso;
	
	
	
	public Usuario() {
		
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getFonecelular() {
		return fonecelular;
	}

	public void setFonecelular(String fonecelular) {
		this.fonecelular = fonecelular;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	

	public String getUrlfoto() {
		return urlfoto;
	}

	public void setUrlfoto(String urlfoto) {
		this.urlfoto = urlfoto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idusuario;
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
		Usuario other = (Usuario) obj;
		if (idusuario != other.idusuario)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + idusuario + ", nome=" + nome + "]";
	}
}
	