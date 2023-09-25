package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Funcionario extends Cliente {
    private String cargo;
    private int qtdItens;
    private final String filePathUser = "src\\Arquivos\\users.txt";
    private final String filePathClientes = "src\\Arquivos\\Clientes.txt";
    
    public Funcionario() {
    }

    public Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(long matricula, String nome, long cpf, String dataNascimento, int senha, boolean pendencia, String tipoCliente, String cargo) {
        super(matricula, nome, cpf, dataNascimento, senha, pendencia, tipoCliente);
        this.cargo = cargo;
        this.qtdItens = 0;
    } 
     

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
        sb.append(",").append(cargo);
        
        return sb.toString();
    }
    
    public void funcionarioCadastro() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathClientes, true));
            writer.write(this.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do funionario: " + e.getMessage());
        }
    }

    public void funcionarioCadastroSenha() {
        try {
            String usuario = this.matricula + ":" + this.senha + ":" + "funcionario";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathUser, true));
            writer.write(usuario);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever a senha do professor: " + e.getMessage());
        }
    }
}
