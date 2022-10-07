/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartstock.web.controle;

import br.com.smartstock.web.dao.ClienteDAO;
import br.com.smartstock.web.dao.GenericDAO;
import br.com.smartstock.web.modelo.Cliente;
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
@WebServlet(name = "CadastrarCliente", urlPatterns = {"/CadastrarCliente"})
public class CadastrarCliente extends HttpServlet {

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
            String idcliente = request.getParameter("idcliente");
            String cpf = request.getParameter("cpf");
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String endereco = request.getParameter("endereco");
            String telefone = request.getParameter("telefone");
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
                    
            Cliente cliente = new Cliente();
            cliente.setCpf(cpf);
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setEndereco(endereco);
            cliente.setTelefone(telefone);
            cliente.setLogin(login);
            cliente.setSenha(senha);
            
            GenericDAO dao = new ClienteDAO();
            
            String mensagem = "";
            
            if(idcliente.equals("")){
                
                if(dao.cadastrar(cliente)){
                    mensagem="Cliente cadastrado com sucesso!";
                }else{
                    mensagem="Erro ao cadastrar cliente!";
                }
            
            }else{
                
                cliente.setIdcliente(Integer.parseInt(idcliente));
                
                if(dao.alterar(cliente) == true){
                    mensagem = "Cliente alterado com sucesso!";
                }else{
                    mensagem = "Erro ao alterar cliente!";
                }
                
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("login-cliente.jsp").forward(request, response);
            
        }catch(Exception e){
            System.out.println("Erro ao cadastrar ClienteCTR " + e.getMessage());
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
