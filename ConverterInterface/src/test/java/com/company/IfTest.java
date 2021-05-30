package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class IfTest {

    @Test
    public void shouldReturnMonthUsingIf() {

        If iCon = new If();
        String whatIExpect = "January";
        String whatIGot = iCon.convertMonth(1);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDayUsingIf() {

        If iCon = new If();
        String whatIExpect = "Sunday";
        String whatIGot = iCon.convertDay(1);
        assertEquals(whatIExpect, whatIGot);
    }
}