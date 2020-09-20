package com.example.cezarZadanie1;

import java.nio.file.ClosedWatchServiceException;

public class Cezar {
    private int key;
    private int decryptKey;

    public Cezar(int key, int decryptKey) {
        this.decryptKey = decryptKey;
        this.key = key;
    }


    public char[] encrypt(String message) {
        char[] symbols = new char[message.length()];
        for (int i = 0; i < message.length(); i++)
            symbols[i] = (char) ((int) (message.charAt(i) + key));
        return symbols;
    }

    public  char[] decrypt(String message) {
        char[] symbols = new char[message.length()];
        for (int i = 0; i < message.length(); i++)
            symbols[i] = (char) ((int) (message.charAt(i) - decryptKey));
        return symbols;

    }
}
