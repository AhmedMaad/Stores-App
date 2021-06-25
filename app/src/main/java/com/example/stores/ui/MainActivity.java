package com.example.stores.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.stores.R;

public class MainActivity extends AppCompatActivity {
  EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= findViewById(R.id.vid1);
        editText = findViewById(R.id.vid2);
        editText = findViewById(R.id.vid3);
        editText = findViewById(R.id.vid4);
        editText = findViewById(R.id.vid5);
        editText = findViewById(R.id.vid6);
    }

    public void butomclick(View view) {
        String retreatedstring = editText.getText().toString();
        Intent intent =new Intent(MainActivity.this, Restaurants.class);
        startActivity(intent);
    }

}