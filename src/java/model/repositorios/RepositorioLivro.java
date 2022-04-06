package model.repositorios;

import java.util.ArrayList;
import java.util.List;
import model.negocios.Livro;

public class RepositorioLivro {

    private static int ultimoCodigo = 1;
    
    private static List<Livro> livros = new ArrayList<>();
    
    public static void inserir(Livro l){
        l.setId(ultimoCodigo++);
        livros.add(l);
    }
    
    public static Livro lerLivro(int id){
        for(Livro l : livros){
            if(l.getId() == id){
                return l;
            }
        }
        return null;
    }
    
    public static void alterar(Livro l){
        for(Livro livro: livros){
            if(livro.getId() == l.getId()){
                livro.setNomeLivro(l.getNomeLivro());
                livro.setAutor(l.getAutor());
                livro.setEdicao(l.getEdicao());
                livro.setEditora(l.getEditora());
                livro.setAnoPublicacao(l.getAnoPublicacao());
                livro.setAssunto(l.getAssunto());
            }
            return;
        }
    }
    
    public static void delete(Livro l){
        Livro lAux = null;
        for(Livro livro: livros){
            if(livro.getId() == l.getId()){
                lAux = livro;
                break;
            }
        }
        livros.remove(lAux);
    }
    
    public static List<Livro> lerTudo(){
        return livros;
    }
    
}
