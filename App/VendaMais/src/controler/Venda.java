package controler;

public class Venda {
	private long idVenda;
    private Cliente cliente;
    private int parcelas;
    private boolean pago;
    private double precoTotal;
    private Produto[] produto;

    public void cadVenda(Cliente cliente, int parcelas, double precoTotal, Produto[] produto) {
        this.cliente = cliente;
        this.parcelas = parcelas;
        this.pago = false;
        this.precoTotal = precoTotal;
        this.produto = produto;
    }
    
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double prcoTotal) {
        this.precoTotal = prcoTotal;
    }

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }

	public long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}
}


