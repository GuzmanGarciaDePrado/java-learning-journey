package dev.guzman.fundamentals;

public class UseConstant {

    public static void main(String[] args) {

        int a = 3, b = 10;

        b = 15;

        System.out.println(b);

        final int example = 9;

        // ---example=15; is a constant is impossible to change it---

        System.out.println(example);

        final double PI = 3.1416;

        System.out.println(PI);

        final double ainches = 2.54;

        int inches = 7;

        double result = inches * ainches;

        System.out.println(result);

        int d, variableE, f;

        d = variableE = f = 4;

        System.out.println(d + variableE + f);


    }
}
