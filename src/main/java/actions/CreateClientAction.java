package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entities.Client;
import services.ClientService;

public class CreateClientAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private ArrayList<Client> clients;
	private ClientService clientService;

	public CreateClientAction() {
		this.clientService = new ClientService();
	}

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
		Client client = new Client(name, email);
		boolean result = clientService.createClient(client);
		if (result) {
			clients = clientService.getClients();
			return SUCCESS;
		}
		return ERROR;
	}

}