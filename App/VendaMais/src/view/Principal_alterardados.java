package view;

public class Principal_alterardados extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public Principal_alterardados() {
        initComponents();
        setSize(668, 402);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon_alterarproduto = new javax.swing.JLabel();
        icon_alterarclientes = new javax.swing.JLabel();
        icon_voltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        icon_alterarproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_alterarprodutoMouseClicked(evt);
            }
        });
        getContentPane().add(icon_alterarproduto);
        icon_alterarproduto.setBounds(200, 150, 80, 70);

        icon_alterarclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_alterarclientesMouseClicked(evt);
            }
        });
        getContentPane().add(icon_alterarclientes);
        icon_alterarclientes.setBounds(30, 150, 80, 80);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(10, 30, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Alterar dados cadastrados_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_voltarMouseClicked
        Home tela = new Home();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_voltarMouseClicked

    private void icon_alterarclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_alterarclientesMouseClicked
        Editar_cliente tela = new Editar_cliente();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_alterarclientesMouseClicked

    private void icon_alterarprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_alterarprodutoMouseClicked
        Editar_produto tela = new Editar_produto();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_alterarprodutoMouseClicked

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
            java.util.logging.Logger.getLogger(Principal_alterardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_alterardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_alterardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_alterardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_alterardados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_alterarclientes;
    private javax.swing.JLabel icon_alterarproduto;
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
