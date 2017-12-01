package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import controler.Categoria;
import controler.Cliente;
import controler.Produto;
import controler.Venda;

public class VendaDAO {
	
	public void save(Venda venda) {
		String sql = "insert into venda" +
				" (idcliente,parcela,datavenda,pago,precotot)" +
				" values (?,?,?,?,?) returning idvenda;";
		
		try (Connection con = new Conexao().getConnection()) {
			// cria um preparedStatement
			PreparedStatement stmt = con.prepareStatement(sql);

			// preenche os valores
			stmt.setLong(1, venda.getCliente().getId());
			stmt.setInt(2, venda.getParcelas());
			stmt.setDate(3, Date.valueOf(LocalDate.now()));
			stmt.setBoolean(4, venda.isPago());
			stmt.setDouble(5, venda.getPrecoTotal());
	        
			// executa
			ResultSet rs = stmt.executeQuery();

			if(rs.next()) venda.setIdVenda(rs.getLong("idvenda"));
			
			stmt.close();
			for (Produto produto : venda.getProduto()) {
				VendaProd vendaProd = new VendaProd();
				vendaProd.save(venda, produto);
			}
			System.out.println("Salvo!");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public ArrayList<Venda> getList() {
		try (Connection con = new Conexao().getConnection()) {
			ArrayList<Venda> vendas = new ArrayList<Venda>();

			PreparedStatement stmt = con.prepareStatement("select * from venda");
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				// criando o objeto produto
				Venda venda = new Venda();
				venda.setIdVenda(rs.getLong("idvenda"));
				venda.setParcelas(rs.getInt("parcela"));
				venda.setPago(rs.getBoolean("pago"));
				venda.setPrecoTotal(rs.getFloat("precotot"));
				venda.setDataVenda(rs.getDate("datavenda"));
				
				ClienteDAO cliente = new ClienteDAO(); 
				venda.setCliente(cliente.getClienteById(rs.getLong("idcliente")));
				
				VendaProd produtos_vendidos = new VendaProd();
				venda.setProduto(produtos_vendidos.getProdutosVenda(venda.getIdVenda()));
	            
				// adicionando o objeto à lista
				vendas.add(venda);
			}
			rs.close();
			stmt.close();
			return vendas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Venda venda) {
		try (Connection con = new Conexao().getConnection()) {
			PreparedStatement stmt = con.prepareStatement("delete from venda where idvenda=?");

			stmt.setLong(1, venda.getIdVenda());
			stmt.execute();
			stmt.close();
			System.out.println("Removido!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
