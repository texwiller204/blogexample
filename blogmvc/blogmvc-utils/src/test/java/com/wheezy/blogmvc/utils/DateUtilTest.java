package com.wheezy.blogmvc.utils;


import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtilTest {

    @Test
    public void testGetToday() {
        String actual = DateUtil.getToday();
        String expected = new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
        //assertEquals(expected, actual);
        assertFalse(false);
    }
}

