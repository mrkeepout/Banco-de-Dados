package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Professor extends Cliente{
    //private String vinculacao;
    private String formacao;
    private int qtdItens;
    private final String filePathUser = "src\\Arquivos\\users.txt";
    private final String filePathClientes = "src\\Arquivos\\Clientes.txt";
    
    public Professor() {
    }

    public Professor(long matricula, String nome, long cpf, String dataNascimento, int senha, boolean pendencia, String tipoCliente, String formacao) {
        super(matricula, nome, cpf, dataNascimento, senha, pendencia, tipoCliente);
        this.formacao = formacao;
        this.qtdItens = 0;
    }
       
   
    public String getFormacao() {
        return formacao;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

   
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",").append(formacao);
        
        return sb.toString();
    }

    public void professorCadastro() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathClientes, true));
            writer.write(this.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do professor: " + e.getMessage());
        }
    }
    
    public void professorCadastroSenha() {
        try {
            String usuario = this.matricula + ":" + this.senha + ":" + "professor";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathUser, true));
            writer.write(usuario);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever a senha do professor: " + e.getMessage());
        }
    }
    
}
