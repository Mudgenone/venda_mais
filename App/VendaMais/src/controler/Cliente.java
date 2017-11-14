package controler;
public class Cliente {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    
    
    public void comprar(Produto produto){
        
    }
    public void pagar(Compra compra, double valor){
        
    }
    public void cadastrar(String nome, String endereco, String email, String telefone){
        if (nome.length()>80){
            return;
        }
        if (endereco.length()>100){
            return;
        }
        if (email.length()>100){
            return;
        }
        if (telefone.length()>12){
            return;
        }
        
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        
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
    
    
}
