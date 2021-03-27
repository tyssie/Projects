package com.company;

public class Plate {
    private int capacity = 10;
    private int size = capacity;

    public boolean decrease(int request) {
        if (request <= size) {
            size -= request;
            return true;
        }
        return false;
    }

    public void add(int requestedSize) {
        int tempSum = requestedSize + size;
        if (tempSum > capacity) {
            size = capacity;
        }
        size += requestedSize;
    }
}
