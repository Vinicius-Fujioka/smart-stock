/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartstock.web.dao;

import java.util.List;

/**
 *
 * @author cazuu
 */
public interface GenericDAO {
        
    public Boolean cadastrar(Object object) throws Exception;
    
    public List<Object> listar() throws Exception;
    
    public Object carregar(Integer codigo) throws Exception;
    
    public Boolean alterar(Object object) throws Exception;
    
    public Boolean excluir (Integer codigo) throws Exception;
    
}
