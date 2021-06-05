package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchTest {

    Switch sCon;

    @Before
    public void setUp() {
        sCon = new Switch();
    }

    @Test
    public void shouldReturnMonthUsingSwitch() {

        String whatIExpect = "January";
        String whatIGot = sCon.convertMonth(1);
        assertEquals(whatIExpect, whatIGot);

        String whatIExpect2 = "February";
        String whatIGot2 = sCon.convertMonth(2);
        assertEquals(whatIExpect2, whatIGot2);
    }

    @Test
    public void shouldReturnDayUsingSwitch() {

        String whatIExpect = "Sunday";
        String whatIGot = sCon.convertDay(1);
        assertEquals(whatIExpect, whatIGot);

        String whatIExpect2 = "Monday";
        String whatIGot2 = sCon.convertDay(2);
        assertEquals(whatIExpect2, whatIGot2);
    }

    @Test
    public void shouldReturnDidNotPickValidMonthNumberUsingSwitch() {

        String whatIExpect = "Did not pick a valid month number";
        String whatIGot = sCon.convertMonth(15);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDidNotPickValidDayNumberUsingSwitch() {

        String whatIExpect = "Did not pick a valid day number";
        String whatIGot = sCon.convertDay(8);
        assertEquals(whatIExpect, whatIGot);
    }

}