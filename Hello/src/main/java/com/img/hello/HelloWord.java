package com.img.hello;

import android.content.Context;
import android.widget.Toast;

public class HelloWord {

    public static void HelloToasto(Context context, String message){
        Toast.makeText(context, message+"Now Toast", Toast.LENGTH_SHORT).show();
    }
}
