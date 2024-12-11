import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class connexion {
    private static final String DB_URL = "jdbc:mariadb://projets.iut-orsay.fr:3306/saes3-bmonod";
    private static final String DB_USER = "saes3-bmonod";
    private static final String DB_PASSWORD = "projet301";
    
    // open
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement du driver JDBC : " + e.getMessage());
        }
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    
    // close
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connexion fermée.");
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
        }
    }
    
    //main
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Établir la connexion
            connection = getConnection();
            System.out.println("Connexion réussie !");

            // Créer un statement pour exécuter la requête
            statement = connection.createStatement();
            String query = "SELECT * FROM Utilisateur";
            resultSet = statement.executeQuery(query);

            
            while (resultSet.next()) {
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                String email = resultSet.getString("email");
                
                // Afficher les résultats
                System.out.println("nom: " + nom + ", prenom: " + prenom + ", Email: " + email);
            }
            query = "INSERT INTO Utilisateur VALUES(null,'Malpi','Seb','testtt','lepauvre','aa','villaverde',CURRENT_TIME())";
            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {
            System.err.println("Erreur de connexion ou d'exécution de la requête : " + e.getMessage());
        } 
        closeConnection(connection);
        }
    }
