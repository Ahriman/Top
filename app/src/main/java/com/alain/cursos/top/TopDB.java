package com.alain.cursos.top;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Ahriman on 10/02/2018.
 */

@Database(name = TopDB.NAME, version = TopDB.VERSION)
public class TopDB {

    public static final String NAME = "TopDataBase";
    public static final int VERSION = 1;
}
