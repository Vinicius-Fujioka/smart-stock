/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartstock.web.dao;

import br.com.smartstock.web.modelo.Estoque;
import br.com.smartstock.web.modelo.Loja;
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
public class EstoqueDAO implements GenericDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public EstoqueDAO() {

        try {
            this.conn = ConnectionFactory.conectar();
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }

    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {

        try {
            Estoque estoque = (Estoque) object;
            String sql = "insert into estoque (nome, descricao, refereidloja) values (?,?,?)";

            stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, estoque.getNome());
            stmt.setString(2, estoque.getDescricao());
            stmt.setInt(3, estoque.getRefereidloja());

            stmt.execute();

            return true;

        } catch (Exception e) {

            System.out.println("Erro ao cadastrar EstoqueDAO " + e.getMessage());
            return false;

        } finally {

            ConnectionFactory.fecharConexao(conn, stmt, rs);

        }
    }

    public List<Object> listarestoquesprodutos(Integer idloja) throws Exception {

        List<Object> lista = new ArrayList<>();

        try {
            String sql = "select * from estoque where refereidloja = " + idloja + "";

            this.stmt = this.conn.prepareStatement(sql);

            this.rs = this.stmt.executeQuery();

            while (this.rs.next()) {

                Estoque estoque = new Estoque();
                estoque.setIdestoque(rs.getInt("idestoque"));
                estoque.setNome(rs.getString("nome"));
                estoque.setDescricao(rs.getString("descricao"));

                lista.add(estoque);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar estoqueDAO " + e.getMessage());
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }

        return lista;

    }

    @Override
    public Object carregar(Integer codigo) throws Exception {
        try {
            String sql = "select * from estoque where idestoque = ?";

            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.rs = this.stmt.executeQuery();
            this.rs.next();

            Estoque estoque = new Estoque();

            estoque.setIdestoque(this.rs.getInt("idestoque"));
            estoque.setNome(this.rs.getString("nome"));
            estoque.setDescricao(this.rs.getString("descricao"));

            return estoque;

        } catch (Exception e) {
            System.out.println("Erro ao carregar estoqueDAO " + e.getMessage());
            return null;
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
    }

    @Override
    public Boolean alterar(Object object) throws Exception {
        try {
            Estoque estoque = (Estoque) object;

            String sql = "update estoque set nome = ?, descricao = ? where idestoque = ?";

            this.stmt = this.conn.prepareStatement(sql);

            this.stmt.setString(1, estoque.getNome());
            this.stmt.setString(2, estoque.getDescricao());

            this.stmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao alterar estoqueDAO " + e.getMessage());
            return false;
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
    }

    @Override
    public Boolean excluir(Integer codigo) throws Exception {
        try {
            String sql = "delete from estoque where idestoque = ?";

            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, codigo);
            this.stmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir estoqueDAO: " + e.getMessage());

            return false;
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
    }

    public List<Object> listarEstoquePorLoja(Integer id) throws Exception {

        List<Object> lista = new ArrayList<>();

        try {
            String sql = "select e.idestoque, e.nome, e.descricao from estoque e where e.refereidloja = ?";

            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, id);

            this.rs = this.stmt.executeQuery();

            while (this.rs.next()) {

                //Estoque estoque = new Estoque();
                //estoque.setIdestoque(rs.getInt("idestoque"));
                Estoque estoque = new Estoque();

                estoque.setIdestoque(rs.getInt("idestoque"));
                estoque.setNome(rs.getString("nome"));
                estoque.setDescricao(rs.getString("descricao"));

                lista.add(estoque);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar estoqueDAO " + e.getMessage());
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }

        return lista;

    }

    public List<Object> listarEstoquePorLojaCliente(Integer id) throws Exception {

        List<Object> lista = new ArrayList<>();

        try {
            String sql = "select e.idestoque, e.nome, e.descricao from estoque e where e.refereidloja = ?";

            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, id);

            this.rs = this.stmt.executeQuery();

            while (this.rs.next()) {

                //Estoque estoque = new Estoque();
                //estoque.setIdestoque(rs.getInt("idestoque"));
                Estoque estoque = new Estoque();

                estoque.setIdestoque(rs.getInt("idestoque"));
                estoque.setNome(rs.getString("nome"));
                estoque.setDescricao(rs.getString("descricao"));

                lista.add(estoque);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar estoqueDAO " + e.getMessage());
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }

        return lista;

    }

    @Override
    public List<Object> listar() throws Exception {

        List<Object> lista = new ArrayList<>();

        try {
            String sql = "select * from estoque";

            this.stmt = this.conn.prepareStatement(sql);

            this.rs = this.stmt.executeQuery();

            while (this.rs.next()) {

                Estoque estoque = new Estoque();
                estoque.setIdestoque(rs.getInt("idestoque"));
                estoque.setNome(rs.getString("nome"));
                estoque.setDescricao(rs.getString("descricao"));

                lista.add(estoque);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar estoqueDAO " + e.getMessage());
        } finally {
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }

        return lista;
    }

}
