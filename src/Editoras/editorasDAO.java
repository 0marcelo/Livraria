package Editoras;

import AConeccaoBanco.ConectarMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class editorasDAO {
    
    public void cadastrar(editoras edit){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("INSERT INTO editoras(nome) values (?)");
            stmt.setString(1, edit.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editora Cadastrada com Sucesso!");
                    
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar! Tente novamente mais tarde!");
            Logger.getLogger(editorasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<editoras> listar(){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<editoras> editoras = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM editoras");
            
            rs = stmt.executeQuery();
        
            while (rs.next()){
                editoras edit = new editoras();
                edit.setId(rs.getInt("id_editora"));
                edit.setNome(rs.getString("nome"));
           
                editoras.add(edit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(editorasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return editoras;
    }
    
    
    public void alterar(editoras edit){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("UPDATE editoras set nome = (?) where id_editora = (?) ");
            stmt.setString(1, edit.getNome());
            stmt.setInt(2, edit.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editora Atualizada com Sucesso!");
                    
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar! Tente novamente mais tarde!");
            Logger.getLogger(editorasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void excluir(editoras edit){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("DELETE FROM editoras where id_editora = (?) ");          
            stmt.setInt(1, edit.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editora Excluida com Sucesso!");
                    
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir! Tente novamente mais tarde!");
            Logger.getLogger(editorasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<editoras> pesquisar(String texto){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<editoras> editoras = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM editoras where nome like (?)");
            stmt.setString(1,"%"+texto+"%");
            
            rs = stmt.executeQuery();
        
            while (rs.next()){
                editoras edit = new editoras();
                edit.setId(rs.getInt("id_editora"));
                edit.setNome(rs.getString("nome"));
           
                editoras.add(edit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(editorasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return editoras;
    }
}
