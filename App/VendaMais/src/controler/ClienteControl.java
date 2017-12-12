package controler;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteControl {
    /* implementação futura
    public void receberPagamento(Venda venda, double valor) {

    }
    */
    
    public String create(String nome, String endereco, String email, String telefone, String obs) {
        Cliente cl = new Cliente();
        if (!nome.matches("(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ](?:das?|dos?|de|e|[A-Z][a-z]+))*$")) {
            return "Nome inválido\nPor favor, digite novamente!";
        }
        if (endereco.length() > 255 || !endereco.matches("^[a-z A-Z0-9.-]*$")) {
            return "Endereço Inválido\nPor favor, digite novamente!";
        }
        if (!telefone.matches("((10)|([1-9][1-9]))9[2-9][0-9]{3}[0-9]{4}$")) {
            return "Telefone\nPor favor, digite apenas números!";
        }
        if (!email.matches("^[a-zA-Z0-9_.+-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")) {
            return "Email Inválido\nPor favor, digite novamente!";
        }
        if (obs.equals("") || obs.length() > 255) {
            return "Faça uma observação com até 255 caracteres!";
        }

        cl.setNome(nome);
        cl.setEndereco(endereco);
        cl.setEmail(email);
        cl.setTelefone(telefone);
        cl.setObs(obs);

        ClienteDAO client = new ClienteDAO();
        client.save(cl);
        return "Cadastro realizado com sucesso!!!";
    }

    public String update(long ID, String nome, String endereco, String email, String telefone, String obs) {
        Cliente cl = new Cliente();
        if (!nome.matches("(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ](?:das?|dos?|de|e|[A-Z][a-z]+))*$")) {
            return "Nome inválido\nPor favor, digite novamente!";
        }
        if (endereco.length() > 255 || !endereco.matches("^[a-z A-Z0-9.-]*$")) {
            return "Endereço Inválido\nPor favor, digite novamente!";
        }
        if (!telefone.matches("((10)|([1-9][1-9]))9[2-9][0-9]{3}[0-9]{4}$")) {
            return "Telefone\nPor favor, digite apenas números!";
        }
        if (!email.matches("^[a-zA-Z0-9_.+-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")) {
            return "Email Inválido\nPor favor, digite novamente!";
        }
        if (obs.equals("") || obs.length() > 255) {
            return "Faça uma observação com até 255 caracteres!";
        }

        cl.setId(ID);
        cl.setNome(nome);
        cl.setEndereco(endereco);
        cl.setEmail(email);
        cl.setTelefone(telefone);
        cl.setObs(obs);

        ClienteDAO client = new ClienteDAO();
        client.update(cl);
        return "Mudança feita com sucesso!!!";
    }

    public boolean remove(Cliente cliente) {
        ClienteDAO client = new ClienteDAO();
        client.remove(cliente);
        return true;
    }
}
