package org.pltw.example.memetracker;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Meme_Fragment extends ListFragment {

    private Meme mMeme;

    public Meme_Fragment() {
        mMeme = new Meme();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.meme_fragment, container, false);


        return rootView;
    }
}
