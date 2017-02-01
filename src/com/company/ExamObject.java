package com.company;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

/**
 * Created by sergeikaganski on 01/02/2017.
 */
public class ExamObject {
    Integer productPrice = 2;

    public int getPrice(int a){
        return a;
    }

    public double pricesOfTheProduct(ArrayList<Double> array){
        double sum=0;
        for (int i = 0; i < array.size(); i++) {
            sum=sum+array.get(i);
        }
        return sum;
    }

    public double wholeAmountSent(ArrayList <Double> array1){
        double sum = 0;
        for (int i = 0; i <array1.size() ; i++) {
            sum=sum+array1.get(i);
        }
        return sum;
    }

    public double amountSold(ArrayList<Double> array2){
        double sum = 0;
        for (int i = 0; i <array2.size() ; i++) {
            sum=sum+array2.get(i);
        }
        return sum;
    }

    public double amountLeft(ArrayList<Double> array1, ArrayList<Double> array2){
        double sum=0;
        double sum1=0;
        for(int i=0; i<array1.size(); i++){
        sum=sum+array1.get(i);
            sum1= sum1+array2.get(i);
        }
        double dif= sum-sum1;
        return dif;
    }

    public double revenueForOneProduct (ArrayList<Double> arrayWithPrice){
        double sum=0;
        for (int i = 0; i < arrayWithPrice.size(); i++) {
            sum=sum+(arrayWithPrice.get(i)-productPrice);
            Math.round(sum);
        }
        return sum;
    }

    public double totalRevenue (ArrayList<Double> arrayPrice, ArrayList<Double> arraySold){
        double sum=0;
        double sum1=0;
        double totalSum=0;
        for (int i = 0; i < arrayPrice.size(); i++) {
            sum=sum+(arrayPrice.get(i)-productPrice);
            Math.round(sum);
            sum1=sum1+arraySold.get(i);
        }
        totalSum=sum*sum1;
        return totalSum;
    }

    public double daysCounting (ArrayList<Double> arrayDate){
        double sum=0;
        for (int i = 0; i <arrayDate.size(); i++) {
            sum=sum+arrayDate.get(i);
        }
        return sum;
    }
}
