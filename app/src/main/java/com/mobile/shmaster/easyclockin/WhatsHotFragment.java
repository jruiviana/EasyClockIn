package com.mobile.shmaster.easyclockin;

/**
 * Created by JOSE RUI on 29/06/2015.
 */


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WhatsHotFragment extends Fragment {

    public WhatsHotFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_whatshot, container, false);

        return rootView;
    }
}