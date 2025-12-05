package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnection {

    // Instance unique de la classe
    private static DatabaseConnection instance;

    // Connexion à la base de données
    private Connection connection;

    // Paramètres de connexion
    private static final String URL = "jdbc:mysql://localhost:3306/db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Constructeur privé pour empêcher l'instanciation directe
    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion à la base de données établie !");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erreur lors de la connexion à la base de données", e);
        }
    }

    // Méthode pour obtenir l'instance unique
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Récupérer la connexion
    public Connection getConnection() {
        return connection;
    }

    // Fermer la connexion
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connexion fermée.");
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la fermeture : " + e.getMessage());
        }
    }
}
