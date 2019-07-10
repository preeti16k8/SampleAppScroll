package com.example.splashactivity.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.example.splashactivity.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text_register;
    ImageButton btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        text_register = findViewById(R.id.registerid);
        btn = findViewById(R.id.imgbtn);
        btn.setOnClickListener(this);
        text_register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        Intent i;
        switch (v.getId()) {
            case R.id.registerid:
                i = new Intent(this, RegisterActivity.class);
                startActivity(i);
                break;
            case R.id.imgbtn:
                i = new Intent(this, PincodeActivity.class);
                startActivity(i);
                break;

        }
    }
}