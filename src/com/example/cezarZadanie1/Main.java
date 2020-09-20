package com.example.cezarZadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Cezar cezar;
        String str1;
        char[] symbols;
        Scanner a = new Scanner(System.in);
        str1 = a.nextLine();
        cezar= new Cezar(3, 3);

       /* int key = 3;
        char[] simvol = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            simvol[i] = (char) ((int) (str1.charAt(i) + key));
        }*/
        symbols = cezar.encrypt(str1);
        System.out.println( symbols);
        str1 = "";
        for(int i = 0; i< symbols.length; i++)
            str1+=symbols[i];
        System.out.println(cezar.decrypt(str1));
        cezar = new Cezar(2, 3);
        str1 = a.nextLine();
        symbols = cezar.encrypt(str1);
        System.out.println( symbols);
        System.out.println(cezar.decrypt(symbols.toString()));

    }

}

