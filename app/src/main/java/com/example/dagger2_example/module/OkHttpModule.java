package com.example.dagger2_example.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

//
@Module
public class OkHttpModule {
    @Singleton//单例标记
    @Provides
    public OkHttpClient okHttpClientProvider() {
        return new OkHttpClient();
    }
}