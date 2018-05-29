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

import static android.view.View.GONE;
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


<<<<<<< HEAD
 
=======

>>>>>>> 1843bd865a81e44d1c61aebc9fbc34eb11138a25
    private void updateImages(){
        mSpongeBobImage1.setVisibility(GONE);
        mSpongeBobImage2.setVisibility(GONE);
        mPhotoshopImage1.setVisibility(GONE);
        mPhotoshopImage2.setVisibility(GONE);
        mJoshImage1.setVisibility(GONE);
        mOverwatchImage1.setVisibility(GONE);
        mOverwatchImage2.setVisibility(GONE);
        mFortniteImage1.setVisibility(GONE);
        mFortniteImage2.setVisibility(GONE);
        mDestinyImage1.setVisibility(GONE);
        mDestinyImage2.setVisibility(GONE);
        mPepeImage1.setVisibility(GONE);
        mPepeImage2.setVisibility(GONE);
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
