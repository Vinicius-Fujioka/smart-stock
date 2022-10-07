package br.com.smartstock.web.modelo;

public class Reserva {
    private Integer idrescliente;
    private Integer idresloja;
    private String nome;
    private String quantidade;
    private String observacao;
    private String produto;

    
    public Reserva() {
    }

    public Reserva(Integer idrescliente, Integer idresloja, String nome, String quantidade, String observacao) {
        this.idrescliente = idrescliente;
        this.idresloja = idresloja;
        this.nome = nome;
        this.quantidade = quantidade;
        this.observacao = observacao;
        this.produto = produto;
    }

    public Integer getIdrescliente() {
        return idrescliente;
    }

    public void setIdrescliente(Integer idrescliente) {
        this.idrescliente = idrescliente;
    }

    public Integer getIdresloja() {
        return idresloja;
    }

    public void setIdresloja(Integer idresloja) {
        this.idresloja = idresloja;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
}
