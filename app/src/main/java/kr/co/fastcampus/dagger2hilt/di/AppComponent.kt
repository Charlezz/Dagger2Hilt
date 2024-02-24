package kr.co.fastcampus.dagger2hilt.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import kr.co.fastcampus.dagger2hilt.MainActivity
import kr.co.fastcampus.dagger2hilt.MyApplication
import javax.inject.Singleton

/**
 * @author soohwan.ok
 */

@Singleton
@Component(
    modules = [
        AppModule::class,
        AppSubcomponents::class,
        AndroidSupportInjectionModule::class
    ],

    )
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }

    fun application(): Application // provision method

    fun helloWorld(): String // provision method

    fun inject(activity: MainActivity) // 멤버 인젝션 메서드

    fun inject(app:MyApplication)

}