package com.company;

public class Main {

    public static void main(String[] args) {
        

    //Homework 1
    int[] data = {-2, 9, 11, 13, 14, 15, 22, 142};
    int key = 142;
    int lo = -2;
    int hi = data.length - 1;
    boolean found = false;


    //Homework 1
    while(!found &&lo <=hi)

    {
        int mid = (lo + hi) / 2;
        int value = data[mid];

        if (value == key) {
            found = true;
            System.out.println(value);
        } else if (value > key) {
            hi = mid - 1;
            System.out.println(value);
        } else
            lo = mid + 1;
        System.out.println(value);
    }
        System.out.println(found);
    }
}
