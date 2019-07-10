package com.example.splashactivity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

//import com.example.splashactivity.Database.PartnerDatabaseHelper;
import com.example.splashactivity.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    //PartnerDatabaseHelper myDb;



    String[] desc={"Business.Net is a complete solution for any type of Whole Sale / Retail Stockist / Distributors Business like Medicine Shop, General Store, Garments, Footwear, Electronics, Mobile Gallery, Furniture etc for Sales, Purchase, Inventory, Accounts, Vat Reports and Multiple Reports."
            , "School.Net is mainly work with Institute, School and College related to Admission, Fee Collection, Examination, Accounts etc."
            , "Hotel.Net is a complete Hotel Management System software for Fooding,Lodging, Expanse and Bank A/c Maintenance"
            , "One of the most important parts of a website is the content. We provide web content development services such as site map development, content planning, writing, editing, and keyword analysis."
            , "Money and securities have specifically been excluded from the definition of services. However specified transactions in money have been included – activity relating to the use of money or its conversion by cash or by any other mode, from one form, currency or denomination to another form, currency or denomination for which a separate consideration is charged."
            , "A Permanent Account Number (PAN) is a ten-digit alphanumeric number, issued in the form of a laminated card, by the Indian Income Tax Department, to any person / who applies for it or to whom the department allots the number without an application."
            , "Add Description Of G.S.T  Services"
            , "Add Description Of WebSites"
            , "Add Description Of PAN Services"
    };

    String[] Names = {"Business.Net ERP 18","School.Net ERP 18","Hotel.Net ERP 18","Restaurant","Hospital","Pathologygold","G.S.T. Services","PAN Services","Websites"};
    String[] Prices = {"11,500", "12,000","12,500","13,000","13,500","14,000","13,000","13,500","14,000"};
    int[] images = {R.drawable.businessgold,R.drawable.schoolgold,R.drawable.hotelgold,R.drawable.restaurantgold,R.drawable.hospitalgold,R.drawable.pathologygold,R.drawable.gst,R.drawable.pan,R.drawable.websites,};

    Button b1,b2;


    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.login);
        b2 = findViewById(R.id.register);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        //myDb = new PartnerDatabaseHelper(this);




        gridView = findViewById(R.id.gridview);
        CustomeAdapter customeAdapter=new CustomeAdapter();
        gridView.setAdapter(customeAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this, GriditemActivity.class);
                intent.putExtra("title",Names[position]);
              //  intent.putExtra("img",images[position]);
                intent.putExtra("dsc",desc[position]);
              //  intent.putExtra("prices",Prices[position]);
                startActivity(intent);
            }
        });

    }

        private class CustomeAdapter extends BaseAdapter {
            @Override
            public int getCount() {
                return Names.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view=getLayoutInflater().inflate(R.layout.row_data,null);
                TextView textView=view.findViewById(R.id.title_name);
                ImageView imageView=view.findViewById(R.id.img);
                textView.setText(Names[position]);
                imageView.setImageResource(images[position]);
                return view;
            }
        }



    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.login:
                i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;
            case R.id.register:
                i = new Intent(this, RegisterActivity.class);
                startActivity(i);
                break;

        }

    }

        }
