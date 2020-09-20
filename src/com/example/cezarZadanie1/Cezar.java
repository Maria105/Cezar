package com.example.cezarZadanie1;

import java.nio.file.ClosedWatchServiceException;

public class Cezar {
    private int key;
    private int antkey;

    public Cezar(int key, int antkey) {
        this.antkey = antkey;
        this.key = key;
    }


    public char[] encrypt(String message) {
        char[] simvols = new char[message.length()];
        for (int i = 0; i < message.length(); i++)
            simvols[i] = (char) ((int) (message.charAt(i) + key));
        return simvols;
    }

    public  char[] decrypt(String message){
        char[] simvols = new char[message.length()];
        for (int i = 0; i < message.length(); i++)
            simvols[i] = (char) ((int) (message.charAt(i) - antkey));
        return simvols;
    }
}
