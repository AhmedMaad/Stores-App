package com.example.stores.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.stores.R;
import com.example.stores.data.Constants;
import com.example.stores.data.LocationModel;
import com.example.stores.data.MealDetailsModel;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart extends AppCompatActivity {

    private ArrayList<MealDetailsModel> meals = new ArrayList<>();
    private String location = "";
    private double totalPrice = 0.0;
    private StringBuilder orderedMeals = new StringBuilder();
    private String restaurant;
    private ListView list;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        db = FirebaseFirestore.getInstance();

        restaurant = getIntent().getStringExtra("restaurant");
        Log.d("trace", "restaurant name: " + restaurant);

        db.collection("meal")
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot snapshots) {

                        List<DocumentSnapshot> list = snapshots.getDocuments();
                        for (DocumentSnapshot document : list) {
                            MealDetailsModel meal = document.toObject(MealDetailsModel.class);
                            if (meal.getEmail().equals(Constants.email)
                                    && meal.getRestaurant().equals(restaurant))
                                meals.add(meal);
                        }
                        showList();
                    }
                });

    }

    private void showList() {
        MealDetailsAdapter adapter = new MealDetailsAdapter(meals, this, true);
        list = findViewById(R.id.lv);
        list.setAdapter(adapter);
    }


    public void sendConfirmationEmail(View view) {
        getUserLocation();
    }

    private void getUserLocation() {
        db.collection("location")
                .document(Constants.email)
                .get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        LocationModel locationModel = documentSnapshot.toObject(LocationModel.class);
                        location = "Governorate: " + locationModel.getGovernorate()
                                + "\nArea: " + locationModel.getArea()
                                + "\nStreet name: " + locationModel.getStreetName()
                                + "\nBuilding number: " + locationModel.getBuildingNo()
                                + "\nFlat: " + locationModel.getFlat()
                                + "\nSpecial Marque: " + locationModel.getSpecialMark();
                        generateEmail();
                    }
                });
    }

    private void generateEmail() {

        for (MealDetailsModel meal : meals) {
            totalPrice += meal.getPrice();
            orderedMeals.append("\n-- ").append(meal.getName());
        }

        String emailBody =
                "Ordered Meals:" + orderedMeals
                        + "\n\nLocation:\n" + location
                        + "\n\nTotal Price: $" + totalPrice;


        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("*/*");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"fatmaelzahraa661@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Order for Stores App");
        i.putExtra(Intent.EXTRA_TEXT, emailBody);
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Deleting Data", Toast.LENGTH_SHORT).show();
        Log.d("trace", "delete items at this point");
        db.collection("meal")
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot snapshots) {
                        list.setVisibility(View.INVISIBLE);
                        List<DocumentSnapshot> list = snapshots.getDocuments();
                        for (int i = 0; i < list.size(); ++i) {
                            MealDetailsModel meal = list.get(i).toObject(MealDetailsModel.class);
                            if (meal.getEmail().equals(Constants.email)
                                    && meal.getRestaurant().equals(restaurant)) {
                                db
                                        .collection("meal")
                                        .document(list.get(i).getId())
                                        .delete();
                                Log.d("trace", "Deleting.. " + meal.getName());
                            }
                        }
                    }
                });
    }

}