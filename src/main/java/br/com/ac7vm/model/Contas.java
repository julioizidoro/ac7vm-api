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
@Table(name = "contas")
public class Contas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontas")
    private Integer idcontas;
    @Size(max = 45)
    @Column(name = "documento")
    private String documento;
    @Column(name = "dataemissao")
    @Temporal(TemporalType.DATE)
    private Date dataemissao;
    @Column(name = "datavencimento")
    @Temporal(TemporalType.DATE)
    private Date datavencimento;
    @Column(name = "valorparcela")
    private Float valorparcela;
    @Column(name = "desconto")
    private Float desconto;
    @Column(name = "juros")
    private Float juros;
    @Column(name = "datapagamento")
    @Temporal(TemporalType.DATE)
    private Date datapagamento;
    @Column(name = "valorpago")
    private Float valorpago;
    @Size(max = 200)
    @Column(name = "observacao")
    private String observacao;
    @Size(max = 1)
    @Column(name = "tipo")
    private String tipo;
    @JoinColumn(name = "planoconta_idplanoconta", referencedColumnName = "idplanoconta")
    @OneToOne(optional = false)
    private Planoconta planoconta;
    @JoinColumn(name = "instituicao_idinstituicao", referencedColumnName = "idinstituicao")
    @OneToOne(optional = false)
    private Instituicao instituicao;
    @JoinColumn(name = "formapagamento_idformapagamento", referencedColumnName = "idformapagamento")
    @OneToOne(optional = false)
    private Formapagamento formapagamento;
    
	public Contas() {
		
	}

	public Integer getIdcontas() {
		return idcontas;
	}

	public String getDocumento() {
		return documento;
	}

	public Date getDataemissao() {
		return dataemissao;
	}

	public Date getDatavencimento() {
		return datavencimento;
	}

	public Float getValorparcela() {
		return valorparcela;
	}

	public Float getDesconto() {
		return desconto;
	}

	public Float getJuros() {
		return juros;
	}

	public Date getDatapagamento() {
		return datapagamento;
	}

	public Float getValorpago() {
		return valorpago;
	}

	public String getTipo() {
		return tipo;
	}

	public Planoconta getPlanoconta() {
		return planoconta;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public Formapagamento getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(Formapagamento formapagamento) {
		this.formapagamento = formapagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcontas == null) ? 0 : idcontas.hashCode());
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
		Contas other = (Contas) obj;
		if (idcontas == null) {
			if (other.idcontas != null)
				return false;
		} else if (!idcontas.equals(other.idcontas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contas [idcontas=" + idcontas + "]";
	}
}
