package com.example.shuva_pc.countrydetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladeshButton,indiaButton,brazilButton ,afghanistanButton,argentinaButton,germanyButton,austriaButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton = findViewById(R.id.bangladesh_buttonId);
        indiaButton = findViewById(R.id.india_buttonId);
        brazilButton = findViewById(R.id.brazil_buttonId);
        afghanistanButton = findViewById(R.id.afghanistan_buttonId);
        argentinaButton = findViewById(R.id.argentina_buttonId);
        germanyButton = findViewById(R.id.germany_buttonId);
        austriaButton = findViewById(R.id.austria_buttonId);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        brazilButton.setOnClickListener(this);
        afghanistanButton.setOnClickListener(this);
        argentinaButton.setOnClickListener(this);
        germanyButton.setOnClickListener(this);
        austriaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
         if(view.getId()==R.id.bangladesh_buttonId){
           intent = new Intent( MainActivity.this,CountryProfile.class);
           intent.putExtra("name","bangladesh");
           startActivity(intent);
         } if(view.getId()==R.id.india_buttonId){
           intent = new Intent( MainActivity.this,CountryProfile.class);
           intent.putExtra("name","india");
           startActivity(intent);
         } if(view.getId()==R.id.brazil_buttonId){
           intent = new Intent( MainActivity.this,CountryProfile.class);
           intent.putExtra("name","brazil");
           startActivity(intent);
         } if(view.getId()==R.id.afghanistan_buttonId){
           intent = new Intent( MainActivity.this,CountryProfile.class);
           intent.putExtra("name","afghanistan");
           startActivity(intent);
         } if(view.getId()==R.id.argentina_buttonId){
           intent = new Intent( MainActivity.this,CountryProfile.class);
           intent.putExtra("name","argentina");
           startActivity(intent);
         } if(view.getId()==R.id.germany_buttonId){
           intent = new Intent( MainActivity.this,CountryProfile.class);
           intent.putExtra("name","germany");
           startActivity(intent);
         } if(view.getId()==R.id.austria_buttonId){
           intent = new Intent( MainActivity.this,CountryProfile.class);
           intent.putExtra("name","austria");
           startActivity(intent);
         }
    }
}
