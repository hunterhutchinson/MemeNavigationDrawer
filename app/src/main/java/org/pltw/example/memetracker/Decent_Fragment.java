package org.pltw.example.memetracker;

import android.app.Fragment;
import android.support.v4.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Decent_Fragment extends ListFragment{

    private Decent mDecent;

    public Decent_Fragment(){
        mDecent = new Decent();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.decent_fragment, container, false);

        return rootView;
    }

}

