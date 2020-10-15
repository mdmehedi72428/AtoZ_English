package com.example.customadapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;


import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;
import java.net.URI;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
   private ListView listview;
   private  String[] Paragraph;
    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Paragraph");

        Paragraph = getResources().getStringArray(R.array.paragraph);
        listview = findViewById(R.id.listview);

        ///translate listerstart
       

        ///end of translate



        listview.setOnItemClickListener(this);

        //create adapter
        ArrayAdapter<String> array = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.paragraph));
        listview.setAdapter(array);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.share){
            ApplicationInfo api = getApplicationContext().getApplicationInfo();
            String apkpath = api.sourceDir;
            Intent intent =  new Intent(Intent.ACTION_SENDTO);
            intent.setType("application/vbd.andriod.package-archive");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
            startActivity(Intent.createChooser(intent,"ShareView"));

        }
        return true;
    }

    ////////////////////////////////
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==0){
         Intent intent = new Intent(MainActivity.this,A_Rainy_Day.class);
         startActivity(intent);

        }else if(i==1){
            Intent intent = new Intent(MainActivity.this,Winter_Moring.class);
            startActivity(intent);
        }else if(i==2) {
            Intent intent = new Intent(MainActivity.this, a_favourite_teacher.class);
            startActivity(intent);
        }else if(i==3) {
            Intent intent = new Intent(MainActivity.this,Traffic_Jam.class);
            startActivity(intent);
        }else if(i==4) {
            Intent intent = new Intent(MainActivity.this,Deforestration.class);
            startActivity(intent);
        }else if(i==5) {
            Intent intent = new Intent(MainActivity.this,May_Day.class);
            startActivity(intent);
        }else if(i==6) {
            Intent intent = new Intent(MainActivity.this,A_Teacher.class);
            startActivity(intent);
        }


       }

}