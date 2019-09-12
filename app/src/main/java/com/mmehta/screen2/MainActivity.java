package com.mmehta.screen2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.LinearGradient;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linLayout = findViewById(R.id.main_container);
        for(int i = 0; i < 10; i++) {
            View images = getLayoutInflater().inflate(R.layout.iterate_image, null);
            linLayout.addView(images);

        }
    }
}
