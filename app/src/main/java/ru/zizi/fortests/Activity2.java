package ru.zizi.fortests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        TextView textView = findViewById(R.id.textView);
        String versionName = BuildConfig.VERSION_NAME;
        textView.setText("Version Name = " + versionName);
    }
}