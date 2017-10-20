package com.example.fangjun.dagger2demo.di;

import com.example.common.DaggerComponent;
import com.example.fangjun.dagger2demo.MainApp;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by fangjun on 2017/10/18.
 */
@AppScope
@Component(dependencies = DaggerComponent.class,
        modules = {AndroidInjectionModule.class,
        MainActivityModule.class,
        MainFragmentModule.class})
public interface AppComponent {
    void inject(MainApp mainApp);
}
