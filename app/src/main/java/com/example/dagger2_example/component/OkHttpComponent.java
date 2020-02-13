package com.example.dagger2_example.component;

import com.example.dagger2_example.module.OkHttpModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

//注意：写在Component的上面
@Singleton
@Component(modules = OkHttpModule.class)
public interface OkHttpComponent {
    OkHttpClient get();
}