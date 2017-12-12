package view;

import dao.ClienteDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Cliente;

public class Listar_clientes extends javax.swing.JFrame {
    
    public Listar_clientes() {
        initComponents();
        setSize(668, 402);
        DefaultTableModel modelo = (DefaultTableModel) tabela_cliente.getModel();
        tabela_cliente.setRowSorter(new TableRowSorter(modelo));
        this.setLocationRelativeTo(null);
        readJTable();
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) tabela_cliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO cliente = new ClienteDAO();
        List <Cliente> listaCliente = cliente.getList();
        
        listaCliente.forEach((c) -> {
            modelo.addRow(new Object[]{
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_cliente = new javax.swing.JTable();
        icon_voltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabela_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereco", "Email", "Observacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_cliente);
        if (tabela_cliente.getColumnModel().getColumnCount() > 0) {
            tabela_cliente.getColumnModel().getColumn(0).setResizable(false);
            tabela_cliente.getColumnModel().getColumn(1).setResizable(false);
            tabela_cliente.getColumnModel().getColumn(2).setResizable(false);
            tabela_cliente.getColumnModel().getColumn(3).setResizable(false);
            tabela_cliente.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 570, 210);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(20, 20, 50, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Listrar clientes.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Listar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_cliente;
    // End of variables declaration//GEN-END:variables
}
