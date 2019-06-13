package com.company.models;

public class Mux {
    public static String compute(String val1, String val2, boolean flag) {
        return flag ? val2 : val1;
    }
}
