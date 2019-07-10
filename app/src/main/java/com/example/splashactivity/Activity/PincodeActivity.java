package com.example.splashactivity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.splashactivity.R;

public class PincodeActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pincode);

        btn = findViewById(R.id.imgbtn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,DashBoard.class);
        startActivity(i);

    }
}
