package com.example.goslinglovelaceapplicationbasic;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView_Gosling;
    private ImageView imageView_Lovelace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_Lovelace=findViewById(R.id.imageView_Lovelace);
        imageView_Gosling=findViewById(R.id.imageView_Gosling);
        int mCurrentOrientation= getResources().getConfiguration().orientation;
        if ( mCurrentOrientation == Configuration.ORIENTATION_PORTRAIT ){
            imageView_Gosling.setImageResource(R.drawable.gosling);

        } else if ( mCurrentOrientation == Configuration.ORIENTATION_LANDSCAPE ) {
            imageView_Lovelace.setImageResource(R.drawable.lovelace);
        }

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);
            imageView_Gosling=findViewById(R.id.imageView_Gosling);
            imageView_Gosling.setImageResource(R.drawable.gosling);

        }else{
            setContentView(R.layout.activity_main);
            imageView_Lovelace=findViewById(R.id.imageView_Lovelace);
            imageView_Lovelace.setImageResource(R.drawable.lovelace);
       }
    }
}
