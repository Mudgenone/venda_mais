package view;

import controler.Venda;
import dao.VendaDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Listar_vendas extends javax.swing.JFrame {
    
    Venda venda = new Venda();
    VendaDAO vendas = new VendaDAO();
    List <Venda> listaVenda = this.vendas.getList(); 

    public Listar_vendas() {
        initComponents();
        setSize(668, 402);
        DefaultTableModel modelo = (DefaultTableModel) tabela_vendas.getModel();
        tabela_vendas.setRowSorter(new TableRowSorter(modelo));
        tabela_vendas.getColumnModel().getColumn(0).setMinWidth(0); 
        tabela_vendas.getColumnModel().getColumn(0).setMaxWidth(0);
        this.setLocationRelativeTo(null);
        
        readJTable();
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) tabela_vendas.getModel();
        modelo.setNumRows(0);
        

        this.listaVenda.forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getIdVenda(),
                c.getCliente().getNome(),
                c.getParcelas(),
                c.getPrecoTotal(),
                c.getDataVenda()                    
            });
        });

    }

    public void readJTable2() {
        
        DefaultTableModel modelo = (DefaultTableModel) tabela_vendaproduto.getModel();
        modelo.setNumRows(0);

        this.venda.produto.forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getQntVendida()
            });
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon_voltar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_vendaproduto = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_vendas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(10, 30, 60, 40);

        tabela_vendaproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela_vendaproduto);
        if (tabela_vendaproduto.getColumnModel().getColumnCount() > 0) {
            tabela_vendaproduto.getColumnModel().getColumn(0).setResizable(false);
            tabela_vendaproduto.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(410, 90, 230, 250);

        tabela_vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Parcelas", "Preço total", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_vendasMouseClicked(evt);
            }
        });
        tabela_vendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabela_vendasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_vendas);
        if (tabela_vendas.getColumnModel().getColumnCount() > 0) {
            tabela_vendas.getColumnModel().getColumn(0).setResizable(false);
            tabela_vendas.getColumnModel().getColumn(1).setResizable(false);
            tabela_vendas.getColumnModel().getColumn(2).setResizable(false);
            tabela_vendas.getColumnModel().getColumn(3).setResizable(false);
            tabela_vendas.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 390, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Listar venda.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabela_vendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_vendasMouseClicked
        int k = tabela_vendas.getSelectedRow();
        long ID = (long) tabela_vendas.getValueAt(k, 0); 
                
            this.listaVenda.forEach((c) -> {
                if(c.getIdVenda()== ID){
                    this.venda = c;
                }
        });
            
        readJTable2();
    }//GEN-LAST:event_tabela_vendasMouseClicked

    private void tabela_vendasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela_vendasKeyReleased
        int k = tabela_vendas.getSelectedRow();
        long ID = (long) tabela_vendas.getValueAt(k, 0);  
               
            this.listaVenda.forEach((c) -> {
                if(c.getIdVenda()== ID){
                    this.venda = c;
                }
        });
            
        readJTable2();       
    }//GEN-LAST:event_tabela_vendasKeyReleased

    private void icon_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_voltarMouseClicked
        Home tela = new Home();
        tela.setVisible(true);   
        this.dispose();
    }//GEN-LAST:event_icon_voltarMouseClicked

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
            java.util.logging.Logger.getLogger(Listar_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar_vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela_vendaproduto;
    private javax.swing.JTable tabela_vendas;
    // End of variables declaration//GEN-END:variables
}
