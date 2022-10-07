/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartstock.web.controle;

import br.com.smartstock.web.dao.LojaDAO;
import br.com.smartstock.web.modelo.Loja;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cazuu
 */
@WebServlet(name = "LoginLoja", urlPatterns = {"/LoginLoja"})
public class LoginLoja extends HttpServlet {

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
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            LojaDAO dao = new LojaDAO();
        
            String mensagem="";
            
            Loja loja = (Loja) dao.logar(login,senha);
        
        if(loja.getIdloja() != null){
            
            HttpSession sessao = request.getSession(true);
            
            sessao.setAttribute("idloja", loja.getIdloja());
            
            request.setAttribute("mensagem", "Seja bem-vindo!");
            request.getRequestDispatcher("homepage-loja.jsp").forward(request, response);
            
        }else{
            request.setAttribute("mensagem", "Login e/ou senha inválidos");
            request.getRequestDispatcher("login-loja.jsp").forward(request, response);
        }
        
        }catch(Exception e){
            System.out.println("Erro ao logar lojaCTR " +e.getMessage());
            
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
