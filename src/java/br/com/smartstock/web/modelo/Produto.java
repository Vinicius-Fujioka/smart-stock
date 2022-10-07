package br.com.smartstock.web.modelo;

public class Produto {
    
    private Integer idproduto;
    private Integer refestoque;
    private String nome;
    private String quantidade;
    private String validade;
    private String preco;

    public Produto() {
    }

    public Produto(Integer idproduto, Integer refestoque, String nome, String quantidade, String validade, String preco) {
        this.idproduto = idproduto;
        this.refestoque = refestoque;
        this.nome = nome;
        this.quantidade = quantidade;
        this.validade = validade;
        this.preco = preco;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Integer getRefestoque() {
        return refestoque;
    }

    public void setRefestoque(Integer refestoque) {
        this.refestoque = refestoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
}
