package com.developer.johhns.intentservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;

import androidx.annotation.Nullable;

public class ServicioOperacion extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        double n = intent.getExtras().getDouble( "numero" ) ;
        SystemClock.sleep(5000);
        MainActivity.salida.append( n * n + " \n" );
        return  START_NOT_STICKY ;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
