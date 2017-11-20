package dao;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection getConnection() {  
        try {  
 
            String url = "";  
            String usuario = "";  
            String senha = "";  
  
            return DriverManager.getConnection(url, usuario, senha);    
  
        } catch (SQLException e) {  
        	throw new RuntimeException(e); 
        }  
    }  
}