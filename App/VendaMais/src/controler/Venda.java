package controler;

import java.sql.Date;
import java.util.ArrayList;

public class Venda {
	private long idVenda;
    private Cliente cliente;
    private int parcelas;
    private boolean pago;
    private double precoTotal;
    private ArrayList <Produto> produto;
    private Date dataVenda; 

    public void cadVenda(Cliente cliente, int parcelas, double precoTotal, ArrayList <Produto> produto) {
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

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

	public long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
}


