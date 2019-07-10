package com.example.splashactivity.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.splashactivity.R;

public class PayActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        textView=findViewById(R.id.item_price);
        textView.setText("Pay "+getIntent().getStringExtra("price"));
    }
}
