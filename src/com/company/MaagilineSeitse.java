package com.company;

import java.util.ArrayList;

/**
 * Created by sergeikaganski on 21/01/2017.
 */
public class MaagilineSeitse {
    //Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};
        ArrayList<Integer> array= new ArrayList();

        for (int number:naide) {

            if(number==7){

                array.add(number*2);

            }else{
                array.add(number);
            }
        }
        System.out.println(array);
        double sum;
        double average;
        sum=0;
        average=0;

        for(int i=0; i<array.size(); i++){
            sum=sum+array.get(i);
            average=sum/array.size();
        }
        System.out.println(average);

    }

}