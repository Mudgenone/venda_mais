package controler;

import java.sql.Date;

import dao.PagamentoDAO;

public class Pagamento {
	private long idPag;
	private Venda venda;
	private Date dataPag;
	private double valor;
	
	PagamentoDAO dao = new PagamentoDAO(); 
	
	public String cadastrar(Venda venda, Date dataPag, double valor) {
		if (valor <=0) {
			return "Valor não pode ser menor que 1!";
		}
		this.venda = venda;
		this.dataPag = dataPag;
		this.valor = valor;
		
		dao.save(this);
		return "Cadastro realizado com sucesso!";
	}
	public String remove() {
		dao.remove(this);
		return "Deletado com Sucesso!";
	}
	
	public long getIdPag() {
		return idPag;
	}
	public void setIdPag(long idPag) {
		this.idPag = idPag;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Date getDataPag() {
		return dataPag;
	}
	public void setDataPag(Date dataPag) {
		this.dataPag = dataPag;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
			
}
