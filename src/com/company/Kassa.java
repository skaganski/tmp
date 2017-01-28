package com.company;

import java.util.ArrayList;

/**
 * Created by sergeikaganski on 26/01/2017.
 */
public class Kassa {
    private String kassapidajaName;
    private ArrayList<String> ostuKorv= new ArrayList<>();

    public Kassa(String kassapidaja) {
        kassapidajaName=kassapidaja;
    }

    public void lisaToode(String toode) {

        ostuKorv.add(toode);
    }

    public void eemaldaToode(String toode) {
        ostuKorv.remove(toode);
    }

    public void prindiOstutsekk() {
        System.out.println("tsekk " + ostuKorv);
    }

    public void prindiKassapidajaNimi() {
        System.out.println("KassapidajaNimi: " + kassapidajaName);
    }
}
