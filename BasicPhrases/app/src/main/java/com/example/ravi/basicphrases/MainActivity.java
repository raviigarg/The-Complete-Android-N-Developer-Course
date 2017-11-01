package com.example.ravi.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view) {

    int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);

        int resoureId = getResources().getIdentifier(ourId, "raw", "com.example.ravi.basicphrases");

        MediaPlayer mplayer = MediaPlayer.create(this, resoureId);
        mplayer.start();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
