package telas;

import Classes.Acervo;
import Classes.Artigo;
import Classes.Emprestimo;
import Classes.Filme;
import Classes.Livro;
import Classes.Cliente;

/**
 *
 * @author gabri
 */
public class telaEmprestimo extends javax.swing.JFrame {

    public telaEmprestimo(String nivelAcesso) {
        initComponents();
        
        menuEmprestimo.setVisible(false);
        
        if(nivelAcesso.equals("funcionario")){     
            menuEmprestimo.setVisible(true);
        }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTipoAcervo = new javax.swing.ButtonGroup();
        pnlGeral = new javax.swing.JPanel();
        pnlEmprestimo = new javax.swing.JPanel();
        rbLivro = new javax.swing.JRadioButton();
        rbArtigo = new javax.swing.JRadioButton();
        rbFilme = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        pnlBack = new javax.swing.JPanel();
        pnlLivro = new javax.swing.JPanel();
        lblCodigoLivro = new javax.swing.JLabel();
        txtCodigoLivro = new javax.swing.JTextField();
        lblTituloLivro = new javax.swing.JLabel();
        txtTituloLivro = new javax.swing.JTextField();
        lblGeneroLivro = new javax.swing.JLabel();
        txtGeneroLivro = new javax.swing.JTextField();
        lblPaginasLivro = new javax.swing.JLabel();
        txtPaginasLivro = new javax.swing.JTextField();
        lblEdicaoLivro = new javax.swing.JLabel();
        txtEdicaoLivro = new javax.swing.JTextField();
        lblAnoLivro = new javax.swing.JLabel();
        txtAnoLivro = new javax.swing.JTextField();
        lblQtdLivro = new javax.swing.JLabel();
        txtQtdLivro = new javax.swing.JTextField();
        btnPesquisarLivro = new javax.swing.JButton();
        btnLimparLivro = new javax.swing.JButton();
        pnlArtigo = new javax.swing.JPanel();
        lblCodigoArtigo = new javax.swing.JLabel();
        txtCodigoArtigo = new javax.swing.JTextField();
        lblTituloArtigo = new javax.swing.JLabel();
        txtTituloArtigo = new javax.swing.JTextField();
        lblAnoArtigo = new javax.swing.JLabel();
        txtAnoArtigo = new javax.swing.JTextField();
        lblQtdArtigo = new javax.swing.JLabel();
        txtQtdArtigo = new javax.swing.JTextField();
        btnPesquisarArtigo = new javax.swing.JButton();
        btnLimparArtigo = new javax.swing.JButton();
        pnlFilme = new javax.swing.JPanel();
        lblCodigoFilme = new javax.swing.JLabel();
        txtCodigoFilme = new javax.swing.JTextField();
        lblTituloFilme = new javax.swing.JLabel();
        txtTituloFilme = new javax.swing.JTextField();
        lblGeneroFilme = new javax.swing.JLabel();
        txtGeneroFilme = new javax.swing.JTextField();
        lblAnoFilme = new javax.swing.JLabel();
        txtAnoFilme = new javax.swing.JTextField();
        lblQtdFilme = new javax.swing.JLabel();
        txtQtdFilme = new javax.swing.JTextField();
        btnPesquisarFilme = new javax.swing.JButton();
        btnLimparFilme = new javax.swing.JButton();
        pnlCliente = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        txtItensReservados = new javax.swing.JTextField();
        txtQtdPendencias = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmprestimosRestantes = new javax.swing.JTextField();
        btnConfirmarEmprestimo = new javax.swing.JButton();
        btnDevolucaoItem = new javax.swing.JButton();
        btnPagMulta = new javax.swing.JButton();
        pnlBemVindo = new javax.swing.JPanel();
        lblBemVindo = new javax.swing.JLabel();
        lblLogomarca = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlPesquisaCliente = new javax.swing.JPanel();
        txtMat = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        pnlDadosCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        txtPendencia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        menuEmprestimo = new javax.swing.JMenuBar();
        Acervo = new javax.swing.JMenu();
        Cadastrar = new javax.swing.JMenu();
        mnCadastrarCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pnlGeral.setBackground(new java.awt.Color(248, 248, 248));

        pnlEmprestimo.setBackground(new java.awt.Color(249, 249, 249));
        pnlEmprestimo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Empréstimo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlEmprestimo.setToolTipText("");

        rbLivro.setBackground(new java.awt.Color(248, 248, 248));
        btnTipoAcervo.add(rbLivro);
        rbLivro.setSelected(true);
        rbLivro.setText("Livro");
        rbLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLivroActionPerformed(evt);
            }
        });

        rbArtigo.setBackground(new java.awt.Color(248, 248, 248));
        btnTipoAcervo.add(rbArtigo);
        rbArtigo.setText("Artigo");
        rbArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbArtigoActionPerformed(evt);
            }
        });

        rbFilme.setBackground(new java.awt.Color(248, 248, 248));
        btnTipoAcervo.add(rbFilme);
        rbFilme.setText("Filme");
        rbFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFilmeActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipo.setText("Selecione o tipo do empréstimo/devolução:");

        pnlBack.setLayout(new java.awt.CardLayout());

        pnlLivro.setBackground(new java.awt.Color(248, 248, 248));
        pnlLivro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Livro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N

        lblCodigoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigoLivro.setText("Código do item:");

        txtCodigoLivro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoLivroFocusGained(evt);
            }
        });
        txtCodigoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLivroActionPerformed(evt);
            }
        });

        lblTituloLivro.setText("Título:");

        txtTituloLivro.setEditable(false);
        txtTituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLivroActionPerformed(evt);
            }
        });

        lblGeneroLivro.setText("Gênero:");

        txtGeneroLivro.setEditable(false);

        lblPaginasLivro.setText("Nº. de páginas:");

        txtPaginasLivro.setEditable(false);

        lblEdicaoLivro.setText("Edição:");

        txtEdicaoLivro.setEditable(false);

        lblAnoLivro.setText("Ano de Publicação:");

        txtAnoLivro.setEditable(false);

        lblQtdLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtdLivro.setText("Qtd. disponível:");

        txtQtdLivro.setEditable(false);
        txtQtdLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdLivroActionPerformed(evt);
            }
        });

        btnPesquisarLivro.setText("Pesquisar");
        btnPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLivroActionPerformed(evt);
            }
        });

        btnLimparLivro.setText("Limpar");
        btnLimparLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLivroLayout = new javax.swing.GroupLayout(pnlLivro);
        pnlLivro.setLayout(pnlLivroLayout);
        pnlLivroLayout.setHorizontalGroup(
            pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivroLayout.createSequentialGroup()
                        .addComponent(lblPaginasLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPaginasLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLivroLayout.createSequentialGroup()
                        .addComponent(lblEdicaoLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEdicaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLivroLayout.createSequentialGroup()
                        .addComponent(lblAnoLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(txtAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLivroLayout.createSequentialGroup()
                        .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoLivro)
                            .addComponent(lblGeneroLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLivroLayout.createSequentialGroup()
                        .addComponent(lblTituloLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLivroLayout.createSequentialGroup()
                        .addComponent(lblQtdLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQtdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLivroLayout.createSequentialGroup()
                        .addComponent(btnPesquisarLivro)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparLivro)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLivroLayout.setVerticalGroup(
            pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoLivro)
                    .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloLivro))
                .addGap(12, 12, 12)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeneroLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaginasLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaginasLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdicaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdicaoLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnoLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtdLivro))
                .addGap(18, 18, 18)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarLivro)
                    .addComponent(btnLimparLivro))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlBack.add(pnlLivro, "card2");

        pnlArtigo.setBackground(new java.awt.Color(248, 248, 248));
        pnlArtigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Artigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N

        lblCodigoArtigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigoArtigo.setText("Código do item:");

        lblTituloArtigo.setText("Título:");

        txtTituloArtigo.setEditable(false);

        lblAnoArtigo.setText("Ano de Publicação:");

        txtAnoArtigo.setEditable(false);

        lblQtdArtigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtdArtigo.setText("Qtd. disponível:");

        txtQtdArtigo.setEditable(false);
        txtQtdArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdArtigoActionPerformed(evt);
            }
        });

        btnPesquisarArtigo.setText("Pesquisar");
        btnPesquisarArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarArtigoActionPerformed(evt);
            }
        });

        btnLimparArtigo.setText("Limpar");
        btnLimparArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparArtigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlArtigoLayout = new javax.swing.GroupLayout(pnlArtigo);
        pnlArtigo.setLayout(pnlArtigoLayout);
        pnlArtigoLayout.setHorizontalGroup(
            pnlArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlArtigoLayout.createSequentialGroup()
                        .addComponent(lblCodigoArtigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodigoArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlArtigoLayout.createSequentialGroup()
                        .addComponent(lblTituloArtigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlArtigoLayout.createSequentialGroup()
                        .addComponent(lblQtdArtigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQtdArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlArtigoLayout.createSequentialGroup()
                        .addComponent(lblAnoArtigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(txtAnoArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlArtigoLayout.createSequentialGroup()
                        .addComponent(btnPesquisarArtigo)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparArtigo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlArtigoLayout.setVerticalGroup(
            pnlArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoArtigo)
                    .addComponent(txtCodigoArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloArtigo))
                .addGap(9, 9, 9)
                .addGroup(pnlArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnoArtigo)
                    .addComponent(txtAnoArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtdArtigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(pnlArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarArtigo)
                    .addComponent(btnLimparArtigo))
                .addGap(20, 20, 20))
        );

        pnlBack.add(pnlArtigo, "card3");

        pnlFilme.setBackground(new java.awt.Color(248, 248, 248));
        pnlFilme.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N

        lblCodigoFilme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigoFilme.setText("Código do item:");

        lblTituloFilme.setText("Título:");

        txtTituloFilme.setEditable(false);

        lblGeneroFilme.setText("Gênero:");

        txtGeneroFilme.setEditable(false);
        txtGeneroFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroFilmeActionPerformed(evt);
            }
        });

        lblAnoFilme.setText("Ano de Publicação:");

        txtAnoFilme.setEditable(false);

        lblQtdFilme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtdFilme.setText("Qtd. disponível:");

        txtQtdFilme.setEditable(false);

        btnPesquisarFilme.setText("Pesquisar");
        btnPesquisarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFilmeActionPerformed(evt);
            }
        });

        btnLimparFilme.setText("Limpar");
        btnLimparFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFilmeLayout = new javax.swing.GroupLayout(pnlFilme);
        pnlFilme.setLayout(pnlFilmeLayout);
        pnlFilmeLayout.setHorizontalGroup(
            pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFilmeLayout.createSequentialGroup()
                        .addComponent(lblCodigoFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(txtCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFilmeLayout.createSequentialGroup()
                        .addComponent(lblTituloFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFilmeLayout.createSequentialGroup()
                        .addComponent(lblQtdFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQtdFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFilmeLayout.createSequentialGroup()
                        .addComponent(lblGeneroFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGeneroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFilmeLayout.createSequentialGroup()
                        .addComponent(lblAnoFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAnoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFilmeLayout.createSequentialGroup()
                        .addComponent(btnPesquisarFilme)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparFilme)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFilmeLayout.setVerticalGroup(
            pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFilmeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoFilme)
                    .addComponent(txtCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloFilme))
                .addGap(9, 9, 9)
                .addGroup(pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeneroFilme)
                    .addComponent(txtGeneroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnoFilme)
                    .addComponent(txtAnoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtdFilme))
                .addGap(18, 18, 18)
                .addGroup(pnlFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarFilme)
                    .addComponent(btnLimparFilme))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlBack.add(pnlFilme, "card4");

        javax.swing.GroupLayout pnlEmprestimoLayout = new javax.swing.GroupLayout(pnlEmprestimo);
        pnlEmprestimo.setLayout(pnlEmprestimoLayout);
        pnlEmprestimoLayout.setHorizontalGroup(
            pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                .addGroup(pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                                .addComponent(rbLivro)
                                .addGap(18, 18, 18)
                                .addComponent(rbArtigo)
                                .addGap(18, 18, 18)
                                .addComponent(rbFilme))))
                    .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEmprestimoLayout.setVerticalGroup(
            pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLivro)
                    .addComponent(rbArtigo)
                    .addComponent(rbFilme))
                .addGap(31, 31, 31)
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCliente.setBackground(new java.awt.Color(249, 249, 249));
        pnlCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(248, 248, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "O que deseja fazer?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(248, 248, 248));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Total de itens reservados:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Total de atrasos:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Total de itens em pendência:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Estatísticas do Cliente");

        jTextField13.setEditable(false);

        txtItensReservados.setEditable(false);
        txtItensReservados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItensReservadosActionPerformed(evt);
            }
        });

        txtQtdPendencias.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Valor da Multa:");

        jTextField16.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Total de empréstimos restantes:");

        txtEmprestimosRestantes.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(29, 29, 29)
                                .addComponent(txtEmprestimosRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtQtdPendencias, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtItensReservados))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtItensReservados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmprestimosRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdPendencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnConfirmarEmprestimo.setBackground(new java.awt.Color(249, 255, 248));
        btnConfirmarEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmarEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/check_circle_FILL0_wght400_GRAD200_opsz24.png"))); // NOI18N
        btnConfirmarEmprestimo.setText("Empréstimo");
        btnConfirmarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarEmprestimoActionPerformed(evt);
            }
        });

        btnDevolucaoItem.setBackground(new java.awt.Color(255, 249, 225));
        btnDevolucaoItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDevolucaoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/assignment_return_FILL0_wght400_GRAD200_opsz24.png"))); // NOI18N
        btnDevolucaoItem.setText("Devolução");
        btnDevolucaoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoItemActionPerformed(evt);
            }
        });

        btnPagMulta.setBackground(new java.awt.Color(255, 229, 229));
        btnPagMulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagMulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/paid_FILL0_wght400_GRAD200_opsz24.png"))); // NOI18N
        btnPagMulta.setText("Pagamento de Multa");
        btnPagMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagMultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnConfirmarEmprestimo)
                .addGap(18, 18, 18)
                .addComponent(btnDevolucaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPagMulta)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDevolucaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBemVindo.setBackground(new java.awt.Color(248, 248, 248));

        lblBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBemVindo.setText("Bem-vindo(a)!");
        lblBemVindo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lblBemVindoComponentShown(evt);
            }
        });
        lblBemVindo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblBemVindoPropertyChange(evt);
            }
        });

        lblLogomarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLogomarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        javax.swing.GroupLayout pnlBemVindoLayout = new javax.swing.GroupLayout(pnlBemVindo);
        pnlBemVindo.setLayout(pnlBemVindoLayout);
        pnlBemVindoLayout.setHorizontalGroup(
            pnlBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBemVindo)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pnlBemVindoLayout.setVerticalGroup(
            pnlBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBemVindoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBemVindoLayout.createSequentialGroup()
                        .addComponent(lblLogomarca)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlPesquisaCliente.setBackground(new java.awt.Color(248, 248, 248));

        txtMat.setText("Digite a matricula do Cliente");
        txtMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMatMouseExited(evt);
            }
        });
        txtMat.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtMatInputMethodTextChanged(evt);
            }
        });
        txtMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPesquisaClienteLayout = new javax.swing.GroupLayout(pnlPesquisaCliente);
        pnlPesquisaCliente.setLayout(pnlPesquisaClienteLayout);
        pnlPesquisaClienteLayout.setHorizontalGroup(
            pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        pnlPesquisaClienteLayout.setVerticalGroup(
            pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosCliente.setBackground(new java.awt.Color(248, 248, 248));

        jLabel6.setText("ID Cliente:");

        jLabel7.setText("Nome:");

        txtIdCliente.setEditable(false);
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        txtNomeCliente.setEditable(false);
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        txtPendencia.setEditable(false);
        txtPendencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPendenciaActionPerformed(evt);
            }
        });

        jLabel15.setText("Pendências:");

        javax.swing.GroupLayout pnlDadosClienteLayout = new javax.swing.GroupLayout(pnlDadosCliente);
        pnlDadosCliente.setLayout(pnlDadosClienteLayout);
        pnlDadosClienteLayout.setHorizontalGroup(
            pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtPendencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlDadosClienteLayout.setVerticalGroup(
            pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPendencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnlPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addComponent(pnlEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addComponent(pnlBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGeralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuEmprestimo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                menuEmprestimoComponentHidden(evt);
            }
        });

        Acervo.setText("Acervo");
        Acervo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcervoMouseClicked(evt);
            }
        });
        Acervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcervoActionPerformed(evt);
            }
        });
        menuEmprestimo.add(Acervo);

        Cadastrar.setText("Cadastrar");

        mnCadastrarCliente.setText("Cadastrar Cliente");
        mnCadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnCadastrarClienteMouseClicked(evt);
            }
        });
        mnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarClienteActionPerformed(evt);
            }
        });
        Cadastrar.add(mnCadastrarCliente);

        menuEmprestimo.add(Cadastrar);

        setJMenuBar(menuEmprestimo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed

    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatMouseClicked
        // TODO add your handling code here:
        txtMat.setText("");
    }//GEN-LAST:event_txtMatMouseClicked

    private void txtMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatActionPerformed

    private void btnDevolucaoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoItemActionPerformed
        // TODO add your handling code here:
        long codigoItem = 0;
        String tipoItem = null;

        if (rbLivro.isSelected()) {
            codigoItem = Long.parseLong(txtCodigoLivro.getText());
            tipoItem = "livro";
        } else if (rbArtigo.isSelected()) {
            codigoItem = Long.parseLong(txtCodigoArtigo.getText());
            tipoItem = "artigo";
        } else if (rbFilme.isSelected()) {
            codigoItem = Long.parseLong(txtCodigoFilme.getText());
            tipoItem = "filme";
        }

        Emprestimo emprestimo = new Emprestimo();
        Acervo acervo = new Acervo();
        
        emprestimo.devolucao(codigoItem,tipoItem);
           

    }//GEN-LAST:event_btnDevolucaoItemActionPerformed

    private void txtPendenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPendenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPendenciaActionPerformed

    private void btnConfirmarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarEmprestimoActionPerformed
        // TODO add your handling code here:

        long codigoItem = 0;
        String tipoItem = null;

        if (rbLivro.isSelected()) {
            codigoItem = Long.parseLong(txtCodigoLivro.getText());
            tipoItem = "livro";
        } else if (rbArtigo.isSelected()) {
            codigoItem = Long.parseLong(txtCodigoArtigo.getText());
            tipoItem = "artigo";
        } else if (rbFilme.isSelected()) {
            codigoItem = Long.parseLong(txtCodigoFilme.getText());
            tipoItem = "filme";
        }

        long idCliente = Long.parseLong(txtIdCliente.getText());

        Emprestimo emprestimo = new Emprestimo(codigoItem, idCliente, tipoItem);

        emprestimo.salvarEmprestimo();

    }//GEN-LAST:event_btnConfirmarEmprestimoActionPerformed

    private void btnPagMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagMultaActionPerformed

    private void rbLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLivroActionPerformed
        // TODO add your handling code here:
        pnlLivro.setVisible(true);
        pnlArtigo.setVisible(false);
        pnlFilme.setVisible(false);
    }//GEN-LAST:event_rbLivroActionPerformed


    private void lblBemVindoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblBemVindoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBemVindoPropertyChange

    private void txtGeneroFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroFilmeActionPerformed

    private void btnPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLivroActionPerformed
        long id = Long.parseLong(txtCodigoLivro.getText());

        Acervo acervo = new Acervo();

        if (txtCodigoLivro != null) {

            Livro item = acervo.buscandoLivro(id);

            if (item != null) {
                long qtd = acervo.qtdLivro(item.getTitulo());
                acervo.qtdLivro(item.getTitulo());
                txtTituloLivro.setText(item.getTitulo());
                txtGeneroLivro.setText(item.getGenero());
                txtPaginasLivro.setText(Integer.toString(item.getQuantidadePaginas()));
                txtEdicaoLivro.setText(Integer.toString(item.getEdicao()));
                txtAnoLivro.setText(Integer.toString(item.getAnoPublicacao()));
                txtQtdLivro.setText(Long.toString(qtd));
            }

        }


    }//GEN-LAST:event_btnPesquisarLivroActionPerformed

    private void txtCodigoLivroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoLivroFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodigoLivroFocusGained

    private void btnLimparLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparLivroActionPerformed
        // TODO add your handling code here:
        txtCodigoLivro.setText("");
        txtTituloLivro.setText("");
        txtGeneroLivro.setText("");
        txtPaginasLivro.setText("");
        txtEdicaoLivro.setText("");
        txtAnoLivro.setText("");
        txtQtdLivro.setText("");

    }//GEN-LAST:event_btnLimparLivroActionPerformed

    private void txtCodigoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoLivroActionPerformed

    private void txtTituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloLivroActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        long matricula = Long.parseLong(txtMat.getText());

        Cliente cliente = new Cliente();
        cliente = cliente.buscandoCliente(matricula);
        Emprestimo emprestimo = new Emprestimo();
        
        long qtdItens = emprestimo.existeEmprestimo(cliente.getMatricula());
        String tipoCliente = cliente.getTipoCliente();
       
        txtIdCliente.setText(Long.toString(cliente.getMatricula()));
        txtNomeCliente.setText(cliente.getNome());
        txtPendencia.setText(Boolean.toString(cliente.isPendencia()));
        txtItensReservados.setText(Long.toString(qtdItens));


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtMatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatMouseEntered
        // TODO add your handling code here:,

    }//GEN-LAST:event_txtMatMouseEntered

    private void txtMatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMatMouseExited

    private void txtMatInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtMatInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatInputMethodTextChanged

    private void txtQtdLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdLivroActionPerformed

    private void rbArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbArtigoActionPerformed
        // TODO add your handling code here:
        pnlLivro.setVisible(false);
        pnlArtigo.setVisible(true);
        pnlFilme.setVisible(false);
    }//GEN-LAST:event_rbArtigoActionPerformed

    private void rbFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFilmeActionPerformed
        // TODO add your handling code here:
        pnlLivro.setVisible(false);
        pnlArtigo.setVisible(false);
        pnlFilme.setVisible(true);
    }//GEN-LAST:event_rbFilmeActionPerformed

    private void lblBemVindoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblBemVindoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBemVindoComponentShown

    private void txtItensReservadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItensReservadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItensReservadosActionPerformed

    private void btnPesquisarArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarArtigoActionPerformed
        // TODO add your handling code here:
        long id = Long.parseLong(txtCodigoArtigo.getText());

        Acervo acervo = new Acervo();

        if (txtCodigoArtigo.getText() != null) {

            Artigo item = acervo.buscandoArtigo(id);
            if (item != null) {
                
                long qtd = acervo.qtdArtigo(item.getTitulo());
                txtTituloArtigo.setText(item.getTitulo());
                txtAnoArtigo.setText(Integer.toString(item.getAnoPublicacao()));
                txtQtdArtigo.setText(Long.toString(qtd));
            }
        }
    }//GEN-LAST:event_btnPesquisarArtigoActionPerformed

    private void btnLimparArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparArtigoActionPerformed
        // TODO add your handling code here:
        txtCodigoArtigo.setText("");
        txtTituloArtigo.setText("");
        txtAnoArtigo.setText("");
        txtQtdArtigo.setText("");
        
    }//GEN-LAST:event_btnLimparArtigoActionPerformed

    private void btnPesquisarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFilmeActionPerformed
        // TODO add your handling code here:
        long id = Long.parseLong(txtCodigoFilme.getText());

        Acervo acervo = new Acervo();

        if (txtCodigoFilme.getText() != null) {
            
            Filme item = acervo.buscandoFilme(id);
            
            if (item != null) {
                
                long qtd = acervo.qtdFilme(item.getTitulo());
                txtTituloFilme.setText(item.getTitulo());
                txtAnoFilme.setText(Integer.toString(item.getAnoLancamento()));
                txtGeneroFilme.setText(item.getGenero());
                txtQtdFilme.setText(Long.toString(qtd));
            }
        }     
    }//GEN-LAST:event_btnPesquisarFilmeActionPerformed

    private void btnLimparFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparFilmeActionPerformed

    private void txtQtdArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdArtigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdArtigoActionPerformed

    private void AcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcervoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AcervoActionPerformed

    private void menuEmprestimoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_menuEmprestimoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEmprestimoComponentHidden

    private void AcervoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcervoMouseClicked
        // TODO add your handling code here:
        new telaAcervo().setVisible(true);
    }//GEN-LAST:event_AcervoMouseClicked

    private void mnCadastrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnCadastrarClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnCadastrarClienteMouseClicked

    private void mnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarClienteActionPerformed
        // TODO add your handling code here:
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_mnCadastrarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acervo;
    private javax.swing.JMenu Cadastrar;
    private javax.swing.JButton btnConfirmarEmprestimo;
    private javax.swing.JButton btnDevolucaoItem;
    private javax.swing.JButton btnLimparArtigo;
    private javax.swing.JButton btnLimparFilme;
    private javax.swing.JButton btnLimparLivro;
    private javax.swing.JButton btnPagMulta;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarArtigo;
    private javax.swing.JButton btnPesquisarFilme;
    private javax.swing.JButton btnPesquisarLivro;
    private javax.swing.ButtonGroup btnTipoAcervo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JLabel lblAnoArtigo;
    private javax.swing.JLabel lblAnoFilme;
    private javax.swing.JLabel lblAnoLivro;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblCodigoArtigo;
    private javax.swing.JLabel lblCodigoFilme;
    private javax.swing.JLabel lblCodigoLivro;
    private javax.swing.JLabel lblEdicaoLivro;
    private javax.swing.JLabel lblGeneroFilme;
    private javax.swing.JLabel lblGeneroLivro;
    private javax.swing.JLabel lblLogomarca;
    private javax.swing.JLabel lblPaginasLivro;
    private javax.swing.JLabel lblQtdArtigo;
    private javax.swing.JLabel lblQtdFilme;
    private javax.swing.JLabel lblQtdLivro;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTituloArtigo;
    private javax.swing.JLabel lblTituloFilme;
    private javax.swing.JLabel lblTituloLivro;
    private javax.swing.JMenuBar menuEmprestimo;
    private javax.swing.JMenuItem mnCadastrarCliente;
    private javax.swing.JPanel pnlArtigo;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBemVindo;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlDadosCliente;
    private javax.swing.JPanel pnlEmprestimo;
    private javax.swing.JPanel pnlFilme;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JPanel pnlLivro;
    private javax.swing.JPanel pnlPesquisaCliente;
    private javax.swing.JRadioButton rbArtigo;
    private javax.swing.JRadioButton rbFilme;
    private javax.swing.JRadioButton rbLivro;
    private javax.swing.JTextField txtAnoArtigo;
    private javax.swing.JTextField txtAnoFilme;
    private javax.swing.JTextField txtAnoLivro;
    private javax.swing.JTextField txtCodigoArtigo;
    private javax.swing.JTextField txtCodigoFilme;
    private javax.swing.JTextField txtCodigoLivro;
    private javax.swing.JTextField txtEdicaoLivro;
    private javax.swing.JTextField txtEmprestimosRestantes;
    private javax.swing.JTextField txtGeneroFilme;
    private javax.swing.JTextField txtGeneroLivro;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtItensReservados;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPaginasLivro;
    private javax.swing.JTextField txtPendencia;
    private javax.swing.JTextField txtQtdArtigo;
    private javax.swing.JTextField txtQtdFilme;
    private javax.swing.JTextField txtQtdLivro;
    private javax.swing.JTextField txtQtdPendencias;
    private javax.swing.JTextField txtTituloArtigo;
    private javax.swing.JTextField txtTituloFilme;
    private javax.swing.JTextField txtTituloLivro;
    // End of variables declaration//GEN-END:variables

}
