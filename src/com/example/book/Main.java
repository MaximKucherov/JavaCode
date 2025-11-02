package com.example.book;

public class Main {

    public static void main(String[] args) {

        ReportCard rc = new ReportCard();
        char yourGrade = rc.convertGrade(88);

        switch (yourGrade) {
            case 'A':
                System.out.println("Превосходная работа!");
                break;
            case 'B':
                System.out.println("Хорошая работа!");
                break;
            case 'C':
                System.out.println("Надо подтянуть знания!");
                break;
            case 'D':
                System.out.println("Будь посерьезнее!");
                break;
        }

    } 
    
}
