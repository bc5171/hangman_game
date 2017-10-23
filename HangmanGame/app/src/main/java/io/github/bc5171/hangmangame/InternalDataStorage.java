package io.github.bc5171.hangmangame;

import android.content.Context;
import android.database.sqlite.*;

/**
 * Created by Ben on 10/20/2017.
 */

public class InternalDataStorage extends SQLiteOpenHelper {

    // DB Name
    private static final String DATABASE_NAME = "hangmangame";

    // DB Version
    private static final int DATABASE_VERSION = 1;

    // DB Table: words
    public static final String table_WORDS = "words";
    public static final String words_ID = "id";
    public static final String words_WORD = "word";

    // DB Table: user
    public static final String table_USER = "user";
    public static final String user_ID = "id";
    public static final String user_OnlineID = "online_id";
    public static final String user_TotSolved = "totSolved";
    public static final String user_TotAttempted = "totAttempted";

    // DB Table: saved
    public static final String table_SAVED = "saved";
    public static final String saved_ID = "id";
    public static final String saved_Word = "saved_word";
    public static final String saved_Guess = "saved_guess";

    public InternalDataStorage(Context context) {
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + table_USER);
        db.execSQL("DROP TABLE IF EXISTS " + table_SAVED);
        db.execSQL("DROP TABLE IF EXISTS " + table_WORDS);
        onCreate(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + table_USER + " (" +
            user_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            user_OnlineID + " TEXT, " +
            user_TotAttempted + " INT, " +
            user_TotSolved + " INT)");

        db.execSQL("CREATE TABLE " + table_WORDS + " (" +
            words_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            words_WORD + " TEXT)");

        db.execSQL("CREATE TABLE " + table_SAVED + " (" +
            saved_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            saved_Guess + " TEXT, " +
            saved_Word + "TEXT)");
    }

}
