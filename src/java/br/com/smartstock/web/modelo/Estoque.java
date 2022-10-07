package br.com.smartstock.web.modelo;

public class Estoque {
    
    private Integer idestoque;
    private String nome;
    private String descricao;
    private Integer refereidloja;

    public Integer getIdestoque() {
        return idestoque;
    }

    public void setIdestoque(Integer idestoque) {
        this.idestoque = idestoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getRefereidloja() {
        return refereidloja;
    }

    public void setRefereidloja(Integer refereidloja) {
        this.refereidloja = refereidloja;
    }

    public Estoque(Integer idestoque, String nome, String descricao, Integer refereidloja) {
        this.idestoque = idestoque;
        this.nome = nome;
        this.descricao = descricao;
        this.refereidloja = refereidloja;
    }

    public Estoque() {
    }
    
}
