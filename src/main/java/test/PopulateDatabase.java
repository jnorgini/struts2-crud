package test;

import java.util.ArrayList;

import entities.Client;
import services.ClientService;

public class PopulateDatabase {

	public static void main(String[] args) {
		ClientService clientService = new ClientService();

		boolean truncated = clientService.truncateClientsTable();
		if (truncated) {
			System.out.println("Table truncated successfully.\n");
		} else {
			System.out.println("Error truncating table.\n");
		}

		ArrayList<Client> existingClients = clientService.getClients();
		for (Client client : existingClients) {
			boolean deletado = clientService.deleteClient(client.getId());
			if (deletado) {
				System.out.println("Client with ID " + client.getId() + " deleted.");
			} else {
				System.out.println("Error deleting client with ID " + client.getId() + ".");
			}
		}

		Client[] clients = { 
				new Client(0, "John Smith", "john.smith@example.com"),
				new Client(0, "Mary Johnson", "mary.johnson@example.com"),
				new Client(0, "Charles Brown", "charles.brown@example.com") };

		for (Client client : clients) {
			boolean created = clientService.createClient(client);
			if (created) {
				System.out.println("Client " + client.getName() + " inserted successfully.");
			} else {
				System.out.println("Error inserting client " + client.getName() + ".");
			}
		}

		ArrayList<Client> listedClients = clientService.getClients();
		System.out.println("\nRegistered clients:");
		for (Client client : listedClients) {
			System.out.println(
					"ID: " + client.getId() + 
					", Name: " + client.getName() + 
					", Email: " + client.getEmail()
					);
		}
	}

}
