package controler;

import java.sql.Date;

public class Compra {
    private Cliente cliente;
    private int parcalas;
    private Date data;
    private boolean pago;
    private double prcoTotal;
    private Produto[] produto;
    
    public void contarQtdProduto(){
        
    }

    public void cadVenda(Cliente cliente, int parcalas, Date data, double prcoTotal, Produto[] produto) {
        this.cliente = cliente;
        this.parcalas = parcalas;
        this.data = data;
        this.pago = false;
        this.prcoTotal = prcoTotal;
        this.produto = produto;
    }
    
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getParcalas() {
        return parcalas;
    }

    public void setParcalas(int oarcalas) {
        this.parcalas = oarcalas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public double getPrcoTotal() {
        return prcoTotal;
    }

    public void setPrcoTotal(double prcoTotal) {
        this.prcoTotal = prcoTotal;
    }

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }

    
    
}


