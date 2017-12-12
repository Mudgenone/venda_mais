package view;

import controler.CategoriaControl;
import javax.swing.JOptionPane;

public class Cadastrar_categoria extends javax.swing.JFrame {

    public Cadastrar_categoria() {
        initComponents();
        setSize(668, 402);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon_voltar = new javax.swing.JLabel();
        botao_salvar = new javax.swing.JLabel();
        campo_nomecategoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(20, 30, 50, 50);

        botao_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_salvarMouseClicked(evt);
            }
        });
        getContentPane().add(botao_salvar);
        botao_salvar.setBounds(380, 260, 190, 70);

        campo_nomecategoria.setBorder(null);
        getContentPane().add(campo_nomecategoria);
        campo_nomecategoria.setBounds(30, 140, 280, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar categoria.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_voltarMouseClicked
        Home tela = new Home();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_icon_voltarMouseClicked

    private void botao_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseClicked
        CategoriaControl nova_categoria = new CategoriaControl();
        String retorno = nova_categoria.create(campo_nomecategoria.getText());
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
            java.util.logging.Logger.getLogger(Cadastrar_categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botao_salvar;
    private javax.swing.JTextField campo_nomecategoria;
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
