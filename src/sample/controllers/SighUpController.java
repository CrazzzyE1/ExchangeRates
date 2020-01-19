package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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

    }
}
