package io.github.bc5171.hangmangame;

/**
 * Created by Ben on 10/20/2017.
 */

import android.content.Context;
import android.database.Cursor;
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

    public Word getWord() {
        Word w = null;

        String query = "SELECT * FROM " + InternalDataStorage.table_SAVED;
        Cursor cursor = database.rawQuery(query, null);

        if (cursor.getCount() > 0) {
            w = new Word();
            cursor.moveToFirst();
            w.setID(cursor.getInt(cursor.getColumnIndex(InternalDataStorage.saved_ID)));
            w.setWord(cursor.getString(cursor.getColumnIndex(InternalDataStorage.saved_Word)));
            w.setGuess(cursor.getString(cursor.getColumnIndex(InternalDataStorage.saved_Guess)));
        }

        return w;
    }

}
