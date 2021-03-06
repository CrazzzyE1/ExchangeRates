package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;
import sample.User;

public class SighUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField sighUp_login;

    @FXML
    private Button sighUpButton;

    @FXML
    private PasswordField sighUp_pass1;

    @FXML
    private PasswordField sighUp_pass2;

    @FXML
    private TextField sighUp_name;

    @FXML
    private TextField sighUp_email;

    @FXML
    void initialize() {
        sighUpButton.setOnAction(event -> {
            sighUpNewUser();
        });

    }

    private void sighUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();
        String name = sighUp_name.getText();
        String email = sighUp_email.getText();
        String login = sighUp_login.getText();
        String password1 = sighUp_pass1.getText();
        String password2 = sighUp_pass2.getText();

        if (!password1.equals(password2)) {
            System.out.println("Password isn't equals");
        } else {
            User user = new User(name, email, login, password1, password2);
            dbHandler.signUpUser(user);
        }

    }
}
