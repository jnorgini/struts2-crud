package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import daos.ClientDAO;
import entities.Client;

public class DeleteClientAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private int clientId;
	private ArrayList<Client> clients;

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
		ClientDAO cDAO = new ClientDAO();
		int resultado = cDAO.deleteClient(clientId);
		if (resultado == 1) {
			clients = cDAO.getClients();
			return SUCCESS;
		}
		return ERROR;
	}

}