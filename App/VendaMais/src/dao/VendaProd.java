package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
