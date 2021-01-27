package ru.vdovin.sandbox.helloWorld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
//        String[] langs = new String[4];
//        langs[0] = "Java";
//        langs[1] = "C#";
//        langs[2] = "Python";
//        langs[3] = "PHP";
//
//        String[] langs1 = {"Java", "C#", "Python", "PHP"};

        List<String> languages = Arrays.asList("Java", "C#", "123", "ASDASD");

        for (String l : languages) {
            System.out.println("Я хочу выучить " + l);
        }
    }
}
