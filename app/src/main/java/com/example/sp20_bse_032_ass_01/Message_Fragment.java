package com.example.sp20_bse_032_ass_01;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Message_Fragment extends Fragment {

    public Message_Fragment() {
        // Required empty public constructor
    }

    public static Message_Fragment newInstance() {
        Message_Fragment fragment = new Message_Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message_, container, false);
        return view;
    }
}
