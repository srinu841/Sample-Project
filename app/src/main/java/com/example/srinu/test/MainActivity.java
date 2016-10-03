package com.example.srinu.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    int current=0;
    String array[]={"earth","jptr","mars","mer","ntpn","sat","urns","vns"};
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.imageView);
        textView= (TextView) findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.second) {
            Intent intentSecond = new Intent(this, Second.class);
            startActivity(intentSecond);
        }
        return super.onOptionsItemSelected(item);
    }
    public void nextButton(View view) {
        if (current < (array.length - 1)) {
            current++;
            String img = array[current];
            textView.setText(img);
            int imgid = getResources().getIdentifier(img, "drawable", "com.example.suman.test");
            imageView.setImageResource(imgid);
        }
            else if(current==(array.length-1)) {
            current=0;
            String img = array[current];
            textView.setText(img);
            int imgid = getResources().getIdentifier(img, "drawable", "com.example.suman.test");
            imageView.setImageResource(imgid);

        }
    }
    public void previousButton(View view) {
        if(current>0){
            current--;
            String img = array[current];
            textView.setText(img);
            int imgid = getResources().getIdentifier(img, "drawable", "com.example.suman.test");
            imageView.setImageResource(imgid);
        }
        else if(current==0){
            current=array.length-1;
            String img = array[current];
            textView.setText(img);
            int imgid = getResources().getIdentifier(img, "drawable", "com.example.suman.test");
            imageView.setImageResource(imgid);
        }
    }
    public void restButton(View view) {
        current=0;
        String img = array[current];
        int imgid = getResources().getIdentifier(img, "drawable", "com.example.suman.test");
        imageView.setImageResource(imgid);
        textView.setText(img);

    }
}
