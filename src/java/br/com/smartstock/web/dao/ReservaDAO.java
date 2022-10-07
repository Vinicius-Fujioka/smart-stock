/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartstock.web.dao;

import br.com.smartstock.web.modelo.Reserva;
import br.com.smartstock.web.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlunoRemoto
 */
public class ReservaDAO implements GenericDAO{
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ReservaDAO() {
        
        try{
            this.conn = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {
        try{
            Reserva reserva = (Reserva) object;
            String sql="insert into reserva (nome, quantidade, observacao, produto) values (?,?,?,?)";
            
            stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, reserva.getNome());
            stmt.setString(2, reserva.getQuantidade());
            stmt.setString(3, reserva.getObservacao());
            stmt.setString(4, reserva.getProduto());
            
            stmt.execute();
            
            return true;    }catch(Exception e){
            
            System.out.println("Erro ao cadastrar ReservaDAO " + e.getMessage());
            return false;
            
        }finally{
            
            ConnectionFactory.fecharConexao(conn, stmt, rs);
            
        }    
    }

    @Override
    public List<Object> listar() throws Exception {
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from reserva";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.rs = this.stmt.executeQuery();
            
            while(this.rs.next()){
                
                Reserva reserva = new Reserva();
                reserva.setIdrescliente(rs.getInt("idrescliente"));
                reserva.setNome(rs.getString("nome"));
                reserva.setQuantidade(rs.getString("quantidade"));
                reserva.setObservacao(rs.getString("observacao"));
                reserva.setProduto(rs.getString("produto"));
                
                lista.add(reserva);
            }
            
        }catch(Exception e){
            System.out.println("Erro ao listar estoqueDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }

        return lista;  
    }

    @Override
    public Object carregar(Integer codigo) throws Exception {
        try{
            String sql = "select * from reserva where idrescliente = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.rs = this.stmt.executeQuery();
            this.rs.next();
            
            Reserva reserva = new Reserva();
            
            reserva.setIdrescliente(this.rs.getInt("idrescliente"));
            reserva.setIdresloja(this.rs.getInt("idresloja"));
            reserva.setNome(this.rs.getString("nome"));
            reserva.setQuantidade(this.rs.getString("quantidade"));
            reserva.setObservacao(this.rs.getString("observacao"));
            reserva.setProduto(this.rs.getString("produto"));
            
            return reserva;
            
        }catch(Exception e){
            System.out.println("Erro ao carregar reservaDAO " + e.getMessage());
            return null;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }    
    }

    @Override
    public Boolean alterar(Object object) throws Exception {
        try{
            Reserva reserva = (Reserva) object;
            
            String sql = "update reserva set nome = ?, quantidade = ?, observacao = ?, produto = ? where idrescliente = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.stmt.setString(1, reserva.getNome());
            this.stmt.setString(2, reserva.getQuantidade());
            this.stmt.setString(3, reserva.getObservacao());
            this.stmt.setString(4, reserva.getProduto());
            this.stmt.setInt(5, reserva.getIdrescliente());
            
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro ao alterar clienteDAO " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }    }

    @Override
    public Boolean excluir(Integer codigo) throws Exception {
        try{
            String sql = "delete from reserva where idrescliente = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.stmt.execute();
            
            return true;
            
            
        }catch(Exception e){
            System.out.println("Erro ao excluir reservaDAO: " + e.getMessage());
            
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }     }
    
}
