package com.company;

/**
 * Created by sergeikaganski on 26/01/2017.
 */
public class Zelda {

    int eluKogus;
    int kolliEluKogus;
    int eluJaak;
    public Zelda(int elusid) {
        eluKogus=elusid;
        System.out.println(elusid);
    }

    public void kaklusKolliga(int kollilElusid) {
        kolliEluKogus=kollilElusid;
        System.out.println(kollilElusid);
        eluJaak=eluKogus-kolliEluKogus;
    }

    public void prindiMituEluAlles() {
        System.out.println(eluJaak);
    }

    public void prindiKasOnElus() {
        if(eluJaak>0){
            System.out.println("On elus");
        }else{
            System.out.println("Surnud");
        }

    }
}
