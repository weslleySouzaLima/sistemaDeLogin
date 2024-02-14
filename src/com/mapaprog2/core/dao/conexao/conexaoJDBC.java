/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mapaprog2.core.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author weslley
 */
public class conexaoJDBC {
    
    private static final String url = "jdbc:mysql://localhost:3306/mapa";
    private static final String username = "root";
    private static final String password = "root1234";
    
    public static Connection conn;
    
    public static Connection getConexao(){
        try {
            
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "perdemos a conexão com o banco de dados");
            return null;
        }
    }
}