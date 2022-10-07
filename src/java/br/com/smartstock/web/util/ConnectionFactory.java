package br.com.smartstock.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConnectionFactory {
        
    public static Connection conectar() throws Exception{
        
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Conectou!");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/smartstock","postgres","postdba");
        }catch(Exception e){
            throw new Exception("Erro ao conectar: " + e.getMessage());
        }
        
    }
    
    public static void fecharConexao(Connection conn, PreparedStatement stmt, ResultSet rs) throws Exception{
        
        try{
            if(conn !=null){
                conn.close();
            }
            if(stmt !=null){
                stmt.close();
            }
            if(rs !=null){
                rs.close();
            }
        }catch(Exception e){
            throw new Exception("Erro ao fecharConexão: " + e.getMessage());
        }
        
    }
    
}
