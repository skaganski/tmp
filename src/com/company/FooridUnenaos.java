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
public class FooridUnenaos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        double x;
        double y;

        for(int i= 0; i<20; i++){
            x=Math.round(Math.random()*500);
            y=Math.round(Math.random()*500);
            Circle circle = new Circle(x, y, 50);
            System.out.println(x +"\r"+ y);
            pane.getChildren().add(circle);
            mouseEntered(circle);
            circle.setFill(Color.BLACK);
        }

    }

    private void mouseEntered(Circle a) {
        a.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                a.setFill(Color.GREEN);
            }
        });
        a.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        a.setFill(Color.BLACK);
                    }
                });
    }
}
