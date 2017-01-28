package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Created by sergeikaganski on 22/01/2017.
 */
public class Joon extends Application {
    //Creating a GridPane container
    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 500, 500);
    Pane pane = new Pane();
    Scene sceneDraw= new Scene(pane, 500, 500);
    Line line;
    Label label = new Label("X start");
    TextField textField = new TextField();
    Label label2 = new Label("X end");
    TextField textField2 = new TextField();
    Label label3 = new Label("Y start");
    TextField textField3 = new TextField();
    Label label4 = new Label("Y end");
    TextField textField4 = new TextField();


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setScene(scene);
        primaryStage.show();

        grid.setHgap(5); // distance between objects horizontal
        grid.setVgap(10); // distance between objects vertical
        grid.setAlignment(Pos.CENTER);
        grid.add(label, 0, 0);
        grid.add(textField, 0, 1);
        grid.add(label2, 1, 0);
        grid.add(textField2, 1, 1);
        grid.add(label3, 0, 2);
        grid.add(textField3, 0, 3);
        grid.add(label4, 1, 2);
        grid.add(textField4, 1, 3);
        Button button = new Button ("Draw");
        grid.add(button, 4, 2);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String textFiledResult = textField.getText();
                String textFiledResult2 = textField2.getText();
                String textFiledResult3 = textField3.getText();
                String textFiledResult4 = textField4.getText();
                Double result1 = Double.parseDouble(textFiledResult);
                Double result2 = Double.parseDouble(textFiledResult2);
                Double result3 = Double.parseDouble(textFiledResult3);
                Double result4 = Double.parseDouble(textFiledResult4);

                primaryStage.setScene(sceneDraw);
                line = new Line(result1, result3, result2, result4);
                pane.getChildren().add(line);
            }
        });

    }
}
