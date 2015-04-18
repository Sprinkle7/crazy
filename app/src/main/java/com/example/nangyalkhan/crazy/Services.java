package com.example.nangyalkhan.crazy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Nangyal Khan on 3/13/2015.
 */
public class Services extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Services:","Created");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d("Services","Stopped");
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Services:", "Started");
        return super.onStartCommand(intent, flags, startId);
    }
}
