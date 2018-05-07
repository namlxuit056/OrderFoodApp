package com.example.namlxuit.orderfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.namlxuit.orderfood.database.CreateDatabase;

public class DangkyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dangky);

        //CreateDatabase createDatabase = new CreateDatabase(this);
        //createDatabase.open();
    }
}
