package com.example.nangyalkhan.crazy;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class second extends ActionBarActivity {
    Intent services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent a = getIntent();
        String username = a.getStringExtra("Username");
        Integer password = a.getIntExtra("Password",0000);
        Boolean remember = a.getBooleanExtra("Remember",true);
        Toast.makeText(this,"Username is: "+ username,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Password is:"+ password,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Remeber Me Checked is: "+ remember,Toast.LENGTH_LONG).show();
        services = new Intent(second.this,Services.class);
        startService(services);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(services);
        Log.d("Services","Stopped");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
