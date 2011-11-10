package com.ecgreb.stringbling;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(StringBling.bling("Hello World"));
    }

    public void launchMarket() {
        Intent intent = new Intent();
        intent.setData(Uri.parse("market://details?id=com.example"));
        startActivity(intent);
    }
}
