package com.company.models;

import java.util.HashMap;
import java.util.Map;

public class MainMemory {
    final static int mainMemBits = 16;

    Map<String, String> memoryMap = new HashMap<>();
    String address;
    boolean memReadSignal;
    boolean memWriteSignal;

    public MainMemory() {
        int memSize = (int)Math.pow(2, 16);
        for (int i = 0; i < memSize; i++) {
            String key = String.format("%" + 16 + "s", Integer.toBinaryString(i)).replace(' ', '0');
            memoryMap.put(key, "00000000000000000000000000000000");
        }
    }

    public void setup(String address, boolean memReadSignal, boolean memWriteSignal) {
        this.address = address;
        this.memReadSignal = memReadSignal;
        this.memWriteSignal = memWriteSignal;
    }

    public void writeData(String data) {

    }

    public String readData() {
        String result = "";
        return result;
    }
}
