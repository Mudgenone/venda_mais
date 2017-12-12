package controler;

import dao.ProdutoDAO;
import model.Categoria;
import model.Produto;

public class ProdutoControl {

    public String create(String nome, String precoVenda, String precoCompra, Categoria categoria, int qtdEstoque) {
        Produto pd = new Produto();
        if (nome.equals("") || nome.length() > 40) {
            return "Seu nome tem mais de 80 carecteres, por favor digite um nome menor!";
        }
        if (!precoCompra.matches("^\\d+\\.?\\d+$")) {
            return "Preço de Compra Inválido\nPor favor, digite novamente!\nEx: 19.20";
        }
        if (!precoVenda.matches("^\\d+\\.?\\d+$")) {
            return "Preço de Venda Inválido\nPor favor, digite novamente!\nEx: 19.20";
        }
        if (qtdEstoque < 0) {
            return "Quantidade no Estoque Inválida!\nPor favor, digite novamente!";
        }

        pd.setNome(nome);
        pd.setPrecoVenda(Float.parseFloat(precoVenda));
        pd.setPrecoCompra(Float.parseFloat(precoCompra));
        pd.setCategoria(categoria);
        pd.setQtdEstoque(qtdEstoque);

        ProdutoDAO produt = new ProdutoDAO();
        produt.save(pd);
        return "Cadastro realizado com sucesso!!!";
    }

    public String update(long id, String nome, String precoVenda, String precoCompra, Categoria categoria, int qtdEstoque) {
        Produto pd = new Produto();
        if (nome.equals("") || nome.length() > 40) {
            return "Nome Inválido\nPor favor digite novamente!";
        }
        if (!precoCompra.matches("^\\d+\\.?\\d+$")) {
            return "Preço de Compra Inválido\nPor favor, digite novamente!\nEx: 19.20";
        }
        if (!precoVenda.matches("^\\d+\\.?\\d+$")) {
            return "Preço de Venda Inválido\nPor favor, digite novamente!\nEx: 19.20";
        }
        if (qtdEstoque < 0) {
            return "Quantidade no Estoque Inválida!\nPor favor, digite novamente!";
        }

        pd.setNome(nome);
        pd.setPrecoVenda(Float.parseFloat(precoVenda));
        pd.setPrecoCompra(Float.parseFloat(precoCompra));
        pd.setCategoria(categoria);
        pd.setQtdEstoque(qtdEstoque);
        pd.setIdProd(id);

        ProdutoDAO produt = new ProdutoDAO();
        produt.update(pd);
        return "Mudança realizado com sucesso!!!";
    }

    public boolean remove(Produto produto) {
        ProdutoDAO produt = new ProdutoDAO();
        produt.remove(produto);
        return true;
    }
}
