package Classes;

import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public final class Emprestimo {

    private long idEmprestimo = 1;
    private Date dataRetirada;
    private boolean atraso = false;
    private long matricula, codigoItem;
    private Date dataDevolucao;
    private String tipoItem;
    private final String filePath = "src\\Arquivos\\Emprestimos.txt";
    private final String filePath2 = "src\\Arquivos\\Clientes.txt";

    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Emprestimo() {

    }

    public Emprestimo(long codigoItem, long matricula, String tipoItem) {
        this.idEmprestimo = idEmprestimo();
        this.codigoItem = codigoItem;
        this.matricula = matricula;
        this.dataRetirada = new Date();
        this.dataDevolucao = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000); // 7 dias a partir da data de empréstimo
        this.tipoItem = tipoItem;
    }

    public Emprestimo(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public long getIdEmprestimo() {
        return idEmprestimo;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public boolean isAtraso() {
        return atraso;
    }

    public void setIdEmprestimo(long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public long getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(long codigoItem) {
        this.codigoItem = codigoItem;
    }

    public void salvarEmprestimo() {

        //Inicialização dos objetos
        Acervo acervo = new Acervo();
        Cliente cliente = new Cliente();

        //Executa uma busca pelo cliente no arquivo e retorna como objeto.
        cliente = cliente.buscandoCliente(this.matricula);

        //Le o arquivo para verificar quantos emprestimos o cliente tem e atribui ao objeto.
        int qtdEmprestimos = existeEmprestimo(cliente.getMatricula());
        ((Aluno) cliente).setQtdItens(qtdEmprestimos);

        //Se o item para emprestar for um livro
        if ("livro".equals(this.getTipoItem())) {

            //Faz uma busca no arquivo pelo livro
            Livro item = acervo.buscandoLivro(codigoItem);
            System.out.println(item.isEmprestado());

            //Se o item nao estiver emprestado
            boolean taEmprestado = acervo.livroEmprestado(item.getId());

            if (!taEmprestado) {

                // se o cliente for do tipo aluno, entao possui as restrições dele.
                if ("aluno".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou aluno");

                    int limite = 3;
                    int qtdItens = ((Aluno) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Aluno) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
                if ("professor".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou professor");

                    int limite = 7;
                    int qtdItens = ((Professor) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Professor) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
                if ("funcionario".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou funcionario");

                    int limite = 7;
                    int qtdItens = ((Funcionario) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Funcionario) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item já emprestado", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("artigo".equals(this.getTipoItem())) {

            //Faz uma busca no arquivo pelo livro
            Artigo item = acervo.buscandoArtigo(codigoItem);
            System.out.println(item.isEmprestado());

            //Se o item nao estiver emprestado
            boolean taEmprestado = acervo.artigoEmprestado(item.getId());

            if (!taEmprestado) {

                // se o cliente for do tipo aluno, entao possui as restrições dele.
                if ("aluno".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou aluno");

                    int limite = 3;
                    int qtdItens = ((Aluno) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Aluno) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
                if ("professor".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou professor");

                    int limite = 7;
                    int qtdItens = ((Professor) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Professor) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
                if ("funcionario".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou funcionario");

                    int limite = 7;
                    int qtdItens = ((Funcionario) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Funcionario) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item já emprestado", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        if ("filme".equals(this.getTipoItem())) {

            //Faz uma busca no arquivo pelo livro
            Filme item = acervo.buscandoFilme(codigoItem);
            System.out.println(item.isEmprestado());

            //Se o item nao estiver emprestado
            boolean taEmprestado = acervo.filmeEmprestado(item.getId());

            if (!taEmprestado) {

                // se o cliente for do tipo aluno, entao possui as restrições dele.
                if ("aluno".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou aluno");

                    int limite = 3;
                    int qtdItens = ((Aluno) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Aluno) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
                if ("professor".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou professor");

                    int limite = 7;
                    int qtdItens = ((Professor) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Professor) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
                if ("funcionario".equals(cliente.getTipoCliente())) {

                    System.out.println("Entrou funcionario");

                    int limite = 7;
                    int qtdItens = ((Funcionario) cliente).getQtdItens();

                    //Se o aluno ainda tiver limite
                    if (qtdItens < limite) {
                        emiteEmprestimo(cliente.getMatricula(), item.getId(), tipoItem);
                        ((Funcionario) cliente).setQtdItens(qtdItens++); //Aumenta a qtd de itens no cliente
                        item.setarEmprestimo(item.getId());
                        System.out.println("ID Item: " + item.getId());
                        item.setEmprestado(true); //Seta o item como emprestado.
                        System.out.println("Emprestimo emitido!");
                        JOptionPane.showMessageDialog(null, cliente.getNome() + " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println(cliente.getNome() + " Não possui limite disponível para emprestimo");

                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item já emprestado", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }// Salvar o emprestimo

    public boolean emiteEmprestimo(long matriculaCliente, long idItem, String tipoItem) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(idEmprestimo() + "," + idItem + "," + matriculaCliente + "," + tipoItem);
            writer.newLine();
            writer.close();
            return true;

        } catch (IOException e) {
            System.err.println("Erro ao escrever o arquivo de emprestimos: " + e.getMessage());
            return false;
        }
    }

    public long idEmprestimo() {
        int id = 1;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                id++;
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do livro: " + e.getMessage());
        }

        return id;
    }

    private List<Emprestimo> carregarEmprestimos() {

        List<Emprestimo> emprestimos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                //long id = Long.parseLong(dadosLivro[0]);
                long codigoItem = Long.parseLong(dadosLivro[1]);
                long matricula = Long.parseLong(dadosLivro[2]);
                String tipoItem = dadosLivro[3];

                Emprestimo emprestimo = new Emprestimo(codigoItem, matricula, tipoItem);
                emprestimos.add(emprestimo);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de livros: " + e.getMessage());
        }
        return emprestimos;
    }

    public int existeEmprestimo(long matricula) {
        List<Emprestimo> emprestimos1 = carregarEmprestimos();
        int qtdEmprestimos = 0;
        for (Emprestimo emprestimo : emprestimos1) {
            //System.out.println(emprestimo.getMatricula());
            if ((emprestimo.getMatricula()) == matricula) {
                qtdEmprestimos++;
            }
        }
        return qtdEmprestimos;
    }

    public void devolucao(long codigoItem, String tipoItem) {
        List<String> linhas = new ArrayList<>();
        Acervo acervo = new Acervo();

        //Inicialização dos objetos
        //Cliente cliente = new Cliente();
        //Executa uma busca pelo cliente no arquivo e retorna como objeto.
        //cliente = cliente.buscandoCliente(this.getMatricula());
        if (null != tipoItem) {
            switch (tipoItem) {
                case "livro": {
                    Livro item = acervo.buscandoLivro(codigoItem);
                    item.devolverLivro(codigoItem);
                    JOptionPane.showMessageDialog(null, " emprestimo do " + item.getTitulo() + " devolvido com sucesso, ou não estava emprestado!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
                case "artigo": {
                    Artigo item = acervo.buscandoArtigo(codigoItem);
                    //item.devolverArtigo(codigoItem);
                    JOptionPane.showMessageDialog(null, " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);

                    break;
                }
                case "filme": {
                    Filme item = acervo.buscandoFilme(codigoItem);
                    //item.devolverFilme(codigoItem);
                    JOptionPane.showMessageDialog(null, " emprestimo do " + item.getTitulo() + " efetuado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);

                    break;
                }
                default:
                    break;
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = reader.readLine()) != null) {

                String[] dadosLivro = linha.split(",");
                long id = Long.parseLong(dadosLivro[1]);

                if (id != codigoItem) {
                    linhas.add(linha);
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
    /*
    //Artigo
    //Faz a leitura e retorna o artigo a ser emprestado
    public static Artigo pegarArtigoDoAcervo(String idItem) {
        List<Artigo> acervo = carregarAcervoDeArtigos();
        for (Artigo artigo : acervo) {
            if (Long.toString(artigo.idArtigo()).equals(idItem) && !artigo.isEmprestado()) {
                return artigo;
            }
        }
        return null;
    }
    //Carrega o acervo de artigos em uma lista

    private static List<Artigo> carregarAcervoDeArtigos() {

        List<Artigo> acervo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("acervoArtigo.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                long id = Long.parseLong(dadosLivro[0]);
                String titulo = dadosLivro[1];
                int anoPublicacao = Integer.parseInt(dadosLivro[2]);
                String autorArtigo = dadosLivro[3];
                boolean emprestado = Boolean.parseBoolean(dadosLivro[4]);

                Artigo artigo = new Artigo(id, titulo, anoPublicacao, autorArtigo, emprestado);
                acervo.add(artigo);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de artigos: " + e.getMessage());
        }
        return acervo;
    }

    //Filme
    public static Filme pegarFilmeDoAcervo(String idItem) {
        List<Filme> acervo = carregarAcervoDeFilmes();
        for (Filme filme : acervo) {
            if (Long.toString(filme.getIdFilme()).equals(idItem) && !filme.isEmprestado()) {
                return filme;
            }
        }
        return null;
    }

    private static List<Filme> carregarAcervoDeFilmes() {

        List<Filme> acervo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("acervoFilme.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                long id = Long.parseLong(dadosLivro[0]);
                String titulo = dadosLivro[1];
                String genero = dadosLivro[2];
                int anoLancamento = Integer.parseInt(dadosLivro[3]);
                boolean emprestado = Boolean.parseBoolean(dadosLivro[4]);

                Filme filme = new Filme(id, titulo, genero, anoLancamento, emprestado);
                acervo.add(filme);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        return acervo;
    }
     */
}
