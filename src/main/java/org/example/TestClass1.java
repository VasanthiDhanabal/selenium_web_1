package org.example;

public class TestClass1 {
    public static void main(String args[]) {
        System.out.println("TestClass 1 main function position 1");
        String testVal1 = "TestVal1 inside main";
        Integer testInt1 = 100;
        functionB("Input to function B");
    }

    public static void functionB(String arg1) {
        System.out.println("Inside function B arg1: " +  arg1);
        functionC("Input to function C");
    }

    public static void functionC(String arg1) {
        System.out.println("Inside function C arg1: " +  arg1);
        functionD("Input to function D");
        System.out.println("Function D exectuion completed");
    }

    public static void functionD(String arg1) {
        System.out.println("Inside function D arg1: " +  arg1);
    }
}
