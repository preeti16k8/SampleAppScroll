package com.example.splashactivity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.splashactivity.Fragment.DashBoardFragment;
import com.example.splashactivity.Fragment.HelpFragment;
import com.example.splashactivity.Fragment.ProfileFragment;
import com.example.splashactivity.R;



public class DashBoard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
       ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        displaySelectedScreen(R.id.nav_dash);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dash_board, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

      /*  if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }*/



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }






    private void displaySelectedScreen(int id){

        Fragment fragment = null;

        switch (id){

           /* case R.id.nav_home:
                Intent storeintent=new Intent(this, StoreActivity.class);
                finish();
                storeintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(storeintent);

                break;*/


            case R.id.nav_dash:
                DashBoardFragment dashFrag= new DashBoardFragment();

                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,dashFrag,"dashHello").disallowAddToBackStack().commit();
                break;

            case R.id.nav_profile:
                ProfileFragment profileFragment= new ProfileFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,profileFragment,"mainHello").disallowAddToBackStack().commit();
                break;



            case R.id.nav_help:
                HelpFragment helpFragment = new
                        HelpFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,helpFragment,"raiseHello").disallowAddToBackStack().commit();
                break;


           case R.id.nav_logOut:
                Intent intet=new Intent(DashBoard.this,MainActivity.class);
                intet.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|intet.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intet);


        }


        if (fragment!=null){

            FragmentTransaction ft =
                    getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame,fragment,fragment.getTag());
            ft.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }

    }
