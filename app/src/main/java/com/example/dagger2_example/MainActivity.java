package com.example.dagger2_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.dagger2_example.bean.User;
import com.example.dagger2_example.component.DaggerMainActivityComponent;
import com.example.dagger2_example.module.LoginModule;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {



    private static final String TAG = "MainActivity";
    private TextView textView;


    @Inject
    User user;


    @Inject
    LoginModule loginModule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        DaggerMainActivityComponent.create().inject(this);
        user.setUsername("123");
        user.setPassword("456");
        loginModule.login(user);


        System.out.println(App.get().getOkHttpComponent().get());
        System.out.println(App.get().getOkHttpComponent().get());
        System.out.println(App.get().getOkHttpComponent().get());
        System.out.println(App.get().getOkHttpComponent().get());
        System.out.println(App.get().getOkHttpComponent().get());
        System.out.println(App.get().getOkHttpComponent().get());
        System.out.println(App.get().getOkHttpComponent().get());
        System.out.println(App.get().getOkHttpComponent().get());
        System.out.println(App.get().getOkHttpComponent().get());

        App.get().okHttpComponent.get().newCall(new Request.Builder().url("https://www.baidu.com/").build()).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {


                Log.e(TAG, "onResponse: "+response.body().string() );

            }
        });


    }
}
