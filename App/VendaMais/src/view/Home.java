/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ander
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setSize(668, 402);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon_receberpagamento = new javax.swing.JLabel();
        icon_principalalterardados = new javax.swing.JLabel();
        icon_cadastrarvenda = new javax.swing.JLabel();
        icon_cadastrarproduto = new javax.swing.JLabel();
        icon_cadastrarcategoria = new javax.swing.JLabel();
        icon_cadastrarclientes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        icon_receberpagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_receberpagamentoMouseClicked(evt);
            }
        });
        getContentPane().add(icon_receberpagamento);
        icon_receberpagamento.setBounds(520, 10, 90, 90);

        icon_principalalterardados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_principalalterardadosMouseClicked(evt);
            }
        });
        getContentPane().add(icon_principalalterardados);
        icon_principalalterardados.setBounds(420, 10, 100, 90);

        icon_cadastrarvenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_cadastrarvendaMouseClicked(evt);
            }
        });
        getContentPane().add(icon_cadastrarvenda);
        icon_cadastrarvenda.setBounds(290, 154, 70, 70);

        icon_cadastrarproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_cadastrarprodutoMouseClicked(evt);
            }
        });
        getContentPane().add(icon_cadastrarproduto);
        icon_cadastrarproduto.setBounds(204, 154, 70, 70);

        icon_cadastrarcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_cadastrarcategoriaMouseClicked(evt);
            }
        });
        getContentPane().add(icon_cadastrarcategoria);
        icon_cadastrarcategoria.setBounds(120, 154, 70, 70);

        icon_cadastrarclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_cadastrarclientesMouseClicked(evt);
            }
        });
        getContentPane().add(icon_cadastrarclientes);
        icon_cadastrarclientes.setBounds(30, 150, 80, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Home_1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_cadastrarclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_cadastrarclientesMouseClicked
        Cadastrarc_cliente tela = new Cadastrarc_cliente();
        tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_icon_cadastrarclientesMouseClicked

    private void icon_cadastrarcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_cadastrarcategoriaMouseClicked
        Cadastrar_categoria tela = new Cadastrar_categoria();
        tela.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_icon_cadastrarcategoriaMouseClicked

    private void icon_cadastrarprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_cadastrarprodutoMouseClicked
        Cadastrar_produto tela = new Cadastrar_produto();
        tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_icon_cadastrarprodutoMouseClicked

    private void icon_cadastrarvendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_cadastrarvendaMouseClicked
        Cadastrar_venda tela = new Cadastrar_venda();
        tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_icon_cadastrarvendaMouseClicked

    private void icon_principalalterardadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_principalalterardadosMouseClicked
        Principal_alterardados tela = new Principal_alterardados();
        tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_icon_principalalterardadosMouseClicked

    private void icon_receberpagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_receberpagamentoMouseClicked
        Receber_pagamento tela = new Receber_pagamento();
        tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_icon_receberpagamentoMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_cadastrarcategoria;
    private javax.swing.JLabel icon_cadastrarclientes;
    private javax.swing.JLabel icon_cadastrarproduto;
    private javax.swing.JLabel icon_cadastrarvenda;
    private javax.swing.JLabel icon_principalalterardados;
    private javax.swing.JLabel icon_receberpagamento;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
