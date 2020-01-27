package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.stage.Stage;
import sample.DatabaseHandler;
import sample.User;
import sample.animations.Shake;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private Button authSigInButton;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button loginSigInButton;

    @FXML
    void initialize() {

        authSigInButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String passwordText = password_field.getText().trim();
            if(!loginText.equals("") && !passwordText.equals("")) {
                loginUser(loginText, passwordText);
            } else
            {
                login_field.setPromptText("Login is Empty");
                login_field.setStyle("-fx-border-color: red;");
                password_field.setStyle("-fx-border-color: red;");
                password_field.setPromptText("Password is Empty");
            }

        });



        loginSigInButton.setOnAction(event -> {

            openWindows("/sample/view/sighUp.fxml");
        });


    }

    private void loginUser(String loginText, String passwordText) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setLogin(loginText);
        user.setPassword1(passwordText);
        ResultSet result = dbHandler.getUser(user);
        int counter = 0;

        while (true) {
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            counter++;
        }

        if(counter!=0) {
            openWindows("/sample/view/app.fxml");
        } else {
            Shake userLoginAnim = new Shake(login_field);
            Shake userPassAnim = new Shake(password_field);
            userLoginAnim.playAnim();
            userPassAnim.playAnim();
        }

    }

    public void openWindows(String windowName) {

        loginSigInButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(windowName));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();


    }
}

