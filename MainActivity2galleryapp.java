package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2galleryapp extends AppCompatActivity {
ImageView fullscreenimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2galleryapp);
        fullscreenimg=(ImageView)findViewById(R.id.fullscreen);

        Intent intent=getIntent();

        int myposition=intent.getExtras().getInt("id");

        ImageAdapter adapter=new ImageAdapter(this);

        fullscreenimg.setImageResource(adapter.imagearray[myposition]);


    }
}