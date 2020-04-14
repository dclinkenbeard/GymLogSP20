package com.daclink.drew.gymlogsp20.db.typeConverters;

import androidx.room.TypeConverter;

import java.util.Date;


public class DateTypeConverter {
    @TypeConverter
    public long convertDateToLong(Date date){
        return date.getTime();
    }

    @TypeConverter
    public Date convertLongtoDate(long time){
        return new Date(time);
    }
}
