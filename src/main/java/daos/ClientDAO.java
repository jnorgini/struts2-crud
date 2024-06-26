package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import entities.Client;

public class ClientDAO {

	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://localhost/db_crud";
	private final String USER = "root";
	private final String PASSWORD = "1414";

	private Connection conn;
	private Statement stmt;

	public ClientDAO() {
	}

	public ArrayList<Client> getClients() {
		ArrayList<Client> clients = new ArrayList<>();

		try {
			conn = connectToDatabase();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM client";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				clients.add(new Client(id, name, email));
			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException ex) {
			Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
		}

		return clients;
	}

	public int createClient(Client client) {
		int rs = 0;

		try {
			conn = connectToDatabase();
			stmt = conn.createStatement();
			String sql = "INSERT INTO client (id, name, email) VALUES (NULL, '" + client.getName() + "','"
					+ client.getEmail() + "');";
			rs = stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return rs;
	}

	public Client getClient(int clientId) {
		Client client = null;

		try {
			conn = connectToDatabase();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM client WHERE id = " + clientId + " LIMIT 1";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				client = new Client(id, name, email);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return client;
	}

	public int updateClient(Client client) {
		int rs = 0;

		try {
			conn = connectToDatabase();
			stmt = conn.createStatement();
			String sql = "UPDATE client SET name = '" + client.getName() + "', email = '" + client.getEmail()
					+ "' WHERE id = " + client.getId();
			rs = stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return rs;
	}

	public int deleteClient(int clientId) {
		int rs = 0;

		try {
			conn = connectToDatabase();
			stmt = conn.createStatement();
			String sql = "DELETE FROM client WHERE id = " + clientId;
			rs = stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return rs;
	}
	
	public boolean truncateClientsTable() {
        boolean success = false;
        try {
            conn = connectToDatabase();
            stmt = conn.createStatement();
            String sql = "TRUNCATE TABLE client";
            stmt.executeUpdate(sql);
            success = true;
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }

	private Connection connectToDatabase() {
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			return connection;
		} catch (ClassNotFoundException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (SQLException ex) {
			Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

}
