package com.actosoftcommunity.bonus_materialdesign;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class botoncitos extends AppCompatActivity implements View.OnClickListener{

    Button BtnExplodeJava, BtnExplodeXML, BtnSlideJava, BtnSlideXML,
    BtnFadeJava, BtnFadeXML;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botoncitos);

        BtnExplodeJava = (Button) findViewById(R.id.BtnExplodeJava);
        BtnExplodeXML = (Button) findViewById(R.id.BtnExplodeXML);
        BtnSlideJava = (Button) findViewById(R.id.BtnSlideJava);
        BtnSlideXML = (Button) findViewById(R.id.BtnSlideXML);
        BtnFadeJava = (Button) findViewById(R.id.BtnFadeJava);
        BtnFadeXML = (Button) findViewById(R.id.BtnFadeXML);

        BtnExplodeJava.setOnClickListener(this);
        BtnExplodeXML.setOnClickListener(this);
        BtnSlideJava.setOnClickListener(this);
        BtnSlideXML.setOnClickListener(this);
        BtnFadeJava.setOnClickListener(this);
        BtnFadeXML.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId())
        {
            case R.id.BtnExplodeJava : {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent i = new Intent(getApplicationContext(), CustomActivity.class);
                i.putExtra("anim_type", "ExplodeJava");
                i.putExtra("anim_name", "Explode By Code");
                startActivity(i, options.toBundle());
                break;
            }

            case R.id.BtnExplodeXML: {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent i = new Intent(getApplicationContext(), CustomActivity.class);
                i.putExtra("anim_type", "ExplodeXML");
                i.putExtra("anim_name", "Explode By XML");
                startActivity(i, options.toBundle());
                break;
            }

            case R.id.BtnSlideJava: {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent i = new Intent(getApplicationContext(), CustomActivity.class);
                i.putExtra("anim_type", "SlideJava");
                i.putExtra("anim_name", "Slide by Code");
                startActivity(i, options.toBundle());
                break;
            }

            case R.id.BtnSlideXML: {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent i = new Intent(getApplicationContext(), CustomActivity.class);
                i.putExtra("anim_type", "SlideXML");
                i.putExtra("anim_name", "Slide by XML");
                startActivity(i, options.toBundle());
                break;
            }

            case R.id.BtnFadeJava: {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent i = new Intent(getApplicationContext(), CustomActivity.class);
                i.putExtra("anim_type", "FadeJava");
                i.putExtra("anim_name", "Fade by Java");
                startActivity(i, options.toBundle());
                break;
            }
        }
    }
}
