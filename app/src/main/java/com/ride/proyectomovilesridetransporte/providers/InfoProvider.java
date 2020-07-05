package com.ride.proyectomovilesridetransporte.providers;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InfoProvider {

    DatabaseReference mDataBase;

    public InfoProvider() {

        mDataBase = FirebaseDatabase.getInstance().getReference().child("Info");
    }

  public DatabaseReference getInfo(){
        return mDataBase;

  }
}
