package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/sample.fxml"));
        primaryStage.setTitle("ExchangeRates");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }

//v.0.3 LOGIN USERS
    public static void main(String[] args) {
        launch(args);
    }
}
