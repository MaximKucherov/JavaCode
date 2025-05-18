package com.example.practice;

public class Section_5 {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if((temperature >= 25 && temperature <= 35) || (summer && temperature >= 25 && temperature <= 45))
            return true;

        return false;
    }

    //----------------------------------------------------------

    public static void printEqual(int one, int two, int three) {

        if(one < 0 || two < 0 || three < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if(one == two && one == three) {
            System.out.println("All numbers are equal");
            return;
        }

        if(one != two && one != three && two != three) {
            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");

    }

    //----------------------------------------------------------

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60;

        long days = hours / 24 % 365;

        long year = hours / 24 / 365;

        System.out.println(minutes + " min = " + year + " y and " + days + " d");

    }

    //----------------------------------------------------------

    public static double area(double radius) {

        if(radius < 0)
            return -1;

        return 0.5 * 2 * Math.PI * radius * radius;
    }

    public static double area(double x, double y) {

        if(x < 0 || y < 0)
            return -1;

        return x * y;
    }
}
