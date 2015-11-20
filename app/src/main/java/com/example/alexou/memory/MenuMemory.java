package com.example.alexou.memory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuMemory extends Activity {

    Button btn_A_Propos;

    Button btn_jouer;

    Button btn_Options_Systeme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
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
