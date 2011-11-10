package com.ecgreb.stringbling.tests;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.TextView;
import com.ecgreb.stringbling.HelloActivity;
import com.ecgreb.stringbling.R;

public class HelloActivityTest extends ActivityUnitTestCase<HelloActivity> {

    private HelloActivity helloAndroidActivity;

    public HelloActivityTest() {
        super(HelloActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        startActivity(new Intent(), null, null);
        helloAndroidActivity = getActivity();
    }

    public void testText() {
        TextView textView = (TextView) helloAndroidActivity.findViewById(R.id.text);
        assertEquals("*** Hello World ***", textView.getText());
    }
}
