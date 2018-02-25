package com.dvinnik.hellocountry.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dvinnik.hellocountry.R;

/**
 * @author Dmitry Vinnik
 * @date 24/02/18
 */

public class HelloAmerica extends Fragment {

    public HelloAmerica() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.hello_america, container, false);
    }

}
