package com.company;

import com.company.interfaces.ConverterIf;
import com.company.interfaces.ConverterSwitch;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a month in numerical form to convert into words. (no zero's as first digit)");
        int userMonthNumber = Integer.parseInt(scan.nextLine());

        while (userMonthNumber < 1 || userMonthNumber > 12) {
            System.out.println("Please enter a month in numerical form between 1-12! (no zero's as first digit)");
            userMonthNumber = Integer.parseInt(scan.nextLine());
        } int monthNumber = userMonthNumber;

        System.out.println("Enter a day in numerical form to convert into words.");
        int userDayNumber = Integer.parseInt(scan.nextLine());

        while (userDayNumber < 1 || userDayNumber > 7) {
            System.out.println("Please enter a day in numerical form 1-7! (1 being Sunday)");
            userDayNumber = Integer.parseInt(scan.nextLine());
        } int dayNumber = userDayNumber;

        ConverterSwitch sCon = new ConverterSwitch() {

            public String convertMonth(int monthNumber) {
//
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

            public String convertMonth(int month) {

                String monthName = "";

                if (monthNumber == 1) {
                    monthName = "January";
                } else if (monthNumber == 2) {
                    monthName = "February";
                } else if (monthNumber == 3) {
                    monthName ="March";
                } else if (monthNumber == 4) {
                    monthName ="April";
                } else if (monthNumber == 5) {
                    monthName ="May";
                } else if (monthNumber == 6) {
                    monthName ="June";
                } else if (monthNumber == 7) {
                    monthName ="July";
                } else if (monthNumber == 8) {
                    monthName ="August";
                } else if (monthNumber == 9) {
                    monthName ="September";
                } else if (monthNumber == 10) {
                    monthName ="October";
                } else if (monthNumber == 11) {
                    monthName ="November";
                } else if (monthNumber == 12) {
                    monthName ="December";
                }
                return monthName;
            }

            public String convertDay(int dayNumber) {

                String dayName = "";

                if (dayNumber == 1) {
                    dayName = "Sunday";
                } else if (dayNumber == 2) {
                    dayName = "Monday";
                } else if (dayNumber == 3) {
                    dayName = "Tuesday";
                } else if (dayNumber == 4) {
                    dayName = "Wednesday";
                } else if (dayNumber == 5) {
                    dayName = "Thurday";
                } else if (dayNumber == 6) {
                    dayName = "Friday";
                } else if (dayNumber == 7) {
                    dayName = "Saturday";
                }

                return dayName;
            }
        };

        System.out.println("Using |ConverterSwitch|, the Month is: " + sCon.convertMonth(userMonthNumber));
        System.out.println("Using |ConverterSwitch|, the Day is: " + sCon.convertDay(userDayNumber));

        System.out.println("Using |ConverterIf|, the Month is: " + iCon.convertMonth(userMonthNumber));
        System.out.println("Using |ConverterIf|, the Day is: " + iCon.convertDay(userDayNumber));
    }
}
