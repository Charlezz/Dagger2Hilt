package kr.co.fastcampus.dagger2hilt.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import kr.co.fastcampus.dagger2hilt.MainActivity
import javax.inject.Singleton

/**
 * @author soohwan.ok
 */

@Singleton
@Component(
    modules = [AppModule::class, AppSubcomponents::class],

)
interface AppComponent{

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance application: Application):AppComponent
    }

    fun application():Application // provision method

    fun helloWorld():String // provision method

    fun inject(activity:MainActivity) // 멤버 인젝션 메서드

    fun mainSubcomponentFactory():MainSubcomponent.Factory

}