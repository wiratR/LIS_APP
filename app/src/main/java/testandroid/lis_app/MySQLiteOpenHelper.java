package testandroid.lis_app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 11/29/2015.
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper{

    //Explicit
    private static final String DATABASE_NAME = "LIS.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_USER_TABLE = "create table userTABLE " +
            "_id integer primary key, User test,Password text, Name text);";


    // Create Constructor
    public MySQLiteOpenHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }//Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}// Main Class
