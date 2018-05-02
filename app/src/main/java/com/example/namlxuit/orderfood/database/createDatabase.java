package com.example.namlxuit.orderfood.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hoang Truong Huy on 05/02/18.
 */

public class createDatabase extends SQLiteOpenHelper {
    public createDatabase(Context context) {
        super(context,"OrderFood", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
