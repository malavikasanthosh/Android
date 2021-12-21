package com.example.implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent, chooser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void process(View V)
        {
            if(V.getId()==R.id.map)
            {
                intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:10.065206,76.629128"));
                chooser=Intent.createChooser(intent,"Launch Maps");
                startActivity(chooser);
            }

            if(V.getId()==R.id.play)
            {
                intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Meta+Platforms,+Inc."));
                chooser=Intent.createChooser(intent,"Google Maps");
                startActivity(chooser);
            }

        }


}