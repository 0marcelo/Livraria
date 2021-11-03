package Autores;

import AConeccaoBanco.ConectarMySQL;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class autoresDAO {
    
    public void cadastrar(autores autor){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("INSERT INTO autores(nome,endereco,numero,bairro,cidade,cpf) values (?,?,?,?,?,?)");
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getEndereco());
            stmt.setInt(3, autor.getNumero());
            stmt.setString(4, autor.getBairro());
            stmt.setString(5, autor.getCidade());
            stmt.setBigDecimal(6,new BigDecimal(autor.getCpf()));                              
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Autor Cadastrado com Sucesso!");
                    
        }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar! Tente novamente mais tarde!"); 
           Logger.getLogger(autoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<autores> Listar(){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<autores> autores = new ArrayList<>();
        
        try{
            stmt = conn.prepareStatement("SELECT * FROM autores");
            
            rs = stmt.executeQuery();
        
            while (rs.next()){
                autores autor = new autores();
                autor.setId(rs.getInt("id_autor"));
                autor.setNome(rs.getString("nome"));
                autor.setEndereco(rs.getString("endereco"));
                autor.setNumero(rs.getInt("numero"));
                autor.setBairro(rs.getString("bairro"));
                autor.setCidade(rs.getString("cidade"));
                autor.setCpf(new BigInteger(rs.getString("cpf")));
                
                autores.add(autor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(autoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return autores;
    }
    
    
    public void alterar(autores autor){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("UPDATE autores set nome = (?), endereco = (?), numero = (?), bairro = (?), cidade = (?), cpf = (?) where id_autor = (?) ");
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getEndereco());
            stmt.setInt(3, autor.getNumero());
            stmt.setString(4, autor.getBairro());
            stmt.setString(5, autor.getCidade());
            stmt.setBigDecimal(6, new BigDecimal (autor.getCpf()));
            stmt.setInt(7, autor.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Autor(a) Atualizado(a) com Sucesso!");
                    
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar! Tente novamente mais tarde!");
            Logger.getLogger(autoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void excluir(autores autor){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("DELETE FROM autores where id_autor = ? ");          
            stmt.setInt(1, autor.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Autor(a) Excluido(a) com Sucesso!");
                    
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir! Tente novamente mais tarde!");
            Logger.getLogger(autoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    public List<autores> pesquisar(String texto){
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<autores> autores = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM autores where nome like (?)");
            stmt.setString(1,"%"+texto+"%");
            
            rs = stmt.executeQuery();
        
            while (rs.next()){
                autores autor = new autores();
                autor.setId(rs.getInt("id_autor"));
                autor.setNome(rs.getString("nome"));
                autor.setEndereco(rs.getString("endereco"));
                autor.setNumero(rs.getInt("numero"));
                autor.setBairro(rs.getString("bairro"));
                autor.setCidade(rs.getString("cidade"));
                autor.setCpf(new BigInteger(rs.getString("cpf")));
           
                autores.add(autor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(autoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return autores;
    }    
    
}

