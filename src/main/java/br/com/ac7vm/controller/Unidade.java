package br.com.ac7vm.controller;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import br.com.ac7vm.model.Obra;

@Entity
@Table(name = "unidade")
public class Unidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idunidade")
    private Integer idunidade;
    @Size(max = 45)
    @Column(name = "areaprivada")
    private String areaprivada;
    @Size(max = 100)
    @Column(name = "areatotal")
    private String areatotal;
    @Column(name = "garagem")
    private Boolean garagem;
    @Column(name = "dormitorio")
    private int dormitorio;
    @Column(name = "suite")
    private int suite;
    @Column(name = "sacada")
    private Boolean sacada;
    @Size(max = 10)
    @Column(name = "churrasqueira")
    private String churrasqueira;
    @JoinColumn(name = "obra_idobra", referencedColumnName = "idobra")
    @OneToOne(optional = false)
    private Obra obra;
    
	public Unidade() {
		
	}

	public Integer getIdunidade() {
		return idunidade;
	}

	public void setIdunidade(Integer idunidade) {
		this.idunidade = idunidade;
	}

	public String getAreaprivada() {
		return areaprivada;
	}

	public void setAreaprivada(String areaprivada) {
		this.areaprivada = areaprivada;
	}

	public String getAreatotal() {
		return areatotal;
	}

	public void setAreatotal(String areatotal) {
		this.areatotal = areatotal;
	}

	public Boolean getGaragem() {
		return garagem;
	}

	public void setGaragem(Boolean garagem) {
		this.garagem = garagem;
	}

	public int getDormitorio() {
		return dormitorio;
	}

	public void setDormitorio(int dormitorio) {
		this.dormitorio = dormitorio;
	}

	public int getSuite() {
		return suite;
	}

	public void setSuite(int suite) {
		this.suite = suite;
	}

	public Boolean getSacada() {
		return sacada;
	}

	public void setSacada(Boolean sacada) {
		this.sacada = sacada;
	}

	public String getChurrasqueira() {
		return churrasqueira;
	}

	public void setChurrasqueira(String churrasqueira) {
		this.churrasqueira = churrasqueira;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idunidade == null) ? 0 : idunidade.hashCode());
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
		Unidade other = (Unidade) obj;
		if (idunidade == null) {
			if (other.idunidade != null)
				return false;
		} else if (!idunidade.equals(other.idunidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Unidade [idunidade=" + idunidade + "]";
	}
	
	
    
    

}
