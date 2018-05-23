package org.pltw.example.memetracker;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.ClipData;
import android.content.Context;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.VISIBLE;

public class Meme_Fragment extends ListFragment {

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

    private void updateImages(){
        mSpongeBobImage1.setVisibility(VISIBLE);
        mSpongeBobImage2.setVisibility(VISIBLE);
        mPhotoshopImage1.setVisibility(VISIBLE);
        mPhotoshopImage2.setVisibility(VISIBLE);
        mJoshImage1.setVisibility(VISIBLE);
        mOverwatchImage1.setVisibility(VISIBLE);
        mOverwatchImage2.setVisibility(VISIBLE);
        mFortniteImage1.setVisibility(VISIBLE);
        mFortniteImage2.setVisibility(VISIBLE);
        mDestinyImage1.setVisibility(VISIBLE);
        mDestinyImage2.setVisibility(VISIBLE);
        mPepeImage1.setVisibility(VISIBLE);
        mPepeImage2.setVisibility(VISIBLE);

    }

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
        mNavJosh = (MenuItem) rootView.findViewById(R.id.nav_josh);
        mNavOverwatch= (MenuItem) rootView.findViewById(R.id.nav_overwatch);
        mNavDestiny = (MenuItem) rootView.findViewById(R.id.nav_destiny2);
        mNavFortnite = (MenuItem) rootView.findViewById(R.id.nav_fortnite);
        mNavPepe = (MenuItem) rootView.findViewById(R.id.nav_pepe);
        mNavPhotoshop = (MenuItem) rootView.findViewById(R.id.nav_photoshop);







        return rootView;
    }
}
