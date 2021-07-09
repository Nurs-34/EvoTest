package com.example.evo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_main);
    }

    public void back(View view) {
        Intent intent = new Intent(PlayerActivityMain.this, SoundPlaylist.class);
        startActivity(intent);
    }
}
