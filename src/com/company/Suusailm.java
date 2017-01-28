package com.company;

/**
 * Created by sergeikaganski on 21/01/2017.
 */

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */

public class Suusailm {

    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

       posNeg(kraadid1);posNeg(kraadid2);

    }

    private static void posNeg(int[] a) {
        double countPos=0;
        double countNeg=0;
        for (double number : a) {
            if (number >= 0) {
                countPos++;
            } else {
                countNeg++;
            }
        }
        double different=countPos-countNeg;
        System.out.println(different);
    }

}

