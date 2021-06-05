package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IfTest {

    If iCon;

    @Before
    public void setUp() {
        iCon = new If();
    }

    @Test
    public void shouldReturnMonthUsingIf() {

        String whatIExpect = "January";
        String whatIGot = iCon.convertMonth(1);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDayUsingIf() {

        String whatIExpect = "Sunday";
        String whatIGot = iCon.convertDay(1);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDidNotPickValidMonthNumberUsingIf() {

        String whatIExpect = "Did not pick a valid month number";
        String whatIGot = iCon.convertMonth(15);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDidNotPickValidDayNumberUsingIf() {

        String whatIExpect = "Did not pick a valid day number";
        String whatIGot = iCon.convertDay(8);
        assertEquals(whatIExpect, whatIGot);
    }
}