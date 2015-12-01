package testandroid.lis_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 11/29/2015.
 */
public class UserTABLE {

    // Explicit
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String USER_TABLE = "userTABLE";
    public static final String COLUM_ID_USER = "_id";
    public static final String COLUM_USER = "User";
    public static final String COLUM_PASSWORD = "Password";
    public static final String COLUM_NAME = "Name";



    public UserTABLE(Context context) {
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();

    }//Constructor

    public long addNewUser(String strUser,String strPassword,String strName) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUM_USER,strUser);
        objContentValues.put(COLUM_PASSWORD,strPassword);
        objContentValues.put(COLUM_NAME,strName);
        return readSqLiteDatabase.insert(USER_TABLE,null,objContentValues);
    } // add New User

}// MAIN CLASS
