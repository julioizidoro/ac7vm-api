package br.com.ac7vm.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Acesso implements Serializable	 {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idacesso")
    private Integer idacesso;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dashBoard")
    private Short dashBoard;
    @Column(name = "cadastro")
    private Short cadastro;
    @Column(name = "cadclienteincluir")
    private Short cadclienteincluir;
    @Column(name = "cadclienteeditar")
    private Short cadclienteeditar;
    @Column(name = "cadfornecedorincluir")
    private Short cadfornecedorincluir;
    @Column(name = "cadfornecedoreditar")
    private Short cadfornecedoreditar;
    @Column(name = "cadobrasincluir")
    private Short cadobrasincluir;
    @Column(name = "cadobraseditar")
    private Short cadobraseditar;
    @Column(name = "cadfaseobraincluir")
    private Short cadfaseobraincluir;
    @Column(name = "cadfaseobraseditar")
    private Short cadfaseobraseditar;
    @Column(name = "cadsubfaseobraincluir")
    private Short cadsubfaseobraincluir;
    @Column(name = "cadsubfaseobraeditar")
    private Short cadsubfaseobraeditar;
    @Column(name = "cadprodutosincluir")
    private Short cadprodutosincluir;
    @Column(name = "cadprodutoseditar")
    private Short cadprodutoseditar;
    @Column(name = "cadgrupocontasincluir")
    private Short cadgrupocontasincluir;
    @Column(name = "cadgrupocontaseditar")
    private Short cadgrupocontaseditar;
    @Column(name = "cadplanocontasincluir")
    private Short cadplanocontasincluir;
    @Column(name = "cadplanocontaseditar")
    private Short cadplanocontaseditar;
    @Column(name = "bens")
    private Short bens;
    @Column(name = "bensincluir")
    private Short bensincluir;
    @Column(name = "benseditar")
    private Short benseditar;
    @Column(name = "obras")
    private Short obras;
    @Column(name = "obrainclir")
    private Short obrainclir;
    @Column(name = "obraeditar")
    private Short obraeditar;
    @Column(name = "compras")
    private Short compras;
    @Column(name = "comprassolciitacao")
    private Short comprassolciitacao;
    @Column(name = "comprassolciitacaoincluir")
    private Short comprassolciitacaoincluir;
    @Column(name = "comprassolciitacaoeditar")
    private Short comprassolciitacaoeditar;
    @Column(name = "compraspedido")
    private Short compraspedido;
    @Column(name = "compraspedidoincluir")
    private Short compraspedidoincluir;
    @Column(name = "compraspedidoeditar")
    private Short compraspedidoeditar;
    @Column(name = "financeiro")
    private Short financeiro;
    @Column(name = "financeirocp")
    private Short financeirocp;
    @Column(name = "financeirocpincluir")
    private Short financeirocpincluir;
    @Column(name = "financeirocpeditar")
    private Short financeirocpeditar;
    @Column(name = "financeirocppagar")
    private Short financeirocppagar;
    @Column(name = "financeirocr")
    private Short financeirocr;
    @Column(name = "financeirocrincluir")
    private Short financeirocrincluir;
    @Column(name = "financeirocreditar")
    private Short financeirocreditar;
    @Column(name = "financeirocrreceber")
    private Short financeirocrreceber;
    @Column(name = "financeirofc")
    private Short financeirofc;
    @Column(name = "cadcliente")
    private Short cadcliente;
    @Column(name = "cadfornecedor")
    private Short cadfornecedor;
    @Column(name = "cadobras")
    private Short cadobras;
    @Column(name = "cadplanocontas")
    private Short cadplanocontas;
    @Column(name = "cadgrupocontas")
    private Short cadgrupocontas;
    @Column(name = "cadfasesobras")
    private Short cadfasesobras;
    @Column(name = "cadprodutos")
    private Short cadprodutos;
    @Column(name = "cadsubfaseobras")
    private Short cadsubfaseobras;

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

    public Short getDashBoard() {
        return dashBoard;
    }

    public void setDashBoard(Short dashBoard) {
        this.dashBoard = dashBoard;
    }

    public Short getCadastro() {
        return cadastro;
    }

    public void setCadastro(Short cadastro) {
        this.cadastro = cadastro;
    }

    public Short getCadclienteincluir() {
        return cadclienteincluir;
    }

    public void setCadclienteincluir(Short cadclienteincluir) {
        this.cadclienteincluir = cadclienteincluir;
    }

    public Short getCadclienteeditar() {
        return cadclienteeditar;
    }

    public void setCadclienteeditar(Short cadclienteeditar) {
        this.cadclienteeditar = cadclienteeditar;
    }

    public Short getCadfornecedorincluir() {
        return cadfornecedorincluir;
    }

    public void setCadfornecedorincluir(Short cadfornecedorincluir) {
        this.cadfornecedorincluir = cadfornecedorincluir;
    }

    public Short getCadfornecedoreditar() {
        return cadfornecedoreditar;
    }

    public void setCadfornecedoreditar(Short cadfornecedoreditar) {
        this.cadfornecedoreditar = cadfornecedoreditar;
    }

    public Short getCadobrasincluir() {
        return cadobrasincluir;
    }

    public void setCadobrasincluir(Short cadobrasincluir) {
        this.cadobrasincluir = cadobrasincluir;
    }

    public Short getCadobraseditar() {
        return cadobraseditar;
    }

    public void setCadobraseditar(Short cadobraseditar) {
        this.cadobraseditar = cadobraseditar;
    }

    public Short getCadfaseobraincluir() {
        return cadfaseobraincluir;
    }

    public void setCadfaseobraincluir(Short cadfaseobraincluir) {
        this.cadfaseobraincluir = cadfaseobraincluir;
    }

    public Short getCadfaseobraseditar() {
        return cadfaseobraseditar;
    }

    public void setCadfaseobraseditar(Short cadfaseobraseditar) {
        this.cadfaseobraseditar = cadfaseobraseditar;
    }

    public Short getCadsubfaseobraincluir() {
        return cadsubfaseobraincluir;
    }

    public void setCadsubfaseobraincluir(Short cadsubfaseobraincluir) {
        this.cadsubfaseobraincluir = cadsubfaseobraincluir;
    }

    public Short getCadsubfaseobraeditar() {
        return cadsubfaseobraeditar;
    }

    public void setCadsubfaseobraeditar(Short cadsubfaseobraeditar) {
        this.cadsubfaseobraeditar = cadsubfaseobraeditar;
    }

    public Short getCadprodutosincluir() {
        return cadprodutosincluir;
    }

    public void setCadprodutosincluir(Short cadprodutosincluir) {
        this.cadprodutosincluir = cadprodutosincluir;
    }

    public Short getCadprodutoseditar() {
        return cadprodutoseditar;
    }

    public void setCadprodutoseditar(Short cadprodutoseditar) {
        this.cadprodutoseditar = cadprodutoseditar;
    }

    public Short getCadgrupocontasincluir() {
        return cadgrupocontasincluir;
    }

    public void setCadgrupocontasincluir(Short cadgrupocontasincluir) {
        this.cadgrupocontasincluir = cadgrupocontasincluir;
    }

    public Short getCadgrupocontaseditar() {
        return cadgrupocontaseditar;
    }

    public void setCadgrupocontaseditar(Short cadgrupocontaseditar) {
        this.cadgrupocontaseditar = cadgrupocontaseditar;
    }

    public Short getCadplanocontasincluir() {
        return cadplanocontasincluir;
    }

    public void setCadplanocontasincluir(Short cadplanocontasincluir) {
        this.cadplanocontasincluir = cadplanocontasincluir;
    }

    public Short getCadplanocontaseditar() {
        return cadplanocontaseditar;
    }

    public void setCadplanocontaseditar(Short cadplanocontaseditar) {
        this.cadplanocontaseditar = cadplanocontaseditar;
    }

    public Short getBens() {
        return bens;
    }

    public void setBens(Short bens) {
        this.bens = bens;
    }

    public Short getBensincluir() {
        return bensincluir;
    }

    public void setBensincluir(Short bensincluir) {
        this.bensincluir = bensincluir;
    }

    public Short getBenseditar() {
        return benseditar;
    }

    public void setBenseditar(Short benseditar) {
        this.benseditar = benseditar;
    }

    public Short getObras() {
        return obras;
    }

    public void setObras(Short obras) {
        this.obras = obras;
    }

    public Short getObrainclir() {
        return obrainclir;
    }

    public void setObrainclir(Short obrainclir) {
        this.obrainclir = obrainclir;
    }

    public Short getObraeditar() {
        return obraeditar;
    }

    public void setObraeditar(Short obraeditar) {
        this.obraeditar = obraeditar;
    }

    public Short getCompras() {
        return compras;
    }

    public void setCompras(Short compras) {
        this.compras = compras;
    }

    public Short getComprassolciitacao() {
        return comprassolciitacao;
    }

    public void setComprassolciitacao(Short comprassolciitacao) {
        this.comprassolciitacao = comprassolciitacao;
    }

    public Short getComprassolciitacaoincluir() {
        return comprassolciitacaoincluir;
    }

    public void setComprassolciitacaoincluir(Short comprassolciitacaoincluir) {
        this.comprassolciitacaoincluir = comprassolciitacaoincluir;
    }

    public Short getComprassolciitacaoeditar() {
        return comprassolciitacaoeditar;
    }

    public void setComprassolciitacaoeditar(Short comprassolciitacaoeditar) {
        this.comprassolciitacaoeditar = comprassolciitacaoeditar;
    }

    public Short getCompraspedido() {
        return compraspedido;
    }

    public void setCompraspedido(Short compraspedido) {
        this.compraspedido = compraspedido;
    }

    public Short getCompraspedidoincluir() {
        return compraspedidoincluir;
    }

    public void setCompraspedidoincluir(Short compraspedidoincluir) {
        this.compraspedidoincluir = compraspedidoincluir;
    }

    public Short getCompraspedidoeditar() {
        return compraspedidoeditar;
    }

    public void setCompraspedidoeditar(Short compraspedidoeditar) {
        this.compraspedidoeditar = compraspedidoeditar;
    }

    public Short getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(Short financeiro) {
        this.financeiro = financeiro;
    }

    public Short getFinanceirocp() {
        return financeirocp;
    }

    public void setFinanceirocp(Short financeirocp) {
        this.financeirocp = financeirocp;
    }

    public Short getFinanceirocpincluir() {
        return financeirocpincluir;
    }

    public void setFinanceirocpincluir(Short financeirocpincluir) {
        this.financeirocpincluir = financeirocpincluir;
    }

    public Short getFinanceirocpeditar() {
        return financeirocpeditar;
    }

    public void setFinanceirocpeditar(Short financeirocpeditar) {
        this.financeirocpeditar = financeirocpeditar;
    }

    public Short getFinanceirocppagar() {
        return financeirocppagar;
    }

    public void setFinanceirocppagar(Short financeirocppagar) {
        this.financeirocppagar = financeirocppagar;
    }

    public Short getFinanceirocr() {
        return financeirocr;
    }

    public void setFinanceirocr(Short financeirocr) {
        this.financeirocr = financeirocr;
    }

    public Short getFinanceirocrincluir() {
        return financeirocrincluir;
    }

    public void setFinanceirocrincluir(Short financeirocrincluir) {
        this.financeirocrincluir = financeirocrincluir;
    }

    public Short getFinanceirocreditar() {
        return financeirocreditar;
    }

    public void setFinanceirocreditar(Short financeirocreditar) {
        this.financeirocreditar = financeirocreditar;
    }

    public Short getFinanceirocrreceber() {
        return financeirocrreceber;
    }

    public void setFinanceirocrreceber(Short financeirocrreceber) {
        this.financeirocrreceber = financeirocrreceber;
    }

    public Short getFinanceirofc() {
        return financeirofc;
    }

    public void setFinanceirofc(Short financeirofc) {
        this.financeirofc = financeirofc;
    }

    public Short getCadcliente() {
        return cadcliente;
    }

    public void setCadcliente(Short cadcliente) {
        this.cadcliente = cadcliente;
    }

    public Short getCadfornecedor() {
        return cadfornecedor;
    }

    public void setCadfornecedor(Short cadfornecedor) {
        this.cadfornecedor = cadfornecedor;
    }

    public Short getCadobras() {
        return cadobras;
    }

    public void setCadobras(Short cadobras) {
        this.cadobras = cadobras;
    }

    public Short getCadplanocontas() {
        return cadplanocontas;
    }

    public void setCadplanocontas(Short cadplanocontas) {
        this.cadplanocontas = cadplanocontas;
    }

    public Short getCadgrupocontas() {
        return cadgrupocontas;
    }

    public void setCadgrupocontas(Short cadgrupocontas) {
        this.cadgrupocontas = cadgrupocontas;
    }

    public Short getCadfasesobras() {
        return cadfasesobras;
    }

    public void setCadfasesobras(Short cadfasesobras) {
        this.cadfasesobras = cadfasesobras;
    }

    public Short getCadprodutos() {
        return cadprodutos;
    }

    public void setCadprodutos(Short cadprodutos) {
        this.cadprodutos = cadprodutos;
    }

    public Short getCadsubfaseobras() {
        return cadsubfaseobras;
    }

    public void setCadsubfaseobras(Short cadsubfaseobras) {
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
