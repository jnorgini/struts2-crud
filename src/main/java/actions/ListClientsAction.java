package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entities.Client;
import services.ClientService;

public class ListClientsAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private ArrayList<Client> clients;
	private ClientService clientService;

	public ListClientsAction() {
		this.clientService = new ClientService();
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String execute() throws Exception {
		clients = clientService.getClients();
		return SUCCESS;
	}

}