package com.insperion.sets.materialfloatingmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab1, fab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab1 = (FloatingActionButton) findViewById(R.id.FAB1);
        fab1.setOnClickListener(this);
        fab2 = (FloatingActionButton) findViewById(R.id.FAB2);
        fab2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.FAB1:
                Toast.makeText(this, "Has presionado opcion 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.FAB2:
                Toast.makeText(this, "Has presionado opcion 2", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
