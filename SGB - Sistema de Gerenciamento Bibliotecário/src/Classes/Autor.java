/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author bodao
 */
public class Autor {
    private long idAutor;
    private String nomeAutor;
    private String paisAutor; 
    private final String filePath = "src\\Arquivos\\AutoresCadastrados.txt";
        
    public Autor(){}
    public Autor(long idAutor, String nomeAutor, String paisAutor) {
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
        this.paisAutor = paisAutor;
    }

    public void cadastrarAutor(long idAutor, String nomeAutor, String paisAutor) {
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
        this.paisAutor = paisAutor;
    }

    public long getIdAutor() {
        return idAutor;
    }
    
    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getPaisAutor() {
        return paisAutor;
    }

   /* public ArrayList<Livro> mostrarLivrosAutor() {
        return livrosAutor;
    }*/

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setPaisAutor(String paisAutor) {
        this.paisAutor = paisAutor;
    }
    
    @Override
    public String toString() {
        return nomeAutor + "," + paisAutor;
    }  
   
    public long idAutor(){
        int id = 1;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                id++;
            }
            reader.close();
        }catch (IOException e) {
            System.err.println("Erro ao escrever dados do livro: " + e.getMessage());
        }
        
        return id;        
    }     
    
    //Fazer o cadastro do autor
    public void autorCadastro() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(new String(this.toString()));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do autor: " + e.getMessage());
        }

    }
    
    public Autor buscaAutor(long idautor){
        Autor autor = new Autor();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosAutor = linha.split(",");
                long id = Long.parseLong(dadosAutor[0]);
                if(id == idautor){                                
                    //cadastrarAutor(long idAutor, String nomeAutor, String paisAutor)
                    autor.cadastrarAutor(idautor, dadosAutor[1], dadosAutor[2]);
                    return autor;
                }                
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        System.out.println("Artigo não cadastrado!");
        return null;
    }
    
}
