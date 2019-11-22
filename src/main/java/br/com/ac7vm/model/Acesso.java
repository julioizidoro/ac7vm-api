package br.com.ac7vm.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acesso implements Serializable	 {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idacesso")
    private Integer idacesso;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dashboard")
    private boolean dashboard;
    @Column(name = "cadastro")
    private boolean cadastro;
    @Column(name = "cadclienteincluir")
    private boolean cadclienteincluir;
    @Column(name = "cadclienteeditar")
    private boolean cadclienteeditar;
    @Column(name = "cadfornecedorincluir")
    private boolean cadfornecedorincluir;
    @Column(name = "cadfornecedoreditar")
    private boolean cadfornecedoreditar;
    @Column(name = "cadobrasincluir")
    private boolean cadobrasincluir;
    @Column(name = "cadobraseditar")
    private boolean cadobraseditar;
    @Column(name = "cadfaseobraincluir")
    private boolean cadfaseobraincluir;
    @Column(name = "cadfaseobraseditar")
    private boolean cadfaseobraseditar;
    @Column(name = "cadsubfaseobraincluir")
    private boolean cadsubfaseobraincluir;
    @Column(name = "cadsubfaseobraeditar")
    private boolean cadsubfaseobraeditar;
    @Column(name = "cadprodutosincluir")
    private boolean cadprodutosincluir;
    @Column(name = "cadprodutoseditar")
    private boolean cadprodutoseditar;
    @Column(name = "cadgrupocontasincluir")
    private boolean cadgrupocontasincluir;
    @Column(name = "cadgrupocontaseditar")
    private boolean cadgrupocontaseditar;
    @Column(name = "cadplanocontasincluir")
    private boolean cadplanocontasincluir;
    @Column(name = "cadplanocontaseditar")
    private boolean cadplanocontaseditar;
    @Column(name = "bens")
    private boolean bens;
    @Column(name = "benscontrole")
    private boolean benscontrole;
    @Column(name = "benscontroleincluir")
    private boolean benscontroleincluir;
    @Column(name = "benscontroleeditar")
    private boolean benscontroleeditar;
    @Column(name = "obras")
    private boolean obras;
    @Column(name = "obrainclir")
    private boolean obrainclir;
    @Column(name = "obraeditar")
    private boolean obraeditar;
    @Column(name = "compras")
    private boolean compras;
    @Column(name = "comprassolciitacao")
    private boolean comprassolciitacao;
    @Column(name = "comprassolciitacaoincluir")
    private boolean comprassolciitacaoincluir;
    @Column(name = "comprassolciitacaoeditar")
    private boolean comprassolciitacaoeditar;
    @Column(name = "compraspedido")
    private boolean compraspedido;
    @Column(name = "compraspedidoincluir")
    private boolean compraspedidoincluir;
    @Column(name = "compraspedidoeditar")
    private boolean compraspedidoeditar;
    @Column(name = "financeiro")
    private boolean financeiro;
    @Column(name = "financeirocp")
    private boolean financeirocp;
    @Column(name = "financeirocpincluir")
    private boolean financeirocpincluir;
    @Column(name = "financeirocpeditar")
    private boolean financeirocpeditar;
    @Column(name = "financeirocppagar")
    private boolean financeirocppagar;
    @Column(name = "financeirocr")
    private boolean financeirocr;
    @Column(name = "financeirocrincluir")
    private boolean financeirocrincluir;
    @Column(name = "financeirocreditar")
    private boolean financeirocreditar;
    @Column(name = "financeirocrreceber")
    private boolean financeirocrreceber;
    @Column(name = "financeirofc")
    private boolean financeirofc;
    @Column(name = "cadcliente")
    private boolean cadcliente;
    @Column(name = "cadfornecedor")
    private boolean cadfornecedor;
    @Column(name = "cadobras")
    private boolean cadobras;
    @Column(name = "cadplanocontas")
    private boolean cadplanocontas;
    @Column(name = "cadgrupocontas")
    private boolean cadgrupocontas;
    @Column(name = "cadfasesobras")
    private boolean cadfasesobras;
    @Column(name = "cadprodutos")
    private boolean cadprodutos;
    @Column(name = "cadsubfaseobras")
    private boolean cadsubfaseobras;
   
    public Acesso() {
    }

    public Acesso(Integer idacesso) {
        this.idacesso = idacesso;
    }

    public Integer getIdacesso() {
        return idacesso;
    }

    public void setIdacesso(Integer idacesso) {
        this.idacesso = idacesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public boolean isDashboard() {
		return dashboard;
	}

	public void setDashboard(boolean dashboard) {
		this.dashboard = dashboard;
	}

	public boolean getCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    public boolean getCadclienteincluir() {
        return cadclienteincluir;
    }

    public void setCadclienteincluir(boolean cadclienteincluir) {
        this.cadclienteincluir = cadclienteincluir;
    }

    public boolean getCadclienteeditar() {
        return cadclienteeditar;
    }

    public void setCadclienteeditar(boolean cadclienteeditar) {
        this.cadclienteeditar = cadclienteeditar;
    }

    public boolean getCadfornecedorincluir() {
        return cadfornecedorincluir;
    }

    public void setCadfornecedorincluir(boolean cadfornecedorincluir) {
        this.cadfornecedorincluir = cadfornecedorincluir;
    }

    public boolean getCadfornecedoreditar() {
        return cadfornecedoreditar;
    }

    public void setCadfornecedoreditar(boolean cadfornecedoreditar) {
        this.cadfornecedoreditar = cadfornecedoreditar;
    }

    public boolean getCadobrasincluir() {
        return cadobrasincluir;
    }

    public void setCadobrasincluir(boolean cadobrasincluir) {
        this.cadobrasincluir = cadobrasincluir;
    }

    public boolean getCadobraseditar() {
        return cadobraseditar;
    }

    public void setCadobraseditar(boolean cadobraseditar) {
        this.cadobraseditar = cadobraseditar;
    }

    public boolean getCadfaseobraincluir() {
        return cadfaseobraincluir;
    }

    public void setCadfaseobraincluir(boolean cadfaseobraincluir) {
        this.cadfaseobraincluir = cadfaseobraincluir;
    }

    public boolean getCadfaseobraseditar() {
        return cadfaseobraseditar;
    }

    public void setCadfaseobraseditar(boolean cadfaseobraseditar) {
        this.cadfaseobraseditar = cadfaseobraseditar;
    }

    public boolean getCadsubfaseobraincluir() {
        return cadsubfaseobraincluir;
    }

    public void setCadsubfaseobraincluir(boolean cadsubfaseobraincluir) {
        this.cadsubfaseobraincluir = cadsubfaseobraincluir;
    }

    public boolean getCadsubfaseobraeditar() {
        return cadsubfaseobraeditar;
    }

    public void setCadsubfaseobraeditar(boolean cadsubfaseobraeditar) {
        this.cadsubfaseobraeditar = cadsubfaseobraeditar;
    }

    public boolean getCadprodutosincluir() {
        return cadprodutosincluir;
    }

    public void setCadprodutosincluir(boolean cadprodutosincluir) {
        this.cadprodutosincluir = cadprodutosincluir;
    }

    public boolean getCadprodutoseditar() {
        return cadprodutoseditar;
    }

    public void setCadprodutoseditar(boolean cadprodutoseditar) {
        this.cadprodutoseditar = cadprodutoseditar;
    }

    public boolean getCadgrupocontasincluir() {
        return cadgrupocontasincluir;
    }

    public void setCadgrupocontasincluir(boolean cadgrupocontasincluir) {
        this.cadgrupocontasincluir = cadgrupocontasincluir;
    }

    public boolean getCadgrupocontaseditar() {
        return cadgrupocontaseditar;
    }

    public void setCadgrupocontaseditar(boolean cadgrupocontaseditar) {
        this.cadgrupocontaseditar = cadgrupocontaseditar;
    }

    public boolean getCadplanocontasincluir() {
        return cadplanocontasincluir;
    }

    public void setCadplanocontasincluir(boolean cadplanocontasincluir) {
        this.cadplanocontasincluir = cadplanocontasincluir;
    }

    public boolean getCadplanocontaseditar() {
        return cadplanocontaseditar;
    }

    public void setCadplanocontaseditar(boolean cadplanocontaseditar) {
        this.cadplanocontaseditar = cadplanocontaseditar;
    }

    public boolean getBens() {
        return bens;
    }

    public void setBens(boolean bens) {
        this.bens = bens;
    }

    

    public boolean isBenscontrole() {
		return benscontrole;
	}

	public void setBenscontrole(boolean benscontrole) {
		this.benscontrole = benscontrole;
	}

	public boolean isBenscontroleincluir() {
		return benscontroleincluir;
	}

	public void setBenscontroleincluir(boolean benscontroleincluir) {
		this.benscontroleincluir = benscontroleincluir;
	}

	public boolean isBenscontroleeditar() {
		return benscontroleeditar;
	}

	public void setBenscontroleeditar(boolean benscontroleeditar) {
		this.benscontroleeditar = benscontroleeditar;
	}

	public boolean getObras() {
        return obras;
    }

    public void setObras(boolean obras) {
        this.obras = obras;
    }

    public boolean getObrainclir() {
        return obrainclir;
    }

    public void setObrainclir(boolean obrainclir) {
        this.obrainclir = obrainclir;
    }

    public boolean getObraeditar() {
        return obraeditar;
    }

    public void setObraeditar(boolean obraeditar) {
        this.obraeditar = obraeditar;
    }

    public boolean getCompras() {
        return compras;
    }

    public void setCompras(boolean compras) {
        this.compras = compras;
    }

    public boolean getComprassolciitacao() {
        return comprassolciitacao;
    }

    public void setComprassolciitacao(boolean comprassolciitacao) {
        this.comprassolciitacao = comprassolciitacao;
    }

    public boolean getComprassolciitacaoincluir() {
        return comprassolciitacaoincluir;
    }

    public void setComprassolciitacaoincluir(boolean comprassolciitacaoincluir) {
        this.comprassolciitacaoincluir = comprassolciitacaoincluir;
    }

    public boolean getComprassolciitacaoeditar() {
        return comprassolciitacaoeditar;
    }

    public void setComprassolciitacaoeditar(boolean comprassolciitacaoeditar) {
        this.comprassolciitacaoeditar = comprassolciitacaoeditar;
    }

    public boolean getCompraspedido() {
        return compraspedido;
    }

    public void setCompraspedido(boolean compraspedido) {
        this.compraspedido = compraspedido;
    }

    public boolean getCompraspedidoincluir() {
        return compraspedidoincluir;
    }

    public void setCompraspedidoincluir(boolean compraspedidoincluir) {
        this.compraspedidoincluir = compraspedidoincluir;
    }

    public boolean getCompraspedidoeditar() {
        return compraspedidoeditar;
    }

    public void setCompraspedidoeditar(boolean compraspedidoeditar) {
        this.compraspedidoeditar = compraspedidoeditar;
    }

    public boolean getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(boolean financeiro) {
        this.financeiro = financeiro;
    }

    public boolean getFinanceirocp() {
        return financeirocp;
    }

    public void setFinanceirocp(boolean financeirocp) {
        this.financeirocp = financeirocp;
    }

    public boolean getFinanceirocpincluir() {
        return financeirocpincluir;
    }

    public void setFinanceirocpincluir(boolean financeirocpincluir) {
        this.financeirocpincluir = financeirocpincluir;
    }

    public boolean getFinanceirocpeditar() {
        return financeirocpeditar;
    }

    public void setFinanceirocpeditar(boolean financeirocpeditar) {
        this.financeirocpeditar = financeirocpeditar;
    }

    public boolean getFinanceirocppagar() {
        return financeirocppagar;
    }

    public void setFinanceirocppagar(boolean financeirocppagar) {
        this.financeirocppagar = financeirocppagar;
    }

    public boolean getFinanceirocr() {
        return financeirocr;
    }

    public void setFinanceirocr(boolean financeirocr) {
        this.financeirocr = financeirocr;
    }

    public boolean getFinanceirocrincluir() {
        return financeirocrincluir;
    }

    public void setFinanceirocrincluir(boolean financeirocrincluir) {
        this.financeirocrincluir = financeirocrincluir;
    }

    public boolean getFinanceirocreditar() {
        return financeirocreditar;
    }

    public void setFinanceirocreditar(boolean financeirocreditar) {
        this.financeirocreditar = financeirocreditar;
    }

    public boolean getFinanceirocrreceber() {
        return financeirocrreceber;
    }

    public void setFinanceirocrreceber(boolean financeirocrreceber) {
        this.financeirocrreceber = financeirocrreceber;
    }

    public boolean getFinanceirofc() {
        return financeirofc;
    }

    public void setFinanceirofc(boolean financeirofc) {
        this.financeirofc = financeirofc;
    }

    public boolean getCadcliente() {
        return cadcliente;
    }

    public void setCadcliente(boolean cadcliente) {
        this.cadcliente = cadcliente;
    }

    public boolean getCadfornecedor() {
        return cadfornecedor;
    }

    public void setCadfornecedor(boolean cadfornecedor) {
        this.cadfornecedor = cadfornecedor;
    }

    public boolean getCadobras() {
        return cadobras;
    }

    public void setCadobras(boolean cadobras) {
        this.cadobras = cadobras;
    }

    public boolean getCadplanocontas() {
        return cadplanocontas;
    }

    public void setCadplanocontas(boolean cadplanocontas) {
        this.cadplanocontas = cadplanocontas;
    }

    public boolean getCadgrupocontas() {
        return cadgrupocontas;
    }

    public void setCadgrupocontas(boolean cadgrupocontas) {
        this.cadgrupocontas = cadgrupocontas;
    }

    public boolean getCadfasesobras() {
        return cadfasesobras;
    }

    public void setCadfasesobras(boolean cadfasesobras) {
        this.cadfasesobras = cadfasesobras;
    }

    public boolean getCadprodutos() {
        return cadprodutos;
    }

    public void setCadprodutos(boolean cadprodutos) {
        this.cadprodutos = cadprodutos;
    }

    public boolean getCadsubfaseobras() {
        return cadsubfaseobras;
    }

    public void setCadsubfaseobras(boolean cadsubfaseobras) {
        this.cadsubfaseobras = cadsubfaseobras;
    }

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idacesso != null ? idacesso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acesso)) {
            return false;
        }
        Acesso other = (Acesso) object;
        if ((this.idacesso == null && other.idacesso != null) || (this.idacesso != null && !this.idacesso.equals(other.idacesso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Acesso[ idacesso=" + idacesso + " ]";
    }
    
}
