package Autores;

import java.math.BigInteger;
import javax.swing.table.DefaultTableModel;

public class ViewAutores extends javax.swing.JFrame {

    public ViewAutores() {
        initComponents();
        carregaDados();
    }
    
    public void carregaDados(){
        
        DefaultTableModel tabela = (DefaultTableModel) TabelaAutores.getModel();      
        autoresDAO dao = new autoresDAO();
        tabela.setNumRows(0);
                
        for (autores a : dao.Listar()){
            tabela.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getEndereco(),
                a.getNumero(),
                a.getBairro(),
                a.getCidade(),
                a.getCpf()
            });
        }        
    }

    public void pesquisaDados(){
        
        DefaultTableModel tabela = (DefaultTableModel) TabelaAutores.getModel();      
        autoresDAO dao = new autoresDAO();
        tabela.setNumRows(0);
                
        for (autores a : dao.pesquisar(CampoPesquisa.getText())){
            tabela.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getEndereco(),
                a.getNumero(),
                a.getBairro(),
                a.getCidade(),
                a.getCpf()
            });
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoId = new javax.swing.JTextField();
        CampoNome = new javax.swing.JTextField();
        CampoEndereco = new javax.swing.JTextField();
        CampoBairro = new javax.swing.JTextField();
        CampoCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CampoNumero = new javax.swing.JTextField();
        CampoCidade = new javax.swing.JTextField();
        BotaoExcluir = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoPesquisar = new javax.swing.JButton();
        CampoPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaAutores = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Autores"));

        jLabel1.setText("ID:");

        jLabel2.setText("NOME:");

        jLabel3.setText("ENDEREÇO:");

        jLabel4.setText("BAIRRO:");

        jLabel5.setText("CPF:");

        CampoId.setEnabled(false);

        CampoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEnderecoActionPerformed(evt);
            }
        });

        CampoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCpfActionPerformed(evt);
            }
        });

        jLabel6.setText("NÚMERO:");

        jLabel7.setText("CIDADE:");

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoAlterar.setText("Alterar");
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        BotaoPesquisar.setText("Pesquisar");
        BotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarActionPerformed(evt);
            }
        });

        CampoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CampoEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(CampoCidade)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CampoNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoCadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoPesquisar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CampoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoAlterar)
                    .addComponent(BotaoCadastrar))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPesquisar)
                    .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabelaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "ENDEREÇO", "NÚMERO", "BAIRRO", "CIDADE", "CPF"
            }
        ));
        TabelaAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaAutoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaAutores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEnderecoActionPerformed

    private void CampoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCpfActionPerformed

    private void CampoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPesquisaActionPerformed

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        autores autor = new autores();
        autoresDAO DAO = new autoresDAO();
        
        autor.setNome(CampoNome.getText());
        autor.setEndereco(CampoEndereco.getText());
        autor.setNumero(Integer.parseInt(CampoNumero.getText()));
        autor.setBairro(CampoBairro.getText());
        autor.setCidade(CampoCidade.getText());
        autor.setCpf(new BigInteger(CampoCpf.getText()));

        DAO.cadastrar(autor);
        carregaDados();       
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed
        autores autor = new autores();
        autoresDAO DAO = new autoresDAO();
        
        autor.setId(Integer.parseInt(CampoId.getText()));
        autor.setNome(CampoNome.getText());
        autor.setEndereco(CampoEndereco.getText());
        autor.setNumero(Integer.parseInt(CampoNumero.getText()));
        autor.setBairro(CampoBairro.getText());
        autor.setCidade(CampoCidade.getText());
        autor.setCpf(new BigInteger(CampoCpf.getText()));

        DAO.alterar(autor);
        carregaDados();        
    }//GEN-LAST:event_BotaoAlterarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        autores autor = new autores();
        autoresDAO DAO = new autoresDAO();
        
        autor.setId(Integer.parseInt(CampoId.getText()));
        autor.setNome(CampoNome.getText());
        autor.setEndereco(CampoEndereco.getText());
        autor.setNumero(Integer.parseInt(CampoNumero.getText()));
        autor.setBairro(CampoBairro.getText());
        autor.setCidade(CampoCidade.getText());
        autor.setCpf(new BigInteger(CampoCpf.getText()));

        DAO.excluir(autor);
        carregaDados();       
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarActionPerformed
        pesquisaDados();        
    }//GEN-LAST:event_BotaoPesquisarActionPerformed

    private void TabelaAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaAutoresMouseClicked
        CampoId.setText(TabelaAutores.getValueAt(TabelaAutores.getSelectedRow(), 0).toString());
        CampoNome.setText(TabelaAutores.getValueAt(TabelaAutores.getSelectedRow(),1).toString());
        CampoEndereco.setText(TabelaAutores.getValueAt(TabelaAutores.getSelectedRow(),2).toString());
        CampoNumero.setText(TabelaAutores.getValueAt(TabelaAutores.getSelectedRow(),3).toString());
        CampoBairro.setText(TabelaAutores.getValueAt(TabelaAutores.getSelectedRow(),4).toString());
        CampoCidade.setText(TabelaAutores.getValueAt(TabelaAutores.getSelectedRow(),5).toString());
        CampoCpf.setText(TabelaAutores.getValueAt(TabelaAutores.getSelectedRow(),6).toString());       
    }//GEN-LAST:event_TabelaAutoresMouseClicked

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
            java.util.logging.Logger.getLogger(ViewAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAutores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JTextField CampoBairro;
    private javax.swing.JTextField CampoCidade;
    private javax.swing.JTextField CampoCpf;
    private javax.swing.JTextField CampoEndereco;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoNumero;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JTable TabelaAutores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
