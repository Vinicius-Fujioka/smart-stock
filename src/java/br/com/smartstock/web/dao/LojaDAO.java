package br.com.smartstock.web.dao;

import br.com.smartstock.web.modelo.Loja;
import br.com.smartstock.web.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class LojaDAO implements GenericDAO{
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public LojaDAO() {
        
        try{
            this.conn = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        
    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {
        
        try{
            Loja loja = (Loja) object;
            String sql="insert into loja (cnpj, tipo, descricao, nome, email, endereco, telefone, cidade, login, senha) values (?,?,?,?,?,?,?,?,?,?)";
            
            stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, loja.getCnpj());
            stmt.setString(2, loja.getTipo());
            stmt.setString(3, loja.getDescricao());
            stmt.setString(4, loja.getNome());
            stmt.setString(5, loja.getEmail());
            stmt.setString(6, loja.getEndereco());
            stmt.setString(7, loja.getTelefone());
            stmt.setString(8, loja.getCidade());
            stmt.setString(9, loja.getLogin());
            stmt.setString(10, loja.getSenha());
            
            stmt.execute();
            
            return true;
            
        }catch(Exception e){
            
            System.out.println("Erro ao cadastrar LojaDAO " + e.getMessage());
            return false;
            
        }finally{
            
            ConnectionFactory.fecharConexao(conn, stmt, rs);
            
        }
    }

    @Override
    public List<Object> listar() throws Exception {

        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from loja";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.rs = this.stmt.executeQuery();
            
            while(this.rs.next()){
                
                Loja loja = new Loja();
                loja.setIdloja(rs.getInt("idloja"));
                loja.setNome(rs.getString("nome"));
                loja.setTipo(rs.getString("tipo"));
                loja.setCidade(rs.getString("cidade"));
                
                lista.add(loja);      
            }
            
        }catch(Exception e){
            System.out.println("Erro ao listar lojaDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return lista;

    }

    @Override
    public Object carregar(Integer codigo) throws Exception {
        try{
            String sql = "select * from loja where idloja = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.rs = this.stmt.executeQuery();
            this.rs.next();
            
            Loja loja = new Loja();
            
            loja.setIdloja(this.rs.getInt("idloja"));
            loja.setCnpj(this.rs.getString("cnpj"));
            loja.setTipo(this.rs.getString("tipo"));
            loja.setDescricao(this.rs.getString("descricao"));
            loja.setNome(this.rs.getString("nome"));
            loja.setEmail(this.rs.getString("email"));
            loja.setEndereco(this.rs.getString("endereco"));
            loja.setTelefone(this.rs.getString("telefone"));
            loja.setCidade(this.rs.getString("cidade"));
            loja.setLogin(this.rs.getString("login"));
            loja.setSenha(this.rs.getString("senha"));
            
            return loja;
            
        }catch(Exception e){
            System.out.println("Erro ao carregar lojaDAOA " + e.getMessage());
            return null;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }    }

    @Override
    public Boolean alterar(Object object) throws Exception {
 try{
            Loja loja = (Loja) object;
            
            String sql = "update loja set cnpj = ?, tipo = ?, descricao = ?, nome = ?, email = ?, endereco = ?, telefone = ?, cidade = ?, login = ?, senha = ? where idloja = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.stmt.setString(1, loja.getCnpj());
            this.stmt.setString(2, loja.getTipo());
            this.stmt.setString(3, loja.getDescricao());
            this.stmt.setString(4, loja.getNome());
            this.stmt.setString(5, loja.getEmail());
            this.stmt.setString(6, loja.getEndereco());
            this.stmt.setString(7, loja.getTelefone());
            this.stmt.setString(8, loja.getCidade());
            this.stmt.setString(9, loja.getLogin());
            this.stmt.setString(10, loja.getSenha());
            this.stmt.setInt(11, loja.getIdloja());
            
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
            String sql = "delete from loja where idloja = ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.stmt.execute();
            
            return true;
            
            
        }catch(Exception e){
            System.out.println("Erro ao excluir lojaDAO: " + e.getMessage());
            
            return false;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
    }
    
    public Object logar(String login, String senha) throws Exception{
        
        try{
            
            String sql = "select * from loja where login like ? and senha like ?";
            
            this.stmt = this.conn.prepareStatement(sql);
            
            this.stmt.setString(1,login);
            this.stmt.setString(2,senha);
            
            this.rs = this.stmt.executeQuery();
            Loja loja = new Loja();
            if(this.rs.next()){
                loja.setIdloja(rs.getInt("idloja"));
            }
            
            return loja;
            
        }catch(Exception e){
            
             System.out.println("Erro ao logar lojaDAO " +e.getMessage());
             return false;
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
    }
    
    public Object carregarloja(Integer codigo) throws Exception {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Loja loja = null;
        
        String sql = "select * from loja where idloja = ?;";
        
        try{
            
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1,codigo);
            
            this.rs = this.stmt.executeQuery();
            
            while(rs.next()){
                
                loja = new Loja();
                loja.setIdloja(rs.getInt("idloja"));
                loja.setNome(rs.getString("nome"));
                loja.setTipo(rs.getString("tipo"));
                loja.setCidade(rs.getString("cidade"));   
            }
            
        }catch(Exception e){
            System.out.println("Erro ao listar lojaDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        
        return loja;

    }
}
