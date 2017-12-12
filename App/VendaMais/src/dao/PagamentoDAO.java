package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import model.Cliente;
import model.Pagamento;
import model.Venda;

public class PagamentoDAO {

    public void save(Pagamento pagamento) {
        String sql = "insert into pagamento"
                + " (idvenda,datapag,valor)"
                + " values (?,?,?) returning idpag;";

        try (Connection con = new Conexao().getConnection()) {
            // cria um preparedStatement
            PreparedStatement stmt = con.prepareStatement(sql);

            // preenche os valores
            stmt.setLong(1, pagamento.getVenda().getIdVenda());
            stmt.setDate(2, Date.valueOf(LocalDate.now()));
            stmt.setDouble(3, pagamento.getValor());

            // executa
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                pagamento.setIdPag(rs.getLong("idpag"));
            }

            stmt.close();
            System.out.println("Salvo!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Pagamento> getList() {
        try (Connection con = new Conexao().getConnection()) {
            ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

            PreparedStatement stmt = con.prepareStatement("select p.*, v.*,c.* from pagamento as p, venda as v, cliente as c where v.idvenda=p.idvenda and v.idcliente=c.idcliente");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato
                Pagamento pagamento = new Pagamento();
                pagamento.setIdPag(rs.getLong("idpag"));
                pagamento.setDataPag(rs.getDate("datapag"));
                pagamento.setValor(rs.getDouble("valor"));
                // adicionando o objeto à lista

                Venda venda = new Venda();
                venda.setIdVenda(rs.getLong("idvenda"));
                venda.setParcelas(rs.getInt("parcela"));
                venda.setDataVenda(rs.getDate("datavenda"));
                venda.setPago(rs.getBoolean("pago"));
                venda.setPrecoTotal(rs.getDouble("precotot"));

                Cliente cliente = new Cliente();
                cliente.setId(rs.getLong("idcliente"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNome(rs.getString("nome"));
                cliente.setObs(rs.getString("obs"));
                cliente.setTelefone(rs.getString("telefone"));

                venda.setCliente(cliente);

                VendaProd produtos_vendidos = new VendaProd();
                venda.setProduto(produtos_vendidos.getProdutosVenda(venda.getIdVenda()));

                pagamento.setVenda(venda);

                pagamentos.add(pagamento);
            }

            rs.close();
            stmt.close();
            return pagamentos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Pagamento pagamento) {
        try (Connection con = new Conexao().getConnection()) {
            PreparedStatement stmt = con.prepareStatement("delete from pagamento where idpag=?");

            stmt.setLong(1, pagamento.getIdPag());
            stmt.execute();
            stmt.close();
            System.out.println("Removido!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
