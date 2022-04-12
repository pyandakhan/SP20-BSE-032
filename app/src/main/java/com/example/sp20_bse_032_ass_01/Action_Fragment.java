package com.example.sp20_bse_032_ass_01;
import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Action_Fragment extends Fragment {
    public Action_Fragment() {
        // Required empty public constructor
    }

    public static Action_Fragment newInstance() {
        Action_Fragment fragment = new Action_Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_action_, container, false);
        return view;
    }
}