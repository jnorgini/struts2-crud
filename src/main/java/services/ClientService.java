package services;

import java.util.ArrayList;

import daos.ClientDAO;
import entities.Client;

public class ClientService {

	private ClientDAO clientDAO;

	public ClientService() {
		this.clientDAO = new ClientDAO();
	}

	public ArrayList<Client> getClients() {
		return clientDAO.getClients();
	}

	public Client getClient(int clientId) {
		return clientDAO.getClient(clientId);
	}

	public boolean createClient(Client client) {
		int result = clientDAO.createClient(client);
		return result > 0;
	}

	public boolean updateClient(Client client) {
		int result = clientDAO.updateClient(client);
		return result > 0;
	}

	public boolean deleteClient(int clientId) {
		int result = clientDAO.deleteClient(clientId);
		return result > 0;
	}

	public boolean truncateClientsTable() {
		return clientDAO.truncateClientsTable();
	}

}
