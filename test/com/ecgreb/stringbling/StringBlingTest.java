package com.ecgreb.stringbling;

import com.ecgreb.stringbling.StringBling;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBlingTest {

    @Test
    public void testText() {
        assertEquals("*** Hello World ***", StringBling.bling("Hello World"));
    }
}
