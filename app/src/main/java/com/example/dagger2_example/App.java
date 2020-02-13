package com.example.dagger2_example;

import android.app.Application;

import com.example.dagger2_example.component.DaggerOkHttpComponent;
import com.example.dagger2_example.component.OkHttpComponent;

public class App extends Application {

    private static App INSTANCE;

    public static App get() {
        return INSTANCE;
    }

    public OkHttpComponent okHttpComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        okHttpComponent = DaggerOkHttpComponent.create();
    }

    public OkHttpComponent getOkHttpComponent() {
        return okHttpComponent;
    }
}
