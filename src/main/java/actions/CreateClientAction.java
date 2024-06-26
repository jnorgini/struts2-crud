package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import daos.ClientDAO;
import entities.Client;

public class CreateClientAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private String name;
	private String email;

	private ArrayList<Client> clients;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClientes(ArrayList<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String execute() throws Exception {
		ClientDAO cDAO = new ClientDAO();
		Client client = new Client(name, email);
		int result = cDAO.createClient(client);
		if (result == 1) {
			clients = cDAO.getClients();
			return SUCCESS;
		}
		return ERROR;
	}

}