package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Produto;
import model.Categoria;

public class ProdutoDAO {
	
	public void save(Produto produto) {
		String sql = "insert into produto" +
				" (nomeprod,qntestoque,precocompra,precovenda,idcat)" +
				" values (?,?,?,?,?)";
		
		try (Connection con = new Conexao().getConnection()) {
			// cria um preparedStatement
			PreparedStatement stmt = con.prepareStatement(sql);

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
		try (Connection con = new Conexao().getConnection()) {
			ArrayList<Produto> produtos = new ArrayList<>();

			PreparedStatement stmt = con.prepareStatement("SELECT p.*, c.nome as nomecat FROM produto as p,categoria as c where p.idCat = c.idCat");
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				// criando o objeto produto
				Produto produto = new Produto();
				produto.setIdProd(rs.getLong("idprod"));
				produto.setNome(rs.getString("nomeprod"));
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
	
	public Produto getProdutoById(long idProd) {
		String sql = "SELECT p.*, c.nome as nomecat FROM produto as p,categoria as c where p.idCat = c.idCat and idprod=?";
		
		try (Connection con = new Conexao().getConnection()){
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, idProd);
			ResultSet rs = stmt.executeQuery();
			
			Produto produto = new Produto();
			
			if(rs.next()) {
				// criando o objeto produto
				produto.setIdProd(rs.getLong("idprod"));
				produto.setNome(rs.getString("nomeprod"));
				produto.setPrecoCompra(rs.getFloat("precocompra"));
				produto.setPrecoVenda(rs.getFloat("precovenda"));
				produto.setQtdEstoque(rs.getInt("qntestoque"));
			
				Categoria categoria = new Categoria();
				categoria.setIdCat(rs.getLong("idcat"));
				categoria.setNome(rs.getString("nomecat"));
				produto.setCategoria(categoria);
			}
			rs.close();
			stmt.close();
			return produto;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void update(Produto produto) {
		String sql = "update produto set nomeprod=?, qntestoque=?,"+
				"precocompra=?, precovenda=?, idcat=? where idprod=?";
		try (Connection con = new Conexao().getConnection()){
			PreparedStatement stmt = con.prepareStatement(sql);

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
		try (Connection con = new Conexao().getConnection()) {
			PreparedStatement stmt = con.prepareStatement("delete from produto where idprod=?");

			stmt.setLong(1, produto.getIdProd());
			stmt.execute();
			stmt.close();
			System.out.println("Removido!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
