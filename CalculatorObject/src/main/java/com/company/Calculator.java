package com.company;

public class Calculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("1 + 1 = " + calc.addInt(1,1));
        System.out.println("23 - 52 = " + calc.subtractInt(23,52));
        System.out.println("34 * 2 = " + calc.multiplyInt(32,2));
        System.out.println("12 / 3 = " + calc.divideInt(12,3));
        System.out.println("12 / 7 = " + calc.divideDouble(12,7));
        System.out.println("3.4 + 2.3 = " + String.format("%.2f", calc.addDouble(3.4,2.3)));
        System.out.println("6.7 * 4.4 = " + String.format("%.2f",calc.multiplyDouble(6.7,4.4)));
        System.out.println("5.5 - 0.5 = " + calc.subtractDouble(5.5,0.5));
        System.out.println("10.8 / 2.2 = " + calc.divideDouble(10.8,2.2));
    }

//    Methods to calculate using two integer parameters
    public int addInt(int a, int b) {
        return a + b;
    }

    public int subtractInt(int a, int b) {
        return a - b;
    }

    public int multiplyInt(int a, int b) {
        return a * b;
    }

    public int divideInt(int a, int b) {
        return a / b;
    }


//    Methods to calculate using two double parameters
    public double addDouble(double a, double b) {
        return a + b;
    }

    public double subtractDouble(double a, double b) {
        return a - b;
    }

    public double multiplyDouble(double a, double b) {
        return a * b;
    }

    public double divideDouble(double a, double b) {
        return a / b;
    }

}
