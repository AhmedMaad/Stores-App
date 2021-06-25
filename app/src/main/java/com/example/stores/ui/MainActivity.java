package com.example.stores.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.stores.R;
import com.example.stores.data.Constants;
import com.example.stores.data.LocationModel;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    private EditText emailET;
    private EditText governorateET;
    private EditText areaET;
    private EditText streetNameET;
    private EditText buildingNoET;
    private EditText flatET;
    private EditText specialMarkET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailET = findViewById(R.id.vid0);
        governorateET = findViewById(R.id.vid1);
        areaET = findViewById(R.id.vid2);
        streetNameET = findViewById(R.id.vid3);
        buildingNoET = findViewById(R.id.vid4);
        flatET = findViewById(R.id.vid5);
        specialMarkET = findViewById(R.id.vid6);
    }

    public void butomclick(View view) {

        String writtenEmail = emailET.getText().toString();

        LocationModel location = new LocationModel(
                writtenEmail
                , governorateET.getText().toString()
                , areaET.getText().toString()
                , streetNameET.getText().toString()
                , buildingNoET.getText().toString()
                , flatET.getText().toString()
                , specialMarkET.getText().toString()
        );

        FirebaseFirestore.getInstance().collection("location")
                .document(writtenEmail)
                .set(location)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(MainActivity.this, "Location Added", Toast.LENGTH_SHORT).show();
                        Constants.email = writtenEmail;
                        Intent intent = new Intent(MainActivity.this, Restaurants.class);
                        startActivity(intent);
                    }
                });
    }

}