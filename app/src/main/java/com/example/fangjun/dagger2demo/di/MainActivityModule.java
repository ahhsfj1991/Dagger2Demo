package com.example.fangjun.dagger2demo.di;

import android.app.Activity;

import com.example.fangjun.dagger2demo.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by fangjun on 2017/10/18.
 */
@Module(subcomponents = MainActivitySubcomponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindActivityInjectorFactory(MainActivitySubcomponent.Builder builder);
}
