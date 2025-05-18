package com.example.practice;

public class Lesson_53 {

    public static void main(String[] args) {

        double centimeters = convertToCentimeters(68);
        System.out.println(centimeters + " centimeters.");

        centimeters = convertToCentimeters(5, 8);
        System.out.println(centimeters + " centimeters.");
    }

    public static double convertToCentimeters(int inches) {
        System.out.print(inches + " inches are ");
        return inches * 2.54;
    }

    private static double convertInchesSilently(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        System.out.print(feet + " foot and " + inches + " inches are ");
        return convertInchesSilently(feet * 12 + inches);
    }
}
