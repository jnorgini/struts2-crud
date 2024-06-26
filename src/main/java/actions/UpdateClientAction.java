package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import daos.ClientDAO;
import entities.Client;

public class UpdateClientAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String email;

	private ArrayList<Client> clients;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String execute() throws Exception {
		ClientDAO cDAO = new ClientDAO();
		Client client = new Client(id, name, email);
		int result = cDAO.updateClient(client);
		if (result == 1) {
			clients = cDAO.getClients();
			return SUCCESS;
		}
		return ERROR;
	}
}
