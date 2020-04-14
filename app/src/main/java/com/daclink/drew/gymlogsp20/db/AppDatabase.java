package com.daclink.drew.gymlogsp20.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.daclink.drew.gymlogsp20.GymLog;
import com.daclink.drew.gymlogsp20.db.typeConverters.DateTypeConverter;


@Database(entities = {GymLog.class}, version = 1)
@TypeConverters(DateTypeConverter.class)
public abstract class AppDatabase extends RoomDatabase {
    public static final String DB_NAME = "GYMLOG_DATABASE";
    public static final String GYMLOG_TABLE = "GYMLOG_TABLE";

    public abstract GymLogDAO getGymLogDAO();
}
