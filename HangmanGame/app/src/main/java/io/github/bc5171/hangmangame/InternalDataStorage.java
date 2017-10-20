package io.github.bc5171.hangmangame;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ben on 10/20/2017.
 */

public class InternalDataStorage extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "hangmangame";

    private static final int DATABASE_VERSION = 1;

    public InternalDataStorage(Context context) {
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    

}
