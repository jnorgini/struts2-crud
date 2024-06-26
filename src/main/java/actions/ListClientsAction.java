package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import daos.ClientDAO;
import entities.Client;

public class ListClientsAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private ArrayList<Client> clients;

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String execute() throws Exception {
		ClientDAO cDAO = new ClientDAO();
		clients = cDAO.getClients();
		return SUCCESS;
	}

}