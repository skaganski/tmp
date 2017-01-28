package com.company;

/**
 * Created by sergeikaganski on 26/01/2017.
 */
public class Pidu {
    public static void main(String[] args) {

        int mahutab = 10;
        Korter korter = new Korter(mahutab);

        korter.saabus("Taavi");
        korter.saabus("Pilve");
        korter.saabus("Maarika");
        korter.saabus("Joonas");
        korter.saabus("Kalle");
        korter.saabus("Muri");
        korter.saabus("Sille");

        korter.prindiKylalisteArv();
        korter.prindiPaljuVeelMahub();

        korter.lahkus("Taavi");

        korter.saabus("Tambet");
        korter.saabus("Liisa");
        korter.saabus("Liis");
        korter.saabus("Veidro");
        korter.saabus("Moonika");
        korter.saabus("Politsei");

        korter.lahkus("Sille");

        korter.prindiKylalisteArv(); // peaks olema 9, järjekorda ei ole.
    }
}
