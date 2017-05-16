package com.example.codigus.clinicacontrol.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by codigus on 16/5/2017.
 */

public class SplashActivity extends AppCompatActivity{
    private SharedPreferences preferencias;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        Intent intent;

        //Preferencias
        preferencias = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        //if (!preferencias.getBoolean())
    }

}
