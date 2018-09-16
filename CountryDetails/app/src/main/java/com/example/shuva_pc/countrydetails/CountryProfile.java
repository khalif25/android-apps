package com.example.shuva_pc.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryProfile extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);

        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null) {


            String CountryName= bundle.getString("name");
            showDetails(CountryName);
        }

    }

     void showDetails(String countryName) {
        if (countryName.equals("bangladesh")) {

            imageView.setImageResource(R.drawable.bangpic);
            textView.setText(R.string.bangladesh_text);

        }if (countryName.equals("india")) {

            imageView.setImageResource(R.drawable.taj);
            textView.setText(R.string.india_text);

        }if (countryName.equals("brazil")) {

             imageView.setImageResource(R.drawable.bra);
             textView.setText(R.string.brazil_text);
         }if (countryName.equals("afghanistan")) {

             imageView.setImageResource(R.drawable.afghan);
             textView.setText(R.string.afghanistan_text);
         }if (countryName.equals("argentina")) {

             imageView.setImageResource(R.drawable.argentina);
             textView.setText(R.string.argentina_text);
         }if (countryName.equals("germany")) {

             imageView.setImageResource(R.drawable.germany);
             textView.setText(R.string.germany_text);
         }if (countryName.equals("austria")) {

            imageView.setImageResource(R.drawable.austria);
            textView.setText(R.string.austria_text);

        }
    }
}
