package controler;

import dao.CategoriaDAO;
import model.Categoria;

public class CategoriaControl {
    CategoriaDAO categoria = new CategoriaDAO();

    public String create(String nome) {
        Categoria cat = new Categoria();
        try {
            if (nome.equals("") || nome.length() > 20) {
                return "Nome inválido\nPor Favor, digite novamente!";
            }

            cat.setNome(nome);

            categoria.save(cat);
            return "Categoria salva com sucesso!!!";
        } catch (RuntimeException e) {
            System.err.println(e);
            return "Erro ao salvar categoria!";
        }

    }

    public String update(long idCat, String nome) {
        Categoria cat = new Categoria();
        try {
            if (nome.equals("") || nome.length() > 20) {
                return "Nome inválido\nPor Favor, digite novamente!";
            }

            cat.setIdCat(idCat);
            cat.setNome(nome);

            categoria.update(cat);
            return "Atualização realizada com sucesso!!!";
        } catch (RuntimeException e) {
            System.err.println(e);
            return "Erro ao realizar atualização";
        }

    }

    public String remove(Categoria categoria) {
        try {
            this.categoria.remove(categoria);
            return "Categoria foi apagada com sucesso!!!";
        } catch (RuntimeException e) {
            System.err.println(e);
            return "Erro ao remover categoria";
        }

    }
}
