package com.example.splashactivity.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.splashactivity.CustomAdapter;
import com.example.splashactivity.Model.UserInformation;
import com.example.splashactivity.R;
import com.example.splashactivity.UserInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CorporatePartnersFragment extends Fragment {


    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    List<UserInfo> userinfomodels = new ArrayList<>();
    public CorporatePartnersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_corporate_partners, container, false);
        recyclerView=v.findViewById(R.id.recyclerview);


        String name  ="pari";
        String city="bangalore";
        String date="04april19";
        String nooflead="78";
        String noofclient="23";


        UserInfo p = new UserInfo();
        p.setFirstName(name);
        p.setCity(city);
        p.setDate(date);
        p.setNooflead(nooflead);
        p.setNoofclient(noofclient);

        p.setImageUrl(String.valueOf(R.drawable.ic_launcher_background));
        userinfomodels.add(p);
        generateDataList(userinfomodels);

        // Inflate the layout for this fragment
        return v;
    }




    private void generateDataList(List<UserInfo> dummylist) {

        adapter = new CustomAdapter(getActivity(),dummylist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}
