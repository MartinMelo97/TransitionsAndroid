package com.actosoftcommunity.bonus_materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ImgBorder, ImgBorderless;
    TextView TVBorder, TVBorderless;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImgBorder = (ImageView) findViewById(R.id.ImgBorder);
        ImgBorderless = (ImageView) findViewById(R.id.ImgBordeless);
        TVBorder = (TextView) findViewById(R.id.TVBorder);
        TVBorderless = (TextView) findViewById(R.id.TVBorderless);

        ImgBorder.setOnClickListener(this);
        ImgBorderless.setOnClickListener(this);
        TVBorder.setOnClickListener(this);
        TVBorderless.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
