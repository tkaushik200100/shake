package com.example.tushar.tap;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
public static Activity obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obj=this;

    }



    //START A SERVICE HERE

    public void startService(View view) {
        startService(new Intent(getBaseContext(), Mservice.class));
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "Activity Stopped", Toast.LENGTH_SHORT).show();


        //going to home
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);

    }
}
