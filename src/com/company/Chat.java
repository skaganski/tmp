package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sergeikaganski on 21/01/2017.
 */
public class Chat {

    ArrayList<String[]> messages = new ArrayList();//või ArrayList kohe difineerida <String>


    private String nimetus;

    public Chat(String toaNimi) {

        nimetus=toaNimi;
    }

    public void sisestaSonum(String name, String s){
        String [] rida = new String [2]; // kuna tegemist on nimega ja sõnumiga, kaks väärtus, tuleb luua masiivi
        rida[0] = name;
        rida[1]= s;
        messages.add(rida);
    }

    public void prindiKoikSonumidKoosKasutajanimega(){

        for (int i=0; i<messages.size(); i++){  // kuna tegemist masiiviga, tuleb läbikäia

            System.out.println(Arrays.toString(messages.get(i)));
        }
    }

    public void adminKustutabSonumi(String kustutatav) {
        for (int i = 0; i < messages.size(); i++) {
            if(messages.get(i)[1].equals(kustutatav)){
                messages.get(i)[1]="DELETED";
            }

        }

    }

    public void prindiToaNimi() {
        System.out.println(nimetus);
    }
}
