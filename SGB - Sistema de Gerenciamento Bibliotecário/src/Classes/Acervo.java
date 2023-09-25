package Classes;

import java.io.BufferedReader;
import java.io.IOException;

public class Acervo {

    private final String filePath = "src\\Arquivos\\livrosCadastrados.txt";
    private final String filePathArtigo = "src\\Arquivos\\ArtigosCadastrados.txt";
    private final String filePathFilme = "src\\Arquivos\\FilmesCadastrados.txt";

    public Acervo() {
    }

    public Livro buscandoLivro(long idLivro) {
        Livro livro = new Livro();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                long id = Long.parseLong(dadosLivro[0]);
                if (id == idLivro) {
                    livro.cadastrarLivro(id, dadosLivro[1], dadosLivro[2], Integer.parseInt(dadosLivro[3]), Integer.parseInt(dadosLivro[4]), Integer.parseInt(dadosLivro[5]), dadosLivro[6], dadosLivro[7], Boolean.parseBoolean(dadosLivro[8]));
                    System.out.println("Livro encontrado!");
                    return livro;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de livros: " + e.getMessage());
        }
        System.out.println("Livro não cadastrado!");
        return null;
    }

    public int qtdLivro(String tituloLivro) {
        String linha;
        int qtdLivro = 0;
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                if (tituloLivro.equals(dadosLivro[1])) {
                    qtdLivro++;
                }
            }
            return qtdLivro;
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        return qtdLivro;
    }

    public boolean livroEmprestado(long codigoItem) {
        String linha;

        boolean statusLivro = false;
        String codItem = Long.toString(codigoItem);
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                if (dadosLivro[0].equals(codItem)) {
                    statusLivro = Boolean.parseBoolean(dadosLivro[6]);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        return statusLivro;
    }

    public boolean artigoEmprestado(long codigoItem) {
        String linha;

        boolean statusItem = false;
        String codItem = Long.toString(codigoItem);
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePathArtigo))) {
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                if (dadosLivro[0].equals(codItem)) {
                    statusItem = Boolean.parseBoolean(dadosLivro[6]);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        return statusItem;
    }

    public boolean filmeEmprestado(long codigoItem) {
        String linha;

        boolean statusItem = false;
        String codItem = Long.toString(codigoItem);
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePathFilme))) {
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                if (dadosLivro[0].equals(codItem)) {
                    statusItem = Boolean.parseBoolean(dadosLivro[6]);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        return statusItem;
    }

    public Filme buscandoFilme(long idFilme) {
        Filme filme = new Filme();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePathFilme))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosFilme = linha.split(",");
                long id = Long.parseLong(dadosFilme[0]);
                if (id == idFilme) {
                    filme.cadastrarFilme(id, dadosFilme[1], dadosFilme[2], Integer.parseInt(dadosFilme[3]), Boolean.parseBoolean(dadosFilme[4]));
                    return filme;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        System.out.println("Filme não cadastrado!");
        return null;
    }

    public int qtdFilme(String tituloFilme) {
        String linha;
        int qtdFilme = 0;
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePathFilme))) {
            while ((linha = br.readLine()) != null) {
                String[] dadosFilme = linha.split(",");
                if (tituloFilme.equals(dadosFilme[1])) {
                    qtdFilme++;
                }
            }
            return qtdFilme;
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        return qtdFilme;
    }

    public Artigo buscandoArtigo(long idArtigo) {
        Artigo artigo = new Artigo();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePathArtigo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosArtigo = linha.split(",");
                long id = Long.parseLong(dadosArtigo[0]);
                if (id == idArtigo) {
                    //Artigo(long idArtigo,String titulo, int anoPublicacao, String autorArtigo, boolean emprestado)
                    artigo.cadastrarArtigo(idArtigo, dadosArtigo[1], Integer.parseInt(dadosArtigo[2]), dadosArtigo[3], Boolean.parseBoolean(dadosArtigo[4]));
                    return artigo;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        System.out.println("Artigo não cadastrado!");
        return null;
    }

    public int qtdArtigo(String tituloArtigo) {
        String linha;
        int qtdArtigo = 0;
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePathArtigo))) {
            while ((linha = br.readLine()) != null) {
                String[] dadosArtigo = linha.split(",");
                if (tituloArtigo.equals(dadosArtigo[1])) {
                    qtdArtigo++;
                }
            }
            return qtdArtigo;
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        return qtdArtigo;
    }

}
