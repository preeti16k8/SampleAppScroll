package com.example.splashactivity.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.splashactivity.Activity.RegisterActivity;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static com.example.splashactivity.Database.DataHelper.DATABASE_NAME;
import static java.sql.Types.VARCHAR;

public class SewakDatahelper extends SQLiteOpenHelper {


    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();


    static String DATABASEE_NAME = "NewSEWAKDatabase.db";
    static String TABLE_NAME = "tblPartners";


    public static final String COL_1 = "Field";
    public static final String COL_2 = "DataType";
    public static final String COL_3 = "Size";


    public SewakDatahelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(UldNew VARCHAR(10),UNameNew VARCHAR(50),UldUpdate VARCHAR(10),UNameUpdate VARCHAR(50)," +
                "UldDelete VARCHAR(10),UNameDelete VARCHAR(50),BranchCode VARCHAR(10),Branch VARCHAR(50),Dated VARCHAR , Time1 VARCHAR , " +
                " Location ,SL ,Id2 VARCHAR(20), SewakId VARCHAR(10), Category VARCHAR(50), Name  VARCHAR(100), " +
                " FirmName VARCHAR(100),Addresss VARCHAR(255),CityVillage  VARCHAR(100),Pincode INTEGER(10) ,State VARCHAR(50)," +
                " Distrct VARCHAR(50), MobileNo VARCHAR(50),WhatsAppNo VARCHAR(50),EmailIdd  VARCHAR(50), Website VARCHAR(50),GSTNo  VARCHAR(20)," +
                "MarketCover VARCHAR(100), InitialInvestment DECIMAL,  BankName  VARCHAR(50), AccountHolder VARCHAR(50), AccountNo  VARCHAR(20),  " +
                "IFSCode  VARCHAR(20),  Branch1 VARCHAR(50), Photo1 ,  Photo2 , " +
                " Lead VARCHAR(10), LeadConfirm VARCHAR(10), Status  VARCHAR)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}



////
////    public static final String COL_2 = "Uldnew";
////    public static final String COL_3 = "UNameNew";
////    public static final String COL_4 = "UldUpdate";
////    public static final String COL_5 = "UNameDelete";
////    public static final String COL_6 = "UldDelete";
////    public static final String COL_7 = "UNameDelete";
////    public static final String COL_8 = "BranchCode";
////    public static final String COL_9 = "Branch";
////    public static final String COL_10 = "Dated";
////    public static final String COL_11 = "Time1";
////    public static final String COL_12 = "Location";
////    public static final String COL_13 = "SL";
////    public static final String COL_14 = "Id2";
////    public static final String COL_15 = "SewakId";
////    public static final String COL_16 = "Category";
////    public static final String COL_17 = "Name";
////    public static final String COL_18 = "FirmName";
////
////    public static final String COL_19 = "Address";
////    public static final String COL_20 = "CityVillage";
////    public static final String COL_20 = "Pincode";
////    public static final String COL_21 = "State";
////    public static final String COL_22 = "Distrct";
////
////    public static final String COL_23 = "MobileNo";
////    public static final String COL_24 = "WhatsAppNo";
////    public static final String COL_25 = "emailid";
////    public static final String COL_26 = "Website";
////    public static final String COL_27 = "GSTNo";
////    public static final String COL_28 = "MarketCover";
////    public static final String COL_29 = "InitialInvestment";
////    public static final String COL_30 = "BankName";
////    public static final String COL_31 = "AccountHolder";
////    public static final String COL_32 = "AccountNo";
////    public static final String COL_33 = "IFSCode";
////    public static final String COL_34 = "Branch";
////    public static final String COL_35 = "photo1";
////    public static final String COL_36 = "Photo2";
////    public static final String COL_37 = "lead";
////    public static final String COL_38 = "LeadConfirm";
////    public static final String COL_39 = "Status";
//
//    // static String CREATE_PARTNER_TABLE = "";
//
//
//    public SewakDatahelper(Context context) {
//
//        super(context, DATABASEE_NAME, null, 1);
//
//        //db.execSQL(" CREATE TABLE " + TABLE_NAME + "(IMAGE VARCHAR,FIRST_NAME TEXT,LAST_NAME TEXT,DATEOF_BIRTH DATE,GENDER TEXT,PHONE_NO INTEGER,EMAIL_ID TEXT PRIMARY KEY,PASSWORD TEXT,CONFIRM_PASS TEXT)");
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//
//        db.execSQL("CREATE TABLE " + TABLE_NAME + "(UldNew VARCHAR(10),UNameNew VARCHAR(50),UldUpdate VARCHAR(10),UNameUpdate VARCHAR(50),UldDelete VARCHAR(10),UNameDelete VARCHAR(50),BranchCode VARCHAR(10),Branch VARCHAR(50),Dated VARCHAR , Time1 VARCHAR ,  Location ,SL ,Id2 VARCHAR(20), SewakId VARCHAR(10), Category VARCHAR(50), Name  VARCHAR(100),  FirmName VARCHAR(100),Addresss VARCHAR(255),CityVillage  VARCHAR(100),Pincode INTEGER(10) ,State VARCHAR(50), Distrct VARCHAR(50), MobileNo VARCHAR(50),WhatsAppNo VARCHAR(50),EmailIdd  VARCHAR(50), Website VARCHAR(50),GSTNo  VARCHAR(20),MarketCover VARCHAR(100), InitialInvestment DECIMAL,  BankName  VARCHAR(50), AccountHolder VARCHAR(50), AccountNo  VARCHAR(20),  IFSCode  VARCHAR(20),  Branch1 VARCHAR(50), Photo1 ,  Photo2 ,  Lead VARCHAR(10), LeadConfirm VARCHAR(10), Status  VARCHAR)");
//        // CREATE_CURRENT_STORE_TABLE = "CREATE TABLE " + CURRENT_STORE_TABLE + "(" + StoreID + " VARCHAR PRIMARY KEY," + UserId + " VARCHAR "+");";
//
//        // db.execSQL(CREATE_CURRENT_STORE_TABLE);
//
//
//    }
//
//
//    // public void adduser(Context mContext, String userid, String userName, String userEmail, String userImage, String userDob, String userPhone, String userLevel)
//    public boolean insertDta(String uldnew, String unamenew, String uldupdate, String unameupdate, String ulddelete, String unamedelete, String branchcode, String branch, String date, String time, String location,
//                             String sl, String id2, String sewakid, String category, String Name,
//                             String FirmName, String Address, String cityVillage, String Pincode, String State, String District,
//                             String Mobileno, String WhatsappNo, String EmailId, String Website, String gstno, String marketcover,
//                             String initialinvestment, String bankname, String accountholder, String accountno, String ifscode, String branch1, String photo1,
//                             String photo2, String lead, String leadconfirm, String status) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//
////        values.put(COL_2, uldnew);
////        values.put(COL_2, unamenew);
////        values.put(COL_3, uldupdate);
////        values.put(COL_4, unameupdate);
////        values.put(COL_5, ulddelete);
////        values.put(COL_6, unamedelete);
////        values.put(COL_7, branchcode);
////        values.put(COL_8, branch);
////        values.put(COL_9, date);
////        values.put(COL_10, time);
////        values.put(COL_11, location);
////        values.put(COL_12, sl);
////        values.put(COL_13, id2);
////        values.put(COL_14, sewakid);
////        values.put(COL_15, category);
////        values.put(COL_16, Name);
////        values.put(COL_17, FirmName);
////        values.put(COL_18, Address);
////        values.put(COL_19, cityVillage);
////        values.put(COL_20, Pincode);
////        values.put(COL_21, State);
////        values.put(COL_22, District);
////        values.put(COL_23, Mobileno);
////        values.put(COL_24, WhatsappNo);
////        values.put(COL_25, EmailId);
////        values.put(COL_26, Website);
////        values.put(COL_28, gstno);
////        values.put(COL_29, marketcover);
////        values.put(COL_30, initialinvestment);
////        values.put(COL_31, bankname);
////        values.put(COL_32, accountholder);
////        values.put(COL_33, accountno);
////        values.put(COL_33, ifscode);
////        values.put(COL_34, branch1);
////        values.put(COL_35, photo1);
////        values.put(COL_36, photo2);
////        values.put(COL_37, lead);
////        values.put(COL_38, leadconfirm);
////        values.put(COL_39, status);
////
////
////        long result  = db.insert(TABLE_NAME, null, values);
////        if (result==-1)
////            return false;
////        else {
////
////
////    }
////
////}
//
//
//
//    //	Delete Sample
//
//    public void deleteUser() {
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.delete(TABLE_NAME, null, null);
//        db.close();
//    }
//
//
//    public int getUserCount() {
//        String countQuery = "SELECT  * FROM " + TABLE_NAME;
//        int count = 0;
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery(countQuery, null);
//        if (cursor != null && !cursor.isClosed()) {
//            count = cursor.getCount();
//            cursor.close();
//        }
//        return count;
//    }
//
//
//    public Cursor getuser() {
//        String selectuser = "SELECT * FROM " + TABLE_NAME;
//
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery(selectuser, null);
//
//
//        return cursor;
//    }
//
//
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//        if (newVersion > oldVersion) {
//            // on upgrade drop older tables
//            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
////            db.execSQL("DROP TABLE IF EXISTS " + ORDER_TABLE);
//
//            // create new tables
//            onCreate(db);
//
//        }
//    }
//
//    public void adduser(RegisterActivity registerActivity,  String uldnew, String unamenew, String uldupdate, String ulddelete, String unamedelete, String branchcode, String branch, String date, String time, String location, String sl,String id2, String sewakid, String category, String name, String firmName, String address, String cityVillage, String pincode, String state, String district, String initialinvestment, String bankname, String accountholder, String accountno, String ifscode, String branch1, String photo1, String photo2, String lead, String leadconfirm, String status, String date1, String time1) {
