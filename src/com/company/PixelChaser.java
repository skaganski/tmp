package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by sergeikaganski on 25/01/2017.
 */
public class PixelChaser extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        for (int i = 0; i<50; i++) {
            Rectangle rectangle = new Rectangle(50, 50);
            rectangle.setX(Math.random() * 500);
            rectangle.setY(Math.random() * 500);
            rectangle.setFill(Color.BLACK);
            pane.getChildren().add(rectangle);
            rectangle.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    switch(event.getClickCount()){
                        case 1: {
                            if(rectangle.getHeight()==50){
                                rectangle.setHeight(25);
                                rectangle.setWidth(25);
                                break;
                            }
                        }
                        case 2: {
                            if(rectangle.getHeight()==25){
                                pane.getChildren().remove(rectangle);
                            }
                        }
                        default: break;
                    }
                }
            });
        }
    }


}
