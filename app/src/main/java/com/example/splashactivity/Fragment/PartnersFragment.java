package com.example.splashactivity.Fragment;

import android.app.ActionBar;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.splashactivity.Activity.PhotoActivity;
import com.example.splashactivity.Database.PartnerDatabaseHelper;
import com.example.splashactivity.Model.PartnerInformation;
import com.example.splashactivity.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.regex.Pattern;

import static android.app.Activity.RESULT_OK;
import static android.widget.Toast.*;

public class PartnersFragment extends Fragment {
    PartnerDatabaseHelper myDb;
    EditText rname, rfirmname, raddress, rcityvillage, rpincode, rstate, rdistrict, rmobileno, rwhatsaapno, rgstno, rmarketcover, rinitialinvestment, rbankname, raccountholder, rifscode, rbranch;

    private String name, firmname, address, cityvillage, pincode, state, district, mobileno, whatsaapno, gstno, marketcover, initialinvestment, bankname, accountholder, ifscode, branch;

    Button btncontinue;

    public PartnersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_partners, container, false);

        btncontinue = rootView.findViewById(R.id.buttoncontinue);
        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttoncontinue();
            }

            private void buttoncontinue() {

                Intent intent = new Intent(getActivity(), PhotoActivity.class);
                startActivity(intent);
            }
        });
        return rootView;

    }
}



//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//
//        //rdb = new Mydb(getApplicationContext());'
//        View v = inflater.inflate(R.layout.fragment_partners, container, false);
//        return v;
//    }
//
//}

//        rname = v.findViewById(R.id.edittextname);
//        rfirmname = v.findViewById(R.id.editfirm);
//        raddress = v.findViewById(R.id.editaddrs);
//        rcityvillage = v.findViewById(R.id.editcity);
//        rpincode = v.findViewById(R.id.editpin);
//        rstate = v.findViewById(R.id.spinner_state);
//        rdistrict = v.findViewById(R.id.spinnerDistrict);
//        rmobileno = v.findViewById(R.id.editTextmobile);
//        rwhatsaapno = v.findViewById(R.id.editwhatsaapno);
//        rgstno = v.findViewById(R.id.editTextGst);
//        rmarketcover = v.findViewById(R.id.edittextmarket);
//        rinitialinvestment = v.findViewById(R.id.editinitial);
//        rbankname = v.findViewById(R.id.editbank);
//        raccountholder = v.findViewById(R.id.edit_accountholder);
//        rmobileno = v.findViewById(R.id.edit_accountno);
//        rifscode = v.findViewById(R.id.edit_Ifscode);
//        rbranch = v.findViewById(R.id.edit_branch);

//
//        btncontinue.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                btncontinue();
//            }
//
//            private void btncontinue() {
//
//                intialize();
//                if (!validate()) {
//
//                    if (!validate())
//                        makeText(this, " Registeration validation failed", LENGTH_SHORT).show();
//                    else {
//                        oncontinuesuccessful();
//                    }
//                }
//
//            }
//
//            private ActionBar makeText(View.OnClickListener onClickListener, String s, int lengthShort) {
//                return null;
//            }
//
//            private void oncontinuesuccessful() {
//
//                boolean isInserted = (boolean) myDb.insertData(rname.getText().toString(),
//                        rfirmname.getText().toString(),
//                        raddress.getText().toString(),
//                        rcityvillage.getText().toString(),
//                        rpincode.getText().toString(),
//                        rstate.getText().toString(),
//                        rdistrict.getText().toString(),
//                        rmobileno.getText().toString(),
//                        rwhatsaapno.getText().toString(),
//                        rmarketcover.getText().toString(),
//                        rinitialinvestment.getText().toString(),
//                        rbankname.getText().toString(),
//                        raccountholder.getText().toString(),
//                        rifscode.getText().toString(),
//                        rbranch.getText().toString());
//            }
//        });
//        return v;
//
//    }
////        if(isInserted =true)
////
////    makeText(PartnersFragment .this, "Registered database  successfully",LENGTH_SHORT).
////
////    show();
////        else
////
////    makeText(PartnersFragment .this, "Registered db  failed",LENGTH_SHORT).show();
////
////    }
//
//
//    public boolean validate() {
//        boolean valid = true;
//
//        if (name.isEmpty() || name.length() > 32) {
//            rname.setError("Enter valid name");
//            valid = false;
//        }
//        if (firmname.isEmpty() || firmname.length() > 32) {
//            rfirmname.setError("Enter valid firmname");
//            valid = false;
//        }
//        if (address.isEmpty()) {
//            raddress.setError("Enter address");
//            valid = false;
//        }
//
//        if (cityvillage.isEmpty() || cityvillage.length() > 32) {
//            rcityvillage.setError("Enter valid name");
//            valid = false;
//        }
//
//        if (pincode.isEmpty() || ((pincode.length() < 6)) || (pincode.length() > 6)) {
//            rpincode.setError("Enter valid number");
//            valid = false;
//        }
//
//        if (mobileno.isEmpty() || ((mobileno.length() < 6)) || (pincode.length() > 6)) {
//            rpincode.setError("Enter valid number");
//            valid = false;
//        }
//
//        return valid;
//    }
//
//    private void intialize() {
//
//        name = rname.getText().toString().trim();
//        firmname = rfirmname.getText().toString().trim();
//        address = raddress.getText().toString().trim();
//        cityvillage = rcityvillage.getText().toString().trim();
//        pincode = rpincode.getText().toString().trim();
//        mobileno = rmobileno.getText().toString().trim();
//    }
