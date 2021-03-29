package com.example.backtoschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MenuActivity extends AppCompatActivity {
    private LinearLayout lnrAbc, lnrNumbers, lnrColours, lnrAnimals, lnrFruits, lnrOgren, lnrDinle;
    private  int kategori = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bindViews();
    }

    private void bindViews() {
        lnrAbc = findViewById(R.id.lnrAbc);
        lnrNumbers = findViewById(R.id.lnrNumbers);
        lnrColours = findViewById(R.id.lnrColours);
        lnrAnimals = findViewById(R.id.lnrAnimals);
        lnrFruits = findViewById(R.id.lnrFruits);
        lnrOgren = findViewById(R.id.lnrOgren);
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.lnrAbc:
                kategori = Constant.ABC;
                break;
            case R.id.lnrNumbers:
                kategori = Constant.NUMBERS;
                break;
            case R.id.lnrColours:
                kategori = Constant.COLOURS;
                break;
            case R.id.lnrAnimals:
                kategori = Constant.ANIMALS;
                break;
            case R.id.lnrFruits:
                kategori = Constant.FRUITS;
                break;
        }
        showBottomSheetDialog();

    }

    public void showBottomSheetDialog() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                MenuActivity.this, R.style.bottomSheetDialog
        );
        final View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(
                R.layout.layout_bottom_sheet,
                (LinearLayout) findViewById(R.id.lnrButtomSheet));
        bottomSheetView.findViewById(R.id.lnrOgren).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LearnActivity.class);
                intent.putExtra("kategori", kategori);
                startActivity(intent);
                bottomSheetDialog.dismiss();
            }
        });


        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

}