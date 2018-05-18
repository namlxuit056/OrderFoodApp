package com.example.namlxuit.orderfood.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.PublicKey;

/**
 * Created by Hoang Truong Huy on 05/02/18.
 * Created Database.
 */

public class CreateDatabase extends SQLiteOpenHelper {

    public static String TB_NHANVIEN = "NHANVIEN";
    public static String TB_MONAN = "MONAN";
    public static String TB_LOAIMONAN = "LOAIMONAN";
    public static String TB_BANAN= "BANAN";
    public static String TB_GOIMON= "GOIMON";
    public static String TB_CHITIETGOIMON = "CHITIETGOIMON";

    public static String TB_NHANVIEN_MANV = "MANV";
    public static String TB_NHANVIEN_TENDN = "TENDN";
    public static String TB_NHANVIEN_MATKHAU = "MATKHAU";
    public static String TB_NHANVIEN_GIOITINH = "GIOITINH";
    public static String TB_NHANVIEN_NGAYSINH = "NGAYSINH";

    public static String TB_MONAN_MAMONAN = "MAMONAN";
    public static String TB_MONAN_TENMONAN = "TENMONAN";
    public static String TB_MONAN_GIATIEN = "GIATIEN";
    public static String TB_MONAN_MALOAI = "MALOAI";

    public static String TB_LOAIMONAN_MALOAI = "MALOAI";
    public static String TB_LOAIMONAN_TENLOAI = "TENLOAI";

    public static String TB_BANAN_MABAN= "MABAN";
    public static String TB_BANAN_TENBAN= "TENBAN";
    public static String TB_BANAN_TINHTRANG= "TINHTRANG";

    public static String TB_GOIMON_MAGOIMON = "MAGOIMON";
    public static String TB_GOIMON_MANV = "MANV";
    public static String TB_GOIMON_NGAYGOI = "NGAYGOI";
    public static String TB_GOIMON_TINHTRANG = "TINHTRANG";
    public static String TB_GOIMON_MABAN= "MABAN";

    public static String TB_CHITIETGOIMON_MAGOIMON = "MAGOIMON";
    public static String TB_CHITIETGOIMON_MAMONAN = "MAMONAN";
    public static String TB_CHITIETGOIMON_SOLUONG = "SOLUONG";


    public CreateDatabase(Context context) {
        super(context,"OrderFood", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String tbNHANVIEN = "CREATE TABLE" + TB_NHANVIEN + "(" + TB_NHANVIEN_MANV + "INTERGER PRIMARY KEY AUTOINCREMENT,"
                + TB_NHANVIEN_TENDN + "TEXT, " + TB_NHANVIEN_MATKHAU + "TEXT, " + TB_NHANVIEN_GIOITINH + "TEXT, "
                + TB_NHANVIEN_NGAYSINH + "TEXT )";

        String tbBANAN = "CREATE TABLE" + TB_BANAN + "(" + TB_BANAN_MABAN + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_BANAN_TENBAN + "TEXT, " + TB_BANAN_TINHTRANG + "TEXT )";

        String tbMONAN = "CREATE TABLE " + TB_MONAN + "(" + TB_MONAN_MAMONAN + "INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_MONAN_TENMONAN + "TEXT, " +TB_MONAN_MALOAI + "INTEGER," + TB_MONAN_GIATIEN + "TEXT )";

        String tbLOAIMON = "CREATE TABLE " + TB_LOAIMONAN + "(" + TB_LOAIMONAN_MALOAI + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TB_LOAIMONAN_TENLOAI + "TEXT)";

        String tbGOIMON = "CREATE TABLE" + TB_GOIMON + "(" + TB_GOIMON_MAGOIMON + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TB_GOIMON_MABAN + "INTEGER," + TB_GOIMON_MANV + "INTEGER," + TB_GOIMON_NGAYGOI + "TEXT, "
                + TB_GOIMON_TINHTRANG + "TEXT )";

        String tbCHITIETGOIMON = "CREATE TABLE" + TB_CHITIETGOIMON + "(" + TB_CHITIETGOIMON_MAGOIMON + "INTEGER, "
                + TB_CHITIETGOIMON_MAMONAN + "INTEGER, " + TB_CHITIETGOIMON_SOLUONG + "INTEGER, "
                + "PRIMARY KEY ( " + TB_CHITIETGOIMON_MAGOIMON + "," + TB_CHITIETGOIMON_MAMONAN + "))";

        sqLiteDatabase.execSQL(tbNHANVIEN);
        sqLiteDatabase.execSQL(tbBANAN);
        sqLiteDatabase.execSQL(tbMONAN);
        sqLiteDatabase.execSQL(tbLOAIMON);
        sqLiteDatabase.execSQL(tbGOIMON);
        sqLiteDatabase.execSQL(tbCHITIETGOIMON);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public SQLiteDatabase open() {
        return this.getWritableDatabase();
    }
}
