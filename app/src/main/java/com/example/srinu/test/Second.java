package com.example.srinu.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void myLocation(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:38.9931123,-76.924374"));
        startActivity(intent);
    }

    public void findApp(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=vivianaranha.com.oglie"));
        startActivity(intent);
    }

    public void sendEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto"));
        String to[] = {"iteng.suman@gmail.com","sumothuk@umflint.edu"};
        intent.putExtra(Intent.EXTRA_EMAIL,to);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Hello From App");
        intent.putExtra(Intent.EXTRA_TEXT,"This is text");
        intent.setType("message/rfc822");
        startActivity(intent);


    }

    public void shareText(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        String str= editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, str);
        intent.setType("text/plain");
        startActivity(intent);

    }
}
