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
                        
                        ProdutoDAO prod = new ProdutoDAO();
                        
                        prod.update(produto);
			stmt.close();
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public ArrayList <Produto> getProdutosVenda(long idVenda ) {
		try(Connection con = new Conexao().getConnection()){
			ArrayList<Produto> produtos = new ArrayList<Produto>();
			
			String sql = "select p.*,c.nome as nomecat from produto as p,categoria as c, venda_produto as vp where vp.idvenda=? and p.idprod=vp.idprod and p.idCat = c.idCat";
		
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, idVenda);
			//Retorna o id dos produtos 
			ResultSet rs = stmt.executeQuery();
		
			while(rs.next()) {
				// adicionando o objeto à lista
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
				
				produtos.add(produto);
			}
			rs.close();
			stmt.close();
			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
