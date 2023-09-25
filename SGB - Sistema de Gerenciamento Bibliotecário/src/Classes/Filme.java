/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Filme {

    private long id;
    private String titulo, genero;
    private int anoLancamento;
    private boolean emprestado;
    private final String filePath = "src\\Arquivos\\FilmesCadastrados.txt";

    public Filme() {
    }

    public Filme(long idFilme, String titulo, String genero, int anoLancamento, boolean emprestado) {
        this.id = idFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.emprestado = emprestado;
    }

    public void cadastrarFilme(long idFilme, String titulo, String genero, int anoLancamento, boolean emprestado) {
        this.id = idFilme();
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.emprestado = emprestado;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setId(long idFilme) {
        this.id = idFilme;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    

    @Override
    public String toString() {
        return id + "," +titulo + "," + genero + "," + anoLancamento + "," + emprestado;
    }

    public long idFilme() {
        int ident = 1;
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                ident++;
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do livro: " + e.getMessage());
        }

        return ident;
    }

    //Fazer o cadastro filme
    public void filmeCadastro() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(this.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do filme: " + e.getMessage());
        }

    }
    
    public void setarEmprestimo(long idFilme) {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
          String linha;
          while ((linha = reader.readLine()) != null) {

            String[] dadosFilme = linha.split(",");
            long id = Long.parseLong(dadosFilme[0]);

            if(id == idFilme){
                linhas.add(linha.replace("false", "true"));
            }
          }
        } catch (IOException e) {
          System.out.println("Erro ao ler arquivo: " + e.getMessage());
          return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
          for (String linha : linhas) {
            writer.write(linha);
            writer.newLine();
          }
        } catch (IOException e) {
          System.out.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }
    
    public void devolverLivro(long codigoItem) {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
          String linha;
          while ((linha = reader.readLine()) != null) {

            String[] dadosFilme = linha.split(",");
            long id = Long.parseLong(dadosFilme[0]);

            if(id == codigoItem){
                linhas.add(linha.replace("true", "false"));
            }
          }
        } catch (IOException e) {
          System.out.println("Erro ao ler arquivo: " + e.getMessage());
          return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
          for (String linha : linhas) {
            writer.write(linha);
            writer.newLine();
          }
        } catch (IOException e) {
          System.out.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }

}
