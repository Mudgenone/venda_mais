package controler;

import dao.CategoriaDAO;

public class Categoria {
    private long idCat;
    private String nome;
    CategoriaDAO categoria = new CategoriaDAO();
    
    public void cadastrar(){
        
    }
    public String create(long idCat, String nome){
        if (nome.length()>20){
            return "O nome não pode ter mais de 20 caracteres";
        }
                
        this.idCat = idCat;
        this.nome = nome;
        
        categoria.save(this);
        return "Categoria salva com sucesso!!!"+idCat +nome;
    }
    public String update(long idCat, String nome){
        this.idCat = idCat;
        this.nome = nome;
        
        categoria.update(this);
        return "Atualização realizada com sucesso!!!";
    }
    public String remove(Categoria categoria){
        categoria.remove(categoria);
        return "a categoria "+idCat+" foi apagada com sucesso!!!";
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
