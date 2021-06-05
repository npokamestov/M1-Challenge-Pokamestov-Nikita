package com.company;

import com.company.interfaces.ConverterIf;

public class If implements ConverterIf {
    public String convertMonth(int userMonthNumber) {

        if (userMonthNumber == 1) {
            return "January";
        } else if (userMonthNumber == 2) {
            return "February";
        } else if (userMonthNumber == 3) {
            return "March";
        } else if (userMonthNumber == 4) {
            return "April";
        } else if (userMonthNumber == 5) {
            return "May";
        } else if (userMonthNumber == 6) {
            return "June";
        } else if (userMonthNumber == 7) {
            return"July";
        } else if (userMonthNumber == 8) {
            return "August";
        } else if (userMonthNumber == 9) {
            return "September";
        } else if (userMonthNumber == 10) {
            return "October";
        } else if (userMonthNumber == 11) {
            return "November";
        } else if (userMonthNumber == 12){
            return "December";
        } else {
            return "Did not pick a valid month number";
        }
    }

    public String convertDay(int dayNumber) {

        if (dayNumber == 1) {
            return "Sunday";
        } else if (dayNumber == 2) {
            return "Monday";
        } else if (dayNumber == 3) {
            return "Tuesday";
        } else if (dayNumber == 4) {
            return "Wednesday";
        } else if (dayNumber == 5) {
            return "Thursday";
        } else if (dayNumber == 6) {
            return "Friday";
        } else if (dayNumber == 7){
            return "Saturday";
        } else {
            return "Did not pick a valid day number";
        }
    }
}
