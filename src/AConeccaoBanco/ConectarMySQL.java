package AConeccaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarMySQL {
    
    public static Connection conectabanco(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return
                DriverManager.getConnection("jdbc:mysql://localhost/db_livraria1?" + "user=root&password=root");
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao conectar no Banco de Dados!",ex);
        }  
        
    }
    
}
