package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sergeikaganski on 01/02/2017.
 */
public class ExamObject {
    Integer productPrice = 2;


    public double wholeAmountSent(ArrayList<Double> array1) {
        double sum = 0;
        for (int i = 0; i < array1.size(); i++) {
            sum = sum + array1.get(i);
        }
        return sum;
    }

    public double amountSold(ArrayList<Double> array2) {
        double sum = 0;
        for (int i = 0; i < array2.size(); i++) {
            sum = sum + array2.get(i);
        }
        return sum;
    }

    public double amountLeft(ArrayList<Double> array1, ArrayList<Double> array2) {
        double sum = 0;
        double sum1 = 0;
        for (int i = 0; i < array1.size(); i++) {
            sum = sum + array1.get(i);
            sum1 = sum1 + array2.get(i);
        }
        double dif = sum - sum1;
        return dif;
    }


    public double totalRevenue(ArrayList<Double> arrayPrice, ArrayList<Double> arraySold) {
        double sum = 0;
        double sum1 = 0;
        double totalSum;
        for (int i = 0; i < arrayPrice.size(); i++) {
            sum = sum + (arrayPrice.get(i) - productPrice);
            Math.round(sum);
            sum1 = sum1 + arraySold.get(i);
        }
        totalSum = sum * sum1;

        return totalSum;
    }

    public double daysCounting(ArrayList<Double> arrayDate) {
        double sum = 0;
        for (int i = 0; i < arrayDate.size(); i++) {
            sum = sum + arrayDate.get(i);
        }
        return sum;
    }

    public double bestPrice(ArrayList<Double> arrayPrice, ArrayList<Double> arraySold) {
        double result = 0;

        for (int i = 0; i < arrayPrice.size(); i++) {
            for (int j = i + 1; j < arrayPrice.size(); j++) {
                if (arraySold.get(i) >= arraySold.get(j)) {
                    result = arrayPrice.get(i);
                } else if(arraySold.get(i)<arraySold.get(j)) {
                    result = arrayPrice.get(j);
                }else {
                    result=arrayPrice.get(i);
                    System.out.println(result);
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
