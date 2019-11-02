package br.com.ac7vm.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author julioizidoro
 */
@Entity
@Table(name = "obrafase")
public class Obrafase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idobrafase")
    private Integer idobrafase;
    @Size(max = 100)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "tempomedio")
    private Integer tempomedio;
    @Column(name = "conta")
    private String conta;
    @JoinColumn(name = "planoconta_idplanoconta", referencedColumnName = "idplanoconta")
    @ManyToOne(optional = false)
    private Planoconta planoconta;

    public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Obrafase() {
    }

    public Obrafase(Integer idobrafase) {
        this.idobrafase = idobrafase;
    }

    public Integer getIdobrafase() {
        return idobrafase;
    }

    public void setIdobrafase(Integer idobrafase) {
        this.idobrafase = idobrafase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTempomedio() {
        return tempomedio;
    }

    public void setTempomedio(Integer tempomedio) {
        this.tempomedio = tempomedio;
    }

    public Planoconta getPlanoconta() {
		return planoconta;
	}

	public void setPlanoconta(Planoconta planoconta) {
		this.planoconta = planoconta;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idobrafase != null ? idobrafase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obrafase)) {
            return false;
        }
        Obrafase other = (Obrafase) object;
        if ((this.idobrafase == null && other.idobrafase != null) || (this.idobrafase != null && !this.idobrafase.equals(other.idobrafase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.tecseg.mavenproject1.Obrafase[ idobrafase=" + idobrafase + " ]";
    }
    
}
