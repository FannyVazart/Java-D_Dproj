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

    public void getHeroes() {

        try {
            Statement getSQL = dbAccess.createStatement();
            ResultSet rs = getSQL.executeQuery("SELECT * FROM hero");
            while (rs.next()) {
                String type = rs.getString("Type");
                String name = rs.getString("Name");
                int lifelevel = rs.getInt("LifeLevel");
                int forceattaque = rs.getInt("ForceAttaque");
                System.out.println(type + " " + name + " " + lifelevel + " " + forceattaque );
            }

        } catch (SQLException e) {
            System.out.println("Les données de la base de données ne peuvent pas être affichés...");
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

//    public void editHero(String nomPerso, String newType, String newName, int newLifeLevel, int newForceAttaque) {
//
//        try {
//            PreparedStatement editSQL = dbAccess.prepareStatement("UPDATE hero SET (?, ?, ?, ?) WHERE Name = nomPerso");
//            editSQL.setString(1, newType);
//            editSQL.setString(2, newName);
//            editSQL.setInt(3, newLifeLevel);
//            editSQL.setInt(4, newForceAttaque);
//            editSQL.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Les paramètres n'ont pas pu être changés...");
//        }
//    }

}
