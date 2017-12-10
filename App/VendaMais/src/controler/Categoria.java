package controler;

import dao.CategoriaDAO;

public class Categoria {

    private long idCat;
    private String nome;
    CategoriaDAO categoria = new CategoriaDAO();

    public String create(String nome) {
        try {
            if (nome.equals("") || nome.length() > 20) {
                return "Nome inválido\nPor Favor, digite novamente!";
            }

            this.nome = nome;

            categoria.save(this);
            return "Categoria salva com sucesso!!!";
        } catch (RuntimeException e) {
            System.err.println(e);
            return "Erro ao salvar categoria!";
        }

    }

    public String update(long idCat, String nome) {
        try {
            if (nome.equals("") || nome.length() > 20) {
                return "Nome inválido\nPor Favor, digite novamente!";
            }

            this.idCat = idCat;
            this.nome = nome;

            categoria.update(this);
            return "Atualização realizada com sucesso!!!";
        } catch (RuntimeException e) {
            System.err.println(e);
            return "Erro ao realizar atualização";
        }

    }

    public String remove(Categoria categoria) {
        try {
            categoria.remove(categoria);
            return "Categoria foi apagada com sucesso!!!";
        } catch (RuntimeException e) {
            System.err.println(e);
            return "Erro ao remover categoria";
        }

    }

    public long getIdCat() {
        return idCat;
    }

    public void setIdCat(long idCat) {
        this.idCat = idCat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
