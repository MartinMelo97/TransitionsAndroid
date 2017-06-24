package com.actosoftcommunity.bonus_materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Window;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String type, name;

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        Intent i = getIntent();
        type = i.getStringExtra("anim_type");
        name = i.getStringExtra("anim_name");

        TextView tv = (TextView) findViewById(R.id.TVTitle);
        tv.setText(name);

        switch (type) {
            case "ExplodeJava": {
                Explode explode = new Explode();
                explode.setDuration(1000);
                getWindow().setEnterTransition(explode);
                break;
            }

            case "ExplodeXML": {
                Transition tr = TransitionInflater.from(this).inflateTransition(R.transition.explode);
                tr.setDuration(1000);
                getWindow().setEnterTransition(tr);
            }

            case "SlideJava": {
                Slide slide = new Slide();
                slide.setDuration(1000);
                getWindow().setEnterTransition(slide);
                break;
            }

            case "SlideXML": {
                Transition tr = TransitionInflater.from(this).inflateTransition(R.transition.slide);
                tr.setDuration(1000);
                getWindow().setEnterTransition(tr);
            }

            case "FadeJava": {
                Fade fade = new Fade();
                fade.setDuration(1000);
                getWindow().setEnterTransition(fade);
                break;
            }

            case "FadeXML": {
                Transition tr = TransitionInflater.from(this).inflateTransition(R.transition.fade);
                tr.setDuration(1000);
                getWindow().setEnterTransition(tr);
            }
        }
    }
}
