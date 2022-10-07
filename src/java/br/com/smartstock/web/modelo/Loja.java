package br.com.smartstock.web.modelo;

public class Loja {
    
    private Integer idloja;
    private String cnpj;
    private String tipo;
    private String descricao;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String cidade;
    private String login;
    private String senha;

    public Integer getIdloja() {
        return idloja;
    }

    public void setIdloja(Integer idloja) {
        this.idloja = idloja;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Loja(Integer idloja, String cnpj, String tipo, String descricao, String nome, String email, String endereco, String telefone, String cidade, String login, String senha) {
        this.idloja = idloja;
        this.cnpj = cnpj;
        this.tipo = tipo;
        this.descricao = descricao;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade = cidade;
        this.login = login;
        this.senha = senha;
    }

    public Loja() {
    }
    
}
