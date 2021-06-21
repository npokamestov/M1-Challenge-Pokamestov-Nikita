package com.company;

import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Month in numerical form to convert into words.");
        int userMonthNumber;
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a Month in numerical form between 1-12!");
            scan.next();
        }
        userMonthNumber = scan.nextInt();
        while (userMonthNumber < 1 || userMonthNumber > 12) {
            System.out.println("Please enter a Month in numerical form between 1-12!");
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a Month in numerical form between 1-12!");
                scan.next();
            }
            userMonthNumber = scan.nextInt();
        }

        System.out.println("Enter a Day in numerical form to convert into words.");
        int userDayNumber;
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a Day in numerical form 1-7! (1 being Sunday)");
            scan.next();
        }
        userDayNumber = scan.nextInt();
        while (userDayNumber < 1 || userDayNumber > 7) {
            System.out.println("Please enter a Day in numerical form 1-7! (1 being Sunday)");
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a Day in numerical form 1-7! (1 being Sunday)");
                scan.next();
            }
            userDayNumber = scan.nextInt();
        }

        SwitchConverter sCon = new SwitchConverter();
        IfConverter iCon = new IfConverter();

        System.out.println("Using |SwitchConverter|, the Month is: "+sCon.convertMonth(userMonthNumber));
        System.out.println("Using |SwitchConverter|, the Day is: "+sCon.convertDay(userDayNumber));
        System.out.println("================================================");
        System.out.println("Using |IfConverter|, the Month is: "+iCon.convertMonth(userMonthNumber));
        System.out.println("Using |IfConverter|, the Day is: "+iCon.convertDay(userDayNumber));
        }
    }