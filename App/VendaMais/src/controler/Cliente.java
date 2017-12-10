package controler;
import dao.ClienteDAO;
public class Cliente {
	private long id;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String obs;
    
    public void comprar(Produto produto){
        
    }
    public void pagar(Venda venda, double valor){
        
    }
    public String create(String nome, String endereco, String email, String telefone, String obs){
        if (!nome.matches("(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ](?:das?|dos?|de|e|[A-Z][a-z]+))*$")){
            return "Nome inválido\nPor favor, digite novamente!";
        }
        if (endereco.length()>255 || !endereco.matches("^[a-z A-Z0-9.-]*$")){
            return "Endereço Inválido\nPor favor, digite novamente!";
        }
        if (telefone.length()>11 || !telefone.matches("((10)|([1-9][1-9]))9[2-9][0-9]{3}[0-9]{4}")){
            return "Telefone\nPor favor, digite apenas números!";
        }
        if (!email.matches("^[a-zA-Z0-9_.+-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")){
            return "Email Inválido\nPor favor, digite novamente!";
        }
        if (obs.equals("") || obs.length()>255){
            return "Faça uma observação com até 255 caracteres!";
        }
        
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.obs = obs;
     
        ClienteDAO client = new ClienteDAO();
        client.save(this);
        return "Cadastro realizado com sucesso!!!";
    }
    public String update(long ID, String nome, String endereco, String email, String telefone, String obs){
         if (!nome.matches("(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ](?:das?|dos?|de|e|[A-Z][a-z]+))*$")){
            return "Nome inválido\nPor favor, digite novamente!";
        }
        if (endereco.length()>255 || !endereco.matches("^[a-z A-Z0-9.-]*$")){
            return "Endereço Inválido\nPor favor, digite novamente!";
        }
        if (telefone.length()>11 || !telefone.matches("((10)|([1-9][1-9]))9[2-9][0-9]{3}[0-9]{4}")){
            return "Telefone\nPor favor, digite apenas números!";
        }
        if (!email.matches("^[a-zA-Z0-9_.+-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")){
            return "Email Inválido\nPor favor, digite novamente!";
        }
        if (obs.equals("") || obs.length()>255){
            return "Faça uma observação com até 255 caracteres!";
        }
        
        this.id = ID;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.obs = obs;
     
        ClienteDAO client = new ClienteDAO();
        client.update(this);
        return "Mudança feita com sucesso!!!";
    }
    public boolean remove(Cliente cliente){
        ClienteDAO client = new ClienteDAO();
        client.remove(cliente);
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
    
    
}
