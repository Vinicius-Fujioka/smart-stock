/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartstock.web.controle;

import br.com.smartstock.web.dao.GenericDAO;
import br.com.smartstock.web.dao.ProdutoDAO;
import br.com.smartstock.web.modelo.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cazuu
 */
@WebServlet(name = "CadastrarProduto", urlPatterns = {"/CadastrarProduto"})
public class CadastrarProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String nome = request.getParameter("nome");
            String quantidade = request.getParameter("quantidade");
            String validade = request.getParameter("validade");
            String preco = request.getParameter("preco");
            Integer refestoque = Integer.parseInt(request.getParameter("refestoque"));
            
            Produto produto = new Produto();
            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setValidade(validade);
            produto.setPreco(preco);
            produto.setRefestoque(refestoque);
            
            GenericDAO dao = new ProdutoDAO();
            
            String mensagem = "";
            
            if(dao.cadastrar(produto)){
                mensagem="Produto cadastrado com sucesso!";
            }else{
                mensagem="Erro ao cadastrar produto!";
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("cadastrarproduto-loja.jsp").forward(request, response);
        }catch(Exception e){
            System.out.println("Erro ao cadastrar ProdutoCTR " + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
