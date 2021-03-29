package com.example.backtoschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnStart;
    private TextView textView,textView2;
    private ImageView imageView;
    private Animation downtoup;
    private Animation uptodown;
    private Animation lefttoright;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setAnimation();
    }

    private void setAnimation(){
        downtoup= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.downtoup);
        uptodown=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.uptodown);
        lefttoright=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.lefttoright);
        btnStart.startAnimation(downtoup);
        textView.startAnimation(uptodown);
        textView2.startAnimation(uptodown);
        imageView.startAnimation(lefttoright);
    }

    private void bindViews(){
        btnStart=findViewById(R.id.btnStart);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        imageView=findViewById(R.id.imageView);
    }

    public void onStartClick(View view){
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}