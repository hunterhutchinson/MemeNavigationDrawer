package org.pltw.example.memetracker;

import android.app.AlertDialog;

import android.content.ClipData;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Meme_Fragment extends Fragment {

    private Meme mMeme;
    private ImageView mSpongeBobImage1;
    private ImageView mSpongeBobImage2;
    private ImageView mPhotoshopImage1;
    private ImageView mPhotoshopImage2;
    private ImageView mJoshImage1;
    private ImageView mOverwatchImage1;
    private ImageView mOverwatchImage2;
    private ImageView mFortniteImage1;
    private ImageView mFortniteImage2;
    private ImageView mDestinyImage1;
    private ImageView mDestinyImage2;
    private ImageView mPepeImage1;
    private ImageView mPepeImage2;

    private Button mButton2;
    private Button mButton1;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;




    private MenuItem mNavSponge;
    private MenuItem mNavJosh;
    private MenuItem mNavOverwatch;
    private MenuItem mNavPhotoshop;
    private MenuItem mNavDestiny;
    private MenuItem mNavFortnite;
    private MenuItem mNavPepe;



    public Meme_Fragment() {
        mMeme = new Meme();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.meme_fragment, container, false);

        mSpongeBobImage1 = (ImageView) rootView.findViewById(R.id.spongebob_1);
        mSpongeBobImage2 = (ImageView) rootView.findViewById(R.id.spongebob_2);

        mPepeImage1 = (ImageView) rootView.findViewById(R.id.pepe_1);
        mPepeImage2 = (ImageView) rootView.findViewById(R.id.pepe_2);

        mPhotoshopImage1 = (ImageView) rootView.findViewById(R.id.photoshop_1);
        mPhotoshopImage2 = (ImageView) rootView.findViewById(R.id.photoshop_2);

        mJoshImage1 = (ImageView) rootView.findViewById(R.id.josh_1);

        mOverwatchImage1 = (ImageView) rootView.findViewById(R.id.overwatch_1);
        mOverwatchImage2 = (ImageView) rootView.findViewById(R.id.overwatch_2);

        mFortniteImage1 = (ImageView) rootView.findViewById(R.id.fortnite_1);
        mFortniteImage2 = (ImageView) rootView.findViewById(R.id.fortnite_2);

        mDestinyImage1 = (ImageView) rootView.findViewById(R.id.destiny_1);
        mDestinyImage2 = (ImageView) rootView.findViewById(R.id.destiny_2);

        mNavSponge = (MenuItem) rootView.findViewById(R.id.nav_spongebob);

        mButton1= rootView.findViewById(R.id.button1);
        mButton2= rootView.findViewById(R.id.button2);
        mButton3= rootView.findViewById(R.id.button3);
        mButton4= rootView.findViewById(R.id.button4);
        mButton5= rootView.findViewById(R.id.button5);
        mButton6= rootView.findViewById(R.id.button6);
        mButton7= rootView.findViewById(R.id.button7);

       // mNavSponge.setOnMenuItemClickListener(new View.())

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPhotoshopImage1.setVisibility(view.GONE);
                mPhotoshopImage2.setVisibility(view.GONE);
                mJoshImage1.setVisibility(view.GONE);
                mOverwatchImage1.setVisibility(view.GONE);
                mOverwatchImage2.setVisibility(view.GONE);
                mFortniteImage1.setVisibility(view.GONE);
                mFortniteImage2.setVisibility(view.GONE);
                mDestinyImage1.setVisibility(view.GONE);
                mDestinyImage2.setVisibility(view.GONE);
                mPepeImage1.setVisibility(view.GONE);
                mPepeImage2.setVisibility(view.GONE);
                mSpongeBobImage1.setVisibility(view.VISIBLE);
                mSpongeBobImage2.setVisibility(view.VISIBLE);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPhotoshopImage1.setVisibility(view.VISIBLE);
                mPhotoshopImage2.setVisibility(view.VISIBLE);
                mJoshImage1.setVisibility(view.GONE);
                mOverwatchImage1.setVisibility(view.GONE);
                mOverwatchImage2.setVisibility(view.GONE);
                mFortniteImage1.setVisibility(view.GONE);
                mFortniteImage2.setVisibility(view.GONE);
                mDestinyImage1.setVisibility(view.GONE);
                mDestinyImage2.setVisibility(view.GONE);
                mPepeImage1.setVisibility(view.GONE);
                mPepeImage2.setVisibility(view.GONE);
                mSpongeBobImage1.setVisibility(view.GONE);
                mSpongeBobImage2.setVisibility(view.GONE);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPhotoshopImage1.setVisibility(view.GONE);
                mPhotoshopImage2.setVisibility(view.GONE);
                mJoshImage1.setVisibility(view.VISIBLE);
                mOverwatchImage1.setVisibility(view.GONE);
                mOverwatchImage2.setVisibility(view.GONE);
                mFortniteImage1.setVisibility(view.GONE);
                mFortniteImage2.setVisibility(view.GONE);
                mDestinyImage1.setVisibility(view.GONE);
                mDestinyImage2.setVisibility(view.GONE);
                mPepeImage1.setVisibility(view.GONE);
                mPepeImage2.setVisibility(view.GONE);
                mSpongeBobImage1.setVisibility(view.GONE);
                mSpongeBobImage2.setVisibility(view.GONE);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPhotoshopImage1.setVisibility(view.GONE);
                mPhotoshopImage2.setVisibility(view.GONE);
                mJoshImage1.setVisibility(view.GONE);
                mOverwatchImage1.setVisibility(view.VISIBLE);
                mOverwatchImage2.setVisibility(view.VISIBLE);
                mFortniteImage1.setVisibility(view.GONE);
                mFortniteImage2.setVisibility(view.GONE);
                mDestinyImage1.setVisibility(view.GONE);
                mDestinyImage2.setVisibility(view.GONE);
                mPepeImage1.setVisibility(view.GONE);
                mPepeImage2.setVisibility(view.GONE);
                mSpongeBobImage1.setVisibility(view.GONE);
                mSpongeBobImage2.setVisibility(view.GONE);
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPhotoshopImage1.setVisibility(view.GONE);
                mPhotoshopImage2.setVisibility(view.GONE);
                mJoshImage1.setVisibility(view.GONE);
                mOverwatchImage1.setVisibility(view.GONE);
                mOverwatchImage2.setVisibility(view.GONE);
                mFortniteImage1.setVisibility(view.GONE);
                mFortniteImage2.setVisibility(view.GONE);
                mDestinyImage1.setVisibility(view.GONE);
                mDestinyImage2.setVisibility(view.GONE);
                mPepeImage1.setVisibility(view.VISIBLE);
                mPepeImage2.setVisibility(view.VISIBLE);
                mSpongeBobImage1.setVisibility(view.GONE);
                mSpongeBobImage2.setVisibility(view.GONE);
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPhotoshopImage1.setVisibility(view.GONE);
                mPhotoshopImage2.setVisibility(view.GONE);
                mJoshImage1.setVisibility(view.GONE);
                mOverwatchImage1.setVisibility(view.GONE);
                mOverwatchImage2.setVisibility(view.GONE);
                mFortniteImage1.setVisibility(view.VISIBLE);
                mFortniteImage2.setVisibility(view.VISIBLE);
                mDestinyImage1.setVisibility(view.GONE);
                mDestinyImage2.setVisibility(view.GONE);
                mPepeImage1.setVisibility(view.GONE);
                mPepeImage2.setVisibility(view.GONE);
                mSpongeBobImage1.setVisibility(view.GONE);
                mSpongeBobImage2.setVisibility(view.GONE);
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPhotoshopImage1.setVisibility(view.GONE);
                mPhotoshopImage2.setVisibility(view.GONE);
                mJoshImage1.setVisibility(view.GONE);
                mOverwatchImage1.setVisibility(view.GONE);
                mOverwatchImage2.setVisibility(view.GONE);
                mFortniteImage1.setVisibility(view.GONE);
                mFortniteImage2.setVisibility(view.GONE);
                mDestinyImage1.setVisibility(view.VISIBLE);
                mDestinyImage2.setVisibility(view.VISIBLE);
                mPepeImage1.setVisibility(view.GONE);
                mPepeImage2.setVisibility(view.GONE);
                mSpongeBobImage1.setVisibility(view.GONE);
                mSpongeBobImage2.setVisibility(view.GONE);
            }
        });



        return rootView;
    }
}
