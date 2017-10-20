package com.example.fangjun.dagger2demo;

import android.app.Activity;
import android.app.Application;

import com.example.common.DaggerDelegate;
import com.example.fangjun.dagger2demo.di.AppComponent;
import com.example.fangjun.dagger2demo.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by fangjun on 2017/10/18.
 */

public class MainApp extends Application implements HasActivityInjector{
    @Inject
    DispatchingAndroidInjector<Activity> mActivityInjector;

    private AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        DaggerDelegate delegate = new DaggerDelegate(this);
        delegate.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .daggerComponent(delegate.getComponent())
                .build();
        mAppComponent.inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mActivityInjector;
    }
}
