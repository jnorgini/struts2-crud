package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entities.Client;
import services.ClientService;

public class DeleteClientAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private int clientId;
	private ArrayList<Client> clients;
	private ClientService clientService;

	public DeleteClientAction() {
		this.clientService = new ClientService();
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(clientId);
		boolean result = clientService.deleteClient(clientId);
		if (result) {
			clients = clientService.getClients();
			return SUCCESS;
		}
		return ERROR;
	}

}