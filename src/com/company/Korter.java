package com.company;

import java.util.ArrayList;

/**
 * Created by sergeikaganski on 26/01/2017.
 */
public class Korter {
    int korteriMaht;
    ArrayList kulalised=new ArrayList();
    String kulaline;
    int mahubVeel;
    public Korter(int mahutab) {
        korteriMaht=mahutab;

    }

    public void saabus(String kulaline) {
        if(korteriMaht>kulalised.size()){
            kulalised.add(kulaline);
        }else{
            System.out.println("Sorry, too late, too full");
        }


    }

    public void prindiKylalisteArv() {
        System.out.println(kulalised.size());
    }

    public void prindiPaljuVeelMahub() {
        mahubVeel=korteriMaht-kulalised.size();
        System.out.println(mahubVeel);

    }

    public void lahkus(String kulaline) {
        kulalised.remove(kulaline);
    }
}
