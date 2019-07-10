package com.example.splashactivity.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.CoreComponentFactory;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.splashactivity.R;

public class DashBoardFragment extends Fragment {

    ImageView imgplusCorporate,imgplusSupport,imgplusEoperator;
    TextView txtcorporate,txtsupport,txteOperators;

    public DashBoardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_dash_board, container, false);
        imgplusCorporate=v.findViewById(R.id.imgplusCorporate);
        imgplusSupport=v.findViewById(R.id.imgplusSupport);
        imgplusEoperator=v.findViewById(R.id.imgplusEoperator);
        txtcorporate=v.findViewById(R.id.txtcorporate);
        txtsupport=v.findViewById(R.id.txtsupport);
        txteOperators=v.findViewById(R.id.txteOperators);

        txtcorporate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CorporatePartnersFragment corporatePartnersFragment= new CorporatePartnersFragment();
                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, corporatePartnersFragment);
                fragmentTransaction.addToBackStack(corporatePartnersFragment.getClass().getName());
                fragmentTransaction.commit();
            }
        });

        imgplusCorporate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PartnersFragment partnersFragment= new PartnersFragment();
                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, partnersFragment);
                fragmentTransaction.addToBackStack(partnersFragment.getClass().getName());
                fragmentTransaction.commit();
            }
        });
        imgplusSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PartnersFragment partnersFragment= new PartnersFragment();
                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, partnersFragment);
                fragmentTransaction.addToBackStack(partnersFragment.getClass().getName());
                fragmentTransaction.commit();
            }
        });
        imgplusEoperator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PartnersFragment partnersFragment= new PartnersFragment();
                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content_frame, partnersFragment);
                fragmentTransaction.addToBackStack(partnersFragment.getClass().getName());
                fragmentTransaction.commit();
            }
        });

        return v;
    }

}
