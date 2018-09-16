package com.example.shuva_pc.prayereducation2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button salatButton,prayersButton,prayer_buttonId1Java,fouth_buttonIdjava,fifth_buttonIdjava,sixth_buttonIdjava,seventh_buttonIdjava,eighth_buttonIdjava;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salatButton = findViewById(R.id.salat_buttonId);
        prayersButton = findViewById(R.id.prayer_buttonId);
        prayer_buttonId1Java = findViewById(R.id.prayer_buttonId1);
        fouth_buttonIdjava = findViewById(R.id.fouth_buttonId);
        fifth_buttonIdjava = findViewById(R.id.fifth_buttonId);
        sixth_buttonIdjava = findViewById(R.id.sixth_buttonId);
        seventh_buttonIdjava = findViewById(R.id.seventh_buttonId);
        eighth_buttonIdjava = findViewById(R.id.eighth_buttonId);


        salatButton.setOnClickListener(this);
        prayersButton.setOnClickListener(this);
        prayer_buttonId1Java.setOnClickListener(this);
        fouth_buttonIdjava.setOnClickListener(this);
        fifth_buttonIdjava.setOnClickListener(this);
        sixth_buttonIdjava.setOnClickListener(this);
        seventh_buttonIdjava.setOnClickListener(this);
        eighth_buttonIdjava.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.salat_buttonId){
            intent= new Intent(MainActivity.this,ProfilePrayer.class);
            intent.putExtra("name","salatButton");
            startActivity(intent);
        }if(view.getId()==R.id.prayer_buttonId){
            intent= new Intent(MainActivity.this,ProfilePrayer.class);
            intent.putExtra("name","prayerButton");
            startActivity(intent);
        }if(view.getId()==R.id.prayer_buttonId1){
            intent= new Intent(MainActivity.this,ProfilePrayer.class);
            intent.putExtra("name","threeButton");
            startActivity(intent);
        }
        if(view.getId()== R.id.fouth_buttonId){
            intent= new Intent(MainActivity.this,ProfilePrayer.class);
            intent.putExtra("name","fouthButton");
            startActivity(intent);
        }if(view.getId()==R.id.fifth_buttonId){
            intent= new Intent(MainActivity.this,ProfilePrayer.class);
            intent.putExtra("name","fifthButton");
            startActivity(intent);
        }if(view.getId()==R.id.sixth_buttonId){
            intent= new Intent(MainActivity.this,ProfilePrayer.class);
            intent.putExtra("name","sixthButton");
            startActivity(intent);
        }if(view.getId()==R.id.seventh_buttonId){
            intent= new Intent(MainActivity.this,ProfilePrayer.class);
            intent.putExtra("name","seventhButton");
            startActivity(intent);
        }if(view.getId()==R.id.eighth_buttonId){
            intent= new Intent(MainActivity.this,ProfilePrayer.class);
            intent.putExtra("name","eighthButton");
            startActivity(intent);
        }
    }
}
