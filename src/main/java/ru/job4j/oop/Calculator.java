package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int m) {
        return m - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int l) {
         return  sum(l) + multiply(l) + minus(l) + divide(l);

    }

    public static void main(String[] args) {
        int resultMinus = Calculator.minus(18);
        System.out.println(resultMinus);

        int resultSum = Calculator.sum(43);
        System.out.println(resultSum);

        Calculator prod = new Calculator();
        int resultProd = prod.multiply(4);
        System.out.println(resultProd);

        Calculator div = new Calculator();
        int resultDiv = div.divide(23);
        System.out.println(resultDiv);

        Calculator all = new Calculator();
        int resultAll = all.sumAllOperation(100);
        System.out.println(resultAll);
    }
}