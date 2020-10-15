package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class A_Rainy_Day extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a__rainy__day);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("A Rainy Day");

    editText = findViewById(R.id.transaleEdittex);
    button = findViewById(R.id.translatebtn);


    tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
        @Override
        public void onInit(int i) {
           if(i != TextToSpeech.ERROR){
               tts.setLanguage(Locale.UK);
           }else{
               Toast.makeText(A_Rainy_Day.this,"Error",Toast.LENGTH_SHORT).show();
           }
        }
    });

    //speak to btn
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tospeak = editText.getText().toString().trim();
                if(tospeak.equals("")){
                    Toast.makeText(A_Rainy_Day.this,"Enter Your text for listining voice",Toast.LENGTH_SHORT).show();
                }else{
                    //speak the word
                    tts.speak(tospeak,TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }
}