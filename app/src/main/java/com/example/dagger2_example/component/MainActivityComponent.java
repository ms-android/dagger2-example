package com.example.dagger2_example.component;


import com.example.dagger2_example.module.LoginModule;
import com.example.dagger2_example.MainActivity;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {LoginModule.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
