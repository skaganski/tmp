package com.company;

import java.util.ArrayList;

/**
 * Created by sergeikaganski on 26/01/2017.
 */
public class Sonaraamat {
    String language;
    ArrayList <String>sonavara = new ArrayList();
    public Sonaraamat(String raamatuKeel) {
        language=raamatuKeel;
    }

    public void sisestaSona(String word) {
        sonavara.add(word);
    }

    public void eemaldaSona(String word) {
        sonavara.remove(word);
    }

    public void misKeelesRaamatOn() {
        System.out.println(language);
    }


    public String[] otsiEsimeseTaheJargi(String letter) {
      char firstLetter = letter.charAt(0); //showing the first letter
        ArrayList<String> newArray = new ArrayList<>();
        for(int i=0; i<sonavara.size(); i++){
            if(sonavara.get(i).charAt(0) == firstLetter){
                String wordSpecial = sonavara.get(i);
                newArray.add(wordSpecial);
            }

        }
        String [] string = new String[newArray.size()];
        for(int i=0; i<newArray.size(); i++){
            string[i] = newArray.get(i);
        }
        return string;

    }
}
