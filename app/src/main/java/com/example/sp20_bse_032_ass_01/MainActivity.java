package com.example.sp20_bse_032_ass_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentManager  fragmen;
    private FragmentTransaction  frgtran;
    private Action_Fragment action_Frag;
    private Message_Fragment message_Frag;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmen = getSupportFragmentManager();
            frgtran = fragmen.beginTransaction();
            action_Frag = Action_Fragment.newInstance();
            message_Frag = Message_Fragment.newInstance();
            frgtran.replace(R.id.frameLeft,action_Frag);
            frgtran.replace(R.id.frameRight,message_Frag);
            frgtran.commit();
        }
        }
    }
