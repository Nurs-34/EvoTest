package com.example.evo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }


    public void enter_in_sound_playlist(View view) {
        Intent intent = new Intent(Main.this, SoundPlaylist.class);
        startActivity(intent);
    }
}