package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by sergeikaganski on 21/01/2017.
 */
public class KuulusNumber {


        public static void main(String[] args) {

            int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
            ArrayList <Integer> array= new ArrayList();



           for(int i=0; i<naide.length; i++){
               if(naide[i]==3){

               }else{
                   array.add(naide[i]);
               }
           }

            for (int i:array) {

                int occurrences = Collections.frequency(array, i);
                System.out.println("number " +i+" appears " +occurrences);

            }

            System.out.println(array);
        }
}
