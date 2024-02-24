package kr.co.fastcampus.dagger2hilt

import android.app.Application
import kr.co.fastcampus.dagger2hilt.di.AppComponent
import kr.co.fastcampus.dagger2hilt.di.DaggerAppComponent

/**
 * @author soohwan.ok
 */
class MyApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
    }

}