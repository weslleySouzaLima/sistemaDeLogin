
package com.mapaprog2.core.dao;

import com.mapaprog2.core.dao.conexao.conexaoJDBC;
import com.mapaprog2.core.entity.Usuario;
import com.sun.jdi.connect.spi.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UsuarioDAO {
    
    public boolean validarLogin(String login, String senha){
        String sqlSelect = "SELECT id, login, senha, email FROM usuario WHERE login = ? AND senha = ?";
        
        PreparedStatement ps;
        try {
            ps = conexaoJDBC.getConexao().prepareStatement(sqlSelect);
            ps.setString(1, login);
            ps.setString(2, senha);
            
            ResultSet resultSet = ps.executeQuery();
            
            return resultSet.next();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao validar login ou senha", e);
        }
    }
    
    public void cadastrar(Usuario usuario){
        
              String sqlInsert = "INSERT INTO USUARIO(NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";
                      
              
        PreparedStatement ps;
         
          
        try {
             ps = conexaoJDBC.getConexao().prepareStatement(sqlInsert);
          ps.setString(1, usuario.getCampoCadNome());
          ps.setString(2, usuario.getCampoCadLogin());
          ps.setString(3, usuario.getCampoCadSenha());
          ps.setString(4, usuario.getCampoCadEmail());
          
          ps.execute();
          ps.close();
          
        }catch(SQLException e){
                  e.printStackTrace();
    }
    
    }
}
