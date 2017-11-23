package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controler.Produto;
import controler.Venda;

public class VendaProd {
private Connection con;
	
	public VendaProd (){
		this.con = new Conexao().getConnection();
	}
	
	public void save(Venda venda, Produto produto) {
		String sql = "insert into venda_produto"
				+ "(idprod,idvenda,qndprod)"
				+ "values (?,?,?)";
		
		try {
			// cria um preparedStatement
			PreparedStatement stmt = this.con.prepareStatement(sql);

			// preenche os valores
			stmt.setLong(1, produto.getIdProd());
			stmt.setLong(2, venda.getIdVenda());
			stmt.setInt(3, produto.getQntVendida());
	        
			// executa
			stmt.execute();
			stmt.close();
			this.con.close();
			System.out.println("Venda_Prod foi Salva!");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} 
	}
}
