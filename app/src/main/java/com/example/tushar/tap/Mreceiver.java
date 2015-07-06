package com.example.tushar.tap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class Mreceiver extends BroadcastReceiver {
    public Mreceiver() {
    }






/*
    public static boolean wasScreenOn = true;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            // do whatever you need to do here
            //STARTING LOCK ACTIVITY
                      Intent intent2 = new Intent(context, Lock.class);
                      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                      context.startActivity(intent2);

            wasScreenOn = false;
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            // and do whatever you need to do here
            wasScreenOn = true;
        }
    }







*/





    @Override
    public void onReceive(Context context, Intent intent) {
      //   TODO: This method is called when the BroadcastReceiver is receiving

     //   STARTING LOCK ACTIVITY
       // Intent intent2 = new Intent(context, Lock.class);
       // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      //  context.startActivity(intent2);
       // Toast.makeText(context, "Service Started", Toast.LENGTH_SHORT).show();
    }
}
