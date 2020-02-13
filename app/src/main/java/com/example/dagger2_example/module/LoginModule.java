package com.example.dagger2_example.module;


import com.example.dagger2_example.bean.User;
import com.example.dagger2_example.utils.ToastUtils;

import javax.inject.Inject;

import dagger.Module;


@Module
public class LoginModule {

    @Inject
    public LoginModule() {
    }

    public void login(User user) {

        String username = user.getUsername();
        String password = user.getPassword();

        ToastUtils.show("username : " + username + "\npassword : " + password);



    }

}
