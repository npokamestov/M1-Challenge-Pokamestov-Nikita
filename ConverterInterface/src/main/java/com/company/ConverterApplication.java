package com.company;

import com.company.interfaces.ConverterIf;
import com.company.interfaces.ConverterSwitch;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Month in numerical form to convert into words.");
        int userMonthNumber;
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a Month in numerical form between 1-12!");
            scan.next();
        } userMonthNumber = scan.nextInt();
        while (userMonthNumber < 1 || userMonthNumber > 12) {
            System.out.println("Please enter a Month in numerical form between 1-12!");
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a Month in numerical form between 1-12!");
                scan.next();
            } userMonthNumber = scan.nextInt();
        }

        System.out.println("Enter a Day in numerical form to convert into words.");
        int userDayNumber;
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a Day in numerical form 1-7! (1 being Sunday)");
            scan.next();
        } userDayNumber = scan.nextInt();
        while (userDayNumber < 1 || userDayNumber > 7) {
            System.out.println("Please enter a Day in numerical form 1-7! (1 being Sunday)");
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a Day in numerical form 1-7! (1 being Sunday)");
                scan.next();
            } userDayNumber = scan.nextInt();
        }

        ConverterSwitch sCon = new ConverterSwitch() {

            public String convertMonth(int monthNumber) {

                switch (monthNumber) {
                    case 1: return "January";
                    case 2: return "February";
                    case 3: return "March";
                    case 4: return "April";
                    case 5: return "May";
                    case 6: return "June";
                    case 7: return "July";
                    case 8: return "August";
                    case 9: return "September";
                    case 10: return "October";
                    case 11: return "November";
                    case 12: return "December";
                    default: return "";
                }
            }


            public String convertDay(int dayNumber) {

                switch (dayNumber) {
                    case 1: return "Sunday";
                    case 2: return "Monday";
                    case 3: return "Tuesday";
                    case 4: return "Wednesday";
                    case 5: return "Thursday";
                    case 6: return "Friday";
                    case 7: return "Saturday";
                    default: return "";
                }
            }
        };

        ConverterIf iCon = new ConverterIf() {

            public String convertMonth(int userMonthNumber) {

                String monthName;

                if (userMonthNumber == 1) {
                    monthName = "January";
                } else if (userMonthNumber == 2) {
                    monthName = "February";
                } else if (userMonthNumber == 3) {
                    monthName ="March";
                } else if (userMonthNumber == 4) {
                    monthName ="April";
                } else if (userMonthNumber == 5) {
                    monthName ="May";
                } else if (userMonthNumber == 6) {
                    monthName ="June";
                } else if (userMonthNumber == 7) {
                    monthName ="July";
                } else if (userMonthNumber == 8) {
                    monthName ="August";
                } else if (userMonthNumber == 9) {
                    monthName ="September";
                } else if (userMonthNumber == 10) {
                    monthName ="October";
                } else if (userMonthNumber == 11) {
                    monthName ="November";
                } else {
                    monthName ="December";
                }
                return monthName;
            }

            public String convertDay(int dayNumber) {

                String dayName;

                if (dayNumber == 1) {
                    dayName = "Sunday";
                } else if (dayNumber == 2) {
                    dayName = "Monday";
                } else if (dayNumber == 3) {
                    dayName = "Tuesday";
                } else if (dayNumber == 4) {
                    dayName = "Wednesday";
                } else if (dayNumber == 5) {
                    dayName = "Thursday";
                } else if (dayNumber == 6) {
                    dayName = "Friday";
                } else {
                    dayName = "Saturday";
                }
                return dayName;
            }
        };

        System.out.println("Using |ConverterSwitch|, the Month is: " + sCon.convertMonth(userMonthNumber));
        System.out.println("Using |ConverterSwitch|, the Day is: " + sCon.convertDay(userDayNumber));
        System.out.println("================================================");
        System.out.println("Using |ConverterIf|, the Month is: " + iCon.convertMonth(userMonthNumber));
        System.out.println("Using |ConverterIf|, the Day is: " + iCon.convertDay(userDayNumber));
    }
}
