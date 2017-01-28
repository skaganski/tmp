package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by sergeikaganski on 25/01/2017.
 */
public class Koristaja extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        Label label = new Label ("Good job, Man!");
        label.setAlignment(Pos.CENTER);
        label.setLayoutX(250);
        label.setLayoutY(250);
        pane.getChildren().add(label);


        for (int i =0; i<50; i++){
            Circle circle=new Circle(25);
            circle.setCenterX((Math.random()*500));
            circle.setCenterY((Math.random()*500));
            circle.setFill(Color.BLACK);
            pane.getChildren().add(circle);
            circle.setOnMouseClicked(e->{
                pane.getChildren().remove(circle);
                System.out.println("klicked");
            });



        }
    }
}





