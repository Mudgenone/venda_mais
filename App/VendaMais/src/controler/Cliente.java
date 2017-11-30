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
    public String create(String nome, String endereco, String email, String telefone){
        if (nome.length()>50){
            return "Seu nome tem mais de 50 caractere, por favor digite um nome menor!";
        }
        if (endereco.length()>255){
            return "Seu nome tem mais de 255 caractere, por favor digite um endereço menor!";
        }
        if (email.length()>255){
            return "Seu nome tem mais de 255 caractere, por favor digite um email menor!";
        }
        if (telefone.length()>12){
            return "Seu nome tem mais de 12 caracteres, por favor digite um numero valido EX.:82900000000!";
        }
        
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
     
        ClienteDAO client = new ClienteDAO();
        client.save(this);
        return "Cadastro realizado com sucesso!!!";
    }
    public String update(String nome, String endereco, String email, String telefone){
        if (nome.length()>50){
            return "Seu nome tem mais de 50 caractere, por favor digite um nome menor!";
        }
        if (endereco.length()>255){
            return "Seu nome tem mais de 255 caractere, por favor digite um endereço menor!";
        }
        if (email.length()>255){
            return "Seu nome tem mais de 255 caractere, por favor digite um email menor!";
        }
        if (telefone.length()>12){
            return "Seu nome tem mais de 12 caracteres, por favor digite um numero valido EX.:82900000000!";
        }
        
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
     
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
