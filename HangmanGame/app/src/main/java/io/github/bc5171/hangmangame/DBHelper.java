package io.github.bc5171.hangmangame;

/**
 * Created by Ben on 10/20/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper {

    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public DBHelper(Context context) {
        dbhelper = new InternalDataStorage(context);
        database = dbhelper.getWritableDatabase();
    }

    public void open() {
        database = dbhelper.getWritableDatabase();
    }

    public void close() {
        dbhelper.close();
    }

}
