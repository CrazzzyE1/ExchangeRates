package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    Connection dbConnectiion;

    public Connection getDbConnectiion() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql//" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");
        dbConnectiion = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnectiion;
    }

    //Write here
}
