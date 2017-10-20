package com.example.common;

import android.app.Application;

/**
 * Created by fangjun on 2017/10/20.
 */

public class DaggerDelegate {

    private DaggerComponent mComponent;
    private final Application mApplication;

    public DaggerDelegate (Application application) {
        mApplication = application;
    }

    public void onCreate() {
        mComponent = DaggerDaggerComponent.builder()
                .daggerModule(new DaggerModule(mApplication))
                .build();
        //mComponent.inject(this);
    }

    public DaggerComponent getComponent() {
        return mComponent;
    }
}
