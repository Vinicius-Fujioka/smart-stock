/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartstock.web.controle;

import br.com.smartstock.web.dao.GenericDAO;
import br.com.smartstock.web.dao.LojaDAO;
import br.com.smartstock.web.modelo.Loja;
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
@WebServlet(name = "CadastrarLoja", urlPatterns = {"/CadastrarLoja"})
public class CadastrarLoja extends HttpServlet {

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
            String idloja = request.getParameter("idloja");
            String cnpj = request.getParameter("cnpj");
            String tipo = request.getParameter("tipo");
            String descricao = request.getParameter("descricao");
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String endereco = request.getParameter("endereco");
            String telefone = request.getParameter("telefone");
            String cidade = request.getParameter("cidade");
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            
            Loja loja = new Loja();
            loja.setCnpj(cnpj);
            loja.setTipo(tipo);
            loja.setDescricao(descricao);
            loja.setNome(nome);
            loja.setEmail(email);
            loja.setEndereco(endereco);
            loja.setTelefone(telefone);
            loja.setCidade(cidade);
            loja.setLogin(login);
            loja.setSenha(senha);
            
            
            GenericDAO dao = new LojaDAO();
            
            String mensagem = "";
            
           if(idloja.equals("")){
                
                if(dao.cadastrar(loja)){
                    mensagem="Loja cadastrado com sucesso!";
                }else{
                    mensagem="Erro ao cadastrar loja!";
                }
            
            }else{
                
                loja.setIdloja(Integer.parseInt(idloja));
                
                if(dao.alterar(loja) == true){
                    mensagem = "Loja alterada com sucesso!";
                }else{
                    mensagem = "Erro ao alterar loja!";
                }
                
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("login-loja.jsp").forward(request, response);
            
        }catch(Exception e){
            System.out.println("Erro ao cadastrar LojaCTR " + e.getMessage());
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
