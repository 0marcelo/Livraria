package Livros;

import Autores.autores;
import Editoras.editoras;

public class livros {
    private int id_livro;
    private editoras editora;
    private autores autor;
    private String titulo;
    private int ano;

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public editoras getEditora() {
        return editora;
    }

    public void setEditora(editoras editora) {
        this.editora = editora;
    }

    public autores getAutor() {
        return autor;
    }

    public void setAutor(autores autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
