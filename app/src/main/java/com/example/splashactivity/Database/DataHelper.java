package com.example.splashactivity.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public class DataHelper extends SQLiteOpenHelper {

    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();

    static String DATABASE_NAME = "SEWAK.db";
    static String PARTNERS_TABLE = "parter";
    static String Location = "location";
    static String Category = "category";
    static String ID = "id";
    static String Date = "date";
    static String Time = "time";
    static String Namee="Name";
    static String FirmNamee="FirmName";

    static String Addresss = "Address";
    static String CityVillage = "CityVillage";
    static String Pincodee = "Pincode";
    static String Statee="State";
    static String Distrct = "distrct";

    static String Mobile1 = "Mobile1";
    static String Mobile2 = "Mobile2";

    static String Whatsapppp = "Whatsap";
    static String EmailIdd="Emailid";
    static String Websiteee="Website";

    static String CREATE_PARTNER_TABLE = "";


    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        CREATE_PARTNER_TABLE = "CREATE TABLE " + PARTNERS_TABLE + "(" + ID + " TEXT PRIMARY KEY, " + Location + " VARCHAR, " + Date + " VARCHAR, " + Time + " VARCHAR, " + Category + " VARCHAR, " + Namee + " VARCHAR, " + FirmNamee + " VARCHAR," + Addresss + " VARCHAR," + CityVillage + " VARCHAR," + Pincodee + " VARCHAR ," + Statee + " VARCHAR," + Distrct + " VARCHAR," + Mobile1 + " VARCHAR," + Mobile2 + " VARCHAR," + Whatsapppp + " VARCHAR," + EmailIdd + " VARCHAR," + Websiteee + " VARCHAR" + ");";
        // CREATE_CURRENT_STORE_TABLE = "CREATE TABLE " + CURRENT_STORE_TABLE + "(" + StoreID + " VARCHAR PRIMARY KEY," + UserId + " VARCHAR "+");";

        db.execSQL(CREATE_PARTNER_TABLE);
        // db.execSQL(CREATE_CURRENT_STORE_TABLE);


    }




    // public void adduser(Context mContext, String userid, String userName, String userEmail, String userImage, String userDob, String userPhone, String userLevel)
    public void adduser(Context mContext, String id, String location, String date, String time, String category, String Name,
                        String FirmName,String Address,String cityVillage,String Pincode,String State,String District,
                        String Mobileno1,String Mobileno2,String WhatsappNo,
                        String EmailId,String Website)

    {

        try {
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(ID, id);
            values.put(Location, location);
            values.put(Date, date);
            values.put(Time, time);
            values.put(Category,category);
            values.put(Namee,Name);
            values.put(FirmNamee,FirmName);

            values.put(Addresss, Address);

            values.put(CityVillage, cityVillage);
            values.put(Pincodee, Pincode);

//            values.put(Name,Name);
//            values.put(FirmName,FirmName);
            values.put(Statee, State);
            values.put(Distrct, District);
            values.put(Mobile1, Mobileno1);
            values.put(Mobile2, Mobileno2);
            values.put(Whatsapppp,WhatsappNo);
            values.put(EmailIdd,EmailId);
            values.put(Websiteee,Website);


            db.insertWithOnConflict(PARTNERS_TABLE, null, values, SQLiteDatabase.CONFLICT_REPLACE);
            db.close();

        } catch (Exception e) {
            Log.e("Insertion exception", "cannot insert", e);
        }
    }






    //	Delete Sample

    public void deleteUser() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(PARTNERS_TABLE, null, null);
        db.close();
    }


    public int getUserCount() {
        String countQuery = "SELECT  * FROM " + PARTNERS_TABLE;
        int count = 0;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        if (cursor != null && !cursor.isClosed()) {
            count = cursor.getCount();
            cursor.close();
        }
        return count;
    }


    public Cursor getuser() {
        String selectuser = "SELECT * FROM " + PARTNERS_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectuser, null);


        return cursor;
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        if (newVersion > oldVersion) {
            // on upgrade drop older tables
            db.execSQL("DROP TABLE IF EXISTS " + PARTNERS_TABLE);
//            db.execSQL("DROP TABLE IF EXISTS " + ORDER_TABLE);

            // create new tables
            onCreate(db);

        }
    }
}

