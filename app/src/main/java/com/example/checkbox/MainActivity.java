package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chk_apple, chk_orange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk_apple = findViewById(R.id.chk_apple);
        chk_orange = findViewById(R.id.chk_orange);

        chk_apple.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean check) {
                if(check){
                    chk_orange.setChecked(false);
                }
            }
        });
        chk_orange.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean check) {
                if(check){
                    chk_apple.setChecked(false);
                }


            }
        });
    }
    //adding click listener on submit button

    public void submit(View view) {


        if(chk_apple.isChecked()){
            Toast.makeText(MainActivity.this, "This is apple", Toast.LENGTH_SHORT).show();
        }
        else if(chk_orange.isChecked()){
            Toast.makeText(MainActivity.this, "This is orange", Toast.LENGTH_SHORT).show();
        }

    }
}