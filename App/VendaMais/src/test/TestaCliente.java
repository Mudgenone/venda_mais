package test;

import java.sql.SQLException;
import java.util.ArrayList;

import controler.Cliente;
import dao.ClienteDAO;  

public class TestaCliente {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ClienteDAO dao = new ClienteDAO();
		
		// Salva um Cliente no BD
		/*Cliente cliente = new Cliente();
		cliente.setNome("Dj Rogerinho");
		cliente.setEmail("hackearam");
		cliente.setTelefone("666123456789");
		cliente.setEndereco("R. Tortão pra Esquerda 666");
		cliente.setObs("Caloteiro");
		dao.save(cliente);
		*/
		
		//Retorna um cliente pelo id
		/*
		Cliente cliente = new Cliente();
		
		cliente = dao.getClienteById(2);
		
		System.out.println("Id: " + cliente.getId());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Obs: " + cliente.getObs());
		*/
		
		// Mostra tudo da tabela Cliente
		/*ArrayList<Cliente> clientes = dao.getList();
		
		for (Cliente cliente : clientes) {
			System.out.println("Id: " + cliente.getId());
			  System.out.println("Nome: " + cliente.getNome());
			  System.out.println("Email: " + cliente.getEmail());
			  System.out.println("Endereço: " + cliente.getEndereco());
			  System.out.println("Telefone: " + cliente.getTelefone());
			  System.out.println("Obs: " + cliente.getObs());
			}
		*/
		
		// Altera um Cliente no BD
		/*Cliente cliente = new Cliente();
		cliente.setId(2);
		cliente.setNome("Jubilada");
		cliente.setEmail("jub@email.com");
		cliente.setTelefone("082123456789");
		cliente.setEndereco("R. Feijão Queimado 666");
		cliente.setObs("Devendo");
		dao.update(cliente);
		*/	
		
		//Remove um Cliente do BD
		/*Cliente cliente = new Cliente();
		cliente.setId(3);
		dao.remove(cliente);
		*/
	}

}
