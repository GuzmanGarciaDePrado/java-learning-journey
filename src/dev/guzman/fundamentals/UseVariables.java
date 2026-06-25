package dev.guzman.fundamentals;

public class UseVariables {

    public static void main(String[] args) {
        byte age = 17;   // ---Test 1: Declare and initialize at the same time (Recommended) ---
        /* large comments Test
         * 1 sddsd
         * 2 sdsds
         */

        System.out.println(age);

        //--- TEST 2: Change the value later ---

        age = 35;
        System.out.println(age);

        age = 0; //---TEST 3: initialize without knowing the data---

        double middleAge = (double) age / 5;

        System.out.println(middleAge); //---TEST 4: Words use---

        String name;

        name = "Bob";

        System.out.println(name);

        age = 15; //---to add---

        age++;

        System.out.println(age);

        age = 15; //---to subtract---

        age--;

        System.out.println(age);

        age = 15; //---recommended---

        age += 10;

        System.out.println(age);

        int age2 = 15; //---not recommended---

        age2 = age2 + 10;

        System.out.println(age2);

        double num1 = 7;

        double num2 = 3;

        System.out.println(num1 % num2);

        int num3 = 5;

        double num4 = 2;

        double resultado = num3 / num4;

        System.out.println(resultado);

        int age3 = 19;

        String name2 = "Juan has";

        System.out.println(name2 + " " + age3 + " years");
    }
}