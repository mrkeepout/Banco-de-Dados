package telas;

import Classes.Aluno;
import Classes.Funcionario;
import Classes.Professor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
        initComponents();
        //habilitando txt
        txtMatricula.setEnabled(true);

        txtMatricula.setEnabled(true);
        txtNome.setEnabled(true);
        txtCPF.setEnabled(true);
        txtDataNascimento.setEnabled(true);

        txtCargoFuncionario.setEnabled(false);
        txtSenhaFuncionario.setEnabled(false);
        txtCursoAluno.setEnabled(false);
        txtSenhaAluno.setEnabled(false);
        txtFormacaoProfessor.setEnabled(false);
        txtSenhaProfessor.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTipoCliente = new javax.swing.ButtonGroup();
        pnlGeral = new javax.swing.JPanel();
        pnlCadastroClientes = new javax.swing.JPanel();
        pnlCadastroGeral = new javax.swing.JPanel();
        pnlCliente = new javax.swing.JPanel();
        pnlProfessor = new javax.swing.JPanel();
        pnlPesquisaCliente1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtFormacaoProfessor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSenhaProfessor = new javax.swing.JTextField();
        pnlFuncionario = new javax.swing.JPanel();
        pnlPesquisaCliente2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtCargoFuncionario = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSenhaFuncionario = new javax.swing.JTextField();
        pnlAluno = new javax.swing.JPanel();
        pnlPesquisaCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCursoAluno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenhaAluno = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        rbProfessor = new javax.swing.JRadioButton();
        rbAluno = new javax.swing.JRadioButton();
        rbFuncionario = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        btnCadastrarCliente = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        pnlBemVindo = new javax.swing.JPanel();
        lblBemVindo = new javax.swing.JLabel();
        lblLogomarca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(248, 248, 248));

        pnlGeral.setBackground(new java.awt.Color(248, 248, 248));

        pnlCadastroClientes.setBackground(new java.awt.Color(249, 249, 249));
        pnlCadastroClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlCadastroClientes.setToolTipText("");

        pnlCadastroGeral.setBackground(new java.awt.Color(248, 248, 248));
        pnlCadastroGeral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N

        pnlCliente.setBackground(new java.awt.Color(249, 249, 249));
        pnlCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCliente.setLayout(new java.awt.CardLayout());

        pnlProfessor.setBackground(new java.awt.Color(248, 248, 248));
        pnlProfessor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Professor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlPesquisaCliente1.setBackground(new java.awt.Color(248, 248, 248));

        jLabel18.setText("Formação:");

        txtFormacaoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormacaoProfessorActionPerformed(evt);
            }
        });

        jLabel19.setText("Senha:");

        txtSenhaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPesquisaCliente1Layout = new javax.swing.GroupLayout(pnlPesquisaCliente1);
        pnlPesquisaCliente1.setLayout(pnlPesquisaCliente1Layout);
        pnlPesquisaCliente1Layout.setHorizontalGroup(
            pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPesquisaCliente1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtFormacaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPesquisaCliente1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlPesquisaCliente1Layout.setVerticalGroup(
            pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaCliente1Layout.createSequentialGroup()
                .addGroup(pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtFormacaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlProfessorLayout = new javax.swing.GroupLayout(pnlProfessor);
        pnlProfessor.setLayout(pnlProfessorLayout);
        pnlProfessorLayout.setHorizontalGroup(
            pnlProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlProfessorLayout.setVerticalGroup(
            pnlProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnlCliente.add(pnlProfessor, "card3");

        pnlFuncionario.setBackground(new java.awt.Color(248, 248, 248));
        pnlFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlPesquisaCliente2.setBackground(new java.awt.Color(248, 248, 248));

        jLabel20.setText("Cargo:");

        txtCargoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoFuncionarioActionPerformed(evt);
            }
        });

        jLabel21.setText("Senha:");

        txtSenhaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPesquisaCliente2Layout = new javax.swing.GroupLayout(pnlPesquisaCliente2);
        pnlPesquisaCliente2.setLayout(pnlPesquisaCliente2Layout);
        pnlPesquisaCliente2Layout.setHorizontalGroup(
            pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaCliente2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPesquisaCliente2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPesquisaCliente2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlPesquisaCliente2Layout.setVerticalGroup(
            pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaCliente2Layout.createSequentialGroup()
                .addGroup(pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFuncionarioLayout = new javax.swing.GroupLayout(pnlFuncionario);
        pnlFuncionario.setLayout(pnlFuncionarioLayout);
        pnlFuncionarioLayout.setHorizontalGroup(
            pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisaCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pnlFuncionarioLayout.setVerticalGroup(
            pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisaCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnlCliente.add(pnlFuncionario, "card4");

        pnlAluno.setBackground(new java.awt.Color(248, 248, 248));
        pnlAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlPesquisaCliente.setBackground(new java.awt.Color(248, 248, 248));

        jLabel6.setText("Curso:");

        txtCursoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoAlunoActionPerformed(evt);
            }
        });

        jLabel7.setText("Senha:");

        txtSenhaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPesquisaClienteLayout = new javax.swing.GroupLayout(pnlPesquisaCliente);
        pnlPesquisaCliente.setLayout(pnlPesquisaClienteLayout);
        pnlPesquisaClienteLayout.setHorizontalGroup(
            pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlPesquisaClienteLayout.setVerticalGroup(
            pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                .addGroup(pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAlunoLayout = new javax.swing.GroupLayout(pnlAluno);
        pnlAluno.setLayout(pnlAlunoLayout);
        pnlAlunoLayout.setHorizontalGroup(
            pnlAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnlAlunoLayout.setVerticalGroup(
            pnlAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCliente.add(pnlAluno, "card2");

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Matrícula:");

        jLabel13.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel10.setText("Data de nascimento:");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCadastroGeralLayout = new javax.swing.GroupLayout(pnlCadastroGeral);
        pnlCadastroGeral.setLayout(pnlCadastroGeralLayout);
        pnlCadastroGeralLayout.setHorizontalGroup(
            pnlCadastroGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCadastroGeralLayout.setVerticalGroup(
            pnlCadastroGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rbProfessor.setBackground(new java.awt.Color(248, 248, 248));
        btnTipoCliente.add(rbProfessor);
        rbProfessor.setText("Professor");
        rbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProfessorActionPerformed(evt);
            }
        });

        rbAluno.setBackground(new java.awt.Color(248, 248, 248));
        btnTipoCliente.add(rbAluno);
        rbAluno.setText("Aluno");
        rbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlunoActionPerformed(evt);
            }
        });

        rbFuncionario.setBackground(new java.awt.Color(248, 248, 248));
        btnTipoCliente.add(rbFuncionario);
        rbFuncionario.setText("Funcionário");
        rbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFuncionarioActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipo.setText("Selecione o cliente a ser cadastrado:");

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroClientesLayout = new javax.swing.GroupLayout(pnlCadastroClientes);
        pnlCadastroClientes.setLayout(pnlCadastroClientesLayout);
        pnlCadastroClientesLayout.setHorizontalGroup(
            pnlCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroClientesLayout.createSequentialGroup()
                .addGroup(pnlCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrarCliente)
                        .addGap(41, 41, 41)
                        .addComponent(btnSair))
                    .addGroup(pnlCadastroClientesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addGroup(pnlCadastroClientesLayout.createSequentialGroup()
                                .addComponent(rbProfessor)
                                .addGap(18, 18, 18)
                                .addComponent(rbAluno)
                                .addGap(18, 18, 18)
                                .addComponent(rbFuncionario))))
                    .addGroup(pnlCadastroClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCadastroGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlCadastroClientesLayout.setVerticalGroup(
            pnlCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroClientesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbProfessor)
                    .addComponent(rbAluno)
                    .addComponent(rbFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCadastroGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarCliente)
                    .addComponent(btnSair))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlBemVindo.setBackground(new java.awt.Color(248, 248, 248));

        lblBemVindo.setBackground(new java.awt.Color(248, 248, 248));
        lblBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBemVindo.setText("Bem-vindo(a)!");

        lblLogomarca.setBackground(new java.awt.Color(248, 248, 248));
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

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGeralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(865, 865, 865))
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCursoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoAlunoActionPerformed

    private void txtSenhaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaAlunoActionPerformed

    private void rbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProfessorActionPerformed
        //habilitando campos de txt
        pnlProfessor.setVisible(true);
        pnlAluno.setVisible(false);
        pnlFuncionario.setVisible(false);
        txtFormacaoProfessor.setEnabled(true);
        txtSenhaProfessor.setEnabled(true);

        txtCursoAluno.setEnabled(false);
        txtSenhaAluno.setEnabled(false);
        txtCargoFuncionario.setEnabled(false);
        txtSenhaFuncionario.setEnabled(false);
    }//GEN-LAST:event_rbProfessorActionPerformed

    private void rbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFuncionarioActionPerformed
        //habilitando campos de txt
        pnlProfessor.setVisible(false);
        pnlAluno.setVisible(false);
        pnlFuncionario.setVisible(true);

        txtCargoFuncionario.setEnabled(true);
        txtSenhaFuncionario.setEnabled(true);

        txtCursoAluno.setEnabled(false);
        txtSenhaAluno.setEnabled(false);
        txtFormacaoProfessor.setEnabled(false);
        txtSenhaProfessor.setEnabled(false);

    }//GEN-LAST:event_rbFuncionarioActionPerformed

    private void txtFormacaoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormacaoProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormacaoProfessorActionPerformed

    private void txtSenhaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaProfessorActionPerformed

    private void txtCargoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoFuncionarioActionPerformed

    private void txtSenhaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFuncionarioActionPerformed

    private void rbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlunoActionPerformed
        //habilitando campos de txt
        pnlProfessor.setVisible(false);
        pnlAluno.setVisible(true);
        pnlFuncionario.setVisible(false);

        txtCursoAluno.setEnabled(true);
        txtSenhaAluno.setEnabled(true);

        txtFormacaoProfessor.setEnabled(false);
        txtSenhaProfessor.setEnabled(false);
        txtCargoFuncionario.setEnabled(false);
        txtSenhaFuncionario.setEnabled(false);
    }//GEN-LAST:event_rbAlunoActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        if (rbAluno.isSelected() == false && rbProfessor.isSelected() == false && rbFuncionario.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Por favor escolher que tipo de cliente! ", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            if (rbProfessor.isSelected()) {
                if (txtMatricula.getText().equals("") || txtNome.getText().equals("") || txtCPF.getText().equals("") || txtDataNascimento.getText().equals("") || txtFormacaoProfessor.getText().equals("") || txtSenhaProfessor.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos! ", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {
                    String formacao = txtFormacaoProfessor.getText(); //Professor(long matricula, String nome, long cpf, Date dataNascimento, int senha, boolean pendencia, String tipoCliente, String formacao)
                    int senha = Integer.parseInt(txtSenhaProfessor.getText());
                    long matricula = Long.parseLong(txtMatricula.getText());
                    String nome = txtNome.getText();
                    long cpf = Long.parseLong(txtCPF.getText());
                    String dataNascimento = txtDataNascimento.getText();
                    //DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
                    //Date data = formatter.parse(dataNascimento);
                    Professor professor = new Professor(matricula, nome, cpf, dataNascimento, senha, false, "professor", formacao);
                    professor.professorCadastro();
                    professor.professorCadastroSenha();
                    JOptionPane.showMessageDialog(null, professor.getNome() + " cadastrado(a) com sucesso!", "Bem-vindo(a)!", JOptionPane.PLAIN_MESSAGE);
                }
            }
            //ALUNO FUNCIONANDO, PRECISA REPLICAR
            if (rbAluno.isSelected()) {
                if (txtMatricula.getText().equals("") || txtNome.getText().equals("") || txtCPF.getText().equals("") || txtDataNascimento.getText().equals("") || txtCursoAluno.getText().equals("") || txtSenhaAluno.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos! ", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {
                    long matricula = Long.parseLong(txtMatricula.getText());
                    String nome = txtNome.getText();
                    long cpf = Long.parseLong(txtCPF.getText());                   
                    String dataNascimento = txtDataNascimento.getText();
                    String curso = txtCursoAluno.getText();
                    int senha = Integer.parseInt(txtSenhaAluno.getText());
                    //Aluno(long matricula, String nome, long cpf, Date dataNascimento, int senha, boolean pendencia, String tipoCliente, String curso)
                    Aluno aluno = new Aluno(matricula, nome, cpf, dataNascimento, senha, false, "aluno", curso);
                    aluno.alunoCadastro();
                    aluno.alunoCadastroSenha();
                    JOptionPane.showMessageDialog(null, aluno.getNome() + " cadastrado(a) com sucesso!", "Bem-vindo(a)!", JOptionPane.PLAIN_MESSAGE);
                }
            }
            if (rbFuncionario.isSelected()) {
                if (txtMatricula.getText().equals("") || txtNome.getText().equals("") || txtCPF.getText().equals("") || txtDataNascimento.getText().equals("") || txtCargoFuncionario.getText().equals("") || txtSenhaFuncionario.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos! ", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {
                    long matricula = Long.parseLong(txtMatricula.getText());
                    String nome = txtNome.getText();
                    long cpf = Long.parseLong(txtCPF.getText());
                    String dataNascimento = txtDataNascimento.getText();
                    String cargo = txtCargoFuncionario.getText();
                    int senha = Integer.parseInt(txtSenhaFuncionario.getText());
                    //Funcionario(long matricula, String nome, long cpf, Date dataNascimento, int senha, boolean pendencia, String tipoCliente, String cargo)
                    Funcionario funcionario = new Funcionario(matricula, nome, cpf, dataNascimento, senha, false, "funcionario", cargo);
                    funcionario.funcionarioCadastro();
                    funcionario.funcionarioCadastroSenha();
                    JOptionPane.showMessageDialog(null, funcionario.getNome() + " cadastrado(a) com sucesso!", "Bem-vindo(a)!", JOptionPane.PLAIN_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup btnTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblLogomarca;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlAluno;
    private javax.swing.JPanel pnlBemVindo;
    private javax.swing.JPanel pnlCadastroClientes;
    private javax.swing.JPanel pnlCadastroGeral;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlFuncionario;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JPanel pnlPesquisaCliente;
    private javax.swing.JPanel pnlPesquisaCliente1;
    private javax.swing.JPanel pnlPesquisaCliente2;
    private javax.swing.JPanel pnlProfessor;
    private javax.swing.JRadioButton rbAluno;
    private javax.swing.JRadioButton rbFuncionario;
    private javax.swing.JRadioButton rbProfessor;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCargoFuncionario;
    private javax.swing.JTextField txtCursoAluno;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtFormacaoProfessor;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenhaAluno;
    private javax.swing.JTextField txtSenhaFuncionario;
    private javax.swing.JTextField txtSenhaProfessor;
    // End of variables declaration//GEN-END:variables
}
