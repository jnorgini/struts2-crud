package actions;

import com.opensymphony.xwork2.ActionSupport;

import entities.Client;
import services.ClientService;

public class GetClientAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private int clientId;
	private Client client;
	private ClientService clientService;

	public GetClientAction() {
		this.clientService = new ClientService();
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String execute() throws Exception {
		client = clientService.getClient(clientId);
		return SUCCESS;
	}

}