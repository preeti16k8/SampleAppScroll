package com.example.splashactivity.Activity;

import android.content.Intent;
import android.database.Cursor;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.splashactivity.Database.DataHelper;
//import com.example.splashactivity.Database.SewakDatahelper;
import com.example.splashactivity.Model.UserInformation;
import com.example.splashactivity.Network.CommonMethod;
import com.example.splashactivity.R;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;

    DataHelper dbHelper;
    String selectedState, selectedistrict, SelectedUserCategory;
    Spinner spinnerstate, spinnerDistrict, spinnerUserCategory;
    EditText edittextname, edittextid, edittextlocation, edittextdate, edittexttime, editfirm, editaddrs, editcity, editpin, editstate, editdistric, editTextmobile, editTextmobile1, editwhatsaapno, editText_emailid, editwebsites;
    String location, date, time = "";
    List<UserInformation> userinfomodels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dbHelper = new DataHelper(this);

        btn = findViewById(R.id.button_register);
        spinnerstate = findViewById(R.id.spinner_state);
        spinnerDistrict = findViewById(R.id.spinnerDistrict);
        spinnerUserCategory = findViewById(R.id.spinnerUserCategory);
        edittextname = findViewById(R.id.edittextname);
        editfirm = findViewById(R.id.editfirm);
        editaddrs = findViewById(R.id.editaddrs);
        editcity = findViewById(R.id.editcity);
        editpin = findViewById(R.id.editpin);
        editTextmobile = findViewById(R.id.editTextmobile);
        editTextmobile1 = findViewById(R.id.editTextmobile1);
        editwhatsaapno = findViewById(R.id.editwhatsaapno);
        editText_emailid = findViewById(R.id.editText_emailid);
        editwebsites = findViewById(R.id.editwebsite);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        btn.setOnClickListener(this);

        spinnerUserCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelectedUserCategory = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinnerstate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedState = parent.getItemAtPosition(position).toString();
                switch (selectedState) {
                    case "Jharkhand":
                        spinnerDistrict.setAdapter(new ArrayAdapter<String>(RegisterActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_Jharkhand)));
                        break;

                    case "Bihar":
                        spinnerDistrict.setAdapter(new ArrayAdapter<String>(RegisterActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.items_div_Bihar)));
                        break;


                }

                spinnerDistrict.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerDistrict.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedistrict = parent.getItemAtPosition(position).toString();

              /*  Toast.makeText(MainActivity.this, "\n Class: \t " + selectedClass +
                        "\n Div: \t" + selectedDiv, Toast.LENGTH_LONG).show();*/
                // tv_selecteditems.setText(selectedClass+ " : "+ selectedistrict);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    @Override
    public void onClick(View v) {
        // getFromDatabase();
        userSignUp();
    }

    private void userSignUp() {
        String id = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        String name = edittextname.getText().toString().trim();
        //String id="1";
       /* String location=edittextlocation.getText().toString().trim();
        String date=edittextdate.getText().toString().trim();
        String time=edittexttime.getText().toString().trim();*/
        String firmname = editfirm.getText().toString().trim();
        String address = editaddrs.getText().toString().trim();
        String cityVillage = editcity.getText().toString().trim();
        String pincode = editpin.getText().toString().trim();
       /* String state=editstate.getText().toString().trim();
        String district=editdistric.getText().toString().trim();*/
        String mobileno1 = editTextmobile.getText().toString().trim();
        String mobileno2 = editTextmobile1.getText().toString().trim();
        String whatsss = editwhatsaapno.getText().toString().trim();
        String EmailId = editText_emailid.getText().toString().trim();
        String website = editwebsites.getText().toString().trim();

        if (name.isEmpty()) {
            edittextname.setError("Name is Required");
            edittextname.requestFocus();
            return;
        }
        if (firmname.isEmpty()) {
            editfirm.setError("Firm Name is Required");
            editfirm.requestFocus();
            return;
        }
        if (address.isEmpty()) {
            editaddrs.setError("Address is Required");
            editaddrs.requestFocus();
            return;
        }
        if (cityVillage.isEmpty()) {
            editcity.setError("CityVillage is Required");
            editcity.requestFocus();
            return;
        }
        if (pincode.isEmpty()) {
            editpin.setError("PinCode is Required");
            editpin.requestFocus();
            return;
        }
        if (selectedState.isEmpty()) {
            editstate.setError("State is Required");
            editstate.requestFocus();
            return;
        }

        if (selectedistrict.isEmpty()) {
            editdistric.setError("District is Required");
            editdistric.requestFocus();
            return;
        }

        if (mobileno1.isEmpty()) {
            editTextmobile.setError("Mobile no is Required");
            editTextmobile.requestFocus();
            return;
        }
        if (mobileno1.length() < 10 || mobileno1.length() > 10) {
            editTextmobile.setError("Mobile number must be 10");
            editTextmobile.requestFocus();
            return;
        }
        if (mobileno2.isEmpty()) {
            editTextmobile1.setError("Mobile no is Required");
            editTextmobile1.requestFocus();
            return;
        }
        if (mobileno2.length() < 10 || mobileno1.length() > 10) {
            editTextmobile1.setError("Mobile number must be 10");
            editTextmobile1.requestFocus();
            return;
        }

        if (whatsss.isEmpty()) {
            editwhatsaapno.setError("Whatsapp no is Required");
            editwhatsaapno.requestFocus();
            return;
        }
        if (whatsss.length() < 10 || editwhatsaapno.length() > 10) {
            editwhatsaapno.setError("Whatsapp no must be 10");
            editwhatsaapno.requestFocus();
            return;
        }

        if (EmailId.isEmpty()) {
            editText_emailid.setError("Email is Required");
            editText_emailid.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(EmailId).matches()) {
            editText_emailid.setError("Enter a valid email");
            editText_emailid.requestFocus();
            return;
        }

        if (website.isEmpty()) {
            editwebsites.setError("Website is Required");
            editwebsites.requestFocus();
            return;
        }

        dbHelper.adduser(RegisterActivity.this, id, location, date, time, SelectedUserCategory, name, firmname, address, cityVillage,
                pincode, selectedState, selectedistrict, mobileno1, mobileno2, whatsss, EmailId, website);
        getFromDatabase();

        Intent intent = new Intent(RegisterActivity.this, DashBoard.class);
        startActivity(intent);
    }

    private void getFromDatabase() {
        if (dbHelper.getUserCount() != 0) {
            Cursor cursor = dbHelper.getuser();
            while (cursor.moveToNext()) {

                String Id = cursor.getString(0);
                String Location = cursor.getString(1);
                String Date = cursor.getString(2);
                String Time = cursor.getString(3);
                String Category = cursor.getString(4);
                String Name = cursor.getString(5);
                String Firmname = cursor.getString(6);
                String Address = cursor.getString(7);
                String CityVillage = cursor.getString(8);
                String Pincode = cursor.getString(9);
                String State = cursor.getString(10);
                String District = cursor.getString(11);
                String Mobileno1 = cursor.getString(12);
                String Mobileno2 = cursor.getString(13);
                String Whatsaapno = cursor.getString(14);
                String Emailid = cursor.getString(15);
                String websites = cursor.getString(16);
                UserInformation p = new UserInformation();
                p.setId(Id);
                p.setLocation(Location);
                p.setDate(Date);
                p.setTime(Time);
                p.setCategory(Category);
                p.setName(Name);
                p.setFirmname(Firmname);
                p.setAddress(Address);
                p.setCityVillage(CityVillage);
                p.setPincode(Pincode);
                p.setState(State);
                p.setDistrict(District);
                p.setMobileno1(Mobileno1);
                p.setMobileno2(Mobileno2);
                p.setWhatsappno(Whatsaapno);
                p.setEmailid(Emailid);
                p.setWebsite(websites);
                userinfomodels.add(p);

                Log.d("eeeeeeeeeee", Emailid);
                Log.d("Categgggghhhhhhhhh", Category);
                Log.d("uniquuuuuue", Id);
            }

            //generateDataList(userinfomodels);
            // progressDoalog.dismiss();
        } else {

            CommonMethod.showAlert("Internet Connectivity Failure", RegisterActivity.this);
        }


    }


}

