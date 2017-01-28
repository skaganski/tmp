package com.company;

/**
 * Created by sergeikaganski on 27/01/2017.
 */
public class puramid {
    public static void main(String[] args){
        int [][] puramid =new int[9][9];
        for (int i = 0; i <puramid.length ; i++) {
            for (int j = 0; j < puramid.length; j++) {

                if(i+j<9){
                    System.out.print(Math.min(i, j)); //võrdleb ja võtab väiksemat
                }else{
                    System.out.print(Math.min(8-i, 8-j));
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9 ; j++) {

            }

        }
    }
}
