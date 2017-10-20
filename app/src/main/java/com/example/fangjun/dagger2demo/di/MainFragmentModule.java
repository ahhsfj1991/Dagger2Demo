package com.example.fangjun.dagger2demo.di;

import com.example.fangjun.dagger2demo.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by fangjun on 2017/10/19.
 */
@Module
public abstract class MainFragmentModule {
    @ContributesAndroidInjector(modules = FangjunModule.class)
    abstract MainFragment contributeMainFragment();
}
