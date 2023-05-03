package com.example.ghttt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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

        Label test = new Label("Update testing");
        // Testing //

        Button button= new Button("Button the second");
        Button bt3 = new Button("Button third!");
        Button bt4 = new Button("Button forth!");

        ImageView imageView1 = new ImageView("file:src/Mario.png");
        ImageView imageView = new ImageView("file:src/Luigi.jpeg");

        //Mario

        pane.getChildren().addAll(label,label1, button, imageView, imageView1);
        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}