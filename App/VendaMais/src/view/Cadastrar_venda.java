package view;

import controler.Cliente;
import dao.ClienteDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Cadastrar_venda extends javax.swing.JFrame {

    Cliente cliente = new Cliente();

    public Cadastrar_venda() {
        initComponents();
        setSize(668, 402);
        DefaultTableModel modelo = (DefaultTableModel) tabela_cliente.getModel();
        tabela_cliente.setRowSorter(new TableRowSorter(modelo));
        tabela_cliente.getColumnModel().getColumn(0).setMinWidth(0);
        tabela_cliente.getColumnModel().getColumn(0).setMaxWidth(0);
        this.setLocationRelativeTo(null);
        readJTable();
    }

    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) tabela_cliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO cliente = new ClienteDAO();

        cliente.getList().forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getTelefone(),
                c.getEndereco(),
                c.getEmail(),
                c.getObs()
            });
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        continuar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_cliente = new javax.swing.JTable();
        icon_voltar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuarMouseClicked(evt);
            }
        });
        getContentPane().add(continuar);
        continuar.setBounds(390, 300, 240, 50);

        tabela_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Telefone", "Endereco", "Email", "Observacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_clienteMouseClicked(evt);
            }
        });
        tabela_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabela_clienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_cliente);
        if (tabela_cliente.getColumnModel().getColumnCount() > 0) {
            tabela_cliente.getColumnModel().getColumn(0).setResizable(false);
            tabela_cliente.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 120, 570, 170);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(20, 30, 50, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar venda – 1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_voltarMouseClicked
        Home tela = new Home();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_voltarMouseClicked

    private void continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseClicked
        if (tabela_cliente.getSelectedRow() != -1) {
            Cadastrar_venda_carrinho tela = new Cadastrar_venda_carrinho(this.cliente);
            tela.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente!");
        }
    }//GEN-LAST:event_continuarMouseClicked

    private void tabela_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela_clienteKeyReleased

        int k = tabela_cliente.getSelectedRow();
        long ID = (long) tabela_cliente.getValueAt(k, 0);
        ClienteDAO cliente = new ClienteDAO();
        this.cliente = cliente.getClienteById(ID);
    }//GEN-LAST:event_tabela_clienteKeyReleased

    private void tabela_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_clienteMouseClicked
        int k = tabela_cliente.getSelectedRow();
        long ID = (long) tabela_cliente.getValueAt(k, 0);
        ClienteDAO cliente = new ClienteDAO();
        this.cliente = cliente.getClienteById(ID);

    }//GEN-LAST:event_tabela_clienteMouseClicked

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
            java.util.logging.Logger.getLogger(Cadastrar_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel continuar;
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_cliente;
    // End of variables declaration//GEN-END:variables
}
