package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Autenticacao {

    private String username = null;
    private char[] password = null;
    private final String filePath = "src\\Arquivos\\users.txt";

    public Autenticacao(String username, char[] password) {
        this.username = username;
        this.password = password;
    }
    
    public Autenticacao(String username) {
        this.username = username;
    }

    //Verificar se usuario e senha coincidem
    public boolean auth() {
        boolean autenticado = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts[0].equals(username) && Arrays.equals(password, parts[1].toCharArray())) {
                    autenticado = true;
                    break;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de usuários: " + e.getMessage());
        }

        return autenticado;
    }
    
    public String tipoAcesso(){
        
        String tipoAcesso = null;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts[0].equals(username)) {
                    tipoAcesso = parts[2];
                    break;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de usuários: " + e.getMessage());
        }
        return tipoAcesso;
    }

}
