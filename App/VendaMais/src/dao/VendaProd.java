package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Categoria;
import controler.Produto;
import controler.Venda;

public class VendaProd {
	
	public void save(Venda venda, Produto produto) {
		String sql = "insert into venda_produto"
				+ "(idprod,idvenda,qndprod)"
				+ "values (?,?,?)";
		
		try(Connection con = new Conexao().getConnection()) {
			// cria um preparedStatement
			PreparedStatement stmt = con.prepareStatement(sql);

			// preenche os valores
			stmt.setLong(1, produto.getIdProd());
			stmt.setLong(2, venda.getIdVenda());
			stmt.setInt(3, produto.getQntVendida());
	        
			// executa
			stmt.execute();
			stmt.close();
			System.out.println("Venda_Prod foi Salva!");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public ArrayList <Produto> getProdutosVenda(long idVenda ) {
		try(Connection con = new Conexao().getConnection()){
			ArrayList<Produto> produtos = new ArrayList<Produto>();
			
			String sql = "select p.idprod from produto as p, venda_produto as vp where vp.idvenda=? and p.idprod=vp.idprod";
		
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, idVenda);
			//Retorna o id dos produtos 
			ResultSet rs = stmt.executeQuery();
		
			while(rs.next()) {
				ProdutoDAO produto = new ProdutoDAO();
				// adicionando o objeto à lista
				produtos.add(produto.getProdutoById(rs.getLong("idprod")));
			}
			rs.close();
			stmt.close();
			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
