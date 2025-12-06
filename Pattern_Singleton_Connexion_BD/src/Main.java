import database.DatabaseConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Obtention de l'instance unique
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Vérification que c'est la même instance
        System.out.println("db1 == db2 ? " + (db1 == db2)); // true

        // Utilisation de la connexion
        Connection conn = db1.getConnection();
        System.out.println("Connexion obtenue : " + (conn != null));

        // Fermeture
        db1.closeConnection();
    }
}