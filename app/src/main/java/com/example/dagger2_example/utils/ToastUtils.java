package com.example.dagger2_example.utils;


import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.example.dagger2_example.App;

public class ToastUtils {


    private static Handler handler = new Handler(Looper.getMainLooper());


    private static Toast toast;


   public static void show(String text) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(App.get(), text, Toast.LENGTH_LONG);
                }
                toast.setText(text);
                toast.show();
            }
        });
    }
}
