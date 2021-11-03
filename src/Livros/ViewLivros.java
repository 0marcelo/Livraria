package Livros;

import Autores.autores;
import Autores.autoresDAO;
import Editoras.editoras;
import Editoras.editorasDAO;
import javax.swing.table.DefaultTableModel;

public class ViewLivros extends javax.swing.JFrame {

    public ViewLivros() {
        initComponents();
        carregaDados();
        
        editorasDAO dao = new editorasDAO();
        
        for (editoras e : dao.listar()){
            SelecionarEditora.addItem(e);
        }
        
        autoresDAO DAO = new autoresDAO();
        
        for (autores a : DAO.Listar()){
            SelecionarAutor.addItem(a);
        }    
    }

    public void carregaDados(){
        
        DefaultTableModel tabela = (DefaultTableModel) TabelaLivros.getModel();      
        livrosDAO dao = new livrosDAO();
        tabela.setNumRows(0);
                
        for (livros L : dao.listar()){
            tabela.addRow(new Object[]{
                L.getId_livro(),
                L.getEditora().getNome(),
                L.getAutor().getNome(),
                L.getTitulo(),
                L.getAno()
            });
        }        
    }
    
    public void pesquisaDados(){
        
        DefaultTableModel tabela = (DefaultTableModel) TabelaLivros.getModel();      
        livrosDAO dao = new livrosDAO();
        tabela.setNumRows(0);
                
        for (livros L : dao.pesquisar(CampoPesquisa.getText())){
            tabela.addRow(new Object[]{
                L.getId_livro(),
                L.getEditora().getNome(),
                L.getAutor().getNome(),
                L.getTitulo(),
                L.getAno()
            });
        }        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoId = new javax.swing.JTextField();
        SelecionarAutor = new javax.swing.JComboBox<>();
        CampoTitulo = new javax.swing.JTextField();
        CampoAno = new javax.swing.JTextField();
        BotaoExcluir = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoPesquisar = new javax.swing.JButton();
        CampoPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaLivros = new javax.swing.JTable();
        SelecionarEditora = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Livros"));

        jLabel1.setText("ID:");

        jLabel2.setText("EDITORA:");

        jLabel3.setText("AUTOR:");

        jLabel4.setText("TÍTULO:");

        jLabel5.setText("ANO:");

        CampoId.setEnabled(false);

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

        TabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "EDITORA", "AUTOR", "TÍTULO", "ANO"
            }
        ));
        TabelaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaLivros);

        jButton1.setText("Fechar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelecionarAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CampoTitulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(SelecionarEditora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoCadastrar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SelecionarEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SelecionarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoAlterar)
                    .addComponent(BotaoCadastrar))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPesquisar)
                    .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPesquisaActionPerformed

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        livros liv = new livros();
        livrosDAO DAO = new livrosDAO();
        
        editoras edit = (editoras) SelecionarEditora.getSelectedItem();
        autores autor = (autores) SelecionarAutor.getSelectedItem();        
        
        liv.setEditora(edit);
        liv.setAutor(autor);
        liv.setTitulo(CampoTitulo.getText());
        liv.setAno(Integer.parseInt(CampoAno.getText()));

        DAO.cadastrar(liv);
        carregaDados();
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed
        livros liv = new livros();
        livrosDAO DAO = new livrosDAO();
        
        editoras edit = (editoras) SelecionarEditora.getSelectedItem();
        autores autor = (autores) SelecionarAutor.getSelectedItem(); 
        
        
        liv.setId_livro(Integer.parseInt(CampoId.getText()));
        liv.setEditora(edit);
        liv.setAutor(autor);
        liv.setTitulo(CampoTitulo.getText());
        liv.setAno(Integer.parseInt(CampoAno.getText()));
        
        DAO.alterar(liv);
        carregaDados();
    }//GEN-LAST:event_BotaoAlterarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        livros liv = new livros();
        livrosDAO DAO = new livrosDAO();
        
        editoras edit = (editoras) SelecionarEditora.getSelectedItem();
        autores autor = (autores) SelecionarAutor.getSelectedItem();        
        
        liv.setId_livro(Integer.parseInt(CampoId.getText()));
        liv.setEditora(edit);
        liv.setAutor(autor);
        liv.setTitulo(CampoTitulo.getText());
        liv.setAno(Integer.parseInt(CampoAno.getText()));
        
        DAO.excluir(liv);
        carregaDados(); 
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarActionPerformed
        pesquisaDados();
    }//GEN-LAST:event_BotaoPesquisarActionPerformed

    private void TabelaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaLivrosMouseClicked
         String Edit = TabelaLivros.getValueAt(TabelaLivros.getSelectedRow(), 1).toString();
        for(int i = 0; i < SelecionarEditora.getItemCount();i++){
            if(SelecionarEditora.getItemAt(i).toString().equalsIgnoreCase(Edit)){
                SelecionarEditora.setSelectedIndex(i);
            }
        }
        
        String Aut = TabelaLivros.getValueAt(TabelaLivros.getSelectedRow(), 2).toString();
        for(int i = 0; i < SelecionarAutor.getItemCount();i++){
            if(SelecionarAutor.getItemAt(i).toString().equalsIgnoreCase(Aut)){
                SelecionarAutor.setSelectedIndex(i);
            }
        }        
        CampoId.setText(TabelaLivros.getValueAt(TabelaLivros.getSelectedRow(), 0).toString());
        CampoTitulo.setText(TabelaLivros.getValueAt(TabelaLivros.getSelectedRow(),3).toString());        
        CampoAno.setText(TabelaLivros.getValueAt(TabelaLivros.getSelectedRow(),4).toString());
    }//GEN-LAST:event_TabelaLivrosMouseClicked

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
            java.util.logging.Logger.getLogger(ViewLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JTextField CampoAno;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JTextField CampoTitulo;
    private javax.swing.JComboBox<Object> SelecionarAutor;
    private javax.swing.JComboBox<Object> SelecionarEditora;
    private javax.swing.JTable TabelaLivros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
