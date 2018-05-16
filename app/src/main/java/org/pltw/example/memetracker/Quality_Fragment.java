package org.pltw.example.memetracker;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Quality_Fragment extends ListFragment{

    private Quality mQuality;

    public Quality_Fragment () {
        mQuality = new Quality();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.quality_fragment, container, false);


        return rootView;
    }
}
