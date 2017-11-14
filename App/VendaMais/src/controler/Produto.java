package controler;
class Produto {
    private String nome;
    private float valorVenda;
    private float valorCampra;
    private Categoria categoria;
    private int qtdEstoque;

    public void cadastrar(String nome, float valorVenda, float valorCampra, Categoria categoria, int qtdEstoque) {
        this.nome = nome;
        this.valorVenda = valorVenda;
        this.valorCampra = valorCampra;
        this.categoria = categoria;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorCampra() {
        return valorCampra;
    }

    public void setValorCampra(float valorCampra) {
        this.valorCampra = valorCampra;
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
    
    
}


