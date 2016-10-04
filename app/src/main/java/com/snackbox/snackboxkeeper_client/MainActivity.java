package com.snackbox.snackboxkeeper_client;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.vision.barcode.BarcodeDetector;

/**
 * Created by Jan Michael Raymundo on 10/4/16.<br> Copyright © 2016 KlabCyscorpions. All rights reserved.
 */

public class MainActivity extends Activity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        BarcodeDetector barcodeDetector = new BarcodeDetector.Builder(this).build();
    }
}
