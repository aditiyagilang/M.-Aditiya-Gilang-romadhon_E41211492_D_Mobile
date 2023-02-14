package com.example.minggu1;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;

    private void initComponent() {
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();

        button.setOnClickListener(this);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        textView.setText("Hello World!");

    }
}