/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartstock.web.dao;

import br.com.smartstock.web.modelo.Produto;
import br.com.smartstock.web.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cazuu
 */
public class ProdutoDAO implements GenericDAO{
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ProdutoDAO() {
        
        try{
            this.conn = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        
    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {
        try{
            Produto produto = (Produto) object;
            String sql="insert into produto (nome, quantidade, validade, preco, refestoque) values (?,?,?,?,?)";
            
            stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getQuantidade());
            stmt.setString(3, produto.getValidade());
            stmt.setString(4, produto.getPreco());
            stmt.setInt(5, produto.getRefestoque());
            
            stmt.execute();
            
            return true;
            
        }catch(Exception e){
            
            System.out.println("Erro ao cadastrar ProdutoDAO " + e.getMessage());
            return false;
            
        }finally{
            
            ConnectionFactory.fecharConexao(conn, stmt, rs);
            
        }    }

    @Override
    public List<Object> listar() throws Exception {
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from produto";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.rs = this.stmt.executeQuery();
            
            while(this.rs.next()){
                
                Produto produto = new Produto();
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getString("quantidade"));
                produto.setValidade(rs.getString("validade"));
                produto.setPreco(rs.getString("preco"));
                
                lista.add(produto);      
            }
            
        }catch(Exception e){
            System.out.println("Erro ao listar produtoDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return lista;    }

    @Override
    public Object carregar(Integer codigo) throws Exception {
        try{
            String sql = "select * from produto where idproduto = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.rs = this.stmt.executeQuery();
            this.rs.next();
            
            Produto produto = new Produto();
            
            produto.setIdproduto(this.rs.getInt("idproduto"));
            produto.setNome(this.rs.getString("nome"));
            produto.setQuantidade(this.rs.getString("quantidade"));
            produto.setValidade(this.rs.getString("validade"));
            produto.setPreco(this.rs.getString("preco"));
            
            
            return produto;
            
        }catch(Exception e){
            System.out.println("Erro ao carregar produtoDAO " + e.getMessage());
            return null;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }    
    }

    @Override
    public Boolean alterar(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean excluir(Integer codigo) throws Exception {
        try{
            String sql = "delete from produto where idproduto = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.stmt.execute();
            
            return true;
            
            
        }catch(Exception e){
            System.out.println("Erro ao excluir produtoDAO: " + e.getMessage());
            
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
    }
    
    public List<Object> listarProdutoPorEstoque(Integer id) throws Exception {

        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select e.idproduto, e.nome, e.quantidade, e.validade, e.preco from produto e where e.refestoque = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1,id);
            
            this.rs = this.stmt.executeQuery();
            
            while(this.rs.next()){
                
                
               Produto produto = new Produto();
                
                
                produto.setIdproduto(rs.getInt("idproduto"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getString("quantidade"));
                produto.setValidade(rs.getString("validade"));
                produto.setPreco(rs.getString("preco"));
                
                lista.add(produto);
            }
            
        }catch(Exception e){
            System.out.println("Erro ao listar produtoDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }

        return lista;

    }
    
}
