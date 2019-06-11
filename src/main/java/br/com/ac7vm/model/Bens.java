package br.com.ac7vm.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "bens")
public class Bens implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbens")
    private Integer idbens;
    @Size(max = 200)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "dataentrada")
    @Temporal(TemporalType.DATE)
    private Date dataentrada;
    @Column(name = "datasaida")
    @Temporal(TemporalType.DATE)
    private Date datasaida;
    @Column(name = "valorentrada")
    private float valorentrada;
    @Column(name = "valorsaida")
    private float valorsaida;
    @Column(name = "diferenca")
    private float diferenca;
    @Column(name = "percentual")
    private double percentual;
    @JoinColumn(name = "planoconta_idplanoconta", referencedColumnName = "idplanoconta")
    @OneToOne(optional = false)
    private Planoconta planoconta;
    
	public Bens() {
	
	}

	public Integer getIdbens() {
		return idbens;
	}

	public void setIdbens(Integer idbens) {
		this.idbens = idbens;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataentrada() {
		return dataentrada;
	}

	public void setDataentrada(Date dataentrada) {
		this.dataentrada = dataentrada;
	}

	public Date getDatasaida() {
		return datasaida;
	}

	public void setDatasaida(Date datasaida) {
		this.datasaida = datasaida;
	}

	public float getValorentrada() {
		return valorentrada;
	}

	public void setValorentrada(float valorentrada) {
		this.valorentrada = valorentrada;
	}

	public float getValorsaida() {
		return valorsaida;
	}

	public void setValorsaida(float valorsaida) {
		this.valorsaida = valorsaida;
	}

	public float getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(float diferenca) {
		this.diferenca = diferenca;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public Planoconta getPlanoconta() {
		return planoconta;
	}

	public void setPlanoconta(Planoconta planoconta) {
		this.planoconta = planoconta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idbens == null) ? 0 : idbens.hashCode());
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
		Bens other = (Bens) obj;
		if (idbens == null) {
			if (other.idbens != null)
				return false;
		} else if (!idbens.equals(other.idbens))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bens [idbens=" + idbens + "]";
	}
	
	
    
    

}
