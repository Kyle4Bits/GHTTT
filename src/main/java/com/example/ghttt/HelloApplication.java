package com.example.ghttt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        Label label = new Label("Hello");
        Label label1 = new Label("Hi");
        Button clickme = new Button("Click me ");
        pane.getChildren().add(clickme);
        Label label3= new Label("dsgfdgfdgdfhgfhghgfh");

        Button button= new Button("Button the second");
        Button bt3 = new Button("Button third!");
        Button bt4 = new Button("Button forth!");


        pane.getChildren().addAll(label,label1, button);
        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}