/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controler.Categoria;
import controler.Produto;
import dao.CategoriaDAO;
import dao.ProdutoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ander
 */
public class Editar_produto extends javax.swing.JFrame {
    Categoria categoria;
    Produto produto;

    /** Creates new form Editar_produto */
    public Editar_produto() {
        initComponents();
        setSize(668, 402);
        
        DefaultTableModel modelo = (DefaultTableModel) tabela_categoria.getModel();
        tabela_categoria.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
        readJTable2();
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
    
    public void readJTable2() {
        
        DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO produto = new ProdutoDAO();

        produto.getList().forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getIdProd(),
                c.getNome(),
                c.getQtdEstoque(),
                c.getPrecoCompra(),
                c.getPrecoVenda()
            });
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_salvar = new javax.swing.JLabel();
        botao_deletar = new javax.swing.JLabel();
        campo_qtdestoque = new javax.swing.JTextField();
        campo_precovenda = new javax.swing.JTextField();
        campo_precocompra = new javax.swing.JTextField();
        campo_nome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_categoria = new javax.swing.JTable();
        botao_voltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botao_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_salvarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_salvar);
        botao_salvar.setBounds(510, 30, 120, 50);

        botao_deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_deletarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_deletar);
        botao_deletar.setBounds(370, 30, 120, 50);
        getContentPane().add(campo_qtdestoque);
        campo_qtdestoque.setBounds(520, 140, 120, 30);
        getContentPane().add(campo_precovenda);
        campo_precovenda.setBounds(520, 200, 120, 30);
        getContentPane().add(campo_precocompra);
        campo_precocompra.setBounds(340, 200, 150, 30);
        getContentPane().add(campo_nome);
        campo_nome.setBounds(340, 140, 150, 30);

        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Estoque", "Compra", "Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        tabela_produtos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabela_produtosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_produtos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 110, 300, 250);

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
        tabela_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabela_categoriaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_categoria);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 270, 280, 90);

        botao_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_voltar);
        botao_voltar.setBounds(10, 30, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar produto.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseClicked
        Principal_alterardados tela = new Principal_alterardados();
        tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_botao_voltarMouseClicked

    private void botao_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseClicked
        Produto produto = new Produto();
        

        readJTable2();

        campo_nome.setText("");
        campo_precocompra.setText("");
        campo_precovenda.setText("");
        campo_qtdestoque.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_botao_salvarMouseClicked

    private void tabela_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_categoriaMouseClicked
        int k = tabela_categoria.getSelectedRow();
            long ID = (long) tabela_categoria.getValueAt(k, 0);
            CategoriaDAO categoria = new CategoriaDAO();
        
            categoria.getList().forEach((c) -> {
                if(c.getIdCat() == ID){
                    this.categoria = c;
                }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_categoriaMouseClicked

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked
        int k = tabela_produtos.getSelectedRow();
        long ID = (long) tabela_produtos.getValueAt(k, 0);
        ProdutoDAO produto = new ProdutoDAO();
        
        produto.getList().forEach((c) -> {
            if(c.getIdProd() == ID){
                this.produto = c;
            }
        });
        
        if(tabela_produtos.getSelectedRow() != -1){
            campo_nome.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 1).toString());
            campo_precocompra.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 3).toString());
            campo_precovenda.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 4).toString());
            campo_qtdestoque.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 2).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_produtosMouseClicked

    private void botao_deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_deletarMouseClicked
        Produto produto = new Produto();
        if(produto.remove(this.produto)){
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        }

        readJTable2();

        campo_nome.setText("");
        campo_precocompra.setText("");
        campo_precovenda.setText("");
        campo_qtdestoque.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_botao_deletarMouseClicked

    private void tabela_produtosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela_produtosKeyReleased
        int k = tabela_produtos.getSelectedRow();
            long ID = (long) tabela_produtos.getValueAt(k, 0);
            ProdutoDAO produto = new ProdutoDAO();
        
            produto.getList().forEach((c) -> {
                if(c.getIdProd() == ID){
                    this.produto = c;
                }
        });
        
        if(tabela_produtos.getSelectedRow() != -1){
            campo_nome.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 1).toString());
            campo_precocompra.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 3).toString());
            campo_precovenda.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 4).toString());
            campo_qtdestoque.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 2).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_produtosKeyReleased

    private void tabela_categoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela_categoriaKeyReleased
        int k = tabela_categoria.getSelectedRow();
            long ID = (long) tabela_categoria.getValueAt(k, 0);
            CategoriaDAO categoria = new CategoriaDAO();
        
            categoria.getList().forEach((c) -> {
                if(c.getIdCat() == ID){
                    this.categoria = c;
                }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_categoriaKeyReleased

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
            java.util.logging.Logger.getLogger(Editar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botao_deletar;
    private javax.swing.JLabel botao_salvar;
    private javax.swing.JLabel botao_voltar;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_precocompra;
    private javax.swing.JTextField campo_precovenda;
    private javax.swing.JTextField campo_qtdestoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela_categoria;
    private javax.swing.JTable tabela_produtos;
    // End of variables declaration//GEN-END:variables

}
