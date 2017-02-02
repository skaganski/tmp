package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by sergeikaganski on 01/02/2017.
 */
public class Exam extends Application {

    GridPane gridPane = new GridPane();
    GridPane gridPaneResult = new GridPane();
    Scene scene = new Scene(gridPane, 500, 500);
    Scene sceneOutPut = new Scene(gridPaneResult, 500, 500);
    Label labelDay = new Label("Day Count:");
    Label label1 = new Label ("Send at morning:");
    Label label2 = new Label ("Sold:");
    Label label3 = new Label("Price:");
    TextField textFieldSend = new TextField();
    TextField textFieldSold = new TextField();
    TextField textFieldPrice = new TextField();
    TextField textFieldDate = new TextField();
    Button buttonCalculate = new Button ("Calculate");
    Button backButton = new Button ("Back");
    ExamObject object = new ExamObject();
    Label labelOutPutSent = new Label("Sent to shops at morning:");
    Label labelOutPutSold = new Label ("Sold till evenening:");
    Label labelOutPutPrice = new Label ("Price today:");
    Label leftAtShops = new Label ("Left at shops:");
    Label totalMoneyBySolding = new Label ("Total Revenue:");
    Label dayCount = new Label ("Statistic of days (count):");
    Label bestPrice = new Label ("Best price (starting from 2nd day:");
    ArrayList<Double> arrayAmountSent = new ArrayList<>();
    ArrayList<Double> arraySold = new ArrayList<>();
    ArrayList<Double> arrayPrice = new ArrayList<>();
    ArrayList<Double> arrayDayCount = new ArrayList<>();


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setScene(scene);
        primaryStage.show();


        gridPane.setVgap(10);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(label1, 0, 0); // sent
        gridPane.add(label2, 0, 1); // sold
        gridPane.add(label3, 0, 2); // price
        gridPane.add(labelDay, 0, 3); //date
        gridPane.add(textFieldSend, 1, 0);
        gridPane.add(textFieldSold, 1, 1);
        gridPane.add(textFieldPrice, 1, 2);
        gridPane.add(textFieldDate, 1, 3);
        gridPane.add(buttonCalculate, 1, 4);


        buttonCalculate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                gridPaneResult.getChildren().clear();
                //getting input from TextField
                String textFiledResult = textFieldSend.getText();
                String textFiledResult2 = textFieldSold.getText();
                String textFiledResult3 = textFieldPrice.getText();
                String textFiledResult4 = textFieldDate.getText();
                //String to double
                Double result1 = Double.parseDouble(textFiledResult);
                Double result2 = Double.parseDouble(textFiledResult2);
                Double result3 = Double.parseDouble(textFiledResult3);
                Double result4 = Double.parseDouble(textFiledResult4);
                //adding to array
                arrayAmountSent.add(result1);
                arraySold.add(result2);
                arrayPrice.add(result3);
                arrayDayCount.add(result4);

                gridPaneResult.setHgap(5);
                gridPaneResult.setVgap(10);
                gridPaneResult.setAlignment(Pos.CENTER);
                //products sent
                gridPaneResult.add(labelOutPutSent, 0, 0);
                String sendProducts = String.valueOf(object.wholeAmountSent(arrayAmountSent));
                gridPaneResult.add(new Label(sendProducts), 0, 1);
                //products sold
                String soldProducts = String.valueOf(object.amountSold(arraySold));
                gridPaneResult.add(labelOutPutSold, 0, 2);
                gridPaneResult.add(new Label(soldProducts), 0, 3);
                //price of product
                String productPrice = String.valueOf(result3);
                gridPaneResult.add(labelOutPutPrice, 0, 4);
                gridPaneResult.add(new Label(productPrice), 0, 5);
                //products left at shop
                gridPaneResult.add(leftAtShops, 0, 6);
                String leftProductAtShop=String.valueOf(object.amountLeft(arrayAmountSent, arraySold));
                gridPaneResult.add(new Label(leftProductAtShop), 0, 7);
                //total revenue;
                gridPaneResult.add(totalMoneyBySolding, 0, 8);
                String totalRevenue = String.valueOf(object.totalRevenue(arrayPrice, arraySold));
                gridPaneResult.add(new Label(totalRevenue), 0, 9);
                //days counting
                gridPaneResult.add(dayCount, 0, 10);
                String dayCountNumber = String.valueOf(object.daysCounting(arrayDayCount));
                gridPaneResult.add(new Label(dayCountNumber), 0, 11);
                //best Price
                gridPaneResult.add(bestPrice, 0, 12);
                String showBestPrice = String.valueOf(object.bestPrice(arrayPrice, arraySold));
                gridPaneResult.add(new Label(showBestPrice), 0, 13);
                // Button
                gridPaneResult.add(backButton, 0, 14);
                primaryStage.setScene(sceneOutPut);

            }

        });

        backButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                textFieldPrice.clear();
                textFieldSold.clear();
                textFieldSend.clear();
                textFieldDate.clear();
                primaryStage.setScene(scene);
            }
        });

    }
}
