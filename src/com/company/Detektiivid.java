package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by sergeikaganski on 22/01/2017.
 */
public class Detektiivid extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(300);
        Circle circle1=new Circle(40);
        circle1.setCenterX(50);
        circle1.setCenterY(50);
        Circle circle2=new Circle(40);
        circle2.setCenterX(200);
        circle2.setCenterY(245);
        circle.setFill(Color.WHITE);
        circle1.setFill(Color.WHITE);
        circle2.setFill(Color.WHITE);
        mouseEntered(circle);
        mouseEntered(circle1);
        mouseEntered(circle2);
        pane.getChildren().addAll(circle, circle1, circle2);
        primaryStage.show();
    }

    private void mouseEntered(Circle a) {
        a.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                a.setFill(Color.BLACK);
            }
        });
        a.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        a.setFill(Color.WHITE);
                    }
                });
    }
}
