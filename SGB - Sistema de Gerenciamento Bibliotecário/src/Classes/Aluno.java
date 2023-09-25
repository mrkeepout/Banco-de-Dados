package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Aluno extends Cliente {

    private String curso;
    private int qtdItens;

    private final String filePathUser = "src\\Arquivos\\users.txt";
    private final String filePathClientes = "src\\Arquivos\\Clientes.txt";

    public Aluno() {
    }

    public Aluno(long matricula, String nome, long cpf, String dataNascimento, int senha, boolean pendencia, String tipoCliente, String curso) {
        super(matricula, nome, cpf, dataNascimento, senha, pendencia, tipoCliente);
        this.curso = curso;
        this.qtdItens = 0;
    }  

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",").append(curso);

        return sb.toString();
    }

    public void alunoCadastro() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathClientes, true));
            writer.write(this.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do aluno: " + e.getMessage());
        }
    }

    public void alunoCadastroSenha() {
        try {
            
            //System.out.println(usuario);
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathUser, true));
            writer.write(this.matricula + ":" + this.senha + ":" + "aluno");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever a senha do aluno: " + e.getMessage());
        }
    }

}
