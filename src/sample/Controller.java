package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
            System.out.println("START to Login");
        });
    }
}

