package actions;

import com.opensymphony.xwork2.ActionSupport;

import daos.ClientDAO;
import entities.Client;

public class GetClientAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private int clientId;
	private Client client;

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
		ClientDAO cDAO = new ClientDAO();
		client = cDAO.getClient(clientId);
		return SUCCESS;
	}

}