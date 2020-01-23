package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    Connection dbConnectiion;

    public Connection getDbConnectiion() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName +
                "?verifyServerCertificate=false"+
                "&useSSL=false"+
                "&requireSSL=false"+
                "&useLegacyDatetimeCode=false"+
                "&amp"+
                "&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnectiion = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnectiion;
    }

    public void signUpUser(String name, String email, String login, String password) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USER_NAME + "," +
                Const.USER_EMAIL + "," + Const.USER_LOGIN + "," + Const.USER_PASS + ")" + "VALUES(?,?,?,?)";

        try {
            PreparedStatement prST = getDbConnectiion().prepareStatement(insert);
            prST.setString(1, name);
            prST.setString(2, email);
            prST.setString(3, login);
            prST.setString(4, password);
            prST.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
