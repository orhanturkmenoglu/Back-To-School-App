package com.example.backtoschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.example.backtoschool.Constant.ABC;
import static com.example.backtoschool.Constant.NUMBERS;

public class LearnActivity extends AppCompatActivity {
    private ImageView imgHome,imgOgrenme,imgBack,imgOynat,imgIleri;
    private TextView tvOkunus,tvSayac,tvKategori;
    private List<Integer> imgViews=new ArrayList<>();
    private List<String> textViews=new ArrayList<>();
    int kategori=1;
    int index;
    TextToSpeech t1;
    String toSpeak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        bindViews();
        kategori = getIntent().getIntExtra("kategori", 1);
        setKategory();

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setSpeechRate(0.8f);
            }
        });
    }

    private void setKategory() {
        switch (kategori){
            case Constant.ABC:
                abc();
                break;
            case Constant.NUMBERS:
               numbers();
                break;
            case Constant.COLOURS:
                colours();
                break;
            case Constant.ANIMALS:
                animals();
                break;
            case Constant.FRUITS:
                fruits();
                break;
            default:
                kategori= ABC;
                break;

        }
    }
    private void abc(){
        tvKategori.setText("ALPHABET");
        imgViews.add(R.drawable.ic_alphabet_a);
        imgViews.add(R.drawable.ic_alphabet_b);
        imgViews.add(R.drawable.ic_alphabet_c);
        imgViews.add(R.drawable.ic_alphabet_d);
        imgViews.add(R.drawable.ic_alphabet_e);
        imgViews.add(R.drawable.ic_alphabet_f);
        imgViews.add(R.drawable.ic_alphabet_g);
        imgViews.add(R.drawable.ic_alphabet_h);
        imgViews.add(R.drawable.ic_alphabet_i);
        imgViews.add(R.drawable.ic_alphabet_j);
        imgViews.add(R.drawable.ic_alphabet_k);
        imgViews.add(R.drawable.ic_alphabet_l);
        imgViews.add(R.drawable.ic_alphabet_m);
        imgViews.add(R.drawable.ic_alphabet_n);
        imgViews.add(R.drawable.ic_alphabet_o);
        imgViews.add(R.drawable.ic_alphabet_p);
        imgViews.add(R.drawable.ic_alphabet_q);
        imgViews.add(R.drawable.ic_alphabet_r);
        imgViews.add(R.drawable.ic_alphabet_s);
        imgViews.add(R.drawable.ic_alphabet_t);
        imgViews.add(R.drawable.ic_alphabet_u);
        imgViews.add(R.drawable.ic_alphabet_v);
        imgViews.add(R.drawable.ic_alphabet_w);
        imgViews.add(R.drawable.ic_alphabet_x);
        imgViews.add(R.drawable.ic_alphabet_y);
        imgViews.add(R.drawable.ic_alphabet_z);
        textViews.add("A");
        textViews.add("B");
        textViews.add("C");
        textViews.add("D");
        textViews.add("E");
        textViews.add("F");
        textViews.add("G");
        textViews.add("H");
        textViews.add("I");
        textViews.add("J");
        textViews.add("K");
        textViews.add("L");
        textViews.add("M");
        textViews.add("N");
        textViews.add("O");
        textViews.add("P");
        textViews.add("Q");
        textViews.add("R");
        textViews.add("S");
        textViews.add("T");
        textViews.add("U");
        textViews.add("V");
        textViews.add("W");
        textViews.add("X");
        textViews.add("Y");
        textViews.add("Z");
        setFillScreen();
    }
    private void numbers(){
        tvKategori.setText("NUMBERS");
        imgViews.add(R.drawable.ic_alphabet_a);
        imgViews.add(R.drawable.ic_alphabet_b);
        imgViews.add(R.drawable.ic_alphabet_c);
        imgViews.add(R.drawable.ic_alphabet_d);
        imgViews.add(R.drawable.ic_alphabet_e);
        imgViews.add(R.drawable.ic_alphabet_f);
        imgViews.add(R.drawable.ic_alphabet_g);
        imgViews.add(R.drawable.ic_alphabet_h);
        imgViews.add(R.drawable.ic_alphabet_i);
        imgViews.add(R.drawable.ic_alphabet_j);
        textViews.add("Q");
        textViews.add("R");
        textViews.add("S");
        textViews.add("T");
        textViews.add("U");
        textViews.add("V");
        textViews.add("W");
        textViews.add("X");
        textViews.add("Y");
        textViews.add("Z");
        setFillScreen();
    }
    private void colours(){
        tvKategori.setText("COLOURS");
        imgViews.add(R.drawable.ic_alphabet_a);
        imgViews.add(R.drawable.ic_alphabet_b);
        imgViews.add(R.drawable.ic_alphabet_c);
        imgViews.add(R.drawable.ic_alphabet_d);
        imgViews.add(R.drawable.ic_alphabet_e);
        imgViews.add(R.drawable.ic_alphabet_f);
        imgViews.add(R.drawable.ic_alphabet_g);
        imgViews.add(R.drawable.ic_alphabet_h);
        imgViews.add(R.drawable.ic_alphabet_i);
        imgViews.add(R.drawable.ic_alphabet_j);
        textViews.add("Q");
        textViews.add("R");
        textViews.add("S");
        textViews.add("T");
        textViews.add("U");
        textViews.add("V");
        textViews.add("W");
        textViews.add("X");
        textViews.add("Y");
        textViews.add("Z");
        setFillScreen();
    }
    private void animals(){
        tvKategori.setText("ANIMALS");
        imgViews.add(R.drawable.ic_alphabet_a);
        imgViews.add(R.drawable.ic_alphabet_b);
        imgViews.add(R.drawable.ic_alphabet_c);
        imgViews.add(R.drawable.ic_alphabet_d);
        imgViews.add(R.drawable.ic_alphabet_e);
        imgViews.add(R.drawable.ic_alphabet_f);
        imgViews.add(R.drawable.ic_alphabet_g);
        imgViews.add(R.drawable.ic_alphabet_h);
        imgViews.add(R.drawable.ic_alphabet_i);
        imgViews.add(R.drawable.ic_alphabet_j);
        textViews.add("Q");
        textViews.add("R");
        textViews.add("S");
        textViews.add("T");
        textViews.add("U");
        textViews.add("V");
        textViews.add("W");
        textViews.add("X");
        textViews.add("Y");
        textViews.add("Z");
        setFillScreen();
    }
    private void fruits(){
        tvKategori.setText("FRUITS");
        imgViews.add(R.drawable.ic_alphabet_a);
        imgViews.add(R.drawable.ic_alphabet_b);
        imgViews.add(R.drawable.ic_alphabet_c);
        imgViews.add(R.drawable.ic_alphabet_d);
        imgViews.add(R.drawable.ic_alphabet_e);
        imgViews.add(R.drawable.ic_alphabet_f);
        imgViews.add(R.drawable.ic_alphabet_g);
        imgViews.add(R.drawable.ic_alphabet_h);
        imgViews.add(R.drawable.ic_alphabet_i);
        imgViews.add(R.drawable.ic_alphabet_j);
        textViews.add("Q");
        textViews.add("R");
        textViews.add("S");
        textViews.add("T");
        textViews.add("U");
        textViews.add("V");
        textViews.add("W");
        textViews.add("X");
        textViews.add("Y");
        textViews.add("Z");
        setFillScreen();
    }

    private void setFillScreen(){
        imgOgrenme.setImageResource(imgViews.get(index));
        tvOkunus.setText(textViews.get(index));
        tvSayac.setText(index+"/"+textViews.size());
    }
    public void onNextClick(View view){
        index++;
        setFillScreen();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            t1.speak(tvOkunus.getText().toString(),0,null,null);
        }
        if(index==imgViews.size()-1){
            index=0;
            tvSayac.setText(index+"/"+textViews.size());
        }

    }

    public void onBackClick(View view){
        index--;
        setFillScreen();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            t1.speak(tvOkunus.getText().toString(),0,null,null);
        }
        if(index==0){
            index=0;
            tvSayac.setText(index+"/"+textViews.size());
        }

    }

    public void onSpeakClick(View view){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            t1.speak(tvOkunus.getText().toString(),0,null,null);
        }
    }

    private void bindViews() {
        imgOgrenme=findViewById(R.id.imgOgrenme);
        imgHome=findViewById(R.id.imgHome);
        imgBack=findViewById(R.id.imgBack);
        imgIleri=findViewById(R.id.imgIleri);
        imgOynat=findViewById(R.id.imgOynat);
        tvSayac=findViewById(R.id.tvSayac);
        tvOkunus=findViewById(R.id.tvOkunus);
        tvKategori=findViewById(R.id.tvKategori);
    }
}