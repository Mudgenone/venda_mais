package test;

import java.sql.SQLException;
import java.util.ArrayList;

import controler.Cliente;
import controler.Produto;
import controler.Venda;
import dao.VendaDAO;
import dao.VendaProd;

public class TestaVenda {
	public static void main(String[] args) throws SQLException {
		VendaDAO dao = new VendaDAO();
		
		// Salva uma Venda no BD
		/*Cliente cliente = new Cliente();
		cliente.setId(2);
		
		Produto produto[] = new Produto[2];
		produto[0] = new Produto();
		produto[1] = new Produto();
		 
		produto[0].setIdProd(4);
		produto[0].setQntVendida(2);
		produto[1].setIdProd(1);
		produto[1].setQntVendida(1);
		
		Venda venda = new Venda();
		venda.setCliente(cliente);;
		venda.setParcelas(3);
		venda.setPago(false);
		venda.setPrecoTotal(125);
		venda.setProduto(produto);
		
		dao.save(venda);
		*/
		
		//Retorna Produtos Vendidos
		/*
		VendaProd vendido = new VendaProd(); 
		
		ArrayList <Produto> produtos = new ArrayList<Produto>();
		
		produtos = vendido.getProdutosVenda(4);
		
		for (Produto produto : produtos) {
			System.out.println("--------------------");			
			System.out.println("IdProd: " + produto.getIdProd());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preco Venda: " + produto.getPrecoVenda());
			System.out.println("Preco Compra: " + produto.getPrecoCompra());
			System.out.println("Estoque: " + produto.getQtdEstoque());
			System.out.println("IdCat: " + produto.getCategoria().getIdCat());
			System.out.println("Nome Cat: " + produto.getCategoria().getNome());
		}
		*/
		//Lista todas as vendas
		/*
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		
		vendas = dao.getList();
		
		for (Venda venda: vendas) {
			System.out.println("------Venda------");
			System.out.println(venda.getIdVenda());
			System.out.println(venda.getParcelas());
			System.out.println(venda.getPrecoTotal());
			System.out.println(venda.getDataVenda());
			System.out.println("--------Cliente-------");
			System.out.println(venda.getCliente().getNome());
			System.out.println("------Produto------");
			for (Produto produto: venda.getProduto()) {
				System.out.println(produto.getNome());
			}
		}
		*/
	}
}
