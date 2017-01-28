package com.company;

/**
 * Created by sergeikaganski on 21/01/2017.
 */
public class PikkadSoned {

    public static void main(String args[]){


     //Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?



    String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3
    double average=0;
        double sum=0;
    for(int i=0; i<naide.length; i++){
        naide[i].length();
        System.out.println(naide[i].length());
        sum=sum+naide[i].length();

    }
        System.out.println(sum);
        average=sum/naide.length;
        System.out.println(average);
        int count=0;
        for(int i=0; i<naide.length; i++){
            if(naide[i].length()>average){
                count++;

            }
        }
        System.out.println(count);

    }
}
