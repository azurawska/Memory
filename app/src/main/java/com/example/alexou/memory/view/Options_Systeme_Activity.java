package com.example.alexou.memory.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.alexou.memory.R;


public class Options_Systeme_Activity extends Activity {

    Button btnSon;
    Button btnQuitter;
    Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options__systeme_);

        btnSon = (Button) findViewById(R.id.button5);
        btnSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MenuMemory.sonActive==true) {
                    MenuMemory.player.stop();
                    MenuMemory.sonActive=false;
                }
                else {
                    MenuMemory.player.start();
                    MenuMemory.sonActive=true;
                }
            }
        });

        btnQuitter = (Button) findViewById(R.id.button6);
        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(DEFAULT_KEYS_DISABLE);
            }
        });

        btnRetour = (Button) findViewById(R.id.button7);
        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel = new Intent(Options_Systeme_Activity.this, MenuMemory.class);
                startActivity(appel);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_options__systeme_, menu);
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
