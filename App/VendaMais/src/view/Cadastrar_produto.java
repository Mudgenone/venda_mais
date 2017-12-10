package view;

import controler.Categoria;
import controler.Produto;
import dao.CategoriaDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;

public class Cadastrar_produto extends javax.swing.JFrame {

    Categoria categoria = new Categoria();

    public Cadastrar_produto() {
        initComponents();
        setSize(668, 402);

        DefaultTableModel modelo = (DefaultTableModel) tabela_categoria.getModel();
        tabela_categoria.setRowSorter(new TableRowSorter(modelo));
        this.setLocationRelativeTo(null);

        readJTable();
    }

    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) tabela_categoria.getModel();
        modelo.setNumRows(0);
        CategoriaDAO categoria = new CategoriaDAO();

        categoria.getList().forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getIdCat(),
                c.getNome()
            });
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_categoria = new javax.swing.JTable();
        botao_salvar = new javax.swing.JLabel();
        icon_voltar = new javax.swing.JLabel();
        campo_precovenda = new javax.swing.JTextField();
        campo_precocompra = new javax.swing.JTextField();
        campo_nomeproduto = new javax.swing.JTextField();
        quantidade = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabela_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_categoria.getTableHeader().setReorderingAllowed(false);
        tabela_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_categoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_categoria);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 130, 290, 100);

        botao_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_salvarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_salvar);
        botao_salvar.setBounds(380, 250, 200, 70);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(20, 20, 50, 50);

        campo_precovenda.setBorder(null);
        getContentPane().add(campo_precovenda);
        campo_precovenda.setBounds(30, 320, 280, 30);

        campo_precocompra.setBorder(null);
        campo_precocompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_precocompraActionPerformed(evt);
            }
        });
        getContentPane().add(campo_precocompra);
        campo_precocompra.setBounds(30, 260, 280, 30);

        campo_nomeproduto.setBorder(null);
        campo_nomeproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nomeprodutoActionPerformed(evt);
            }
        });
        getContentPane().add(campo_nomeproduto);
        campo_nomeproduto.setBounds(30, 130, 280, 30);

        quantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(quantidade);
        quantidade.setBounds(30, 200, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar produto.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nomeprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nomeprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nomeprodutoActionPerformed

    private void campo_precocompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_precocompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_precocompraActionPerformed

    private void icon_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_voltarMouseClicked
        Home tela = new Home();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_voltarMouseClicked

    private void botao_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseClicked
        if (tabela_categoria.getSelectedRow() != -1) {
            Produto cadastrar_produto = new Produto();
            String retorno = cadastrar_produto.create(campo_nomeproduto.getText(), campo_precovenda.getText(), campo_precocompra.getText(), this.categoria, Integer.parseInt(quantidade.getValue().toString()));
            JOptionPane.showMessageDialog(null, retorno);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma categoria!");
        }

    }//GEN-LAST:event_botao_salvarMouseClicked

    private void tabela_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_categoriaMouseClicked
        int k = tabela_categoria.getSelectedRow();
        long ID = (long) tabela_categoria.getValueAt(k, 0);
        CategoriaDAO categoria = new CategoriaDAO();

        categoria.getList().forEach((c) -> {
            if (c.getIdCat() == ID) {
                this.categoria = c;
            }
        });
    }//GEN-LAST:event_tabela_categoriaMouseClicked

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
            java.util.logging.Logger.getLogger(Cadastrar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botao_salvar;
    private javax.swing.JTextField campo_nomeproduto;
    private javax.swing.JTextField campo_precocompra;
    private javax.swing.JTextField campo_precovenda;
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner quantidade;
    private javax.swing.JTable tabela_categoria;
    // End of variables declaration//GEN-END:variables
}
