package com.daclink.drew.gymlogsp20;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class Uitl {

    public static void toastMaker(Context context,String message){

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER, 0, 0);

        toast.show();



    }
}
