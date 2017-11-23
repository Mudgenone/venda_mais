package test;

import java.util.ArrayList;

import controler.Categoria;
import dao.CategoriaDAO;

public class TestaCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoriaDAO dao = new CategoriaDAO();
		
		// Salva uma Categoria no BD
		/*Categoria categoria = new Categoria();
		categoria.setNome("Alimento");
		dao.save(categoria);
		*/
		
		// Mostra tudo da tabela Categoria
		/*ArrayList<Categoria> categorias = dao.getList();
		
		for (Categoria categoria : categorias) {
			System.out.println("Id: " + categoria.getIdCat());
			  System.out.println("Nome: " + categoria.getNome());
			}
		*/
		
		// Altera uma Categoria no BD
		/*Categoria categoria = new Categoria();
		categoria.setIdCat(2);
		categoria.setNome("Bebida");
		dao.update(categoria);
		*/
		
		//Remove uma Categoria do BD
		/*Categoria categoria = new Categoria();
		categoria.setIdCat(3);
		dao.remove(categoria);
		*/
	}

}
