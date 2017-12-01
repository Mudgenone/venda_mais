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

    public String create(String nome, float precoVenda, float precoCompra, Categoria categoria, int qtdEstoque) {
        if(nome.length()>40){
            return "Seu nome tem mais de 80 carecteres, por favor digite um nome menor!";
        }
        if (precoCompra < 0){
            return "Valor do preço de compra não pode ser menor que 0!";
        }
        if(precoVenda < 0){
            return "Valor do preço de venda não pode ser menor que 0!";
        }
        if(qtdEstoque < 0){
            return "Sua quantidade de estoque esta menor que 0, faça novas compras!";
        }
        
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.categoria = categoria;
        this.qtdEstoque = qtdEstoque;
               
        ProdutoDAO produt = new ProdutoDAO();
        produt.save(this);
        return "Cadastro realizado com sucesso!!!";
    }
    public String update(long id, String nome, float precoVenda, float precoCompra, Categoria categoria, int qtdEstoque){
        if(nome.length()>40){
            return "Seu nome tem mais de 80 carecteres, por favor digite um nome menor!";
        }
        if (precoCompra < 0){
            return "Valor do preço de compra não pode ser menor que 0!";
        }
        if(precoVenda < 0){
            return "Valor do preço de venda não pode ser menor que 0!";
        }
        if(qtdEstoque < 0){
            return "Sua quantidade de estoque esta menor que 0, faça novas compras!";
        }
        
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.categoria = categoria;
        this.qtdEstoque = qtdEstoque;
        this.idProd = id;
        
        ProdutoDAO produt = new ProdutoDAO();
        produt.update(this);
        return "Mudança realizado com sucesso!!!";
    }
    public boolean remove(Produto produto){
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


