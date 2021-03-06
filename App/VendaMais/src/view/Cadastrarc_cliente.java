package view;

import controler.ClienteControl;
import javax.swing.JOptionPane;

public class Cadastrarc_cliente extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public Cadastrarc_cliente() {
        initComponents();
        setSize(668, 402);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo_observacao = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        campo_telefone = new javax.swing.JTextField();
        campo_endereco = new javax.swing.JTextField();
        campo_nomenovocliente = new javax.swing.JTextField();
        botao_salvar = new javax.swing.JLabel();
        icon_voltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        campo_observacao.setBorder(null);
        getContentPane().add(campo_observacao);
        campo_observacao.setBounds(340, 130, 290, 60);

        campo_email.setBorder(null);
        campo_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_emailActionPerformed(evt);
            }
        });
        getContentPane().add(campo_email);
        campo_email.setBounds(20, 320, 290, 30);

        campo_telefone.setBorder(null);
        getContentPane().add(campo_telefone);
        campo_telefone.setBounds(20, 254, 290, 30);

        campo_endereco.setToolTipText("");
        campo_endereco.setBorder(null);
        campo_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(campo_endereco);
        campo_endereco.setBounds(20, 190, 290, 30);

        campo_nomenovocliente.setBorder(null);
        getContentPane().add(campo_nomenovocliente);
        campo_nomenovocliente.setBounds(20, 130, 290, 30);

        botao_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_salvarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_salvar);
        botao_salvar.setBounds(380, 260, 200, 60);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(10, 30, 60, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar cliente_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_voltarMouseClicked
        Home tela = new Home();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_voltarMouseClicked

    private void campo_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_enderecoActionPerformed

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_emailActionPerformed

    private void botao_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseClicked
        ClienteControl cadastrar_cliente = new ClienteControl();
        String retorno = cadastrar_cliente.create(campo_nomenovocliente.getText(), campo_endereco.getText(), campo_email.getText(), campo_telefone.getText(), campo_observacao.getText());
        JOptionPane.showMessageDialog(null, retorno);

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
            java.util.logging.Logger.getLogger(Cadastrarc_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrarc_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrarc_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrarc_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrarc_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botao_salvar;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_endereco;
    private javax.swing.JTextField campo_nomenovocliente;
    private javax.swing.JTextField campo_observacao;
    private javax.swing.JTextField campo_telefone;
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
