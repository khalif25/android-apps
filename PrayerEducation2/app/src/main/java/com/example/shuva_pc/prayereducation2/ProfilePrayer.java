package com.example.shuva_pc.prayereducation2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfilePrayer extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_prayer);
        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);
        
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            
            String PrayerName = bundle.getString("name");
            showDetails(PrayerName);
        }

    }

     void showDetails(String prayerName) {
        if (prayerName.equals("salatButton")) {
            imageView.setImageResource(R.drawable.salat);
            textView.setText(R.string.prayer_text1);
        }if (prayerName.equals("prayerButton")) {
            imageView.setImageResource(R.drawable.prayer);
            textView.setText(R.string.prayer_text2);
        } if (prayerName.equals("threeButton")) {
            imageView.setImageResource(R.drawable.imgs);
            textView.setText(R.string.prayer_text3);
        } if (prayerName.equals("fouthButton")) {
            imageView.setImageResource(R.drawable.img);
            textView.setText(R.string.prayer_text4);
        } if (prayerName.equals("fifthButton")) {
            imageView.setImageResource(R.drawable.imgs);
            textView.setText(R.string.prayer_text5);
        } if (prayerName.equals("sixthButton")) {
            imageView.setImageResource(R.drawable.prayer);
            textView.setText(R.string.prayer_text6);
        } if (prayerName.equals("seventhButton")) {
            imageView.setImageResource(R.drawable.ramadan);
            textView.setText(R.string.prayer_text7);
        } if (prayerName.equals("eighthButton")) {
            imageView.setImageResource(R.drawable.eid);
            textView.setText(R.string.prayer_text8);

        }
    }
}
