package br.com.smartstock.web.dao;

import br.com.smartstock.web.modelo.Cliente;
import br.com.smartstock.web.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements GenericDAO{
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ClienteDAO() {
        
        try{
            this.conn = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        
    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {
        
        try{
            Cliente cliente = (Cliente) object;
            String sql="insert into cliente (cpf, nome, email, endereco, telefone, login, senha) values (?,?,?,?,?,?,?)";
            
            stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5, cliente.getTelefone());
            stmt.setString(6, cliente.getLogin());
            stmt.setString(7, cliente.getSenha());
            
            
            stmt.execute();
            
            return true;
            
        }catch(Exception e){
            
            System.out.println("Erro ao cadastrar ClienteDAO " + e.getMessage());
            return false;
            
        }finally{
            
            ConnectionFactory.fecharConexao(conn, stmt, rs);
            
        }    }

    @Override
    public List<Object> listar() throws Exception {
        
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from cliente order by nome";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.rs = this.stmt.executeQuery();
            
            while(this.rs.next()){
                
                Cliente cliente = new Cliente();
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setLogin(rs.getString("login"));
                cliente.setSenha(rs.getString("senha"));
                
                lista.add(cliente);      
            }
            
        }catch(Exception e){
            System.out.println("Erro ao listar estoqueDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return lista;    }

    @Override
    public Object carregar(Integer codigo) throws Exception {
        try{
            String sql = "select * from cliente where idcliente = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.rs = this.stmt.executeQuery();
            this.rs.next();
            
            Cliente cliente = new Cliente();
            
            cliente.setIdcliente(this.rs.getInt("idcliente"));
            cliente.setCpf(this.rs.getString("cpf"));
            cliente.setNome(this.rs.getString("nome"));
            cliente.setEmail(this.rs.getString("email"));
            cliente.setEndereco(this.rs.getString("endereco"));
            cliente.setTelefone(this.rs.getString("telefone"));
            cliente.setLogin(this.rs.getString("login"));
            cliente.setSenha(this.rs.getString("senha"));
            
            return cliente;
            
        }catch(Exception e){
            System.out.println("Erro ao carregar clienteDAO " + e.getMessage());
            return null;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
    }

    @Override
    public Boolean alterar(Object object) throws Exception {

        try{
            Cliente cliente = (Cliente) object;
            
            String sql = "update cliente set cpf = ?, nome = ?, email = ?, endereco = ?, telefone = ?, login = ?, senha = ? where idcliente = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.stmt.setString(1, cliente.getCpf());
            this.stmt.setString(2, cliente.getNome());
            this.stmt.setString(3, cliente.getEmail());
            this.stmt.setString(4, cliente.getEndereco());
            this.stmt.setString(5, cliente.getTelefone());
            this.stmt.setString(6, cliente.getLogin());
            this.stmt.setString(7, cliente.getSenha());
            this.stmt.setInt(8, cliente.getIdcliente());
            
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro ao alterar clienteDAO " + e.getMessage());
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }



    }

    @Override
    public Boolean excluir(Integer codigo) throws Exception {
        try{
            String sql = "delete from cliente where idcliente = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.stmt.execute();
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro ao excluir clienteDAO: " + e.getMessage());
            
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
    }
    
    public Object logar(String login, String senha) throws Exception{
        try{
            
            String sql = "select * from cliente where login like ? and senha like ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.stmt.setString(1,login);
            this.stmt.setString(2,senha);
            
            this.rs = this.stmt.executeQuery();
            Cliente cliente = new Cliente();
            if(this.rs.next()){
            cliente.setIdcliente(rs.getInt("idcliente"));
        }
            
            return cliente;
            
        }catch(Exception e){
            
             System.out.println("Erro ao logar clienteDAO " +e.getMessage());
             return false;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
    }
    
}
