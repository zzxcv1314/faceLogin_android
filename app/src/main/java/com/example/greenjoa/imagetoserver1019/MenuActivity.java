package com.example.greenjoa.imagetoserver1019;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        TextView tv = (TextView) findViewById(R.id.tv);
        ImageButton btn1 = (ImageButton) findViewById(R.id.btn1);
        ImageButton btn2 = (ImageButton) findViewById(R.id.btn2);
        ImageButton btn3 = (ImageButton) findViewById(R.id.btn3);
        ImageButton btn4 = (ImageButton) findViewById(R.id.btn4);

        Intent intent = getIntent();
        String username = intent.getStringExtra("name");

        tv.setText(username);


            btn1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent1 = new Intent(getApplicationContext(), RequestActivity.class);
                    startActivity(intent1);
                }
            });


            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent2 = new Intent(getApplicationContext(), InfoActivity.class);
                    startActivity(intent2);
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent3 = new Intent(getApplicationContext(), MedicalActivity.class);
                    startActivity(intent3);
                }
            });


            btn4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
//                Intent intent4 = new Intent(getApplicationContext(),MedicalActivity.class);
//                startActivity(intent4);

                    Intent intent = getIntent();
                    String imagepath = intent.getStringExtra("mCurrentPhotoPath");

                    Intent intent4 = new Intent(getApplicationContext(), GuessActivity.class);
                    intent4.putExtra("imagepath", (CharSequence) imagepath);
                    startActivity(intent4);

                }
            });

        }
}