package org.pltw.example.memetracker;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Garbage_Fragment extends ListFragment {

    private Garbage mGarbage;

    public Garbage_Fragment() {
        mGarbage = new Garbage();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.garbage_fragment, container, false);


        return rootView;
    }
}
