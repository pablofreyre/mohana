package edu.unicauca.mohana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button femenino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        femenino=(Button)findViewById(R.id.btn_fem);

        femenino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent femenino = new Intent(MainActivity.this,main_femenino.class);
                startActivity(femenino);
            }
        });
    }
}