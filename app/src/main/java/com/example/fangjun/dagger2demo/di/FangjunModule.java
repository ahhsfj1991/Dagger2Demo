package com.example.fangjun.dagger2demo.di;

import com.example.fangjun.dagger2demo.Person;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fangjun on 2017/10/18.
 */
@Module
public class FangjunModule {
    @Provides
    public Person provideFangjun() {
        return new Person("fangjun", 25);
    }
}
