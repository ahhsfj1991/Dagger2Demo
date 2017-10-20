package com.example.fangjun.dagger2demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.common.Car
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject lateinit var fangjun: Person
    @Inject lateinit var mFragmentInjector: DispatchingAndroidInjector<Fragment>
    @Inject lateinit var mCar: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_main_show.text = fangjun.name + mCar.name
        supportFragmentManager.beginTransaction().add(fl_main_content.id, MainFragment()).commit()
    }

    override fun supportFragmentInjector(): AndroidInjector<android.support.v4.app.Fragment> = mFragmentInjector
}
