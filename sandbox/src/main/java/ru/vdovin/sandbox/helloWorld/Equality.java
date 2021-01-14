package ru.vdovin.sandbox.helloWorld;

public class Equality {
        
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

}
