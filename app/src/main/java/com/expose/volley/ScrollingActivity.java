package com.expose.volley;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);


        ImageView image = (ImageView) findViewById(R.id.image);
        TextView textView =(TextView) findViewById(R.id.tv);
        String wall = getIntent().getStringExtra("wall");
        assert image != null;
        Glide.with(getApplicationContext()).load(wall)
                .diskCacheStrategy(DiskCacheStrategy.ALL)

                .into(image);

        String name = getIntent().getStringExtra("name");
        textView.setText(name);


    }
}
