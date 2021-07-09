package com.example.evo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SoundPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound);

    }

    public void enter_sound_player(View view) {

        Intent intent = new Intent(SoundPlaylist.this, PlayerActivityMain.class);
        startActivity(intent);
    }
}