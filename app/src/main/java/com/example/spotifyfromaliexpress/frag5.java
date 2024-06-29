package com.example.spotifyfromaliexpress;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment;


public class frag5 extends Fragment {


    public frag5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag5, container, false);
        TextView marqueeText = view.findViewById(R.id.marquee_text);
        marqueeText.setSelected(true);
        return view;
    }
}