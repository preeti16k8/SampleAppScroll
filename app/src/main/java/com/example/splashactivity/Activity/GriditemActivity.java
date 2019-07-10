package com.example.splashactivity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.splashactivity.R;

public class GriditemActivity extends AppCompatActivity  {
    TextView text_name, text_name2, text_name3, text_description, text_description2, text_description3,
            text_price, text_price2, text_price3;
    ImageView image, image2, image3;
    Button btn, btn2, btn3;

    int[] bussiness_image = {R.drawable.businessgold, R.drawable.bussinessilver, R.drawable.bussinessplatinum};
    int[] school_image = {R.drawable.schoolgold, R.drawable.schoolplatinum, R.drawable.schoolsilver};
    int[] hotel_image = {R.drawable.hotelgold, R.drawable.hotelplatinum, R.drawable.hotelsilver};
    int[] restaurant_image = {R.drawable.restaurantgold, R.drawable.restaurantplatinum, R.drawable.resaurantsilver};
    int[] hospital_image = {R.drawable.hospitalgold, R.drawable.hospitalplatinum, R.drawable.hospitalsilver};
    int[] pathologygold_image = {R.drawable.pathologygold, R.drawable.pathologyplatinum, R.drawable.pathologysilver};
    int[] website_image = {R.drawable.normalwebsite, R.drawable.dynmic, R.drawable.ecommerce};

    String[] bussiness_price = {"RS. 11,500", "RS. 12,000", "RS. 12,500"};
    String[] school_price = {"RS. 11,500", "RS. 12,000", "RS. 12,500"};
    String[] hotel_price = {"RS. 11,500", "RS. 12,000", "RS. 12,500"};
    String[] restaurant_price = {"RS. 11,500", "RS. 12,000", "RS. 12,500"};
    String[] hospital_price = {"RS. 11,500", "RS. 12,000", "RS. 12,500"};
    String[] pathology_price = {"RS. 11,500", "RS. 12,000", "RS. 12,500"};
    String[] website_price = {"RS. 12,0000", "RS. 22,0000", "RS 42,0000"};
    String[] Names = {"Business.Net ERP 18", "School.Net ERP 18", "Hotel.Net ERP 18", "Restaurant", "Hospital", "Pathologygold", "G.S.T. Services","PAN Services", "Websites" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_griditem);
        btn = findViewById(R.id.buttonbuyno);
        btn2 = findViewById(R.id.buttonbuyno2);
        btn3 = findViewById(R.id.buttonbuyno3);

        text_price = findViewById(R.id.price);
        text_price2 = findViewById(R.id.price2);
        text_price3 = findViewById(R.id.price3);

        text_name = findViewById(R.id.title_nm);
        text_name2 = findViewById(R.id.title_nm2);
        text_name3 = findViewById(R.id.title_nm3);

        text_description = findViewById(R.id.desc);
        text_description2 = findViewById(R.id.desc2);
        text_description3 = findViewById(R.id.desc3);

        image = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView2);
        image3 = findViewById(R.id.imageView3);

        String name = getIntent().getStringExtra("title");
        if (name.equals(Names[0])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            image.setImageResource(bussiness_image[0]);
            image2.setImageResource(bussiness_image[1]);
            image3.setImageResource(bussiness_image[2]);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(bussiness_price[0]);
            text_price2.setText(bussiness_price[1]);
            text_price3.setText(bussiness_price[2]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                            Intent i = new Intent(GriditemActivity.this, PayActivity.class);
                            i.putExtra("price",bussiness_price[0]);
                            startActivity(i);
                    }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(GriditemActivity.this, PayActivity.class);
                    i2.putExtra("price",bussiness_price[1]);
                    startActivity(i2);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(GriditemActivity.this, PayActivity.class);
                    i3.putExtra("price",bussiness_price[2]);
                    startActivity(i3);
                }
            });

        } else if (name.equals(Names[1])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            image.setImageResource(school_image[0]);
            image2.setImageResource(school_image[1]);
            image3.setImageResource(school_image[2]);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(school_price[0]);
            text_price2.setText(school_price[1]);
            text_price3.setText(school_price[2]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(GriditemActivity.this, PayActivity.class);
                    i.putExtra("price",school_price[0]);
                    startActivity(i);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(GriditemActivity.this, PayActivity.class);
                    i2.putExtra("price",school_price[1]);
                    startActivity(i2);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(GriditemActivity.this, PayActivity.class);
                    i3.putExtra("price",school_price[2]);
                    startActivity(i3);
                }
            });
        } else if (name.equals(Names[2])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            image.setImageResource(hotel_image[0]);
            image2.setImageResource(hotel_image[1]);
            image3.setImageResource(hotel_image[1]);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(hotel_price[0]);
            text_price2.setText(hotel_price[1]);
            text_price3.setText(hotel_price[2]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(GriditemActivity.this, PayActivity.class);
                    i.putExtra("price",hotel_price[0]);
                    startActivity(i);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(GriditemActivity.this, PayActivity.class);
                    i2.putExtra("price",hotel_price[1]);
                    startActivity(i2);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(GriditemActivity.this, PayActivity.class);
                    i3.putExtra("price",hotel_price[2]);
                    startActivity(i3);
                }
            });

        } else if (name.equals(Names[3])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            image.setImageResource(restaurant_image[0]);
            image2.setImageResource(restaurant_image[1]);
            image3.setImageResource(restaurant_image[2]);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(restaurant_price[0]);
            text_price2.setText(restaurant_price[1]);
            text_price3.setText(restaurant_price[2]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(GriditemActivity.this, PayActivity.class);
                    i.putExtra("price",restaurant_price[0]);
                    startActivity(i);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(GriditemActivity.this, PayActivity.class);
                    i2.putExtra("price",restaurant_price[1]);
                    startActivity(i2);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(GriditemActivity.this, PayActivity.class);
                    i3.putExtra("price",restaurant_price[2]);
                    startActivity(i3);
                }
            });

        } else if (name.equals(Names[4])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            image.setImageResource(hospital_image[0]);
            image2.setImageResource(hospital_image[1]);
            image3.setImageResource(hospital_image[2]);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(hospital_price[0]);
            text_price2.setText(hospital_price[1]);
            text_price3.setText(hospital_price[2]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(GriditemActivity.this, PayActivity.class);
                    i.putExtra("price",hospital_price[0]);
                    startActivity(i);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(GriditemActivity.this, PayActivity.class);
                    i2.putExtra("price",hospital_price[1]);
                    startActivity(i2);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(GriditemActivity.this, PayActivity.class);
                    i3.putExtra("price",hospital_price[2]);
                    startActivity(i3);
                }
            });


        } else if (name.equals(Names[5])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            image.setImageResource(pathologygold_image[0]);
            image2.setImageResource(pathologygold_image[1]);
            image3.setImageResource(pathologygold_image[1]);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(pathology_price[0]);
            text_price2.setText(pathology_price[1]);
            text_price3.setText(pathology_price[2]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(GriditemActivity.this, PayActivity.class);
                    i.putExtra("price",pathology_price[0]);
                    startActivity(i);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(GriditemActivity.this, PayActivity.class);
                    i2.putExtra("price",pathology_price[1]);
                    startActivity(i2);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(GriditemActivity.this, PayActivity.class);
                    i3.putExtra("price",pathology_price[2]);
                    startActivity(i3);
                }
            });
        } else if (name.equals(Names[6])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            image.setImageResource(school_image[0]);
            image2.setImageResource(school_image[1]);
            image3.setImageResource(school_image[2]);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(school_price[0]);
            text_price2.setText(school_price[1]);
            text_price3.setText(school_price[2]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(GriditemActivity.this, PayActivity.class);
                    i.putExtra("price",bussiness_price[0]);
                    startActivity(i);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(GriditemActivity.this, PayActivity.class);
                    i2.putExtra("price",bussiness_price[1]);
                    startActivity(i2);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(GriditemActivity.this, PayActivity.class);
                    i3.putExtra("price",bussiness_price[2]);
                    startActivity(i3);
                }
            });
        } else if (name.equals(Names[7])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            image.setImageResource(school_image[0]);
            image2.setImageResource(school_image[1]);
            image3.setImageResource(school_image[2]);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(school_price[0]);
            text_price2.setText(school_price[1]);
            text_price3.setText(school_price[2]);

        } else if (name.equals(Names[8])) {
            text_name.setText(name);
            text_name2.setText(name);
            text_name3.setText(name);
            text_description.setText(getIntent().getStringExtra("dsc"));
            text_description2.setText(getIntent().getStringExtra("dsc"));
            text_description3.setText(getIntent().getStringExtra("dsc"));
            text_price.setText(website_price[0]);
            text_price2.setText(website_price[1]);
            text_price3.setText(website_price[2]);
            image.setImageResource(website_image[0]);
            image2.setImageResource(website_image[1]);
            image3.setImageResource(website_image[2]);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(GriditemActivity.this, PayActivity.class);
                    i.putExtra("price",website_price[0]);
                    startActivity(i);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(GriditemActivity.this, PayActivity.class);
                    i2.putExtra("price",website_price[1]);
                    startActivity(i2);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i3 = new Intent(GriditemActivity.this, PayActivity.class);
                    i3.putExtra("price",website_price[2]);
                    startActivity(i3);
                }
            });
        }

    }


}