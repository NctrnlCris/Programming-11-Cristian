package com.example.cp11project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("McWendys.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 660, 430);
        stage.setTitle("McWendy's POS System");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
    /* To do
    Only writing total to file
    Display orders. Save total to file for safety.




     */

}