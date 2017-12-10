package controler;

import dao.ProdutoDAO;

public class Produto {

    private long idProd;
    private String nome;
    private float precoVenda;
    private float precoCompra;
    private Categoria categoria;
    private int qtdEstoque;
    private int qntVendida;

    public String create(String nome, String precoVenda, String precoCompra, Categoria categoria, int qtdEstoque) {
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

        this.nome = nome;
        this.precoVenda = Float.parseFloat(precoVenda);
        this.precoCompra = Float.parseFloat(precoCompra);
        this.categoria = categoria;
        this.qtdEstoque = qtdEstoque;

        ProdutoDAO produt = new ProdutoDAO();
        produt.save(this);
        return "Cadastro realizado com sucesso!!!";
    }

    public String update(long id, String nome, String precoVenda, String precoCompra, Categoria categoria, int qtdEstoque) {
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

        this.nome = nome;
        this.precoVenda = Float.parseFloat(precoVenda);
        this.precoCompra = Float.parseFloat(precoCompra);
        this.categoria = categoria;
        this.qtdEstoque = qtdEstoque;
        this.idProd = id;

        ProdutoDAO produt = new ProdutoDAO();
        produt.update(this);
        return "Mudança realizado com sucesso!!!";
    }

    public boolean remove(Produto produto) {
        ProdutoDAO produt = new ProdutoDAO();
        produt.remove(produto);
        return true;
    }

    public long getIdProd() {
        return idProd;
    }

    public void setIdProd(long idProd) {
        this.idProd = idProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getQntVendida() {
        return qntVendida;
    }

    public void setQntVendida(int qntVendida) {
        this.qntVendida = qntVendida;
    }
}
