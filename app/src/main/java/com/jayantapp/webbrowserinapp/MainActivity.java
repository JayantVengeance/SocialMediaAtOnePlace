package com.jayantapp.webbrowserinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  //  EditText editText=(EditText)findViewById(R.id.editTextTextPersonName);
   // String message=editText.getText().toString();
    public void search(View view)
    {
        EditText number=(EditText)findViewById(R.id.editTextTextPersonName);
        Log.i("Info","Button Pressed");
        Log.i("Info",number.getText().toString());
        String message=number.getText().toString();
        if(message.length()<12)
        {
            Toast.makeText(this,"Invalid URL",Toast.LENGTH_LONG).show();
        }
      /*  else if(message.substring(0,7)!="https://")
        {
            Toast.makeText(this,"Invalid URL",Toast.LENGTH_LONG).show();
        }
        */

        
       /* else if(message.substring(message.length()-4,message.length())!=".com")
        {
            Toast.makeText(this,"Invalid URL",Toast.LENGTH_LONG).show();
        }
        */

        else {
            findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clicked_btn(message);
                }
            });
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imageButton9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://fb.com");
            }
        });
        findViewById(R.id.ig_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://instagram.com");
            }
        });
        findViewById(R.id.tw_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://twitter.com");
            }
        });
        findViewById(R.id.yt_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://youtube.com");
            }
        });
       /*findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              clicked_btn(message);
            }
        });*/
    }
    public void clicked_btn(String url)
       {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}