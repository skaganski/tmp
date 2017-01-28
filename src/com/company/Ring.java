package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by sergeikaganski on 22/01/2017.
 */
public class Ring extends Application {

    GridPane gridPane = new GridPane();
    Scene sceneInput = new Scene(gridPane, 500, 500);
    Pane pane= new Pane();
    Scene sceneDraw = new Scene(pane, 500, 500);
    Label labelX = new Label("X coordinate");
    Label labelY = new Label("Y coordinate");
    Label labelRadius = new Label("Radius");
    TextField textFieldX = new TextField();
    TextField textFieldY = new TextField();
    TextField textFieldR = new TextField();
    Button button = new Button("Draw");


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(sceneInput);
        primaryStage.show();
        gridPane.add(labelX, 0, 0);
        gridPane.add(labelY, 0, 1);
        gridPane.add(labelRadius, 0, 2);
        gridPane.add(textFieldX, 1, 0);
        gridPane.add(textFieldY, 1, 1);
        gridPane.add(textFieldR, 1, 2);
        gridPane.setVgap(10);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(button, 3, 2);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String getTextX = textFieldX.getText();
                String getTextY = textFieldY.getText();
                String getTextR = textFieldR.getText();
                Double resultX = Double.parseDouble(getTextX);
                Double resultY = Double.parseDouble(getTextY);
                Double resultR = Double.parseDouble(getTextR);
                primaryStage.setScene(sceneDraw);
                Circle ring = new Circle(resultX, resultY, resultR);
                pane.getChildren().add(ring);
            }
        });

    }
}
