import java.sql.*;
import characters.Personnage;

public class DbCRUD {
    public Connection dbAccess;

    public DbCRUD() {
        try {
//            Driver myDriver = new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(myDriver);
            this.dbAccess = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_d&d", "root", "root");
        } catch (SQLException e) {
            System.out.println("Erreur d'accès à la base de données...");
            System.exit(1);
        }
        }

    public void createHero(Personnage perso) {

        try {
            PreparedStatement addSQL = dbAccess.prepareStatement("INSERT INTO hero VALUES (?, ?, ?, ?)");
            addSQL.setString(1, perso.getType());
            addSQL.setString(2, perso.getName());
            addSQL.setInt(3, perso.getLifeLevel());
            addSQL.setInt(4, perso.getForceAttaque());
            addSQL.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Les paramètres n'ont pas pu être entrés...");
        }
    }
}
