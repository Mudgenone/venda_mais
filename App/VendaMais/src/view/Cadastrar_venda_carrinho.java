package view;

import controler.Cliente;
import controler.Produto;
import controler.Venda;
import dao.ProdutoDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;

public class Cadastrar_venda_carrinho extends javax.swing.JFrame {

    Cliente cliente = new Cliente();
    ArrayList<Produto> produtos = new ArrayList<>();
    Produto produto = new Produto();
    double total = 0;

    public Cadastrar_venda_carrinho(Cliente cliente) {
        initComponents();
        setSize(668, 402);

        DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
        tabela_produtos.setRowSorter(new TableRowSorter(modelo));
        this.cliente = cliente;
        this.data.setText(LocalDate.now().toString());
        tabela_produtos.getColumnModel().getColumn(0).setMinWidth(0);
        tabela_produtos.getColumnModel().getColumn(0).setMaxWidth(0);
        tabela_carrinho.getColumnModel().getColumn(0).setMinWidth(0);
        tabela_carrinho.getColumnModel().getColumn(0).setMaxWidth(0);
        this.setLocationRelativeTo(null);
        readJTable();
    }

    private Cadastrar_venda_carrinho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO produtoDAO = new ProdutoDAO();

        produtoDAO.getList().forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getIdProd(),
                c.getNome(),
                c.getPrecoVenda()
            });
        });
    }

    public void readJTable2() {

        DefaultTableModel modelo = (DefaultTableModel) tabela_carrinho.getModel();

        modelo.addRow(new Object[]{
            this.produto.getIdProd(),
            this.produto.getNome(),
            this.produto.getQntVendida()
        });
    }

    public Boolean inTable(String id) {
        int linha = tabela_carrinho.getRowCount();

        for (int i = 0; i < linha; i++) {
            if (String.valueOf(tabela_carrinho.getValueAt(i, 0)).equals(id)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_carrinho = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        botao_addcarrinho = new javax.swing.JLabel();
        icon_voltar = new javax.swing.JLabel();
        quantidade = new javax.swing.JSpinner();
        data = new javax.swing.JLabel();
        preco_total = new javax.swing.JLabel();
        parcelas = new javax.swing.JSpinner();
        finalizar = new javax.swing.JLabel();
        nada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro da Venda");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(null);

        tabela_carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Produto", "Qtd."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_carrinho.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela_carrinho);
        if (tabela_carrinho.getColumnModel().getColumnCount() > 0) {
            tabela_carrinho.getColumnModel().getColumn(0).setResizable(false);
            tabela_carrinho.getColumnModel().getColumn(1).setResizable(false);
            tabela_carrinho.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 120, 200, 150);

        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Produto", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produtos.getTableHeader().setReorderingAllowed(false);
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_produtos);
        if (tabela_produtos.getColumnModel().getColumnCount() > 0) {
            tabela_produtos.getColumnModel().getColumn(0).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabela_produtos.getColumnModel().getColumn(1).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 120, 210, 150);

        botao_addcarrinho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botao_addcarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_addcarrinhoMouseClicked(evt);
            }
        });
        getContentPane().add(botao_addcarrinho);
        botao_addcarrinho.setBounds(270, 160, 110, 70);

        icon_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(icon_voltar);
        icon_voltar.setBounds(10, 30, 60, 50);

        quantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        quantidade.setValue(1);
        getContentPane().add(quantidade);
        quantidade.setBounds(270, 120, 110, 30);
        getContentPane().add(data);
        data.setBounds(210, 320, 90, 30);

        preco_total.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 12)); // NOI18N
        getContentPane().add(preco_total);
        preco_total.setBounds(130, 290, 70, 20);

        parcelas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(parcelas);
        parcelas.setBounds(100, 320, 60, 30);

        finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarMouseClicked(evt);
            }
        });
        getContentPane().add(finalizar);
        finalizar.setBounds(400, 290, 240, 70);

        nada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar venda – 3.png"))); // NOI18N
        getContentPane().add(nada);
        nada.setBounds(0, 0, 650, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_voltarMouseClicked
        Cadastrar_venda tela = new Cadastrar_venda();
        tela.setVisible(true);
    }//GEN-LAST:event_icon_voltarMouseClicked

    private void botao_addcarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_addcarrinhoMouseClicked

        String pegou = quantidade.getValue().toString();

        System.out.println(pegou);
        if (tabela_produtos.getSelectedRow() != -1) {
            this.produto.setQntVendida(Integer.parseInt(pegou));
            if (this.produto.getQtdEstoque() >= this.produto.getQntVendida()) {
                if (!inTable(String.valueOf(this.produto.getIdProd()))) {
                    this.produto.setQtdEstoque(this.produto.getQtdEstoque() - this.produto.getQntVendida());
                    System.out.println(this.produto.getQtdEstoque());
                    this.produtos.add(this.produto);
                    this.total += this.produto.getQntVendida() * this.produto.getPrecoVenda();
                    preco_total.setText(String.valueOf(this.total));
                    readJTable2();
                } else {
                    JOptionPane.showMessageDialog(null, "Produto já foi adicionado!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Estoque insuficiente!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Escolha um produto!");
        }
    }//GEN-LAST:event_botao_addcarrinhoMouseClicked

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked

        int k = tabela_produtos.getSelectedRow();
        long ID = (long) tabela_produtos.getValueAt(k, 0);
        ProdutoDAO produto = new ProdutoDAO();
        this.produto = produto.getProdutoById(ID);
        System.out.println(this.produto.getNome());
    }//GEN-LAST:event_tabela_produtosMouseClicked

    private void finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseClicked
        if (tabela_carrinho.getRowCount() != 0) {
            Venda venda = new Venda();
            String mostra = venda.create(this.cliente, Integer.parseInt(parcelas.getValue().toString()), this.total, this.produtos);
            JOptionPane.showMessageDialog(null, mostra);
            Cadastrar_venda tela = new Cadastrar_venda();
            tela.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Nada para cadastrar!");
        }
    }//GEN-LAST:event_finalizarMouseClicked

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
            java.util.logging.Logger.getLogger(Cadastrar_venda_carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_venda_carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_venda_carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_venda_carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_venda_carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botao_addcarrinho;
    private javax.swing.JLabel data;
    private javax.swing.JLabel finalizar;
    private javax.swing.JLabel icon_voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nada;
    private javax.swing.JSpinner parcelas;
    private javax.swing.JLabel preco_total;
    private javax.swing.JSpinner quantidade;
    private javax.swing.JTable tabela_carrinho;
    private javax.swing.JTable tabela_produtos;
    // End of variables declaration//GEN-END:variables
}
