package sample;

import java.sql.*;

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

    public void signUpUser(User user) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USER_NAME + "," +
                Const.USER_EMAIL + "," + Const.USER_LOGIN + "," + Const.USER_PASS + ")" + "VALUES(?,?,?,?)";

        try {
            PreparedStatement prST = getDbConnectiion().prepareStatement(insert);
            prST.setString(1, user.getName());
            prST.setString(2, user.getEmail());
            prST.setString(3, user.getLogin());
            prST.setString(4, user.getPassword1());
            prST.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

//    public ResultSet getUser(User user) {
//        return ResultSet
//    }

}
