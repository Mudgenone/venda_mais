package controler;

import java.sql.Date;
import java.util.ArrayList;

import dao.VendaDAO;

public class Venda {
	private long idVenda;
    private Cliente cliente;
    private int parcelas;
    private boolean pago;
    private double precoTotal;
    public ArrayList <Produto> produto;
    private Date dataVenda; 
    
    private VendaDAO dao = new VendaDAO();

    public String create(Cliente cliente, int parcelas, double precoTotal, ArrayList <Produto> produtos, Date dataVenda) {
        if(parcelas<1){
            return "Não pode haver menos de 01 parcela";
        }
        
        if(precoTotal<0) {
        	return "Preço total não pode ser menor que 0";
        }
                      
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.parcelas = parcelas;
        this.pago = false;
        this.precoTotal = precoTotal;
        this.produto = produtos;
        
        dao.save(this);
        return "Venda feita com sucesso!";
    }
    public boolean remove(Venda venda){
    	try {
    		dao.remove(venda);
    		return true;
    	} catch(RuntimeException err) {
    		return false;
    	}        
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


