package br.com.ac7vm.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author julioizidoro
 */
@Entity
@Table(name = "obra")
public class Obra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idobra")
    private Integer idobra;
    @Size(max = 45)
    @Column(name = "cei")
    private String cei;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Size(max = 200)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "datainicio")
    @Temporal(TemporalType.DATE)
    private Date datainicio;
    @Size(max = 100)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 10)
    @Column(name = "numero")
    private String numero;
    @Size(max = 45)
    @Column(name = "bairro")
    private String bairro;
    @Size(max = 45)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 8)
    @Column(name = "cep")
    private String cep;
    @Size(max = 2)
    @Column(name = "estado")
    private String estado;
    @Size(max = 100)
    @Column(name = "engenheiro")
    private String engenheiro;
    @Column(name = "previsaotermino")
    @Temporal(TemporalType.DATE)
    private Date previsaotermino;
    @Column(name = "datatermino")
    @Temporal(TemporalType.DATE)
    private Date datatermino;
    @Size(max = 45)
    @Column(name = "padraoacabamento")
    private String padraoacabamento;
    @Size(max = 5)
    @Column(name = "blocos")
    private String blocos;
    @Size(max = 2)
    @Column(name = "unidades")
    private int unidade;

    public Obra() {
    }

    public Obra(Integer idobra) {
        this.idobra = idobra;
    }

    public Integer getIdobra() {
        return idobra;
    }

    public void setIdobra(Integer idobra) {
        this.idobra = idobra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEngenheiro() {
        return engenheiro;
    }

    public void setEngenheiro(String engenheiro) {
        this.engenheiro = engenheiro;
    }

    public String getCei() {
		return cei;
	}

	public void setCei(String cei) {
		this.cei = cei;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public Date getPrevisaotermino() {
		return previsaotermino;
	}

	public void setPrevisaotermino(Date previsaotermino) {
		this.previsaotermino = previsaotermino;
	}

	public Date getDatatermino() {
		return datatermino;
	}

	public void setDatatermino(Date datatermino) {
		this.datatermino = datatermino;
	}

	public String getPadraoacabamento() {
		return padraoacabamento;
	}

	public void setPadraoacabamento(String padraoacabamento) {
		this.padraoacabamento = padraoacabamento;
	}

	public String getBlocos() {
		return blocos;
	}

	public void setBlocos(String blocos) {
		this.blocos = blocos;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idobra != null ? idobra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obra)) {
            return false;
        }
        Obra other = (Obra) object;
        if ((this.idobra == null && other.idobra != null) || (this.idobra != null && !this.idobra.equals(other.idobra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.tecseg.mavenproject1.Obra[ idobra=" + idobra + " ]";
    }
    
}