package test;

import java.sql.SQLException;

import controler.Cliente;
import controler.Produto;
import controler.Venda;
import dao.VendaDAO;

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
	}
}
