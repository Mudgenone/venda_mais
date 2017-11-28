package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controler.Categoria;

public class CategoriaDAO {
	private Connection con;
	
	public CategoriaDAO(){
		this.con = new Conexao().getConnection();
	}
	
	public void save(Categoria categoria) {
		String sql = "insert into categoria" +
				" (nome)" +
				" values (?)";
		
		try {
			// cria um preparedStatement
			PreparedStatement stmt = this.con.prepareStatement(sql);

			// preenche os valores
			stmt.setString(1, categoria.getNome());
	        
	        // executa
	        stmt.execute();
	        stmt.close();
	        System.out.println("Salvo!");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public ArrayList<Categoria> getList() {
		try {
			ArrayList<Categoria> categorias = new ArrayList<Categoria>();

			PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM categoria");
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				// criando o objeto produto
				Categoria categoria = new Categoria();
				categoria.setIdCat(rs.getLong("idcat"));
				categoria.setNome(rs.getString("nome"));

				// adicionando o objeto à lista
				categorias.add(categoria);
			}
			rs.close();
			stmt.close();
			return categorias;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void update(Categoria produto) {
		String sql = "update categoria set nome=? where idcat=?";
		try {
			PreparedStatement stmt = this.con.prepareStatement(sql);

			stmt.setString(1, produto.getNome());
			stmt.setLong(2, produto.getIdCat());

			stmt.execute();
			stmt.close();
			System.out.println("Alterado!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Categoria produto) {
		try {
			PreparedStatement stmt = this.con.prepareStatement("delete from categoria where idcat=?");

			stmt.setLong(1, produto.getIdCat());
			
			stmt.execute();
			stmt.close();
			System.out.println("Removido!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
