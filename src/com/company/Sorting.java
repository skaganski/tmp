package com.company;

import java.util.Arrays;

/**
 * Created by sergeikaganski on 20/01/2017.
 */
public class Sorting {

        public static void main(String[] args) {
            int [][] maatriks = new int[10][10];

            int vastus = 1;
            for (int i = 0; i < maatriks.length; i++) {
                if (i%2==0){ //parem on tingimus i%2== 0 ehk tingimus, et i on paarisarv
                    for (int j = maatriks.length-1; j >= 0; j--) {
                        maatriks[i][j] = vastus;
                        vastus++;
                    }
                } else {
                    for (int j = 0; j <maatriks[i].length; j++) {

                        maatriks[i][j] = vastus;
                        vastus++;
                    }
                }
                System.out.println(Arrays.toString(maatriks[i]));
            }
        }
    }

