package com.example.common;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by fangjun on 2017/10/20.
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, DaggerModule.class})
public interface DaggerComponent {
    Application application();
    Car getCar();
    void inject(DaggerDelegate daggerDelegate);
}
