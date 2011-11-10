package com.ecgreb.stringbling;

import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloActivityJUnitTest {

    private HelloActivity helloAndroidActivity;

    @Before
    public void setUp() {
        helloAndroidActivity = new HelloActivity();
        helloAndroidActivity.onCreate(null);
    }

    @Test
    public void testText() {
        TextView textView = (TextView) helloAndroidActivity.findViewById(R.id.text);
        assertEquals("*** Hello World***", textView.getText());
    }
}
