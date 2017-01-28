package com.company;

/**
 * Created by sergeikaganski on 21/01/2017.
 */
public class Kirjanik {

        public static void main(String[] args) {
            int tindiKogus = 60;

            Pastakas pastakas = new Pastakas(tindiKogus);

            pastakas.kirjuta("Elu oleks palju lihtsam, kui meil oleks selle lähtekood.");

            pastakas.prindiPaljuTintiAlles();

            pastakas.kirjuta("Õiged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!");

        }

}
