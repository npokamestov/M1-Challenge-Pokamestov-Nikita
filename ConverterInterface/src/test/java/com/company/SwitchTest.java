package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchTest {

    @Test
    public void shouldReturnMonthUsingIf() {

        Switch sCon = new Switch();
        String whatIExpect = "January";
        String whatIGot = sCon.convertMonth(1);
        assertEquals(whatIExpect, whatIGot);

        String whatIExpect2 = "February";
        String whatIGot2 = sCon.convertMonth(2);
        assertEquals(whatIExpect2, whatIGot2);
    }

    @Test
    public void shouldReturnDayUsingIf() {

        Switch sCon = new Switch();
        String whatIExpect = "Sunday";
        String whatIGot = sCon.convertDay(1);
        assertEquals(whatIExpect, whatIGot);

        String whatIExpect2 = "Monday";
        String whatIGot2 = sCon.convertDay(2);
        assertEquals(whatIExpect2, whatIGot2);
    }

}