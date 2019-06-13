package com.company;

public class Main {

    public static void main(String[] args) {
        String a = "hello";
        System.out.println(a);
        for (int i = 0; i < 50; i++) {
            String key = String.format("%16s", Integer.toBinaryString(i)).replace(' ', '0');
            System.out.println(key);
        }
    }
}
