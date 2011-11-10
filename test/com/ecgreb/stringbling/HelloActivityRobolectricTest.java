package com.ecgreb.stringbling;

import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import com.xtremelabs.robolectric.shadows.ShadowActivity;
import com.xtremelabs.robolectric.shadows.ShadowImageView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class HelloActivityRobolectricTest {

    private HelloActivity helloAndroidActivity;

    @Before
    public void setUp() {
        helloAndroidActivity = new HelloActivity();
        helloAndroidActivity.onCreate(null);
    }

    @Test
    public void testText() {
        TextView textView = (TextView) helloAndroidActivity.findViewById(R.id.text);
        assertEquals("*** Hello World ***", textView.getText());
    }


    @Test
    public void testImage() {
        ImageView imageView = (ImageView) helloAndroidActivity.findViewById(R.id.image);
        ShadowImageView shadowImageView = Robolectric.shadowOf(imageView);
        assertEquals(R.drawable.robo, shadowImageView.getResourceId());
    }

    @Test
    public void testMarketLaunch() {
        ShadowActivity shadowActivity = Robolectric.shadowOf(helloAndroidActivity);
        helloAndroidActivity.launchMarket();
        Intent startedIntent = shadowActivity.getNextStartedActivity();


        Uri marketUri = Uri.parse("market://details?id=com.example");
        assertEquals(marketUri, startedIntent.getData());
    }
}
