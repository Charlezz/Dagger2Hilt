package kr.co.fastcampus.dagger2hilt

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kr.co.fastcampus.dagger2hilt.di.AppComponent
import kr.co.fastcampus.dagger2hilt.di.DaggerAppComponent
import javax.inject.Inject

/**
 * @author soohwan.ok
 */
class MyApplication : Application(), HasAndroidInjector {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
        appComponent.inject(this)
    }

    @Inject
    lateinit var androidInjector:DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }

}