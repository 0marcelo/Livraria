package Livros;

import AConeccaoBanco.ConectarMySQL;
import Autores.autores;
import Editoras.editoras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class livrosDAO {
    
    public void cadastrar(livros liv){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        try {
            stmt = conn.prepareStatement("INSERT INTO livros(id_editora,id_autor,titulo,ano) values (?,?,?,?)");
            stmt.setInt(1, liv.getEditora().getId());
            stmt.setInt(2, liv.getAutor().getId());
            stmt.setString(3, liv.getTitulo());
            stmt.setInt(4, liv.getAno());                                            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Livro Cadastrado com Sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar! Tente novamente mais tarde!");
            Logger.getLogger(livrosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
        
        
    public List<livros> listar(){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<livros> livros = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT id_livro,editoras.nome AS nome_editora, autores.nome AS nome_autor, titulo, ano FROM livros INNER JOIN editoras ON (editoras.id_editora = livros.id_editora) INNER JOIN autores ON (autores.id_autor = livros.id_autor);");
            
            rs = stmt.executeQuery();
        
            while (rs.next()){
                livros liv = new livros();
                                              
                liv.setId_livro(rs.getInt("id_livro"));                
                liv.setTitulo(rs.getString("titulo"));
                liv.setAno(rs.getInt("ano"));
                
                editoras edit = new editoras();
                edit.setNome(rs.getString("nome_editora")); 
                liv.setEditora(edit);
                
                autores aut = new autores();
                aut.setNome(rs.getString("nome_autor"));
                liv.setAutor(aut);
                
                livros.add(liv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(livrosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return livros;
    }
    
    
    public void alterar(livros liv){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("UPDATE livros set id_editora = (?), id_autor = (?), titulo = (?), ano = (?) where id_livro = (?) ");            

            stmt.setInt (1, liv.getEditora().getId());
            stmt.setInt(2, liv.getAutor().getId());
            stmt.setString(3, liv.getTitulo());
            stmt.setInt(4, liv.getAno());            
            stmt.setInt(5, liv.getId_livro());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Livro atualizado com Sucesso!");
                    
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar! Tente novamente mais tarde!");
            Logger.getLogger(livrosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void excluir(livros liv){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("DELETE FROM livros where id_livro = (?) ");          
            stmt.setInt(1, liv.getId_livro());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Livro Excluido com Sucesso!");
                    
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir! Tente novamente mais tarde!");
            Logger.getLogger(livrosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<livros> pesquisar(String texto){
        
        Connection conn = ConectarMySQL.conectabanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<livros> livros = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT id_livro,editoras.nome AS nome_editora, autores.nome AS nome_autor, titulo, ano FROM livros \n" +
                                        "INNER JOIN editoras ON (editoras.id_editora = livros.id_editora) \n" +
                                        "INNER JOIN autores ON (autores.id_autor = livros.id_autor)\n" +
                                        "WHERE titulo like (?)");            
            stmt.setString(1,"%"+texto+"%");
            
            rs = stmt.executeQuery();
        
            while (rs.next()){
                livros liv = new livros();
                                              
                liv.setId_livro(rs.getInt("id_livro")); 
                liv.setTitulo(rs.getString("titulo"));
                liv.setAno(rs.getInt("ano"));
                
                editoras edit = new editoras();
                edit.setNome(rs.getString("nome_editora")); 
                liv.setEditora(edit);
                
                autores aut = new autores();
                aut.setNome(rs.getString("nome_autor"));
                liv.setAutor(aut);
                
                livros.add(liv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(livrosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return livros;
    }
}               
                        