package com.company;

/**
 * Created by sergeikaganski on 26/01/2017.
 */
public class Pastakas {
    int amount;


    public Pastakas(int tindiKogus) {
        amount=tindiKogus;
    }

    public void kirjuta(String s) {

        if(amount>s.length()) {
            int count = 0;
            for(int i=0; i<s.length(); i++){
                char letter = s.charAt(i);
                if(!Character.isSpaceChar(letter)){
                    count++;
                }
            }
            amount=amount-count;
            System.out.println(s);

        }else{
            System.out.println(s.substring(0,amount));
        }

    }

    public void prindiPaljuTintiAlles() {

        System.out.println(amount);

    }
}
