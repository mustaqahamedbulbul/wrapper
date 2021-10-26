package com.mabani;

class MyInteger{

    private int i;

    //constructor
    MyInteger(int j) {
        i = j;
    }
    //public api

    public int intValue()
    {
        return i;
    }
}

public class CustomWrapperClassExample {


    public static void main(String[] args) {
        int x = 10;

        //java define wrapper classes
        Integer y = new Integer(x);
        System.out.println(y.intValue());

        //using the custom wrapper class to create a wrapper class
        MyInteger z = new MyInteger(x);
        System.out.println(z.intValue());

    }

}
