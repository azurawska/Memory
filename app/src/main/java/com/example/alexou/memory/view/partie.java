package com.example.alexou.memory.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.alexou.memory.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class partie extends Activity {

    private Button retour;
    private int temps;
    private int nbCoups;
    private int nbPaires;
    private int score;

    private Context context;
    private Resources resources;

    private Bitmap android;
    private Bitmap apple_mac;
    private Bitmap ballon_basket;
    private Bitmap ballon_foot;
    private Bitmap ballon_handball;
    private Bitmap ballon_rugby;
    private Bitmap bananes;
    private Bitmap barabapapa;
    private Bitmap bonbons;
    private Bitmap camion;
    private Bitmap canard;
    private Bitmap carre_bleu;
    private Bitmap chaise;
    private Bitmap chat;
    private Bitmap chateau;
    private Bitmap chien;
    private Bitmap chocolat_au_lait;
    private Bitmap chocolat_blanc;
    private Bitmap chocolat_noir;
    private Bitmap churros;
    private Bitmap cyclope;
    private Bitmap elephant;
    private Bitmap facebook;
    private Bitmap firefox;
    private Bitmap fleur_de_vanille;
    private Bitmap framboise;
    private Bitmap gaston_lagaffe;
    private Bitmap glace;
    private Bitmap hamster;
    private Bitmap joconde;
    private Bitmap lapin;
    private Bitmap linux;
    private Bitmap noix_de_coco;
    private Bitmap oignon;
    private Bitmap pain;
    private Bitmap pere_noel;
    private Bitmap perroquet;
    private Bitmap poire;
    private Bitmap poisson;
    private Bitmap poulet;
    private Bitmap rose;
    private Bitmap sapin;
    private Bitmap schtroumpf_farceur;
    private Bitmap table;
    private Bitmap terre;
    private Bitmap treffle_quatre_feuilles;
    private Bitmap twitter;
    private Bitmap vache;
    private Bitmap violette;
    private Bitmap voiture;
    private Bitmap windows;

    private int[][][] cases;

    private static final String fichierScores = "Meilleurs_Scores";
    private static final String fichierPartieSauvegardee = "Partie_Sauvegardée";

    private SharedPreferences meilleursScores;
    private SharedPreferences partieEnCours;

    private ArrayList<Integer> images;

    private void initAll(Context mcontext) {
        context = mcontext;
        resources = context.getResources();
        android = BitmapFactory.decodeResource(resources, R.drawable.android);
        apple_mac = BitmapFactory.decodeResource(resources, R.drawable.apple_mac);
        ballon_basket = BitmapFactory.decodeResource(resources, R.drawable.ballon_basket);
        ballon_foot = BitmapFactory.decodeResource(resources, R.drawable.ballon_foot);
        ballon_handball = BitmapFactory.decodeResource(resources, R.drawable.ballon_handball);
        ballon_rugby = BitmapFactory.decodeResource(resources, R.drawable.ballon_rugby);
        bananes = BitmapFactory.decodeResource(resources, R.drawable.bananes);
        barabapapa = BitmapFactory.decodeResource(resources, R.drawable.barbapapa);
        bonbons = BitmapFactory.decodeResource(resources, R.drawable.bonbons);
        camion = BitmapFactory.decodeResource(resources, R.drawable.camion);
        canard = BitmapFactory.decodeResource(resources, R.drawable.canard);
        carre_bleu = BitmapFactory.decodeResource(resources, R.drawable.carre_bleu);
        chaise = BitmapFactory.decodeResource(resources, R.drawable.chaise);
        chat = BitmapFactory.decodeResource(resources, R.drawable.chat);
        chateau = BitmapFactory.decodeResource(resources, R.drawable.chateau);
        chien = BitmapFactory.decodeResource(resources, R.drawable.chien);
        chocolat_au_lait = BitmapFactory.decodeResource(resources, R.drawable.chocolat_au_lait);
        chocolat_blanc = BitmapFactory.decodeResource(resources, R.drawable.chocolat_blanc);
        chocolat_noir = BitmapFactory.decodeResource(resources, R.drawable.chocolat_noir);
        churros = BitmapFactory.decodeResource(resources, R.drawable.churros);
        cyclope = BitmapFactory.decodeResource(resources, R.drawable.cyclope);
        elephant = BitmapFactory.decodeResource(resources, R.drawable.elephant);
        facebook = BitmapFactory.decodeResource(resources, R.drawable.facebook);
        firefox = BitmapFactory.decodeResource(resources, R.drawable.firefox);
        fleur_de_vanille = BitmapFactory.decodeResource(resources, R.drawable.fleur_de_vanille);
        framboise = BitmapFactory.decodeResource(resources, R.drawable.framboise);
        gaston_lagaffe = BitmapFactory.decodeResource(resources, R.drawable.gaston_lagaffe);
        glace = BitmapFactory.decodeResource(resources, R.drawable.glace);
        hamster = BitmapFactory.decodeResource(resources, R.drawable.hamster);
        joconde = BitmapFactory.decodeResource(resources, R.drawable.joconde);
        lapin = BitmapFactory.decodeResource(resources, R.drawable.lapin);
        linux = BitmapFactory.decodeResource(resources, R.drawable.linux);
        noix_de_coco = BitmapFactory.decodeResource(resources, R.drawable.noix_de_coco);
        oignon = BitmapFactory.decodeResource(resources, R.drawable.oignon);
        pain = BitmapFactory.decodeResource(resources, R.drawable.pain);
        pere_noel = BitmapFactory.decodeResource(resources, R.drawable.pere_noel);
        perroquet = BitmapFactory.decodeResource(resources, R.drawable.perroquet);
        poire = BitmapFactory.decodeResource(resources, R.drawable.poire);
        poisson = BitmapFactory.decodeResource(resources, R.drawable.poisson);
        poulet = BitmapFactory.decodeResource(resources, R.drawable.poulet);
        rose = BitmapFactory.decodeResource(resources, R.drawable.rose);
        sapin = BitmapFactory.decodeResource(resources, R.drawable.sapin);
        schtroumpf_farceur = BitmapFactory.decodeResource(resources, R.drawable.schtroumpf_farceur);
        table = BitmapFactory.decodeResource(resources, R.drawable.table);
        terre = BitmapFactory.decodeResource(resources, R.drawable.terre);
        treffle_quatre_feuilles = BitmapFactory.decodeResource(resources, R.drawable.treffle_quatre_feuilles);
        twitter = BitmapFactory.decodeResource(resources, R.drawable.twitter);
        vache = BitmapFactory.decodeResource(resources, R.drawable.vache);
        violette = BitmapFactory.decodeResource(resources, R.drawable.violette);
        voiture = BitmapFactory.decodeResource(resources, R.drawable.voiture);
        windows = BitmapFactory.decodeResource(resources, R.drawable.windows);

        images.add(R.drawable.android);
        images.add(R.drawable.apple_mac);
        images.add(R.drawable.ballon_basket);
        images.add(R.drawable.ballon_foot);
        images.add(R.drawable.ballon_handball);
        images.add(R.drawable.ballon_rugby);
        images.add(R.drawable.bananes);
        images.add(R.drawable.barbapapa);
        images.add(R.drawable.bonbons);
        images.add(R.drawable.camion);
        images.add(R.drawable.canard);
        images.add(R.drawable.chaise);
        images.add(R.drawable.chat);
        images.add(R.drawable.chateau);
        images.add(R.drawable.chien);
        images.add(R.drawable.chocolat_au_lait);
        images.add(R.drawable.chocolat_blanc);
        images.add(R.drawable.chocolat_noir);
        images.add(R.drawable.churros);
        images.add(R.drawable.cyclope);
        images.add(R.drawable.elephant);
        images.add(R.drawable.facebook);
        images.add(R.drawable.firefox);
        images.add(R.drawable.fleur_de_vanille);
        images.add(R.drawable.framboise);
        images.add(R.drawable.gaston_lagaffe);
        images.add(R.drawable.glace);
        images.add(R.drawable.hamster);
        images.add(R.drawable.joconde);
        images.add(R.drawable.lapin);
        images.add(R.drawable.linux);
        images.add(R.drawable.noix_de_coco);
        images.add(R.drawable.oignon);
        images.add(R.drawable.pain);
        images.add(R.drawable.pere_noel);
        images.add(R.drawable.perroquet);
        images.add(R.drawable.poire);
        images.add(R.drawable.poisson);
        images.add(R.drawable.poulet);
        images.add(R.drawable.rose);
        images.add(R.drawable.sapin);
        images.add(R.drawable.schtroumpf_farceur);
        images.add(R.drawable.table);
        images.add(R.drawable.terre);
        images.add(R.drawable.treffle_quatre_feuilles);
        images.add(R.drawable.twitter);
        images.add(R.drawable.vache);
        images.add(R.drawable.violette);
        images.add(R.drawable.voiture);
        images.add(R.drawable.windows);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partie);
        this.temps=100;
        this.nbPaires=10;
        this.nbCoups=50;
        this.score=0;
        this.cases = new int[4][5][3];

        retour = (Button) findViewById(R.id.button11);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel = new Intent(partie.this, Jeu_Activity.class);
                startActivity(appel);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_partie, menu);
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

    private void initPlateauJeu() {
        ArrayList<Integer> images_ = imagesChoisies(images);

        for(int i=0;i<cases.length;i++) {
            for(int j=0;j<cases[i].length;j++) {
                for(int k=1;k<=20;k++) {
                    cases[i][j][0]=k;
                    cases[i][j][1]=R.drawable.carre_bleu;
                }
                for(int l=0;l<images_.size()-1;l++) {
                    cases[i][j][3]=images_.get(l);
                    cases[i+1][j+1][3]=images_.get(l);
                }
            }
        }
    }

    private ArrayList<Integer> imagesChoisies(ArrayList<Integer> listeImages) {

        ArrayList<Integer> imagesChoisies = new ArrayList<>();
        ArrayList<Integer> poubelle = new ArrayList<>(); //liste des valeurs répétées

        Random r = new Random();

        int valeurMin = 0;
        int valeurMax = listeImages.size();
        int nbImagesChoisies=0;

        while(nbImagesChoisies<10) {

            int valeur = valeurMin + r.nextInt(valeurMax - valeurMin);

            if(!poubelle.contains(valeur)) {
                imagesChoisies.add(listeImages.get(valeur));
                poubelle.add(valeur);
                nbImagesChoisies++;
            }
            else {
                poubelle.add(valeur);
            }
        }

        return imagesChoisies;
    }

    private class Decompte implements Runnable {

        @Override
        public void run() {
                try {
                    Thread.sleep(1000);
                    temps--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    private class RetournementCarte implements Runnable {

        @Override
        public void run() {

        }
    }
}