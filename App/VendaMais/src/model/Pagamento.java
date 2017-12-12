package model;

import java.sql.Date;

public class Pagamento {

    private long idPag;
    private Venda venda;
    private Date dataPag;
    private double valor;

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
