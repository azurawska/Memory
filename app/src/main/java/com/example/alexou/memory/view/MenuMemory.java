package com.example.alexou.memory.view;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.alexou.memory.R;


public class MenuMemory extends Activity {

    private int nbCoups=0;
    private int tempsRestant=100;

    Button btn_A_Propos;

    Button btn_jouer;

    Button btn_Options_Systeme;

    static MediaPlayer player;
    static boolean sonActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        sonActive=false;
        btn_A_Propos = (Button) findViewById(R.id.button3);

        btn_A_Propos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel = new Intent(MenuMemory.this, A_Propos_Activity.class);
                startActivity(appel);
            }
        });

        btn_Options_Systeme = (Button) findViewById(R.id.button2);

        btn_Options_Systeme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel = new Intent(MenuMemory.this, Options_Systeme_Activity.class);
                startActivity(appel);
            }
        });

        btn_jouer = (Button) findViewById(R.id.button);

        btn_jouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel = new Intent(MenuMemory.this, Jeu_Activity.class);
                startActivity(appel);
            }
        });

        player = MediaPlayer.create(MenuMemory.this, R.raw.setunimaneasy1c85f201060);
        player.setVolume(100, 100);
        if(sonActive==true) {
            player.start();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
