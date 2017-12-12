package controler;

import java.util.ArrayList;

import dao.VendaDAO;
import model.Cliente;
import model.Produto;
import model.Venda;

public class VendaControl {
        
    private VendaDAO dao = new VendaDAO();

    public String create(Cliente cliente, int parcelas, double precoTotal, ArrayList <Produto> produtos) {
        Venda v = new Venda();
        if(parcelas<1){
            return "Não pode haver menos de 01 parcela";
        }
        
        if(precoTotal<0) {
        	return "Preço total não pode ser menor que 0";
        }
                      
        v.setCliente(cliente);
        v.setParcelas(parcelas);
        v.setPago(false);
        v.setPrecoTotal(precoTotal);
        v.setProduto(produtos);
        
        dao.save(v);
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
}


