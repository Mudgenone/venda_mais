package view;

import dao.ProdutoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Produto;

public class Listar_produtos extends javax.swing.JFrame {

    public Listar_produtos() {
        initComponents();
        setSize(668, 402);
        
        DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
        tabela_produtos.setRowSorter(new TableRowSorter(modelo));
        this.setLocationRelativeTo(null);
        
        readJTable();
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO produto = new ProdutoDAO();
        List<Produto> listaProd = produto.getList();
        listaProd.forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getQtdEstoque(),
                c.getPrecoCompra(),
                c.getPrecoVenda(),
                c.getCategoria().getNome()
            });
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        botao_voltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Qntd em estoque", "Preco de compra", "Preco de venda", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_produtos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 590, 220);

        botao_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_voltar);
        botao_voltar.setBounds(10, 30, 70, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Listrar produtos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseClicked
        Home tela = new Home();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_voltarMouseClicked

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
            java.util.logging.Logger.getLogger(Listar_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar_produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botao_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_produtos;
    // End of variables declaration//GEN-END:variables
}
