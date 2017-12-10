package view;

import controler.Cliente;
import dao.ClienteDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Editar_cliente extends javax.swing.JFrame {
    
    Cliente cliente = new Cliente();
    long id;
    
    public Editar_cliente() {
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

        botao_deletar = new javax.swing.JLabel();
        botao_salvar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_cliente = new javax.swing.JTable();
        icon_voltar = new javax.swing.JLabel();
        campo_observacao = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        campo_endereco = new javax.swing.JTextField();
        campo_telefone = new javax.swing.JTextField();
        campo_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        botao_deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_deletarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_deletar);
        botao_deletar.setBounds(370, 30, 110, 50);

        botao_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_salvarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_salvar);
        botao_salvar.setBounds(500, 30, 130, 50);

        tabela_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Endereco", "Email", "Observacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_cliente.getTableHeader().setReorderingAllowed(false);
        tabela_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_clienteMouseClicked(evt);
            }
        });
        tabela_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabela_clienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabela_clienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_cliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 310, 230);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(10, 30, 60, 50);
        getContentPane().add(campo_observacao);
        campo_observacao.setBounds(340, 270, 300, 60);

        campo_email.setBorder(null);
        getContentPane().add(campo_email);
        campo_email.setBounds(520, 200, 120, 30);

        campo_endereco.setBorder(null);
        getContentPane().add(campo_endereco);
        campo_endereco.setBounds(340, 200, 150, 30);

        campo_telefone.setBorder(null);
        getContentPane().add(campo_telefone);
        campo_telefone.setBounds(520, 140, 120, 30);

        campo_nome.setBorder(null);
        getContentPane().add(campo_nome);
        campo_nome.setBounds(340, 140, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar cliente.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 366);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_voltarMouseClicked
        Principal_alterardados tela = new Principal_alterardados();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_voltarMouseClicked

    private void botao_deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_deletarMouseClicked
        if (tabela_cliente.getSelectedRow() != -1) {
            Cliente deletar = new Cliente();
            if (deletar.remove(this.cliente)) {
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            }
            
            readJTable();
            
            campo_nome.setText("");
            campo_telefone.setText("");
            campo_endereco.setText("");
            campo_email.setText("");
            campo_observacao.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um cliente!");
        }
    }//GEN-LAST:event_botao_deletarMouseClicked

    private void tabela_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_clienteMouseClicked
        int k = tabela_cliente.getSelectedRow();
        this.id = (long) tabela_cliente.getValueAt(k, 0);
        ClienteDAO categoria = new ClienteDAO();
        
        categoria.getList().forEach((c) -> {
            if (c.getId() == this.id) {
                this.cliente = c;
            }
        });
        
        if (tabela_cliente.getSelectedRow() != -1) {
            campo_nome.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 1).toString());
            campo_telefone.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 2).toString());
            campo_endereco.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 3).toString());
            campo_email.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 4).toString());
            campo_observacao.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 5).toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_tabela_clienteMouseClicked

    private void tabela_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela_clienteKeyPressed
        if (tabela_cliente.getSelectedRow() != -1) {
            campo_nome.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 1).toString());
            campo_telefone.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 2).toString());
            campo_endereco.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 3).toString());
            campo_email.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 4).toString());
            campo_observacao.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 5).toString());
        }      // TODO add your handling code here:
    }//GEN-LAST:event_tabela_clienteKeyPressed

    private void tabela_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela_clienteKeyReleased
        if (tabela_cliente.getSelectedRow() != -1) {
            this.id = Long.parseLong(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 0).toString());
            campo_nome.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 1).toString());
            campo_telefone.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 2).toString());
            campo_endereco.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 3).toString());
            campo_email.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 4).toString());
            campo_observacao.setText(tabela_cliente.getValueAt(tabela_cliente.getSelectedRow(), 5).toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_tabela_clienteKeyReleased

    private void botao_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseClicked
        if (tabela_cliente.getSelectedRow() != -1) {
            Cliente editar_cliente = new Cliente();
            System.out.println(this.id);
            String retorno = editar_cliente.update(this.id, campo_nome.getText(), campo_endereco.getText(), campo_email.getText(), campo_telefone.getText(), campo_observacao.getText());
            JOptionPane.showMessageDialog(null, retorno);
            
            readJTable();
            
            campo_nome.setText("");
            campo_telefone.setText("");
            campo_endereco.setText("");
            campo_email.setText("");
            campo_observacao.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um cliente!");
        }
    }//GEN-LAST:event_botao_salvarMouseClicked
    
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
            java.util.logging.Logger.getLogger(Editar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botao_deletar;
    private javax.swing.JLabel botao_salvar;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_endereco;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_observacao;
    private javax.swing.JTextField campo_telefone;
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_cliente;
    // End of variables declaration//GEN-END:variables
}
