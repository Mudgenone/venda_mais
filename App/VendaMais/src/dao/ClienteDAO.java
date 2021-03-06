package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;

public class ClienteDAO {
	
	public void save(Cliente cliente) {
		String sql = "insert into cliente" +
				" (nome,endereco,email,telefone,obs)" +
				" values (?,?,?,?,?)";
		
		try (Connection con = new Conexao().getConnection()){
			// cria um preparedStatement
			PreparedStatement stmt = con.prepareStatement(sql);

			// preenche os valores
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEndereco());
			stmt.setString(3, cliente.getEmail());
			stmt.setString(4, cliente.getTelefone());
			stmt.setString(5, cliente.getObs());
	        
			// executa
			stmt.execute();
			stmt.close();
			System.out.println("Salvo!");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public ArrayList<Cliente> getList() {
		try (Connection con = new Conexao().getConnection()) {
			ArrayList<Cliente> clientes = new ArrayList<Cliente>();

			PreparedStatement stmt = con.prepareStatement("select * from cliente");
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				// criando o objeto Contato
				Cliente cliente = new Cliente();
				cliente.setId(rs.getLong("idcliente"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setObs(rs.getString("obs"));

				// adicionando o objeto à lista
				clientes.add(cliente);
			}
			rs.close();
			stmt.close();
			return clientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Cliente getClienteById(long idCliente) {
		String sql = "select * from cliente where idcliente=?";
		
		try (Connection con = new Conexao().getConnection()) {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, idCliente);
			
			ResultSet rs = stmt.executeQuery();
			
			Cliente cliente = new Cliente();
			
			if(rs.next()) {			
				cliente.setId(rs.getLong("idcliente"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setObs(rs.getString("obs"));
			}
			rs.close();
			stmt.close();
			return cliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void update(Cliente cliente) {
		String sql = "update cliente set nome=?, email=?,"+
				"endereco=?, telefone=?, obs=? where idcliente=?";
		try (Connection con = new Conexao().getConnection()){
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());
			stmt.setString(4, cliente.getTelefone());
			stmt.setString(5, cliente.getObs());
			stmt.setLong(6, cliente.getId());

			stmt.execute();
			stmt.close();
			System.out.println("Alterado!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Cliente cliente) {
		try (Connection con = new Conexao().getConnection()) {
			PreparedStatement stmt = con.prepareStatement("delete from cliente where idcliente=?");

			stmt.setLong(1, cliente.getId());
			stmt.execute();
			stmt.close();
			System.out.println("Removido!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
