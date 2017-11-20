package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Categoria;
import controler.Produto;

public class ProdutoDAO {
private Connection con;
	
	public ProdutoDAO(){
		this.con = new Conexao().getConnection();
	}
	
	public void save(Produto produto) {
		String sql = "insert into produto" +
				" (nome,qntestoque,precocompra,precovenda,idcat)" +
				" values (?,?,?,?,?)";
		
		try {
			// cria um preparedStatement
			PreparedStatement stmt = this.con.prepareStatement(sql);

			// preenche os valores
			stmt.setString(1, produto.getNome());
			stmt.setFloat(2, produto.getQtdEstoque());
	        stmt.setFloat(3, produto.getPrecoCompra());
	        stmt.setFloat(4, produto.getPrecoVenda());
	        stmt.setLong(5, produto.getCategoria().getIdCat());
	        
	        // executa
	        stmt.execute();
	        stmt.close();
	        System.out.println("Salvo!");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public ArrayList<Produto> getList() {
		try {
			ArrayList<Produto> produtos = new ArrayList<Produto>();

			PreparedStatement stmt = this.con.prepareStatement("SELECT p.*, c.nome as nomecat FROM produto as p,categoria as c where p.idCat = c.idCat");
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				// criando o objeto produto
	            Produto produto = new Produto();
	            produto.setIdProd(rs.getLong("idprod"));
	            produto.setNome(rs.getString("nome"));
	            produto.setPrecoCompra(rs.getFloat("precocompra"));
	            produto.setPrecoVenda(rs.getFloat("precovenda"));
	            produto.setQtdEstoque(rs.getInt("qntestoque"));
	            
	            Categoria categoria = new Categoria();
	            categoria.setIdCat(rs.getLong("idcat"));
	            categoria.setNome(rs.getString("nomecat"));
	            produto.setCategoria(categoria);

	            // adicionando o objeto à lista
	            produtos.add(produto);
			}
			rs.close();
	        stmt.close();
	        return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void update(Produto produto) {
		String sql = "update produto set nome=?, qntestoque=?,"+
				"precocompra=?, precovenda=?, idcat=? where idprod=?";
		try {
			PreparedStatement stmt = this.con.prepareStatement(sql);

			stmt.setString(1, produto.getNome());
	        stmt.setInt(2, produto.getQtdEstoque());
	        stmt.setFloat(3, produto.getPrecoCompra());
	        stmt.setFloat(4, produto.getPrecoVenda());
	        stmt.setLong(5, produto.getCategoria().getIdCat());
	        stmt.setLong(6, produto.getIdProd());

	        stmt.execute();
	        stmt.close();
	        System.out.println("Alterado!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Produto produto) {
		try {
			PreparedStatement stmt = this.con.prepareStatement("delete from produto where idprod=?");

			stmt.setLong(1, produto.getIdProd());
			stmt.execute();
			stmt.close();
			System.out.println("Removido!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
