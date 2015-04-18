package com.example.nangyalkhan.crazy;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button signin, signup;
    EditText user,pass;
    CheckBox remeber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    signin = (Button)findViewById(R.id.sigin);
    signup = (Button) findViewById(R.id.sigup);
    user   = (EditText) findViewById(R.id.Edituser);
    pass   = (EditText) findViewById(R.id.Editpass);
    remeber = (CheckBox) findViewById(R.id.remeber);

    signin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String username = user.getText().toString();
            String password = pass.getText().toString();
            Bundle a,b,c;
            Intent i = new Intent(MainActivity.this,second.class);
            a = new Bundle();
            b = new Bundle();
            c = new Bundle();
            if (username.equals("Khan"))
            {
                if (password.equals("12345"))
                {
                    if (remeber.isChecked())
                    {
                        c.putBoolean("Remember",true);
                        i.putExtras(c);
                    }
                    else
                    {
                        c.putBoolean("Remember",false);
                        i.putExtras(c);
                    }
                    a.putString("Username",username);
                    b.putInt("Password",12345);
                    i.putExtras(a);
                    i.putExtras(b);
                    startActivity(i);
                    MainActivity.this.finish();
                }
                else
                {
                    pass.setError("Invalid Password");
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Usernmae/Password Invalid",Toast.LENGTH_SHORT).show();
            }
        }
    });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
