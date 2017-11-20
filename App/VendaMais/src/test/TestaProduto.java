package test;

import java.sql.SQLException;
import java.util.ArrayList;

import controler.Categoria;
import controler.Produto;
import dao.ProdutoDAO;

public class TestaProduto {

	public static void main(String[] args) throws SQLException{
		ProdutoDAO dao = new ProdutoDAO();
			
		//Salva um Produto no BD
		/*Produto produto = new Produto();
		produto.setNome("Cerveja (350ml)");
		produto.setPrecoCompra(1.5f);
		produto.setPrecoVenda(2.25f);;
		produto.setQtdEstoque(12);
		Categoria categoria = new Categoria();
		categoria.setIdCat(2);
		produto.setCategoria(categoria);
		dao.save(produto);
		*/
		
		// Mostra busca tudo da tabela Produto
		/*ArrayList<Produto> produtos = dao.getList();
		
		for (Produto produto : produtos) {
			System.out.println("IdProd: " + produto.getIdProd());
			  System.out.println("Nome: " + produto.getNome());
			  System.out.println("Preco Venda: " + produto.getPrecoVenda());
			  System.out.println("Preco Compra: " + produto.getPrecoCompra());
			  System.out.println("Estoque: " + produto.getQtdEstoque());
			  System.out.println("IdCat: " + produto.getCategoria().getIdCat());
			  System.out.println("Nome Cat: " + produto.getCategoria().getNome());
			}
		*/
		
		// Altera um Produto no BD
		/*Produto produto = new Produto();
		produto.setIdProd(4);
		produto.setNome("Cerveja (350ml)");
		produto.setPrecoCompra(1.75f);
		produto.setPrecoVenda(2.50f);
		produto.setQtdEstoque(30);
		Categoria categoria = new Categoria();
		categoria.setIdCat(2);
		produto.setCategoria(categoria);
		dao.update(produto);
		*/	
		
		//Remove um Produto do BD
		/*Produto produto = new Produto();
		produto.setIdProd(3);
		dao.remove(produto);
		*/
	}
}

