package com.developer.johhns.intentservices;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;

import androidx.annotation.Nullable;
import androidx.core.app.JobIntentService;

public class IntentServicioOperacion extends IntentService {
    /**
     * @param name
     * @deprecated
     */
    public IntentServicioOperacion(String name) {
        super("IntentServicioOperacion");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        double n = intent.getExtras().getDouble( "numero" ) ;
        SystemClock.sleep(5000);
        MainActivity.salida.append( n * n + " \n" );
    }
}
