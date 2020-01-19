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
    private TextField login_field;

    @FXML
    private Button authSigInButton;

    @FXML
    private PasswordField password_field;

    @FXML
    private PasswordField password_field1;

    @FXML
    private TextField login_field1;

    @FXML
    private TextField login_field11;

    @FXML
    void initialize() {
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'sighUp.fxml'.";
        assert authSigInButton != null : "fx:id=\"authSigInButton\" was not injected: check your FXML file 'sighUp.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'sighUp.fxml'.";
        assert password_field1 != null : "fx:id=\"password_field1\" was not injected: check your FXML file 'sighUp.fxml'.";
        assert login_field1 != null : "fx:id=\"login_field1\" was not injected: check your FXML file 'sighUp.fxml'.";
        assert login_field11 != null : "fx:id=\"login_field11\" was not injected: check your FXML file 'sighUp.fxml'.";

    }
}

