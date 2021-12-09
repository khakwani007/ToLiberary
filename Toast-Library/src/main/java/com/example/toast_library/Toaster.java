package com.example.toast_library;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    
    public void toast(Context context ,String message){

        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
