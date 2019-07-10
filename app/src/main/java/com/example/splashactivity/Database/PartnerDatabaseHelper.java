package com.example.splashactivity.Database;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import java.util.ArrayList;
//import java.util.List;
//
public class PartnerDatabaseHelper {
}

//    public static final String DATABASE_NAME = "PARTNERS.db";
//    public static final String TABLE_NAME = "partners_table";
//    public static final String COL_1 = "ID";
//    public static final String COL_2 = "NAME";
//    public static final String COL_3 = "FIRMNAME";
//    public static final String COL_4 = "ADDRESS";
//
//    public static final String COL_5 = "CITYVILLAGE";
//    public static final String COL_6 = "PINCODE";
//    public static final String COL_7 = "STATE";
//    public static final String COL_8 = "DISTRICT";
//    public static final String COL_9 = "MOBILENO";
//
//    public static final String COL_10 = "WHATSAPPNO";
//    public static final String COL_11 = "GSTNO";
//    public static final String COL_12 = "MARKETCOVER";
//    public static final String COL_13 = "INTIALINVESTMENT";
//
//
//    public static final String COL_14= "BANKNAME";
//    public static final String COL_15 = "ACCOUNTHOLDER";
//    public static final String COL_16 = "ACCOUNTNO";
//    public static final String COL_17 = "IFSCODE";
//    public static final String COL_18 = "BRANCH";
//
//
//    public PartnerDatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, 1);
//        SQLiteDatabase db = this.getWritableDatabase();
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//
//        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME VARCHAR,FIRMNAME VARCHAR,ADDRESS VARCHAR, CITYVILLAGE VARCHAR,PINCODE INTEGER,STATE VARCHAR,DISTRICT VARCHAR,MOBILENO VARCHAR,WHATSAAPNO VARCHAR,GSTNO VARCHAR,MARKETCOVER VARCHAR,INTIALINVESTMENT VARCHAR,BANKNAME VARCHAR,ACCOUNTHOLDER VARCHAR,ACCOUNTNO VARCHAR,IFSCODE VARCHAR,BRANCH VARCHAR)");
//
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        onCreate(db);
//    }
//
//
//    public boolean insertData(String name, String firmname, String address, String cityvillage, String pincode, String state, String district, String mobileno, String whatsaapno, String gstno, String marketcover, String initialinvestment, String bankname, String accountholder, String accountno) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//
//        contentValues.put(COL_2, name);
//        contentValues.put(COL_3, firmname);
//        contentValues.put(COL_3, address);
//        contentValues.put(COL_4, cityvillage);
//        contentValues.put(COL_5, pincode);
//        contentValues.put(COL_6, state);
//        contentValues.put(COL_7, district);
//        contentValues.put(COL_8, mobileno);
//        contentValues.put(COL_9, whatsaapno);
//        contentValues.put(COL_10, gstno);
//        contentValues.put(COL_11, marketcover);
//        contentValues.put(COL_12, initialinvestment);
//        contentValues.put(COL_13, bankname);
//        contentValues.put(COL_14, accountholder);
//        contentValues.put(COL_15, accountno);
////        contentValues.put(COL_16, ifscode);
////        contentValues.put(COL_17, branch);
//
//        long result = db.insert(TABLE_NAME, null, contentValues);
//        if (result == -1)
//            return false;
//        else
//            return true;
//    }
//
//
//
//
//    public Cursor getAllData(){
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor res = db.rawQuery("select * from " + TABLE_NAME,null);
//        if (res.moveToFirst()){
//            do {
//
//            }while (res.moveToNext());
//        }
//        res.close();
//        return res;
//    }
//    public void upadteDAta(String name, String firmname, String address, String cityvillage, String pincode, String state, String district, String mobileno, String whatsaapno, String gstno, String marketcover, String  initialinvestment, String bankname, String accountholder, String accountno, String ifscode, String branch) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//
//        values.put(COL_1, name);
//        values.put(COL_2, firmname);
//        values.put(COL_3, address);
//        values.put(COL_5, cityvillage);
//        values.put(COL_6, pincode);
//        values.put(COL_7, state);
//        values.put(COL_8, district);
//        values.put(COL_9, mobileno);
//        values.put(COL_10, whatsaapno);
//        values.put(COL_11, gstno);
//        values.put(COL_12, marketcover);
//        values.put(COL_13, initialinvestment);
//        values.put(COL_14, bankname);
//        values.put(COL_15, accountholder);
//        values.put(COL_17, ifscode);
//        values.put(COL_18, branch);
//
//
//    }
//    List<All_user> getAllUser(){
//        String[] col = {
//                COL_1,COL_5,COL_6
//        };
//        String sort = COL_6 + " ASC";
//        List<All_user> userList = new ArrayList<>();
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        Cursor cursor = db.query(TABLE_NAME, col,null,null,null,null,sort);
//        if (cursor.moveToFirst()){
//            All_user user = new All_user();
//            //ContentValues values = new ContentValues();
//            user.setName(cursor.getString(cursor.getColumnIndex(COL_1)));
//            user.getName();
//            user.firmname();
//            user.address();
//        }
//
//        cursor.close();
//        db.close();
//        return userList;
//    }
//
//
//
//}
