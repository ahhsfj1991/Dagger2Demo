package com.example.common;

import android.app.Application;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by fangjun on 2017/10/20.
 */
@Module
public class DaggerModule {
    private final Application mApplication;

    public DaggerModule(Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    public Application provideApplication() {
        return this.mApplication;
    }

    @Singleton
    @Provides
    public Car provideCar() {
        return new Car("audi");
    }
}
