package controler;

import java.sql.Date;

import dao.PagamentoDAO;
import model.Pagamento;
import model.Venda;

public class PagamentoControl {

    PagamentoDAO dao = new PagamentoDAO();

    public String cadastrar(Venda venda, Date dataPag, double valor) {
        Pagamento pg = new Pagamento();
        if (valor <= 0) {
            return "Valor não pode ser menor que 1!";
        }
        pg.setVenda(venda);
        pg.setDataPag(dataPag);
        pg.setValor(valor);

        dao.save(pg);
        return "Cadastro realizado com sucesso!";
    }

    public String remove(Pagamento pg) {
        dao.remove(pg);
        return "Deletado com Sucesso!";
    }
}
