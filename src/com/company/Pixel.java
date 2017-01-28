package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by sergeikaganski on 27/01/2017.
 */
public class Pixel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        for (int i = 0; i <10 ; i++) {
            Rectangle rectangle = new Rectangle(i*100, i*100, 100, 100);
            pane.getChildren().add(rectangle);
            rectangle.setId("eioleKlikitud");
            rectangle.setOnMouseClicked(event -> {
                if(rectangle.getId().equals("klikitud")){
                    rectangle.setScaleX(0);
                    rectangle.setScaleY(0);
                }else{
                    rectangle.setScaleX(0.5);
                    rectangle.setScaleY(0.5);
                }
                rectangle.setId("klikitud");
            });

        }
    }
}
