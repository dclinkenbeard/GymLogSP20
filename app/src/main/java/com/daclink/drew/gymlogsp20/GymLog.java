package com.daclink.drew.gymlogsp20;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.daclink.drew.gymlogsp20.db.AppDatabase;

import java.util.Date;

@Entity(tableName = AppDatabase.GYMLOG_TABLE)
public class GymLog {

    @PrimaryKey(autoGenerate = true)
    private int mLogId;

    private String mExercise;
    private int mReps;
    private double mWeight;

    private Date mDate;

    public GymLog(String exercise, int reps, double weight) {
        mExercise = exercise;
        mReps = reps;
        mWeight = weight;

        mDate = new Date();
    }

    public int getLogId() {
        return mLogId;
    }

    public void setLogId(int logId) {
        mLogId = logId;
    }

    public String getExercise() {
        return mExercise;
    }

    public void setExercise(String exercise) {
        mExercise = exercise;
    }

    public int getReps() {
        return mReps;
    }

    public void setReps(int reps) {
        mReps = reps;
    }

    public double getWeight() {
        return mWeight;
    }

    public void setWeight(double weight) {
        mWeight = weight;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    @Override
    public String toString() {
        String output;

        output = mExercise  + " " + mWeight + " : " + mReps;
        output += "\n";
        output += getDate();


        return output;
    }
}
