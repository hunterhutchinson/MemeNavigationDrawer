package org.pltw.example.memetracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class MemeActivity extends FragmentActivity {


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = null;

    }


}
