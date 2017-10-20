package com.example.fangjun.dagger2demo.di;

import com.example.fangjun.dagger2demo.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by fangjun on 2017/10/18.
 */
@Subcomponent(modules = FangjunModule.class)
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }
}
