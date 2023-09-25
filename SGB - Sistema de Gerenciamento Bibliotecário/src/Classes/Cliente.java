package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Cliente {

    //protected Long id;
    protected long matricula;
    protected String nome, tipoCliente;
    protected long cpf;
    protected String dataNascimento;
    protected int senha;
    protected boolean pendencia;

    private final String filePath = "src\\Arquivos\\Clientes.txt";
    //SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    
    public Cliente() {

    }

    public Cliente(long matricula, String nome, long cpf, String dataNascimento, int senha, boolean pendencia, String tipoCliente) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.pendencia = pendencia;
        this.tipoCliente = tipoCliente;
    }

    public void cadastraCliente(long matricula, String nome, long cpf, String dataNascimento, int senha, boolean pendencia, String tipoCliente) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.pendencia = pendencia;
        this.tipoCliente = tipoCliente;
    }

    public Cliente buscandoCliente(long idCliente) {
               
        //Realiza a leitura do arquivo Clientes.txt linha a linha
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            
            String linha;
            
            while ((linha = br.readLine()) != null) { //Enquanto houver linhas no arquivo, continua lendo
                
                String[] dadosCliente = linha.split(",");
                long id = Long.parseLong(dadosCliente[0]); //Recebe a matricula que esta no primeiro campo do arquivo
              
                if (id == idCliente) {  // Se for aluno, crie um objeto cliente do tipo Aluno.
                    if("aluno".equals(dadosCliente[6])){ // Se o campo 6 da linha for igual a "aluno", crie um objeto CLIENTE do tipo ALUNO e retorne.
                        
                        //Date data = formatter.parse(dadosCliente[3]);
                        
                        // Construtor para aluno é aluno(long matricula, String nome, long cpf, Date dataNascimento, int senha, boolean pendencia, String tipoCliente, String curso)
                        Cliente cliente = new Aluno(id, dadosCliente[1], Long.parseLong(dadosCliente[2]), dadosCliente[3],
                                Integer.parseInt(dadosCliente[4]), Boolean.parseBoolean(dadosCliente[5]), dadosCliente[6], dadosCliente[7]);
                        return cliente;
                    }
                    
                    // Se for professor, crie um objeto cliente do tipo Professor.
                    
                    
                    // Se for funcionario, crie um objeto cliente do tipo Funcionario.
                }// se existir id cliente
                else{ //se nao existir id cliente
                    System.out.println("Id não encontrado"); // Precisa transformar em uma janela de erro. 
                }
            }// enquanto existir linha, repita.
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar os Clientes: " + e.getMessage());
        }
        return null;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public boolean isPendencia() {
        return pendencia;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(matricula);
        sb.append(",").append(nome);
        sb.append(",").append(cpf);
        sb.append(",").append(dataNascimento);
        sb.append(",").append(senha);
        sb.append(",").append(pendencia);
        sb.append(",").append(tipoCliente);
        return sb.toString();
    }

}
